package com.erikasari.persediaantoko;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.adapters.fotoAdapter;
import com.erikasari.persediaantoko.models.foto;

import java.util.ArrayList;
import java.util.List;

public class fotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<foto> teams = new ArrayList<>();
        teams.add(new foto("https://www.zalora.co.id/adidas-adidas-originals-superstar-shoes-white-2023221.html","women shoes sneakers"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/233479_adidas-superstar-bounce-bb2939-women_light-salmon_BGCRT.jpg", "women light salmon"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/126466/womens-nike-air-max-2016-dark-purple-dust-white-pink-pow?trc_sale=shoes+sneakers", "sneakers white pink"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/247974/adidas-cfliteracerw-bb9841-women?trc_sale=shoes+sneakers","women shoes sneakers"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/108560_womens-nike-free-rn-running-shoe-laser-orange_orange-red_1A5LN.jpg","women nike running shoes"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/71720/chuck-taylor-all-star-missoni-pink-freeze-black-egret?trc_sale=shoes+sneakers","women pink freeze black sneakers"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/103398_women-classic-authentic-50th-gold-checker_orange-red_X8O50.jpg","women classic autentic"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/229949/adidas-cloudfoam-lite-racer-w-grey-black-aw4036-women?trc_sale=shoes+sneakers","racer black sneakers"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/232636/superga-2750-fabricpltiedyew-rose-women?trc_sale=shoes+sneakers","rose women sneakers"));
        teams.add(new foto("https://berrybenka.com/shoes/sneakers/108566/womens-nike-air-zoom-pegasus-32-hyper-violet-white-black?trc_sale=shoes+sneakers","women nike air zoom violet "));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/269524_nike-air-zoom-pegasus-32-photosynth-women_black_EM1M3.jpg","nike air zoom photosynth"));

        fotoAdapter adapter = new fotoAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
