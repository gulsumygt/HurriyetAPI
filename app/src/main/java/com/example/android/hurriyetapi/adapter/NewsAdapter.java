package com.example.android.hurriyetapi.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.hurriyetapi.R;
import com.example.android.hurriyetapi.model.News;

import java.util.List;

/**
 * Created by glsmy on 18.12.2016.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private List<News> newsList;
    private int rowLayout;
    private Context context;


    public static class NewsViewHolder extends RecyclerView.ViewHolder {

        LinearLayout newsLayout;
        TextView title;
        TextView description;

        public NewsViewHolder(View itemView) {
            super(itemView);

            newsLayout = (LinearLayout) itemView.findViewById(R.id.news_layout);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
        }
    }

    public NewsAdapter(Context context, List<News> newsList, int rowLayout) {
        this.context = context;
        this.newsList = newsList;
        this.rowLayout = rowLayout;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(rowLayout,parent,false);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.title.setText(newsList.get(position).getTitle());
        holder.description.setText(newsList.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

}
