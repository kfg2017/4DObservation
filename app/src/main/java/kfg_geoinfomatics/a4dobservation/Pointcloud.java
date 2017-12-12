package kfg_geoinfomatics.a4dobservation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Pointcloud extends Fragment {


    public Pointcloud() {
        // Required empty public constructor
    }

    public WebView mWebview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_pointcloud, container, false);
        mWebview = (WebView) v.findViewById(R.id.webview);
        mWebview.loadUrl("http://192.168.2.101/potree/pageName.html");

        //Enable Javascript
        WebSettings webSettings = mWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Force links and redirects to open in the WebView instead of in a browser
        mWebview.setWebViewClient(new WebViewClient());

        return v;
    }

}
