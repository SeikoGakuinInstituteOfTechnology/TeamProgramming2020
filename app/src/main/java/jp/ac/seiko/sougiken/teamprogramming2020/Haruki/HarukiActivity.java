package jp.ac.seiko.sougiken.teamprogramming2020.Haruki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class HarukiActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavor;
    private TextView mTextHate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haruki);
        mTextViewName = findViewById(R.id.textView_Haruki_name);
        mTextViewClass = findViewById(R.id.textView_Haruki_class);
        mTextViewFavor = findViewById(R.id.textView_Haruki_favor);
        mTextHate = findViewById(R.id.textView_Haruki_hate);

        init();
    }
    private void init() {
        mTextViewName.setText("山田智貴");
        mTextViewClass.setText("中2B組43番");
        mTextViewFavor.setText("Twitter");
        mTextHate.setText("宿題");
    }
}
