package com.example.eventhandling1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class CaseconverterActivity extends Activity {
	private Button uc, lc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caseconverter);
		
		uc=(Button) findViewById(R.id.button1);
		lc=(Button) findViewById(R.id.button2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.caseconverter, menu);
		return true;
	}

}
