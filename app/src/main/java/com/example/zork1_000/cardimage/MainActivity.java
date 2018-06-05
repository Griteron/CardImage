package com.example.zork1_000.cardimage;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    static int player = 6;
    static int round = 20;

    ImageView player2,player3,player4,player5,player6,trump;
    HorizontalScrollView playerHand, playedCard;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout cardHand = findViewById(R.id.cardHand);
        LayoutInflater inflater = LayoutInflater.from(this);

        //init Trump
        trump = findViewById(R.id.trump);
        for (int i = 0; i < round; i++) {

            View view = inflater.inflate(R.layout.card,cardHand,false);
            ImageView imageView = view.findViewById(R.id.imageView);

            imageView.setClickable(true);


            cardHand.addView(view);
        }
        //init ScrollViews
        playedCard = findViewById(R.id.playedCard);
        playerHand = findViewById(R.id.playerHand);

        createPlayers();
    }






    private void createPlayers() {

        switch (player){

            case 2: player4= findViewById(R.id.player4);
                    player4.setVisibility(View.VISIBLE);
                    break;
            case 3:player3= findViewById(R.id.player3);
                    player3.setVisibility(View.VISIBLE);
                    player5= findViewById(R.id.player5);
                    player5.setVisibility(View.VISIBLE);
                    break;
            case 4: player2=findViewById(R.id.player2);
                    player2.setVisibility(View.VISIBLE);
                    player4= findViewById(R.id.player4);
                    player4.setVisibility(View.VISIBLE);
                    player6= findViewById(R.id.player6);
                    player6.setVisibility(View.VISIBLE);
                    break;
            case 5: player2= findViewById(R.id.player2);
                    player2.setVisibility(View.VISIBLE);
                    player3= findViewById(R.id.player3);
                    player3.setVisibility(View.VISIBLE);
                    player5= findViewById(R.id.player5);
                    player5.setVisibility(View.VISIBLE);
                    player6= findViewById(R.id.player6);
                    player6.setVisibility(View.VISIBLE);
                    break;
            case 6: player4= findViewById(R.id.player4);
                    player4.setVisibility(View.VISIBLE);
                    player2= findViewById(R.id.player2);
                    player2.setVisibility(View.VISIBLE);
                    player3= findViewById(R.id.player3);
                    player3.setVisibility(View.VISIBLE);
                    player5= findViewById(R.id.player5);
                    player5.setVisibility(View.VISIBLE);
                    player6= findViewById(R.id.player6);
                    player6.setVisibility(View.VISIBLE);
                    break;

        }
    }


}
