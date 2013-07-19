package com.example.rapewhistle;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	
	Button a,b,c;
	MediaPlayer w;
	ImageView iv;
	RelativeLayout layout;
	
	/*
    @Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	*/


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        a = (Button)findViewById(R.id.button1);
        b = (Button)findViewById(R.id.button2);
      //  c = (Button)findViewById(R.id.button4);
        
        Thread PlayWhistle;
        w = MediaPlayer.create(MainActivity.this, R.raw.audrapewhistle);
        iv = (ImageView)findViewById(R.drawable.q);
        layout = (RelativeLayout)findViewById(R.layout.activity_main);
        
        //SoundPool whist = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        
        
        a.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				w.start();
			}
		});
        
        b.setOnClickListener(new View.OnClickListener() {
			
        	//onClick causes a button to not respond when layout changes
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//b.setImageResource(image);
				//layout.addView(iv);	
				setContentView(R.layout.pic);
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
