package hr.unidu.kruno.promjenalayouta;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fm;
    private boolean prvi = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        // Započni transakciju
        FragmentTransaction ft = fm.beginTransaction();
        // Zamijeni sadržaj kontejnera aktivnosti drugim fragmentom
        ft.replace(R.id.drugi_fragment, new FragmentActivity2());
        //ft.addToBackStack("tag1");
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Potvrdi promjenu
        ft.commit();
    }


}
