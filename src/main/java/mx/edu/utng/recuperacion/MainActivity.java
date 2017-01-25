package mx.edu.utng.recuperacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private EditText edtY;
    private Button btCalculate;
    private TextView txvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtY = (EditText)findViewById(R.id.edt_y);
        btCalculate=(Button)findViewById(R.id.btn_calculate);
        txvResult=(TextView)findViewById(R.id.txv_result);

        btCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double letterY=Float.parseFloat(edtY.getText().toString());
                double result=0;

                result=((Math.pow(letterY,4)+6*Math.pow(letterY,3)-7*Math.pow(letterY,2)+9*letterY-3)/(3*Math.pow(letterY,2)));

                txvResult.setText(""+result);
            }
        });
    }
}
