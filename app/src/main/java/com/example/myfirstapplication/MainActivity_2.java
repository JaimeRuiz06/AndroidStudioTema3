package com.example.myfirstapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity_2 extends AppCompatActivity {

    private static final String TAG = "EJEMPLO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Estoy onCreate JaimeRuiz");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "Estoy onStart JaimeRuiz");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Estoy onResume JaimeRuiz");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Estoy onPause JaimeRuiz");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Estoy onStop JaimeRuiz");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Estoy onRestart JaimeRuiz");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Estoy onDestroy JaimeRuiz");
        Intent ejemplo= new Intent(Intent.ACTION_VIEW);
        ejemplo.setData(Uri.parse("http://www.google.es"));
        startActivity(ejemplo);
    }
}
