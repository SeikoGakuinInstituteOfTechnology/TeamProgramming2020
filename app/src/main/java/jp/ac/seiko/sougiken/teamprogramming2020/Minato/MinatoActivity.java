package jp.ac.seiko.sougiken.teamprogramming2020.Minato;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class MinatoActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavor;
    private TextView mTextViewHate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minato);
        mTextViewName = findViewById(R.id.textView_minato_name);
        mTextViewClass = findViewById(R.id.textView_minato_class);
        mTextViewFavor = findViewById(R.id.textView_minato_favor);
        mTextViewHate = findViewById(R.id.textView_minato_hate);
    }
}
