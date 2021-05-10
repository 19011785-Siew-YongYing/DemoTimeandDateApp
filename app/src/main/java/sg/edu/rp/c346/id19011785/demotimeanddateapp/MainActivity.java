package sg.edu.rp.c346.id19011785.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textView);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hr = tp.getCurrentHour();
                int min = tp.getCurrentMinute();
                //tvDisplay.setText("Time is " + timeHr + ":" + min);
                tvDisplay.setText(String.format("Time is %d:%d", hr, min));
            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mth = dp.getMonth();
                int yr = dp.getYear();
                int day = dp.getDayOfMonth();
                //tvDisplay.setText("Date is " + day + "/" + mth + "/" + yr); // Display format D/M/Y
                tvDisplay.setText(String.format("Date is %d/%d/%d", day, mth, yr));

            }
        });

    }
}