package com.erikasari.persediaantoko;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.adapters.dataAdapter;
import com.erikasari.persediaantoko.models.Session;
import com.erikasari.persediaantoko.models.data;

import java.util.ArrayList;
import java.util.List;

public class dataActivity  extends AppCompatActivity {
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        session = Application.getProduk();

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<data> teams = new ArrayList<>();
        teams.add(new data("MERK SEPATU","HARGA","STOK"));
        teams.add(new data("sneakers women nike air laveder","Rp.150.000","20"));
        teams.add(new data("women light salmon","Rp.185.000","40"));
        teams.add(new data("sneakers women nike air purple","Rp.205.000","9"));
        teams.add(new data("adidas women grey","Rp.125.000","15"));
        teams.add(new data("sneakers women nike running shoes laser orange","Rp.102.000","20"));
        teams.add(new data("sneakers women classic autentic orange red","Rp.100.000","10"));
        teams.add(new data("sneakers adidasracer black sneakers","Rp.147.000","22"));
        teams.add(new data("sneakers women rose pink","Rp.164.000","12"));
        teams.add(new data("snekaers women nike air zoom violet","Rp.192.000","17"));
        teams.add(new data("sneakers women nike air zoom photosynth","Rp.225.000","15"));
        teams.add(new data("women light salmon","Rp.185.000","40"));

        dataAdapter adapter = new dataAdapter(this, teams);
        teamsView.setAdapter(adapter);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
