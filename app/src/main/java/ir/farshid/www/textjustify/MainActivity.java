package ir.farshid.www.textjustify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ir.waspar.www.persiantextjustify.FarshidTextView;

public class MainActivity extends AppCompatActivity {

    private boolean isJustified=false;
    private FarshidTextView farshidTextView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        farshidTextView=findViewById(R.id.farshidTextView);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleText();
            }
        });
    }

    private void toggleText() {
        if(isJustified){
            farshidTextView.setText(getString(R.string.text),false);
            isJustified=false;
            button.setText("justify Text");
        }else {
            farshidTextView.setText(getString(R.string.text),true);
            isJustified=true;
            button.setText("Normal Text");

        }
    }
}
