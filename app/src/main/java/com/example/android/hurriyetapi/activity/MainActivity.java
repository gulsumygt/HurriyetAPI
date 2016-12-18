package com.example.android.hurriyetapi.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.android.hurriyetapi.R;
import com.example.android.hurriyetapi.adapter.NewsAdapter;
import com.example.android.hurriyetapi.model.File;
import com.example.android.hurriyetapi.model.News;
import com.example.android.hurriyetapi.rest.ApiClient;
import com.example.android.hurriyetapi.rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private final static String API_KEY = ""; //Buraya API Key'inizi yazınız.
    private static final String TAG = MainActivity.class.getSimpleName();

    ApiInterface apiService;
    Call<List<News>> call;
    List<News> newses;
    List<File> files;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.news_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        apiService = ApiClient.getClient().create(ApiInterface.class);
        call = apiService.getNews(API_KEY);

        call.enqueue(new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                newses = response.body();

                files = new ArrayList<File>();

                for (int i = 0; i < newses.size(); i++) {
                    File item = new File();

                    item.setFileUrl(newses.get(i).getFiles().get(0).getFileUrl());
                    item.setMetadata(newses.get(i).getFiles().get(0).getMetadata());

                    files.add(item);
                }

                recyclerView.setAdapter(new NewsAdapter(getApplicationContext(), newses,files, R.layout.list_item_news));
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
