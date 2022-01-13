package com.example.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.minhaideia.R;
import com.example.minhaideia.core.AppUtil;
import com.example.minhaideia.model.Cliente;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtil.TAG, "onCreate: tela Principal carregada");

        // Recupera a informação da outra activity
        Bundle bundle = getIntent().getExtras();
    }
}