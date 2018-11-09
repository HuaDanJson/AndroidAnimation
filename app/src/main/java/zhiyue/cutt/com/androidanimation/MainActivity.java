package zhiyue.cutt.com.androidanimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_frame_main_activity) Button mFrame;
    @BindView(R.id.btn_mending_main_activity) Button mMending;
    @BindView(R.id.btn_attribute_main_activity) Button mAttribute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_frame_main_activity)
    public void frameClicked() {
        startActivity(new Intent(MainActivity.this, FragmentActivity.class));
    }

    @OnClick(R.id.btn_mending_main_activity)
    public void mendingClicked() {
        startActivity(new Intent(MainActivity.this, TweenActivity.class));
    }

    @OnClick(R.id.btn_attribute_main_activity)
    public void attributeClicked() {
        startActivity(new Intent(MainActivity.this, PropertyActivity.class));
    }
}
