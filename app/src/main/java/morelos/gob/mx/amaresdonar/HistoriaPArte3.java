package morelos.gob.mx.amaresdonar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoriaPArte3 extends AppCompatActivity {
    Button personajes3,dialogos3;
    TextView texto;
    int numeroCliks=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_parte3);
        personajes3= (Button) findViewById(R.id.personajes3);
        dialogos3=(Button)findViewById(R.id.dialogos3);
        texto= (TextView) findViewById(R.id.textView11);
        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion28));
        personajes3.setBackground(getResources().getDrawable(R.drawable.papunormal));
        dialogos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText(numeroCliks+"");

                switch (numeroCliks){
                    case 1:
                        texto.setText(numeroCliks+"");

                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion28));
                        numeroCliks++;
                        break;
                    case 2:
                        texto.setText(numeroCliks+"");
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion29));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.nada));
                        numeroCliks++;
                        break;
                    case 3:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion30));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papunormal));
                        numeroCliks++;
                        break;
                    case 4:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion31));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.mamatranquila2));
                        numeroCliks++;
                        break;
                    case 5:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion32));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papunormal));

                        numeroCliks++;
                        break;
                    case 6:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion33));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.ananormal));

                        numeroCliks++;
                        break;
                    case 7:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion34));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papunormal));

                        numeroCliks++;
                        break;
                    case 8:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion35));
                        //personajes3.setBackground(getResources().getDrawable(R.drawable.mamatranquila2));

                        numeroCliks++;
                        break;
                    case 9:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion36));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.anasorprendida));

                        numeroCliks++;
                        break;
                    case 10:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion37));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papuenojado));

                        numeroCliks++;
                        break;
                    case 11:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion38));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.mamaenojada2));

                        numeroCliks++;
                        break;
                    case 12:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion39));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papuenojado));

                        numeroCliks++;
                        break;
                    case 13:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion40));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.mamaenojada2));

                        numeroCliks++;
                        break;
                    case 14:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion41));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.papuenojado));

                        numeroCliks++;
                        break;
                    case 15:
                        dialogos3.setBackground(getResources().getDrawable(R.drawable.guion42_ca));
                        personajes3.setBackground(getResources().getDrawable(R.drawable.nada));

                        numeroCliks++;
                        break;
                    case 16:
                        Intent hitoria4 = new Intent(getApplicationContext(),HistoriaParte4.class);
                        startActivity(hitoria4);
                        break;


                }

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historia_parte3, menu);
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
