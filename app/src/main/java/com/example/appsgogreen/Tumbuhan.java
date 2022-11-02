package com.example.appsgogreen;

import android.os.Parcel;
import android.os.Parcelable;

public class Tumbuhan implements Parcelable {
    private String nama, detail, latin;
    private int photo;

    public Tumbuhan() {

    }

    protected Tumbuhan(String nama, String detail, int photo, String latin) {
        this.nama = nama;
        this.detail = detail;
        this.photo = photo;
        this.latin = latin;
    }

    protected Tumbuhan(Parcel in) {
        nama = in.readString();
        latin = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<Tumbuhan> CREATOR = new Creator<Tumbuhan>() {
        @Override
        public Tumbuhan createFromParcel(Parcel in) {
            return new Tumbuhan(in);
        }

        @Override
        public Tumbuhan[] newArray(int size) {
            return new Tumbuhan[size];
        }
    };

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLatin() {
        return latin;
    }
    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }
    public void setPhoto(int photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama);
        dest.writeString(latin);
        dest.writeString(detail);
        dest.writeInt(photo);
    }
}