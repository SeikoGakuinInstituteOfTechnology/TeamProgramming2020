package jp.ac.seiko.sougiken.teamprogramming2020.Kenta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class KitoActivity extends AppCompatActivity {

    private TextView mTextViewName;
    private TextView mTextViewClass;
    private TextView mTextViewFavorite;
    private TextView mTextViewHate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kito);
        mTextViewName = findViewById(R.id.textView_kito_name);
        mTextViewClass = findViewById(R.id.textView_kito_class);
        mTextViewFavorite = findViewById(R.id.textView_kito_favorite);
        mTextViewHate = findViewById(R.id.textView_kito_hate);

    }
}
