package br.sp.senac.appcalendar;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalendarView calendarView = (CalendarView) findViewById(R.id.id_Calendario);

        calendarView.setFocusedMonthDateColor(Color.GREEN);

        calendarView.setUnfocusedMonthDateColor(Color.BLUE);
        calendarView.setWeekSeparatorLineColor(Color.GREEN);
        calendarView.setSelectedWeekBackgroundColor(Color.RED);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int ano, int mes, int dia) {
                Toast.makeText(getApplicationContext(), dia + "/" + mes + "/" + ano, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
