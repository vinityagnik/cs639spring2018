package com.example.vinit.assignment_1;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // creating objects

    ImageView img1;
    TextView Birdtxt;
    ImageView img2;
    TextView Cattxt;
    ImageView img3;
    TextView Dogtxt;
    Button btnSilver;
    Button btnGreen;
    Button btnBlue;
    Button btnRed;
    Button btnOlive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);

        btnSilver = findViewById(R.id.btnSilver);
        btnGreen = findViewById(R.id.btnGreen);
        btnBlue = findViewById(R.id.btnBlue);
        btnRed = findViewById(R.id.btnRed);
        btnOlive = findViewById(R.id.btnOlive);

        Birdtxt = findViewById(R.id.Birdtxt);
        Birdtxt.setVisibility(View.INVISIBLE);
        Cattxt = findViewById(R.id.Cattxt);
        Cattxt.setVisibility(View.INVISIBLE);
        Dogtxt = findViewById(R.id.Dogtxt);
        Dogtxt.setVisibility(View.INVISIBLE);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

        btnSilver.setOnClickListener(this);
        btnGreen.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnOlive.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {


        // events for image view click and button
        // check which image is selected and display the textview accordingly
        switch(view.getId()){


            //
            case R.id.img1:
                if(Birdtxt.getVisibility() == View.INVISIBLE)
                {

                    Birdtxt.setVisibility(View.VISIBLE);
                    Cattxt.setVisibility(View.INVISIBLE);
                    Dogtxt.setVisibility(View.INVISIBLE);
                    break;
                }

                if(Birdtxt.getVisibility() != View.INVISIBLE)
                {
                    Birdtxt.setVisibility(View.INVISIBLE);
                    break;
                }

            case R.id.img2:
                if(Cattxt.getVisibility() == View.INVISIBLE)
                {

                    Cattxt.setVisibility(View.VISIBLE);
                    Birdtxt.setVisibility(View.INVISIBLE);
                    Dogtxt.setVisibility(View.INVISIBLE);
                    break;
                }

                if(Cattxt.getVisibility() != View.INVISIBLE)
                {
                    Cattxt.setVisibility(View.INVISIBLE);
                    break;
                }

            case R.id.img3:
                if(Dogtxt.getVisibility() == View.INVISIBLE)
                {

                    Dogtxt.setVisibility(View.VISIBLE);
                    Birdtxt.setVisibility(View.INVISIBLE);
                    Cattxt.setVisibility(View.INVISIBLE);
                    break;
                }

                if(Dogtxt.getVisibility() != View.INVISIBLE)
                {
                    Dogtxt.setVisibility(View.INVISIBLE);
                    break;
                }


                //
            case R.id.btnSilver:
                if(Birdtxt.getVisibility() == View.VISIBLE)
                    img1.setColorFilter(Color.rgb(192,192,192), PorterDuff.Mode.SRC_IN);
                if(Dogtxt.getVisibility() == View.VISIBLE)
                    img3.setColorFilter(Color.rgb(192,192,192), PorterDuff.Mode.SRC_IN);
                 if(Cattxt.getVisibility() == View.VISIBLE)
                    img2.setColorFilter(Color.rgb(192,192,192), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Select an image before choosing a color",
                            Toast.LENGTH_LONG).show();
                break;


            case R.id.btnGreen:
                if(Birdtxt.getVisibility() == View.VISIBLE)
                    img1.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                 if(Dogtxt.getVisibility() == View.VISIBLE)
                    img3.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                  if(Cattxt.getVisibility() == View.VISIBLE)
                    img2.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Select an image before choosing a color",
                            Toast.LENGTH_LONG).show();
                break;

            case R.id.btnBlue:
                if(Birdtxt.getVisibility() == View.VISIBLE)
                    img1.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                 if(Dogtxt.getVisibility() == View.VISIBLE)
                    img3.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                  if(Cattxt.getVisibility() == View.VISIBLE)
                    img2.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Select an image before choosing a color",
                            Toast.LENGTH_LONG).show();
                break;

            case R.id.btnRed:
                if(Birdtxt.getVisibility() == View.VISIBLE)
                    img1.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                 if(Dogtxt.getVisibility() == View.VISIBLE)
                    img3.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                  if(Cattxt.getVisibility() == View.VISIBLE)
                    img2.setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Select an image before choosing a color",
                            Toast.LENGTH_LONG).show();
                break;

            case R.id.btnOlive:
                if(Birdtxt.getVisibility() == View.VISIBLE)
                    img1.setColorFilter(Color.rgb(128,128,0), PorterDuff.Mode.SRC_IN);
                 if(Dogtxt.getVisibility() == View.VISIBLE)
                    img3.setColorFilter(Color.rgb(128,128,0), PorterDuff.Mode.SRC_IN);
                  if(Cattxt.getVisibility() == View.VISIBLE)
                    img2.setColorFilter(Color.rgb(128,128,0), PorterDuff.Mode.SRC_IN);
                else Toast.makeText(this, "Select an image before choosing a color",
                            Toast.LENGTH_LONG).show();
                break;



            default:
                break;

        }
    }


}
