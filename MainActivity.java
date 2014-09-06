package com.example.drawerexample;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String[] data = { "one", "two", "three" };
	public DrawerLayout drawer;
	public ListView navList;

	protected void onCreate(Bundle savedInstanceState, int resLayoutID) {
		super.onCreate(savedInstanceState);
		setContentView(resLayoutID);

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, data);

		drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
		navList = (ListView) findViewById(R.id.drawer);

		navList.setAdapter(adapter);
		navList.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					final int pos, long id) {

				drawer.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {

					@Override
					public void onDrawerClosed(View drawerView) {
						super.onDrawerClosed(drawerView);

						Toast.makeText(MainActivity.this, "Close" + "",
								Toast.LENGTH_LONG).show();
					}
				});
				drawer.closeDrawer(navList);
			}
		});
	}
}
