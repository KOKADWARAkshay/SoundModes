package com.example.soundmodes;

import android.content.Context;
import android.media.AudioManager;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private AudioManager myAudioManager;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myAudioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
    }
    public void onMode(View v)
    {
        int mod=myAudioManager.getRingerMode();

        if(mod==AudioManager.RINGER_MODE_VIBRATE){
            Toast.makeText(this,"Now in Vibrate Mode",Toast.LENGTH_LONG).show();
        }

        else if(mod==AudioManager.RINGER_MODE_NORMAL){
            Toast.makeText(this,"Now in Ringing Mode",Toast.LENGTH_LONG).show();
        }

        else
        {
            Toast.makeText(this,"Now in Silent Mode",Toast.LENGTH_LONG).show();
        }
    }
    public void onRing(View v)
    {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
        Toast.makeText(this,"Now in Ringing Mode",Toast.LENGTH_LONG).show();
    }
    public void onSilent(View v)
    {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
        Toast.makeText(this,"Now in silent Mode",Toast.LENGTH_LONG).show();
    }
    public void onVibrate(View v)
    {
        myAudioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
        Toast.makeText(this,"Now in Vibrate Mode",Toast.LENGTH_LONG).show();
    }
}
