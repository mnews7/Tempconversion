package mattnewsom.tempconversion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText tempInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempInput = (EditText) findViewById(R.id.inputValue);

    }

    public void onClick(View view) {

        RadioButton celsiusButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton fahrenheitButton = (RadioButton) findViewById(R.id.radioButton2);

        if (tempInput.getText().length() == 0) {
            Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_LONG).show();
        } else {
            float inputValue;
            inputValue = Float.parseFloat(tempInput.getText().toString());

            if (celsiusButton.isChecked()) {
                inputValue = ConverterUtil.convertFtoC(inputValue);
                tempInput.setText(String.valueOf(inputValue));
                celsiusButton.setChecked(false);
                fahrenheitButton.setChecked(true);

            } else {
                inputValue = ConverterUtil.convertCtoF(inputValue);
                tempInput.setText(String.valueOf(inputValue));
                celsiusButton.setChecked(true);
                fahrenheitButton.setChecked(false);

            }

        }


    }
}
