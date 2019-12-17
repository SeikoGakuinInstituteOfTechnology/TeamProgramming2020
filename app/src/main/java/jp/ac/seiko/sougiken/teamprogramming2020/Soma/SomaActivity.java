package jp.ac.seiko.sougiken.teamprogramming2020.Soma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class SomaActivity extends AppCompatActivity {

private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavor;
    private TextView mTextViewHate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soma3);
        mTextViewName = findViewById(R.id.textView_soma_name);
        mTextViewClass = findViewById(R.id.textView_soma_class);
        mTextViewFavor = findViewById(R.id.textView_soma_favor);
        mTextViewHate = findViewById(R.id.textView_soma_hate);
    }
}
