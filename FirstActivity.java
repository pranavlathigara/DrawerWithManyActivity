package com.example.drawerexample;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class FirstActivity extends MainActivity {

	private TextView main;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.activity_first);
		// setContentView(R.layout.activity_first);

		main = (TextView) findViewById(R.id.main);

		main.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(FirstActivity.this,
						SecondActivity.class));
				finish();
			}
		});
	}

}
