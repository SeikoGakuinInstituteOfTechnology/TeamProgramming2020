package jp.ac.seiko.sougiken.teamprogramming2020.Yagami;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import jp.ac.seiko.sougiken.teamprogramming2020.R;

public class Yagamiactivity extends AppCompatActivity {

    private TextView mtextViewName;
    private TextView mtextViewClass;
    private TextView mtextViewFavorite;
    private TextView mtextViewHate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yagamiactivity);
        mtextViewName = findViewById(R.id.textView_yagami_name);
        mtextViewClass = findViewById(R.id.textView_yagami_class);
        mtextViewFavorite= findViewById(R.id.textView_yagami_favorite);
        mtextViewHate = findViewById(R.id.textView_yagami_hate);
    }
}
