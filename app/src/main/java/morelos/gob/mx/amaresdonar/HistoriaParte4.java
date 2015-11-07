package morelos.gob.mx.amaresdonar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoriaParte4 extends AppCompatActivity {
    Button personaje4,dialogo4;
    TextView texto;
    int numeroClikcs=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_parte4);
        personaje4= (Button) findViewById(R.id.personajes4);
        dialogo4=(Button) findViewById(R.id.dialogos4);
        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion43));
        texto.setText(numeroClikcs + "");
        dialogo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText(numeroClikcs + "");
                switch (numeroClikcs){
                    case 1:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion43));
                        numeroClikcs++;
                        break;
                    case 2:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion44));
                        numeroClikcs++;
                        break;
                    case 3:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion45));
                        numeroClikcs++;
                        break;
                    case 4:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion46));
                        numeroClikcs++;
                        break;
                    case 5:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion47));
                        numeroClikcs++;
                        break;
                    case 6:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion48));
                        numeroClikcs++;
                        break;
                    case 7:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion49));
                        numeroClikcs++;
                        break;
                    case 8:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion50));
                        numeroClikcs++;
                        break;
                    case 9:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion51));
                        numeroClikcs++;
                        break;
                    case 10:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion52));
                        numeroClikcs++;
                        break;
                    case 11:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion53));
                        numeroClikcs++;
                        break;
                    case 12:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion54));
                        numeroClikcs++;
                        break;
                    case 13:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion55));
                        numeroClikcs++;
                        break;
                    case 14:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion56));
                        numeroClikcs++;
                        break;
                    case 15:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion57));
                        numeroClikcs++;
                        break;
                    case 16:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion58));
                        numeroClikcs++;
                        break;
                    case 17:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion59));
                        numeroClikcs++;
                        break;
                    case 18:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion60));
                        numeroClikcs++;
                        break;
                    case 19:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion61));
                        numeroClikcs++;
                        break;
                    case 20:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion62));
                        numeroClikcs++;
                        break;
                    case 21:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion63));
                        numeroClikcs++;
                        break;
                    case 22:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion64));
                        numeroClikcs++;
                        break;
                    case 23:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion65));
                        numeroClikcs++;
                        break;
                    case 24:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion66));
                        numeroClikcs++;
                        break;
                    case 25:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion67));
                        numeroClikcs++;
                        break;
                    case 26:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion68));
                        numeroClikcs++;
                        break;
                    case 27:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion69));
                        numeroClikcs++;
                        break;
                    case 28:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion70));
                        numeroClikcs++;
                        break;
                    case 29:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion71_ca));
                        numeroClikcs++;
                        break;
                    case 30:
                        dialogo4.setBackground(getResources().getDrawable(R.drawable.guion72));
                        numeroClikcs++;
                        break;
                    case 31:
                        Intent historia5 = new Intent(getApplicationContext(),HistoriaParte5.class);
                        startActivity(historia5);
                        break;
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historia_parte4, menu);
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
