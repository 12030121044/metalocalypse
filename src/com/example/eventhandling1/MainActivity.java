package com.example.eventhandling1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Button click;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		click=(Button) findViewById(R.id.mvb);
		
		click.setText("Go on.");
		
		click.setTextColor(Color.GREEN);
		click.setBackgroundColor(Color.YELLOW);
		
		click.setTextSize((float)12.3);
		
		OnClickListener listener=new OnClickListener(){
			
			@Override
			public void onClick(View view){
				click.setText("Button was clicked");
			}
			
		};
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
