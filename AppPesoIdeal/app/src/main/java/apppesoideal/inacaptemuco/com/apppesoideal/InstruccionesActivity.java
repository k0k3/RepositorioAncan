package apppesoideal.inacaptemuco.com.apppesoideal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class InstruccionesActivity extends AppCompatActivity {


    TextView txvInstrucciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucciones);
        txvInstrucciones= (TextView) findViewById(R.id.btn_instrucciones);

    }
}
