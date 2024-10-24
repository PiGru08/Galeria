package com.example.galeriazdjec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonLewo;
    Button buttonPrawo;
    Button buttonPolub;
    ImageView imageViewZdj;
    TextView textPolubien;
    int licznik;
    int licznikPolubienDin;
    int licznikPolubienMot;
    int licznikPolubienKot;
    int licznikPolubienPand;
    int licznikPolubienPant;
private ArrayList<Integer> obrazki = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazki.add(R.drawable.motyle);
        obrazki.add(R.drawable.dinosaur);
        obrazki.add(R.drawable.kot);
        obrazki.add(R.drawable.panda);
        obrazki.add(R.drawable.pantera);
        imageViewZdj = findViewById(R.id.imageView2);
        textPolubien = findViewById(R.id.tekstPolubien);

        buttonPolub = findViewById(R.id.buttonPolub);
        buttonPolub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        textPolubien.setText("Polubienia: "+licznikPolubienDin);
                        textPolubien.setText("Polubienia: "+licznikPolubienMot);
                        textPolubien.setText("Polubienia: "+licznikPolubienKot);
                        textPolubien.setText("Polubienia: "+licznikPolubienPand);
                        textPolubien.setText("Polubienia: "+licznikPolubienPant);
                        if (licznik == 0){
                            licznikPolubienDin++;
                            textPolubien.setText("Polubienia: "+licznikPolubienDin);
                        }else if(licznik == 1){
                            licznikPolubienMot++;
                            textPolubien.setText("Polubienia: "+licznikPolubienMot);
                        }else if(licznik == 2){
                            licznikPolubienKot++;
                            textPolubien.setText("Polubienia: "+licznikPolubienKot);

                        }else if(licznik == 3){
                            licznikPolubienPand++;
                            textPolubien.setText("Polubienia: "+licznikPolubienPand);
                        }else if(licznik == 4){
                            licznikPolubienPant++;
                            textPolubien.setText("Polubienia: "+licznikPolubienPant);
                        }
                    }
                }
        );

        buttonLewo = findViewById(R.id.lewo);
        buttonLewo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(licznik == 0){
                            licznik = 4;
                            imageViewZdj.setImageResource(obrazki.get(licznik));
                        }else {
                            licznik--;
                            imageViewZdj.setImageResource(obrazki.get(licznik));
                        }

                    }
                }
        );

        buttonPrawo = findViewById(R.id.prawo);
        buttonPrawo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(licznik == 4){
                            licznik = 0;
                        }else{
                            licznik++;
                            imageViewZdj.setImageResource(obrazki.get(licznik));
                        }
                    }
                }
        );
    }
}