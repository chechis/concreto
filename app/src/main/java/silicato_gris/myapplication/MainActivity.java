package silicato_gris.myapplication;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.Toast;

import silicato_gris.myapplication.fragmento.Cantidad;
import silicato_gris.myapplication.fragmento.Ingreso;
import silicato_gris.myapplication.fragmento.Proporcion;

public class MainActivity extends AppCompatActivity {


    Ingreso ingreso = new Ingreso();
    Proporcion proporcion = new Proporcion();
    Cantidad cantidad = new Cantidad();

    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
    int numero;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    if (numero != 1){
                    fragmentTransaction.replace(R.id.contenedor, ingreso);
                    fragmentTransaction.commit();
                    numero = 1;
                    }else {
                        Toast.makeText(MainActivity.this, "Ya te encuentras en esta vista", Toast.LENGTH_SHORT).show();

                    }

                    return true;

                case R.id.navigation_dashboard:

                    if (numero != 2){
                        fragmentTransaction.replace(R.id.contenedor, proporcion);
                        fragmentTransaction.commit();
                        numero = 2;
                    }else {
                        Toast.makeText(MainActivity.this, "Ya te encuentras en esta vista", Toast.LENGTH_SHORT).show();

                    }

                    return true;

                case R.id.navigation_notifications:

                    if (numero != 3){
                        fragmentTransaction.replace(R.id.contenedor, cantidad);
                        fragmentTransaction.commit();
                        numero = 3;
                    }else {
                        Toast.makeText(MainActivity.this, "Ya te encuentras en esta vista", Toast.LENGTH_SHORT).show();

                    }


                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        fragmentTransaction.add(R.id.contenedor, ingreso);
        fragmentTransaction.commit();
        numero = 1;

    }

}
