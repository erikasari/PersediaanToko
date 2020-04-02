package com.erikasari.persediaantoko;

import com.erikasari.persediaantoko.models.Account;
import com.erikasari.persediaantoko.models.Session;

public class Application extends android.app.Application {

    private static Account account;
    private static Session session;
    private static Session produk;

    @Override
    public void onCreate() {
        super.onCreate();
        account = new Account("Selamat Datang Admin");
        session = new Session(this);
        produk = new Session(this);
    }

    public static Session getSession(){
        return session;
    }

    public static Session getProduk() {
        return produk;
    }

    public static Account getAccount() {
        return account;
    }
}
