package com.meet.learnpython;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.github.barteksc.pdfviewer.PDFView;
import com.google.android.ads.nativetemplates.NativeTemplateStyle;
import com.google.android.ads.nativetemplates.TemplateView;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.nativead.NativeAd;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PY_1 extends AppCompatActivity {
    static int flag=0;
    AdView mAdview;
    AdRequest adRequest;
    String str1,str2,str3;
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_y_1);
        setTitle(getIntent().getExtras().getString("key1"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String str = getIntent().getExtras().getString("key");
        if(str.equals("0")){
            str1="1_intro.html";
            str2="1_1_intro.html";
        }else if(str.equals("1")){
            str1="2_compiler.html";
            str2="2_1_compiler.html";
        }else if(str.equals("2")){
            str1="3_input.html";
            str2="3_1_input.html";
        }else if(str.equals("3")){
            str1="4_program.html";
            str2="4_1_program.html";
        }else if(str.equals("4")){
            str1="5_comment.html";
            str2="5_1_comment.html";
        }else if(str.equals("5")){
            str1="6_variable.html";
            str2="6_1_variable.html";
        }else if(str.equals("6")){
            str1="7_data_types.html";
            str2="7_1_data_types.html";
        }else if(str.equals("7")){
            str1="8_number.html";
            str2="8_1_number.html";
        }else if(str.equals("8")){
            str1="9_list.html";
            str2="9_1_list.html";
        }else if(str.equals("9")){
            str1="10_string.html";
            str2="10_1_string.html";
        }else if(str.equals("10")){
            str1="11_tuple.html";
            str2="11_1_tuple.html";
        }else if(str.equals("11")){
            str1="12_dictionary.html";
            str2="12_1_dictionary.html";
        }else if(str.equals("12")){
            str1="13_operator.html";
            str2="13_1_operator.html";
        }else if(str.equals("13")){
            str1="14_ifelse.html";
            str2="14_1_ifelse.html";
        }else if(str.equals("14")){
            str1="15_loops.html";
            str2="15_1_loops.html";
        }else if(str.equals("15")){
            str1="16_break.html";
            str2="16_1_break.html";
        }else if(str.equals("16")){
            str1="17_function.html";
            str2="17_1_function.html";
        }else if(str.equals("17")){
            str1="18_local_variable.html";
            str2="18_1_local_variable.html";
        }else if(str.equals("18")){
            str1="19_module.html";
            str2="19_1_module.html";
        }else if(str.equals("19")){
            str1="20_file_handling.html";
            str2="20_1_file_handling.html";
        }else if(str.equals("20")){
            str1="21_exception.html";
            str2="21_1_exception.html";
        }else if(str.equals("21")){
            str1="22_class.html";
            str2="22_1_class.html";
        }else if(str.equals("22")){
            str1="23_constructor.html";
            str2="23_1_constructor.html";
        }else if(str.equals("23")){
            str1="24_inheritance.html";
            str2="24_1_inheritance.html";
        }else if(str.equals("24")){
            str1="25_overloading.html";
            str2="25_1_overloading.html";
        }else if(str.equals("25")){
            str1="26_encapsulation.html";
            str2="26_1_encapsulation.html";
        }else if(str.equals("26")){
            str1="27_regular_expression.html";
            str2="27_1_regular_expression.html";
        }else if(str.equals("27")){
            str1="28_thread.html";
            str2="28_1_thread.html";
        }else if(str.equals("28")){
            str1="29_socket.html";
            str2="29_1_socket.html";
        }else if(str.equals("29")){
            str1="searching.html";
            str2="searching_1.html";
        }else if(str.equals("30")){
            str1="bubble_sort.html";
            str2="bubble_sort_1.html";
        }else if(str.equals("31")){
            str1="insertion_sort.html";
            str2="insertion_sort_1.html";
        }else if(str.equals("32")){
            str1="merge_sort.html";
            str2="merge_sort_1.html";
        }else if(str.equals("33")){
            str1="selection_sort.html";
            str2="selection_sort_1.html";
        }

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("file:///android_asset/"+str1);
        WebSettings webSettings = webView.getSettings();
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        webView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        webView.setLongClickable(false);

        WebView webView1 = (WebView) findViewById(R.id.webView1);
        webView1.loadUrl("file:///android_asset/"+str2);
        WebSettings webSettings1 = webView.getSettings();
        webView1.setWebViewClient(new WebViewClient());
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.getSettings().setJavaScriptEnabled(true);
        webSettings1.setDomStorageEnabled(true);
        webView1.getSettings().setBuiltInZoomControls(true);
        webView1.getSettings().setDisplayZoomControls(false);

        webView1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return true;
            }
        });
        webView1.setLongClickable(false);

        mAdview = (AdView)findViewById(R.id.adView);
        adRequest=new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);

        AdLoader adLoader = new AdLoader.Builder(this, getResources().getString(R.string.PY_native))
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    private ColorDrawable background;@Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();
        adLoader.loadAd(adRequest);

        AdLoader adLoader1 = new AdLoader.Builder(this, getResources().getString(R.string.PY_native1))
                .forNativeAd(new NativeAd.OnNativeAdLoadedListener() {
                    private ColorDrawable background;@Override
                    public void onNativeAdLoaded(NativeAd nativeAd) {
                        NativeTemplateStyle styles = new
                                NativeTemplateStyle.Builder().withMainBackgroundColor(background).build();
                        TemplateView template = findViewById(R.id.my_template1);
                        template.setStyles(styles);
                        template.setNativeAd(nativeAd);
                    }
                })
                .build();
        adLoader1.loadAd(adRequest);

        showAd();

        ScheduledExecutorService scheduler =
                Executors.newSingleThreadScheduledExecutor();
        scheduler.scheduleAtFixedRate(new Runnable() {

            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        if(flag==0) {
                            if (mInterstitialAd!= null) {
                                mInterstitialAd.show(PY_1.this);
                            }
                            showAd();
                        }
                    }
                });

            }
        }, 150, 150, TimeUnit.SECONDS);

    }
    public void showAd(){
        InterstitialAd.load(this,getResources().getString(R.string.PY_interstitial), adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void onStart() {
        super.onStart();
        flag=0;
    }
    protected void onRestart() {
        super.onRestart();
        flag=0;
    }
    protected void onResume() {
        super.onResume();
        flag=0;
    }
    public void onStop() {
        super.onStop();
        flag=1;
    }
    protected void onDestroy() {
        super.onDestroy();
        flag=1;
    }
    protected void onPause() {
        super.onPause();
        flag=1;
    }
}