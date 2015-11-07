package morelos.gob.mx.amaresdonar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button corazon,pulmon,rinon,agregar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        corazon= (Button) findViewById(R.id.button);
        pulmon= (Button) findViewById(R.id.button2);
        rinon= (Button) findViewById(R.id.button3);
        agregar= (Button) findViewById(R.id.buttonNombre);
        corazon.setEnabled(false);
        pulmon.setEnabled(false);
        rinon.setEnabled(false);
        corazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historia= new Intent(getApplicationContext(),Historia.class);
                startActivity(historia);
            }
        });
        pulmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent formulario= new Intent(getApplicationContext(),Formulario.class);
                startActivity(formulario);
            }
        });
        rinon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                corazon.setEnabled(true);
                pulmon.setEnabled(true);
                rinon.setEnabled(true);
                corazon.setBackground(getResources().getDrawable(R.drawable.c2));
                pulmon.setBackground(getResources().getDrawable(R.drawable.p2));
                rinon.setBackground(getResources().getDrawable(R.drawable.r2));
            }
        });
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
