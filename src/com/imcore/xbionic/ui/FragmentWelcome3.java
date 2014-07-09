package com.imcore.xbionic.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.imcore.xbionic.R;

public class FragmentWelcome3 extends Fragment {
	private Button mImgbtnStart;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frgmt_welcome3, null);

		mImgbtnStart = (Button) view.findViewById(R.id.img_btn_start);

		mImgbtnStart.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getActivity(), LoginActivity.class);
				startActivity(intent);
                
			}
		});
		return view;
	}

}