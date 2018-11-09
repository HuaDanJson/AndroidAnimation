package zhiyue.cutt.com.androidanimation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PropertyActivity extends AppCompatActivity {

    @BindView(R.id.btn_translate_java_property_activity) Button mtranslateJava;
    @BindView(R.id.btn_translate_xml_property_activity) Button mTranslateXml;
    @BindView(R.id.btn_scale_java_property_activity) Button mScaleJava;
    @BindView(R.id.btn_scale_xml_property_activity) Button mScaleXml;
    @BindView(R.id.btn_rote_java_property_activity) Button mRoteJava;
    @BindView(R.id.btn_rote_xml_property_activity) Button mRoteXml;
    @BindView(R.id.btn_alpha_java_property_activity) Button mAlphaJava;
    @BindView(R.id.btn_alpha_xml_property_activity) Button mAlphaXml;
    @BindView(R.id.btn_all_java_property_activity) Button mAllJava;
    @BindView(R.id.btn_all_xml_property_activity) Button mAllXml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attribute);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_translate_java_property_activity)
    public void translateJavaClicked() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mtranslateJava, "translationX", 0f, -300f, 0f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mtranslateJava, "translationY", 0f, 500f, 300f, 800f, 0);
        animator.setDuration(300);
        animator2.setDuration(500);
        animator.start();
        animator2.start();
    }

    @OnClick(R.id.btn_translate_xml_property_activity)
    public void translateXmlClicked() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.translate_animator);
        animator.setTarget(mTranslateXml);
        animator.start();
    }

    @OnClick(R.id.btn_scale_java_property_activity)
    public void scaleJavaClicked() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mScaleJava, "scaleX", 1f, 2f, 1f);
        animator.setDuration(500);
        animator.start();
    }

    @OnClick(R.id.btn_scale_xml_property_activity)
    public void scaleXmlClicked() {

    }

    @OnClick(R.id.btn_rote_java_property_activity)
    public void roteJavaClicked() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mRoteJava, "rotation", 0f, 360f, 0f, 360);
        animator.setDuration(2000);
        animator.start();
    }

    @OnClick(R.id.btn_rote_xml_property_activity)
    public void roteXmlClicked() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.rotate_animator);
        animator.setTarget(mRoteXml);
        animator.start();
    }

    @OnClick(R.id.btn_alpha_java_property_activity)
    public void alphaJavaClicked() {
        ObjectAnimator animator = ObjectAnimator.ofFloat(mAlphaJava, "alpha", 1.0f, 0.0f, 1.0f);
        animator.setDuration(1000);
        animator.setRepeatCount(-1);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.start();
        animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }
        });
    }

    @OnClick(R.id.btn_alpha_xml_property_activity)
    public void alphaXmlClicked() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.alpha_animator);
        animator.setTarget(mAlphaXml);
        animator.start();
    }

    @OnClick(R.id.btn_all_java_property_activity)
    public void allJavaClicked() {
        //沿x轴放大
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat(mAllJava, "scaleX", 1f, 2f, 1f);
        //沿y轴放大
        ObjectAnimator scaleYAnimator = ObjectAnimator.ofFloat(mAllJava, "scaleY", 1f, 2f, 1f);
        //移动
        ObjectAnimator translationXAnimator = ObjectAnimator.ofFloat(mAllJava, "translationX", 0f, 200f, 0f);
        //透明动画
        ObjectAnimator animator = ObjectAnimator.ofFloat(mAllJava, "alpha", 1f, 0f, 1f);
        AnimatorSet set = new AnimatorSet();
        //同时沿X,Y轴放大，且改变透明度，然后移动
        set.play(scaleXAnimator).with(scaleYAnimator).with(animator).before(translationXAnimator);
        //都设置3s，也可以为每个单独设置
        set.setDuration(3000);
        set.start();

        set.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animation) {
                super.onAnimationCancel(animation);
                //动画被取消的时候调用
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //画结束的时候调用
            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                super.onAnimationRepeat(animation);
                //动画重复执行的时候调用
            }

            @Override
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                //动画开始的时候调用
            }

            @Override
            public void onAnimationPause(Animator animation) {
                super.onAnimationPause(animation);
            }

            @Override
            public void onAnimationResume(Animator animation) {
                super.onAnimationResume(animation);
            }
        });

//        animator.setStartDelay(1000);//延迟1000ms后执行,需要在start()前调用
    }

    @OnClick(R.id.btn_all_xml_property_activity)
    public void allXmlClicked() {
        Animator animator = AnimatorInflater.loadAnimator(this, R.animator.all_animator);
        animator.setTarget(mAllXml);
        animator.start();
    }
}
