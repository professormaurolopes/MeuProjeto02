package com.aula.meuprojeto02;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class JanelaPrincipal extends ActionBarActivity implements OnClickListener {

    private EditText tnome,tidade;
    private Button bMsg;
    
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_janela_principal);
        tnome = (EditText) findViewById(R.id.txtNome);
        tidade = (EditText) findViewById(R.id.txtIdade);
        bMsg = (Button) findViewById(R.id.btnMensagem);
        bMsg.setOnClickListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.janela_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		String nome;
		int idade;
		nome = tnome.getText().toString();
		idade = Integer.parseInt(tidade.getText().toString());
		//Toast.makeText(this, nome, Toast.LENGTH_SHORT).show();
		Intent it = new Intent(this, Janela02.class);
		Bundle parametros = new Bundle();
		parametros.putString("nome", nome);
		parametros.putInt("idade", idade);
		it.putExtras(parametros);
		startActivity(it);
		
	}
}
