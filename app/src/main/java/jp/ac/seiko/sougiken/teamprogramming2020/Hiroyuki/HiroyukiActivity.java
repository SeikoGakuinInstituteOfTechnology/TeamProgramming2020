package jp.ac.seiko.sougiken.teamprogramming2020.Hiroyuki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class HiroyukiActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavor;
    private TextView mTextViewHate;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiroyuki);
        mTextViewName = findViewById(R.id.textView_hiroyuki_name);
        mTextViewClass = findViewById(R.id.textView_hiroyuki_class);
        mTextViewFavor = findViewById(R.id.textView_hiroyuki_favor);
        mTextViewHate = findViewById(R.id.textView_hiroyuki_hate);
    }
}
