package com.example.android.hurriyetapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by glsmy on 18.12.2016.
 */
public class File {
    @SerializedName("FileUrl")
    @Expose
    private String fileUrl;
    @SerializedName("Metadata")
    @Expose
    private Metadata metadata;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
}
