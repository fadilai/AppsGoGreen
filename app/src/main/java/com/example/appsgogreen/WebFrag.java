package com.example.appsgogreen;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class WebFrag extends Fragment {

    public WebFrag() {
        // require a empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        new myikc().execute();

        return inflater.inflate(R.layout.fragment_web, container, false);
    }

    class myikc extends AsyncTask<String, String, String> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }


        protected String doInBackground(String... args) {

            return null;
        }


        protected void onPostExecute(String file_url) {



            WebView wv = (WebView) getView().findViewById(R.id.wvAflowz);
            wv.getSettings().setJavaScriptEnabled(true);
            wv.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
            String url = "http://google.com";

            wv.loadUrl(url);
            wv.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });


            wv.setWebViewClient(new WebViewClient() {
                public void onReceivedError(WebView view, int errorCode, String description,
                                            String
                                                    failingUrl) {
                    Toast.makeText(getActivity(), "Mohon periksa koneksi data internet anda...", Toast.LENGTH_SHORT).show();
                    WebView wv = (WebView) getView().findViewById(R.id.wvAflowz);

                    wv.loadDataWithBaseURL("file:///android_asset/", "<img src=\"file:///android_res/drawable/beringin.jpg\"/>", "text/html", "utf-8", null);
                }
            });

        }
    }
}
