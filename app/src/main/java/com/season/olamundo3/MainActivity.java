package com.season.olamundo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edNome;
    Button btOK;
    TextView tvNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNome = (EditText) findViewById(R.id.edNome);
        btOK = (Button) findViewById(R.id.btOK);
        tvNome = (TextView) findViewById(R.id.tvNome);

        btOK.setOnClickListener(this);
    }

    public void onClick(View v){
        String nome = edNome.getText().toString();

        if(!nome.trim().isEmpty()){
            tvNome.setText("Olá, " + nome);
        }else{
            AlertDialog.Builder dlg = new AlertDialog.Builder(this);
            dlg.setTitle("Aviso");
            dlg.setMessage("Informe o nome!");
            dlg.setIcon(R.drawable.ic_warning);
            dlg.setPositiveButton("OK",null);
            dlg.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
