package app.cominjohnsawickitrkhp_identity_photo.linkedin.httpswww.gitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Adder a = new Adder();
        sum = a.adding(3,7);
        sum+=1;
        Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
    }
}
