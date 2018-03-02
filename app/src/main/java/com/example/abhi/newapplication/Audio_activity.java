package com.example.abhi.newapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.util.Log;

import java.util.Locale;

public class Audio_activity extends AppCompatActivity implements TextToSpeech.OnInitListener {

    private TextToSpeech tts;
    private Button btnspeak;
    private TextView txtText;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        Button back1 = (Button) findViewById(R.id.button1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Audio_activity.this, screen0.class));
            }
        });

        tts = new TextToSpeech(this, this);
        btnspeak = (Button) findViewById(R.id.button8);
        txtText = (TextView) findViewById(R.id.lvRss);

        btnspeak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                speakOut();
            }
        });

    }

    public void onDestroy() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {

        if (status == TextToSpeech.SUCCESS) {

            int result = tts.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA
                    || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Log.e("TTS", "This Language is not supported");
            } else {
                btnspeak.setEnabled(true);
                speakOut();
            }

        } else {
            Log.e("TTS", "Initilization Failed!");
        }

    }

    @SuppressLint("NewApi")
    private void speakOut() {

        CharSequence text = txtText.getText();

        tts.speak(text, TextToSpeech.QUEUE_FLUSH, null,"id1");

    }
}
