package ru.library.crc32library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.library.crc32lib.CRCcalculation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CRCcalculation CR = new CRCcalculation();
        String A1 = CR.CRC32ForInt(123);
        String A2 = CR.CRC32SForString("HELLO");
        System.out.println("ARRAY "+ A1+A2);
        System.out.println("CRC "+CR.CRC(A1+A2));
    }
}
