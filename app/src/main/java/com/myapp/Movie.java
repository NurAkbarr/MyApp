package com.myapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Movie implements Parcelable {
    private String title;
    private String deskripsi;
    private String tahun;
    private String photo;

    // Constructor
    public Movie(String title, String deskripsi, String tahun, String photo) {
        this.title = title;
        this.deskripsi = deskripsi;
        this.tahun = tahun;
        this.photo = photo;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getTahun() {
        return tahun;
    }

    public String getPhoto() {
        return photo;
    }

    // Parcelable implementation
    protected Movie(Parcel in) {
        title = in.readString();
        deskripsi = in.readString();
        tahun = in.readString();
        photo = in.readString();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(deskripsi);
        dest.writeString(tahun);
        dest.writeString(photo);
    }
}
