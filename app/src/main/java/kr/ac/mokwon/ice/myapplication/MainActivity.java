package kr.ac.mokwon.ice.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button btName;
    public TextView txName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txName = (TextView)findViewById(R.id.txName);
        btName = (Button)findViewById(R.id.btName);
        btName.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                txName.setText("Cho");
                Toast.makeText(getApplicationContext(), "Cho", Toast.LENGTH_SHORT).show();
            }
        });
    }
}