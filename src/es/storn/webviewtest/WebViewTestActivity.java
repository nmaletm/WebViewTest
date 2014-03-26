package es.storn.webviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewTestActivity extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
			
			WebView webView;
			
			webView = (WebView)findViewById(R.id.webView1);
			webView.loadUrl("file:///android_asset/index.html");       

			webView = (WebView)findViewById(R.id.webView2);
			webView.loadUrl("file:///android_asset/index.html?test");       

			webView = (WebView)findViewById(R.id.webView3);
			webView.loadUrl("file:///android_asset/index.html#test");


		}



	}
