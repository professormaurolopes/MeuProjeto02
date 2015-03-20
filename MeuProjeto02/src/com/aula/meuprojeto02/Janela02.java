package com.aula.meuprojeto02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Janela02 extends Activity {
	private TextView txtmsg;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_janela02);
		txtmsg = (TextView) findViewById(R.id.txtmsg);
		//Recupera a Intent
		Intent it = getIntent();
		//Recupera o Bundle
		Bundle param = it.getExtras();
		//Recupera os parametros
		String nome = param.getString("nome");
		int idade = param.getInt("idade");
		//Utiliza os parametros recuperados
		txtmsg.setText("Meu Nome � " + nome + " e minha idade �: " + idade);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.janela02, menu);
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
}
