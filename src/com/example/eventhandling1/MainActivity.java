package com.example.eventhandling1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private Button click;
	private EditText name;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		click=(Button) findViewById(R.id.mvb);
		name=(EditText) findViewById(R.id.editusername);
		
		click.setText("Go on.");
		
		click.setTextColor(Color.GREEN);
		click.setBackgroundColor(Color.YELLOW);
		
		click.setTextSize((float)12.3);
		
		OnClickListener listener = new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				click.setText(name.getText());
			}
		};
		
		click.setOnClickListener(listener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
