package com.amit.metro_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.net.Uri;

public class MainActivity extends Activity {
	
	Button btn3;
	ImageButton btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (ImageButton) findViewById(R.id.button1);
        btn2 = (ImageButton) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Route_map.class);
		        startActivity(intent);
				
			}
		});
        
         btn2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, Fare_chart.class);
		        startActivity(intent);
				
			}
		});
         
         btn3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = null,chooser = null;
				intent = new Intent(android.content.Intent.ACTION_VIEW);
	    		//For any Action
	    		intent.setData(Uri.parse("geo:27.961429,76.402788"));
	    		chooser = Intent.createChooser(intent,"MAPS Launch");
	    		startActivity(chooser);
			}
		});
    }
}
