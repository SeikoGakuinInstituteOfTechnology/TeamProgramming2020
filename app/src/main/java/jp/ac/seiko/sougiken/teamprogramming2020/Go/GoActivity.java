package jp.ac.seiko.sougiken.teamprogramming2020.Go;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class GoActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavor;
    private TextView mTextViewHate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        mTextViewName = findViewById(R.id.textView_go_name);
        mTextViewName = findViewById(R.id.textView_go_class);
        mTextViewName = findViewById(R.id.textView_go_favor);
        mTextViewName = findViewById(R.id.textView_hate);

        init();
    }
    private void init(){
        mTextViewName.setText("安間 豪");
        mTextViewClass.setText("中１C");
        mTextViewFavor.setText("AMD");
        mTextViewHate.setText("Apple");
    }
}
