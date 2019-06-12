package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton=(Button) findViewById(R.id.askButton);

        final ImageView eightBall = (ImageView) findViewById(R.id.image_eightBall);

        final int[] eightBallArray =
                {R.drawable.ball1, R.drawable.ball2, R.drawable.ball3, R.drawable.ball4, R.drawable.ball5};

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Magic Eight Ball", "The Button has been Pressed");

                Random randomNumberGenerator = new Random ();

                int number = randomNumberGenerator.nextInt(5);

                Log.d("Magic Eight Ball", "The random number is:" + number);
                eightBall.setImageResource(eightBallArray[number]);


            }
        });
    }
}
