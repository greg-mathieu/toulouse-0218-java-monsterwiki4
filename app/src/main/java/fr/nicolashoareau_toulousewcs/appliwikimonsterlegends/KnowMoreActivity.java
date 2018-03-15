package fr.nicolashoareau_toulousewcs.appliwikimonsterlegends;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class KnowMoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_more);

        setTitle("Know More About Us !");

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.militarycreation);
        mediaPlayer.start();

        //On créer un élement tvBlink avec l'id du texte du titlebanniere
        TextView tvKnow = (TextView) findViewById(R.id.textView3);
        //on paramètre l'animation
        Animation animKnow = new AlphaAnimation(0.0f, 1.0f);
        animKnow.setDuration(2000); //c'est le paramètre qui permet de paramètrer la fréquence du clignot
        animKnow.setStartOffset(5);//temps qu'il reste invisible
        animKnow.setRepeatMode(Animation.REVERSE);
        animKnow.setRepeatCount(Animation.INFINITE);
        tvKnow.startAnimation(animKnow);
        tvKnow.setTextColor(this.getResources().getColor(R.color.colorAccent));

    }
}
