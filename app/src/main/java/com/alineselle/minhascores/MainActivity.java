package com.alineselle.minhascores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int nextColor = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button colorButton;
        colorButton =findViewById(R.id.colorButton);

       final ImageView colorImage = findViewById(R.id.colorImage);

        //create an array
       final int[] colorsArray = {
               R.drawable._indigo,
        R.drawable._violet,
        R.drawable.black,
        R.drawable.blue_gray,
        R.drawable.brown,
        R.drawable.dark_green,
        R.drawable.dark_red,
        R.drawable.lavande,
        R.drawable.light_green,
        R.drawable.light_yellow,
        R.drawable.red,
        R.drawable.rose,
        R.drawable.yellow};

        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("My Colors", "Ze Button has been pressed!");
                //Random randomNumberGenerator = new Random();
                //int number = randomNumberGenerator.nextInt(13);

              //  Log.d("My Colors","The random number is "+number);

                Log.d("My Colors","Ze color is "+nextColor);
                colorImage.setImageResource(colorsArray[nextColor++]);
                if (nextColor == colorsArray.length){
                    nextColor =0;
                }
            }
        });

    }
}
