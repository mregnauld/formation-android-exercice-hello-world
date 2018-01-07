package com.formationandroid.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
	
	// Constantes :
	private static final String TAG = "demonstration";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// init :
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// log :
		Log.d(TAG, "appel de onCreate()");
	}
	
	@Override
	protected void onStart()
	{
		// init :
		super.onStart();
		
		// log :
		Log.d(TAG, "appel de onStart()");
	}
	
	@Override
	protected void onResume()
	{
		// init :
		super.onResume();
		
		// log :
		Log.d(TAG, "appel de onResume()");
	}
	
	@Override
	protected void onPause()
	{
		// init :
		super.onPause();
		
		// log :
		Log.d(TAG, "appel de onPause()");
	}
	
	@Override
	protected void onStop()
	{
		// init :
		super.onStop();
		
		// log :
		Log.d(TAG, "appel de onStop()");
	}
	
	@Override
	protected void onDestroy()
	{
		// init :
		super.onDestroy();
		
		// log :
		Log.d(TAG, "appel de onDestroy()");
	}
	
}
