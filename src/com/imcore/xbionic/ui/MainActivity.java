package com.imcore.xbionic.ui;

import java.util.Timer;
import java.util.TimerTask;

import com.imcore.xbionic.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.format.Time;
import android.view.Menu;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import android.widget.ImageView;

public class MainActivity extends Activity {
	private ImageView ImgBackground;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImgBackground = (ImageView) findViewById(R.id.img_background);
		final Intent intent = new Intent(this, WelcomeActivity.class);
		Timer timer = new Timer();
		transition();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				startActivity(intent);
				MainActivity.this.finish();
			}
		};
		timer.schedule(task, 1000 * 2);

	}

	private void transition() {
		Animation transition = AnimationUtils.loadAnimation(this,
				R.anim.anim_translate);
		ImgBackground.startAnimation(transition);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
