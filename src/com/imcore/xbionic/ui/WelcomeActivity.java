package com.imcore.xbionic.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v7.app.ActionBarActivity;

import android.widget.ImageView;

import com.imcore.xbionic.R;

public class WelcomeActivity extends ActionBarActivity {
	private ViewPager mViewPager;
	private ImageView imgInclude1, imgInclude2, imgInclude3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);

		getSupportActionBar().hide();
		mViewPager = (ViewPager) findViewById(R.id.viewPager);
		mViewPager.setAdapter(new MyAdapter(getSupportFragmentManager()));
		mViewPager.setOnPageChangeListener(mListener);

		imgInclude1 = (ImageView) findViewById(R.id.img_include1);
		imgInclude2 = (ImageView) findViewById(R.id.img_include2);
		imgInclude3 = (ImageView) findViewById(R.id.img_include3);

	}

	private class MyAdapter extends FragmentStatePagerAdapter {

		public MyAdapter(FragmentManager fm) {
			super(fm);

		}

		@Override
		public int getCount() {

			return 3;
		}

		@Override
		public Fragment getItem(int position) {
			// if(position == 0){
			// imgInclude1.setVisibility(0);
			// imgInclude2.setVisibility(4);
			// imgInclude3.setVisibility(4);
			// }
			Fragment frgmt = null;
			switch (position) {
			case 0:
				frgmt = new FragmentWelcome1();
				break;
			case 1:
				frgmt = new FragmentWelcome2();
				break;
			case 2:
				frgmt = new FragmentWelcome3();
				break;
			}

			return frgmt;
		}

	}

	private OnPageChangeListener mListener = new OnPageChangeListener() {

		@Override
		public void onPageSelected(int position) {
			switch (position) {
			case 0:
				imgInclude1.setVisibility(0);
				imgInclude2.setVisibility(4);
				imgInclude3.setVisibility(4);
				break;

			case 1:
				imgInclude1.setVisibility(4);
				imgInclude2.setVisibility(0);
				imgInclude3.setVisibility(4);
				break;

			case 2:
				imgInclude1.setVisibility(4);
				imgInclude2.setVisibility(4);
				imgInclude3.setVisibility(0);
				break;
			}

		}

		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {

		}

		@Override
		public void onPageScrollStateChanged(int arg0) {

		}
	};

}
