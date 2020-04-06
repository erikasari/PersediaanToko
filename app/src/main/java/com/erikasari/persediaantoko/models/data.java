package com.erikasari.persediaantoko.models;

public class data {
    public String Deskripsi;
    public String harga;
    public String stok;

    public data(String deskripsi, String harga, String stok) {
        Deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
}
