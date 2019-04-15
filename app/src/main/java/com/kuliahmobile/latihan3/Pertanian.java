package com.kuliahmobile.latihan3;

import android.os.Parcel;
import android.os.Parcelable;

public class Pertanian implements Parcelable {
    public String getKota() {
        return Kota;
    }

    public void setKota(String kota) {
        Kota = kota;
    }

    public String getKecamatan() {
        return Kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        Kecamatan = kecamatan;
    }

    public int getLuasLahan() {
        return luasLahan;
    }

    public void setLuasLahan(int luasLahan) {
        this.luasLahan = luasLahan;
    }

    public String getPemilik() {
        return Pemilik;
    }

    public void setPemilik(String pemilik) {
        Pemilik = pemilik;
    }

    public int getHasilPanen() {
        return hasilPanen;
    }

    public void setHasilPanen(int hasilPanen) {
        this.hasilPanen = hasilPanen;
    }

    private String Kota;
    private String Kecamatan;
    private int luasLahan;
    private String Pemilik;
    private int hasilPanen;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.Kota);
        dest.writeString(this.Kecamatan);
        dest.writeInt(this.luasLahan);
        dest.writeString(this.Pemilik);
        dest.writeInt(this.hasilPanen);
    }

    public Pertanian() {
    }

    protected Pertanian(Parcel in) {
        this.Kota = in.readString();
        this.Kecamatan = in.readString();
        this.luasLahan = in.readInt();
        this.Pemilik = in.readString();
        this.hasilPanen = in.readInt();
    }

    public static final Parcelable.Creator<Pertanian> CREATOR = new Parcelable.Creator<Pertanian>() {
        @Override
        public Pertanian createFromParcel(Parcel source) {
            return new Pertanian(source);
        }

        @Override
        public Pertanian[] newArray(int size) {
            return new Pertanian[size];
        }
    };
}
