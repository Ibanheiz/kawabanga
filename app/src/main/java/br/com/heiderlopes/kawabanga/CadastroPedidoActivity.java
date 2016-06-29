package br.com.heiderlopes.kawabanga;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class CadastroPedidoActivity extends AppCompatActivity {

    private EditText etCliente;
    private RadioGroup rgTamanhos;
    private EditText etQuantidade;
    private EditText etValor;
    private Spinner spSabor;
    private Button btFecharPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pedido);
        etCliente = (EditText) findViewById(R.id.etCliente);
        rgTamanhos = (RadioGroup)findViewById(R.id.rgTamanhos);
        etQuantidade = (EditText)findViewById(R.id.etQuantidade);
        etValor = (EditText)findViewById(R.id.etValor);
        spSabor = (Spinner)findViewById(R.id.spSabor);
        btFecharPedido = (Button)findViewById(R.id.btFecharPedido);

        btFecharPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CadastroPedidoActivity.this,
                        getString(R.string.pedido_com_sucesso,
                                etCliente.getText().toString()),
                        Toast.LENGTH_LONG).show();
            }
        });
    }

    private void teste() {

    }
}








