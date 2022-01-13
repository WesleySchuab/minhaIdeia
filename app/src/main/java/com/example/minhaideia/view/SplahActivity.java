package com.example.minhaideia.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.example.minhaideia.R;
import com.example.minhaideia.model.Cliente;

public class SplahActivity extends AppCompatActivity {
    String TAG = "APP MINHA IDEIA";
    int tempoDeEspera = 1000 *3;
    // CRIA UM OBJETO
    Cliente objCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);
        trocarTela();
    }

    private void trocarTela() {
        // Intent classe intenção de algo
        // trocarDeTela Obj
        Log.d(TAG, "trocarTela: ");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //Instancia
                objCliente = new Cliente("wesley","teste@t","99545644",28,true);

                Intent trocarDeTela = new Intent(SplahActivity.this, MainActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("nome", objCliente.getNome());
                bundle.putString("email", objCliente.getEmail());
                trocarDeTela.putExtras(bundle);

                startActivity(trocarDeTela);
                finish();
            }
        }, tempoDeEspera);

    }
}