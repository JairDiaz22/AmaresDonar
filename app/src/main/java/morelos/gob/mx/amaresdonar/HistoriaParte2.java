package morelos.gob.mx.amaresdonar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HistoriaParte2 extends AppCompatActivity {
    Button texto,image;
    TextView contador;
    int numeroClicks=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_parte2);
        texto= (Button) findViewById(R.id.buttonHistoriaParte2);
        image= (Button) findViewById(R.id.imagenes);
        contador= (TextView) findViewById(R.id.textViewcontador);
        texto.setBackground(getResources().getDrawable(R.drawable.guion1));
        image.setBackground(getResources().getDrawable(R.drawable.ananormal));
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (numeroClicks){
                    case 1:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion1));
                        image.setBackground(getResources().getDrawable(R.drawable.ananormal));
                        numeroClicks++;
                        break;
                    case 2:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion2));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatranquila2));
                        numeroClicks++;
                        break;
                    case 3:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion3));
                        image.setBackground(getResources().getDrawable(R.drawable.anafeliz));
                        numeroClicks++;
                        break;
                    case 4:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion4));
                        image.setBackground(getResources().getDrawable(R.drawable.anafeliz));
                        numeroClicks++;
                        break;
                    case 5:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion5));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatranquila2));
                        numeroClicks++;
                        break;
                    case 6:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion6));
                        image.setBackground(getResources().getDrawable(R.drawable.nada));
                        numeroClicks++;
                        break;
                    case 7:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion7));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.ananormal));
                        break;
                    case 8:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion8));
                        image.setBackground(getResources().getDrawable(R.drawable.aaronfeliz));

                        numeroClicks++;
                        break;
                    case 9:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion9));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.anafeliz));
                        break;
                    case 10:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion10));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.aarontranqulio));
                        break;
                    case 11:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion11));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.aaronpreocupado));
                        break;
                    case 12:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion12));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.anasorprendida));
                        break;
                    case 13:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion13));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.aaronpreocupado));
                        break;
                    case 14:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion14));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.mamaenojada2));
                        break;
                    case 15:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion15));
                        numeroClicks++;
                        image.setBackground(getResources().getDrawable(R.drawable.aaronpreocupado));
                        break;
                    case 16:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion16));
                        numeroClicks++;
                        //image.setBackground(getResources().getDrawable(R.drawable.mamaenojada));
                        break;
                    case 17:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion17));
                        image.setBackground(getResources().getDrawable(R.drawable.mamaenojada2));
                        numeroClicks++;
                        break;
                    case 18:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion18));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatriste2));
                        numeroClicks++;
                        break;
                    case 19:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion19));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatriste2));
                        numeroClicks++;
                        break;
                    case 20:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion20));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatriste2));
                        numeroClicks++;
                        break;
                    case 21:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion21));
                        image.setBackground(getResources().getDrawable(R.drawable.anatriste));
                        numeroClicks++;
                        break;
                    case 22:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion22));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatriste2));
                        numeroClicks++;
                        break;
                    case 23:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion23));
                        image.setBackground(getResources().getDrawable(R.drawable.anatriste));
                        numeroClicks++;
                        break;
                    case 24:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion24));
                        image.setBackground(getResources().getDrawable(R.drawable.mamatriste2));
                        numeroClicks++;
                        break;
                    case 25:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion25));
                        image.setBackground(getResources().getDrawable(R.drawable.nada));
                        numeroClicks++;
                        break;
                    case 26:
                        contador.setText(numeroClicks+"");
                        texto.setBackground(getResources().getDrawable(R.drawable.guion26));
                        image.setBackground(getResources().getDrawable(R.drawable.nada));
                        numeroClicks++;
                        break;
                    case 27:
                        contador.setText(numeroClicks+"");
                        /////////////////////////////////////////////////////////////////////////////////////////////////////////
                        numeroClicks++;
                        break;
                    case 28:
                        Intent historiaPArte3 = new Intent(getApplicationContext(),HistoriaPArte3.class);
                        startActivity(historiaPArte3);
                        break;

                    default:
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historia_parte2, menu);
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
