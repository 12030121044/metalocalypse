package com.example.eventhandling1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class CaseconverterActivity extends Activity {
	private EditText editString;
	private RadioGroup rgCase;
	private TextView txtString;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caseconverter);
		
		editString=(EditText) findViewById(R.id.mvt);
		rgCase=(RadioGroup) findViewById(R.id.rgCase);
		txtString=(TextView) findViewById(R.id.txtString);
		
		OnCheckedChangeListener listener = new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int radioButtonId) {
				switch(radioButtonId)
				{
				case R.id.lCase:
					txtString.setText(editString.getText().toString()).toLowerCase());
					break;
					
				case R.id.uCase:
					txtString.setText(editString.getText().toString()).toLowerCase());
				}
				
				
			}
		};
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.caseconverter, menu);
		return true;
	}

}
