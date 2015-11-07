package morelos.gob.mx.amaresdonar;

/**
 * Created by luisolartegervacio on 06/11/15.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {

    private long SPLASH_DELAY = 1000; //6 segundos
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        image= (ImageView) findViewById(R.id.image);

      //  Animation hyperspaceJump = AnimationUtils.loadAnimation(getApplicationContext(), R.animator.corazon);
     //   image.startAnimation(hyperspaceJump);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(getApplicationContext(),
                        Splash2.class);

                startActivity(mainIntent);
                //Destruimos esta activity para prevenit
                //que el usuario retorne aqui presionando el boton Atras.
                finish();
            }
        };

        Timer timer = new Timer();

        timer.schedule(task, SPLASH_DELAY);
        //image.setBackground(getResources().getDrawable(R.drawable.hackton));
    }

}
