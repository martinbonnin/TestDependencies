package testdependencies.mbonnin.net.testdependencies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import testdependencies.mbonnin.net.mylibrary.Hello;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.d("Hello world !");
        Toast.makeText(this, Hello.world(), Toast.LENGTH_LONG).show();
    }
}
