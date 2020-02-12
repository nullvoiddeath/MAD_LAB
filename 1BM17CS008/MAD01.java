package com.example.s101;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.graphics.Color;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ch =1;
    float font =30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t= (TextView) findViewById(R.id.textView);
        Button btn1 =findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t.setTextSize(font);
                font = font + 3;
                if(font > 50)
                    font = 30;
            }
        });

        Button btn2 = findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(ch)
                {
                    case 1:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 2:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 3:
                        t.setTextColor(Color.MAGENTA);
                        break;
                    case 4:
                        t.setTextColor(Color.RED);
                        break;
                    case 5:
                        t.setTextColor(Color.DKGRAY);
                        break;
                    case 6:
                        t.setTextColor(Color.GRAY);
                    case 7:
                        t.setTextColor(Color.BLUE);
                    case 8:
                        t.setTextColor(Color.BLACK);

                }
                ch ++;
                if (ch ==9)
                {
                    ch =1;
                }


            }
        });
    }

}