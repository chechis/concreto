package silicato_gris.myapplication;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

import silicato_gris.myapplication.fragmento.Ingreso;

public class MainActivity extends AppCompatActivity {


    Ingreso ingreso = new Ingreso();
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
                    }else {

                    }

                    return true;
                case R.id.navigation_dashboard:


                    return true;
                case R.id.navigation_notifications:


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
