package my.edu.taruc.lab12bmi;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    //Declare global variable here
    private EditText editTextWeight , editTextHeight;
    private TextView textViewResult;
    private ImageView imageViewResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linking UI to program
        editTextWeight = (EditText)findViewById(R.id.editTextWeight);
        editTextHeight = (EditText)findViewById(R.id.editTextHeight);
        textViewResult = (TextView)findViewById(R.id.textViewBMI);
        imageViewResult = (ImageView)findViewById(R.id.imageViewResult);

    }

    public void calculateBMI(View view){
        //TODO : calculate BMI and display the result

        double weight, height, bmi;
        weight = Double.parseDouble(editTextWeight.getText().toString());
        height = Double.parseDouble(editTextHeight.getText().toString());

        height /= 100;

        bmi = weight / Math.pow(height,2);

        //bmi = Double.parseDouble(textViewResult.getText().toString());

        //Set image during run time
        if(bmi<=18.5){
            imageViewResult.setImageResource(R.drawable.under);
        }
        else if(bmi>=21){
            imageViewResult.setImageResource(R.drawable.over);
        }
        else{
            imageViewResult.setImageResource(R.drawable.normal);
        }


    }
}
