package morelos.gob.mx.amaresdonar;


        import android.content.Intent;
        import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class InicioHistoria extends AppCompatActivity  {
    ImageButton introduccion;
    int aumenta=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_historia);

        introduccion = (ImageButton) findViewById(R.id.intro);

        introduccion.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if(aumenta == 0) {
                    introduccion.setImageResource(R.drawable.intro2);
                    aumenta++;
                }
                else
                if(aumenta == 1)
                {
                    introduccion.setImageResource(R.drawable.intro3);
                    aumenta++;
                }
                else
                if(aumenta == 2)
                {
                    introduccion.setImageResource(R.drawable.intro4);
                    aumenta++;
                }else
                if (aumenta==3){
                    Intent historiaParte2 = new Intent(getApplicationContext(),HistoriaParte2.class);
                    startActivity(historiaParte2);
                }
            }
        });
    }

}
