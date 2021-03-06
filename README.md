## HurriyetAPI

Hürriyet'in API'si kullanılarak haber başlıklarını, spot metinlerini ve heberin resmini RecyclerView ile gösteren uygulama.

## Hakkında

Uygulamada istemciden gelen verileri kullanmak için Retrofit kullanılmıştır. İstemciden gelen veriler RecyclerView ile gösterilmiştir. Haberlerin resimlerini yüklemek için Picasso kütüphanesi kullanılmıştır
Retrofit, RecyclerView ve Picasso kullanabilmek için uygulamaya aşağıdaki kütüphaneler eklenmiştir.

build.gradle(Module:app)
```
 // GSON with Retrofit
    compile 'com.google.code.gson:gson:2.6.2'
    compile 'com.squareup.retrofit2:retrofit:2.0.2'
    compile 'com.squareup.retrofit2:converter-gson:2.0.2'

    // recycler view
    compile 'com.android.support:recyclerview-v7:24.2.0'
    
     // Load Images
    compile 'com.squareup.picasso:picasso:2.4.0'
```

Uygulamayı kullanabilmek için MainActivity.java dosyası içindeki gerekli yere kendi API anahtarınızı yerleştirmeniz gerekmektedir.
