package com.erikasari.persediaantoko.models;

public class foto {
    public String foto;
    public String deskripsi;

    public foto(String foto, String deskripsi) {
        this.foto = foto;
        this.deskripsi = deskripsi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
