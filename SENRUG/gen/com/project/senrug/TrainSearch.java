package com.project.senrug;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class TrainSearch extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.train_web);
		
		String url="m.facebook.com";
		WebView view=(WebView) this.findViewById(R.id.webview1);
		view.getSettings().setJavaScriptEnabled(true);
		view.loadUrl(url);
		
	}
	
	

}
