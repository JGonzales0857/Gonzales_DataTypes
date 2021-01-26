package mcm.edu.ph.gonzales_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayText);

        String firstName = "Joshua Arnel";
        char middleInitial = 'A';
        String lastname = "Gonzales";
        int myAge = 18;
        float myDreamTVLGrade = 95.0f;
        double myMoney = 99999.99;



        //String.valueOf(myMoney);
        display.setText("My name is "+firstName+ " "
                +String.valueOf(middleInitial)+ " "
                +lastname+ "\nand my age is "
                +myAge+ ".\nI want my grade in TVL to be "
                +String.valueOf(myDreamTVLGrade));


        boolean amIMarried = false;

    }
}