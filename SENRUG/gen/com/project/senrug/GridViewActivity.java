package com.project.senrug;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;


public class GridViewActivity extends Activity {

	GridView gridView;
	static final String[] VALUES=new String[]{"Trains","Locate","Newsletter","Vandalism"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_grid);
		gridView = (GridView) findViewById(R.id.gridView1);
		gridView.setAdapter(new ImageAdapter(this, VALUES));
		
		gridView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				Toast.makeText(
				   getApplicationContext(),
				   ((TextView) v.findViewById(R.id.grid_item_label))
				   .getText(), Toast.LENGTH_SHORT).show();
				String temp=(String) ((TextView) v.findViewById(R.id.grid_item_label)).getText();
				//System.out.print(temp);
				//if(temp.equals("Trains")){
					//Intent trainsearch=new Intent("com.example.senrug.TRAINSEARCH");
					//startActivity(trainsearch);
				//}
				
 
			}

			
		});
		
		
	}
	
	
	

}
