package cova.test.activity_app;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.colors_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }

    public void sendMessage(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        EditText editText = (EditText) findViewById(R.id.editText);



        if(editText.getText().toString().equals("equals")){
            System.out.println("EDIT_TEXT_EQUALS");
        }

        if(editText.getText().toString().length() < 10){
            System.out.println("EDIT_TEXT_LENGTH_SMALLER");
        }

        if(editText.getText().toString().length() > 10){
            System.out.println("EDIT_TEXT_LENGTH_GREATER");
        }
        if(editText.getText().toString().length() == 10){
            System.out.println("EDIT_TEXT_LENGTH_EQUALS");
        }




        if(editText.getText().toString().startsWith("startsWith")){
            System.out.println("EDIT_TEXT_STARTS");
        }

        if(editText.getText().toString().endsWith("endsWith")){
            System.out.println("EDIT_TEXT_ENDS");
        }

        if(spinner.getSelectedItem().toString().equals("Red")){
            System.out.println("SPINNER_RED");
        }





        String message = editText.getText().toString();
        if(message.contains("@") && message.length() > 10 && message.endsWith(".com")) {
            System.out.println("EDIT_TEXT_COMBINED");
            Intent intent = new Intent(this, DisplayMessageActivity.class);
            startActivity(intent);
        }

    try {
        if (editText.getText().toString().equals("") || Integer.parseInt(editText.getText().toString()) == 0) {
            System.out.println("EDIT_TEXT_EQUALS_OR_INT_PARSE");
        }


        if (Integer.parseInt(editText.getText().toString()) == 0) {
            System.out.println("EDIT_TEXT_INT_PARSE");
        }
    } catch (Exception e){
        e.printStackTrace();
    }


        int random = new Random().nextInt();
        if(editText.getText().toString().length() > 10 || random >= 11){
            System.out.println("EDIT_TEXT_LENGTH_GREATER_OR_RANDOM");
        }

    }

}
