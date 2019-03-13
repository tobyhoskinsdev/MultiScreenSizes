package examples.aaronhoskins.com.multiscreensizes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvPhoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPhoneNumber = findViewById(R.id.tvPhoneNumber);
        if(tvPhoneNumber != null) {
            tvPhoneNumber.setText("8675309");
        }
    }
}
