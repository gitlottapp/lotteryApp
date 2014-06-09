package com.example.lotterytestappjuneseven;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	//comments by harminder
	EditText editText01;
	EditText editText02;
	EditText editText03;
	EditText editText04;
	EditText editText05;
	EditText editText06;
	
	String[] textArray;
	
	TextView displayNumbers;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText01= (EditText) findViewById(R.id.EditText01); 
		editText02= (EditText) findViewById(R.id.EditText02); 
		editText03= (EditText) findViewById(R.id.EditText03); 
		editText04= (EditText) findViewById(R.id.EditText04); 
		editText05= (EditText) findViewById(R.id.EditText05); 
		editText06= (EditText) findViewById(R.id.EditText06); 
		
		textArray = new String[]{editText01.getText().toString(), editText02.getText().toString(), editText03.getText().toString(),
				editText04.getText().toString(), editText05.getText().toString(), editText06.getText().toString()};
		
		//System.out.println(textArray);
		displayNumbers = (TextView) findViewById(R.id.DisplayNumbers);
		
		displayNumbers.setText(textArray[0]);
		//dummy comments
	}
	
	

	//@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
