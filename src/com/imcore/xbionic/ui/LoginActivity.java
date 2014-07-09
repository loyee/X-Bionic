package com.imcore.xbionic.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

import android.widget.ImageButton;

import com.imcore.xbionic.R;

public class LoginActivity extends Activity implements
		android.view.View.OnClickListener {
	private ImageButton btnSinaLogin, btnQQLogin, btnLogin, btnRegister,
			btnHelp, btnServe;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		btnSinaLogin = (ImageButton) findViewById(R.id.btn_sina_login);
		btnQQLogin = (ImageButton) findViewById(R.id.btn_qq_login);
		btnLogin = (ImageButton) findViewById(R.id.btn_login);
		btnRegister = (ImageButton) findViewById(R.id.btn_register);
		btnHelp = (ImageButton) findViewById(R.id.btn_help);
		btnServe = (ImageButton) findViewById(R.id.btn_serve);

		btnSinaLogin.setOnClickListener(this);
		btnQQLogin.setOnClickListener(this);
		btnLogin.setOnClickListener(this);
		btnRegister.setOnClickListener(this);
		btnHelp.setOnClickListener(this);
		btnServe.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_sina_login:

			break;

		case R.id.btn_qq_login:

			break;
		case R.id.btn_login:
			Intent intent3 = new Intent(LoginActivity.this, TribeLoginActivity.class);
			startActivity(intent3);

			break;
		case R.id.btn_register:

			break;
		case R.id.btn_help:
			Intent intent5 = new Intent(LoginActivity.this,
					WelcomeActivity.class);
			startActivity(intent5);

			break;
		case R.id.btn_serve:

			break;

		}

	}

	// 退出对话框
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setTitle("提示").setMessage("确定退出吗?")
					.setNegativeButton("取消", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int arg1) {
							dialog.dismiss();

						}
					}).setPositiveButton("确定", new OnClickListener() {

						@Override
						public void onClick(DialogInterface dialog, int arg1) {
							dialog.dismiss();
							finish();

							System.exit(0);
						}
					}).create().show();
		}
		return super.onKeyDown(keyCode, event);
	}

}
