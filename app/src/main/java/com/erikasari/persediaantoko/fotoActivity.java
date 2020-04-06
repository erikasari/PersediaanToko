package com.erikasari.persediaantoko;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.erikasari.persediaantoko.adapters.fotoAdapter;
import com.erikasari.persediaantoko.models.Session;
import com.erikasari.persediaantoko.models.foto;

import java.util.ArrayList;
import java.util.List;

public class fotoActivity extends AppCompatActivity {
    private Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);
        session = Application.getProduk();

        RecyclerView teamsView = findViewById(R.id.rv_teams);

        List<foto> teams = new ArrayList<>();
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/108566_womens-nike-air-zoom-pegasus-32-hyper-violet-white-black_lavender_XNGGE.jpg","sneakers women nike air laveder "));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/233479_adidas-superstar-bounce-bb2939-women_light-salmon_BGCRT.jpg", "women light salmon"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/126466_womens-nike-air-max-2016-dark-purple-dust-white-pink-pow_lavender_8I94G.jpg", "sneakers women nike air purple"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/247974_adidas-cfliteracerw-bb9841-women_grey_FY3S4.jpg","adidas women grey"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/108560_womens-nike-free-rn-running-shoe-laser-orange_orange-red_1A5LN.jpg","sneakers women nike running shoes laser orange"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/71720_chuck-taylor-all-star-missoni-pink-freeze-black-egret_pale-violet-red_236IK.jpg","sneakers women pink freeze black "));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/103398_women-classic-authentic-50th-gold-checker_orange-red_X8O50.jpg","sneakers women classic autentic orange red"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/229949_adidas-cloudfoam-lite-racer-w-grey-black-aw4036-women_black_P7RTH.jpg","sneakers adidasracer black sneakers"));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/232636_superga-2750-fabricpltiedyew-rose-women_pink_SSO8D.jpg","sneakers women rose pink "));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/108566_womens-nike-air-zoom-pegasus-32-hyper-violet-white-black_lavender_0TN7M.jpg","snekaers women nike air zoom violet "));
        teams.add(new foto("https://im.berrybenka.com/assets/upload/product/zoom/269524_nike-air-zoom-pegasus-32-photosynth-women_black_EM1M3.jpg","sneakers women nike air zoom photosynth"));


        fotoAdapter adapter = new fotoAdapter(this, teams);
        teamsView.setAdapter(adapter);


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }

}
