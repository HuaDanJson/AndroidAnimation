package zhiyue.cutt.com.androidanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TweenActivity extends AppCompatActivity {

    @BindView(R.id.btn_translate_java_mending_activity) Button mtranslateJava;
    @BindView(R.id.btn_translate_xml_mending_activity) Button mTranslateXml;
    @BindView(R.id.btn_scale_java_mending_activity) Button mScaleJava;
    @BindView(R.id.btn_scale_xml_mending_activity) Button mScaleXml;
    @BindView(R.id.btn_rote_java_mending_activity) Button mRoteJava;
    @BindView(R.id.btn_rote_xml_mending_activity) Button mRoteXml;
    @BindView(R.id.btn_alpha_java_mending_activity) Button mAlphaJava;
    @BindView(R.id.btn_alpha_xml_mending_activity) Button mAlphaXml;
    @BindView(R.id.btn_all_java_mending_activity) Button mAllJava;
    @BindView(R.id.btn_all_xml_mending_activity) Button mAllXml;
    @BindView(R.id.btn_all2_xml_mending_activity) TextView mAllXml2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mending);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_translate_java_mending_activity)
    public void translateJavaClicked() {
/**
 * Button mButton = (Button) findViewById(R.id.Button);
 *         // 步骤1:创建 需要设置动画的 视图View
 *
 *         Animation translateAnimation = new TranslateAnimation(0，500，0，500);
 *         // 步骤2：创建平移动画的对象：平移动画对应的Animation子类为TranslateAnimation
 *         // 参数分别是：
 *         // 1. fromXDelta ：视图在水平方向x 移动的起始值
 *         // 2. toXDelta ：视图在水平方向x 移动的结束值
 *         // 3. fromYDelta ：视图在竖直方向y 移动的起始值
 *         // 4. toYDelta：视图在竖直方向y 移动的结束值
 *
 *         translateAnimation.setDuration(3000);
 *         // 固定属性的设置都是在其属性前加“set”，如setDuration（）
 *         mButton.startAnimation(translateAnimation);
 *         // 步骤3:播放动画
 */
        Animation animation = new TranslateAnimation(0, 0, 0, -100);
        animation.setDuration(250);
        mtranslateJava.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animation2 = new TranslateAnimation(0, 0, -100, 0);
                animation2.setDuration(250);
                mtranslateJava.startAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @OnClick(R.id.btn_translate_xml_mending_activity)
    public void translateXmlClicked() {
        Animation translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim);
        mTranslateXml.startAnimation(translateAnimation);
    }

    @OnClick(R.id.btn_scale_java_mending_activity)
    public void scaleJavaClicked() {
        /**
         * Button mButton = (Button) findViewById(R.id.Button);
         *         // 步骤1:创建 需要设置动画的 视图View
         *
         *           Animation rotateAnimation = new ScaleAnimation(0,2,0,2,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
         *         // 步骤2：创建缩放动画的对象 & 设置动画效果：缩放动画对应的Animation子类为RotateAnimation
         *         // 参数说明:
         *         // 1. fromX ：动画在水平方向X的结束缩放倍数
         *         // 2. toX ：动画在水平方向X的结束缩放倍数
         *         // 3. fromY ：动画开始前在竖直方向Y的起始缩放倍数
         *         // 4. toY：动画在竖直方向Y的结束缩放倍数
         *         // 5. pivotXType:缩放轴点的x坐标的模式
         *         // 6. pivotXValue:缩放轴点x坐标的相对值
         *         // 7. pivotYType:缩放轴点的y坐标的模式
         *         // 8. pivotYValue:缩放轴点y坐标的相对值
         *
         *         // pivotXType = Animation.ABSOLUTE:缩放轴点的x坐标 =  View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
         *         // pivotXType = Animation.RELATIVE_TO_SELF:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
         *         // pivotXType = Animation.RELATIVE_TO_PARENT:缩放轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理)
         *
         *
         *         scaleAnimation.setDuration(3000);
         *         // 固定属性的设置都是在其属性前加“set”，如setDuration（）
         *
         *         mButton.startAnimation(scaleAnimation);
         *         // 步骤3：播放动画
         */
        Animation animation = new ScaleAnimation(0, 2, 0, 2, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(250);
        mScaleJava.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animation2 = new ScaleAnimation(2, 0, 2, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                animation2.setDuration(250);
                mScaleJava.startAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }

    @OnClick(R.id.btn_scale_xml_mending_activity)
    public void scaleXmlClicked() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale_anim);
        mScaleXml.startAnimation(animation);
    }

    @OnClick(R.id.btn_rote_java_mending_activity)
    public void roteJavaClicked() {
        /**
         * // 步骤1:创建 需要设置动画的 视图View
         *
         * // 步骤2：创建旋转动画的对象 & 设置动画效果：旋转动画对应的Animation子类为RotateAnimation
         *         // 参数说明:
         *         // 1. fromDegrees ：动画开始时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
         *         // 2. toDegrees ：动画结束时 视图的旋转角度(正数 = 顺时针，负数 = 逆时针)
         *         // 3. pivotXType：旋转轴点的x坐标的模式
         *         // 4. pivotXValue：旋转轴点x坐标的相对值
         *         // 5. pivotYType：旋转轴点的y坐标的模式
         *         // 6. pivotYValue：旋转轴点y坐标的相对值
         *
         *         // pivotXType = Animation.ABSOLUTE:旋转轴点的x坐标 =  View左上角的原点 在x方向 加上 pivotXValue数值的点(y方向同理)
         *         // pivotXType = Animation.RELATIVE_TO_SELF:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 自身宽度乘上pivotXValue数值的值(y方向同理)
         *         // pivotXType = Animation.RELATIVE_TO_PARENT:旋转轴点的x坐标 = View左上角的原点 在x方向 加上 父控件宽度乘上pivotXValue数值的值 (y方向同理)
         */
        Animation animation = new RotateAnimation(0, 359, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(300);
        mRoteJava.startAnimation(animation);
    }

    @OnClick(R.id.btn_rote_xml_mending_activity)
    public void roteXmlClicked() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim);
        mRoteXml.startAnimation(animation);
    }

    @OnClick(R.id.btn_alpha_java_mending_activity)
    public void alphaJavaClicked() {
        Animation animation = new AlphaAnimation(1, 0);
        animation.setDuration(250);
        mAlphaJava.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Animation animation2 = new AlphaAnimation(0, 1);
                animation2.setDuration(250);
                mAlphaJava.startAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }

    @OnClick(R.id.btn_alpha_xml_mending_activity)
    public void alphaXmlClicked() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim);
        mAlphaXml.startAnimation(animation);
    }

    @OnClick(R.id.btn_all_java_mending_activity)
    public void allJavaClicked() {
        /**
         * Button mButton = (Button) findViewById(R.id.Button);
         *         // 创建 需要设置动画的 视图View
         *
         *         // 组合动画设置
         *         AnimationSet setAnimation = new AnimationSet(true);
         *         // 步骤1:创建组合动画对象(设置为true)
         *
         *
         *         // 步骤2:设置组合动画的属性
         *         // 特别说明以下情况
         *         // 因为在下面的旋转动画设置了无限循环(RepeatCount = INFINITE)
         *         // 所以动画不会结束，而是无限循环
         *         // 所以组合动画的下面两行设置是无效的
         *         setAnimation.setRepeatMode(Animation.RESTART);
         *         setAnimation.setRepeatCount(1);// 设置了循环一次,但无效
         *
         *         // 步骤3:逐个创建子动画(方式同单个动画创建方式,此处不作过多描述)
         *
         *         // 子动画1:旋转动画
         *         Animation rotate = new RotateAnimation(0,360,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
         *         rotate.setDuration(1000);
         *         rotate.setRepeatMode(Animation.RESTART);
         *         rotate.setRepeatCount(Animation.INFINITE);
         *
         *         // 子动画2:平移动画
         *         Animation translate = new TranslateAnimation(TranslateAnimation.RELATIVE_TO_PARENT,-0.5f,
         *                 TranslateAnimation.RELATIVE_TO_PARENT,0.5f,
         *                 TranslateAnimation.RELATIVE_TO_SELF,0
         *                 ,TranslateAnimation.RELATIVE_TO_SELF,0);
         *         translate.setDuration(10000);
         *
         *         // 子动画3:透明度动画
         *         Animation alpha = new AlphaAnimation(1,0);
         *         alpha.setDuration(3000);
         *         alpha.setStartOffset(7000);
         *
         *         // 子动画4:缩放动画
         *         Animation scale1 = new ScaleAnimation(1,0.5f,1,0.5f,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
         *         scale1.setDuration(1000);
         *         scale1.setStartOffset(4000);
         *
         *         // 步骤4:将创建的子动画添加到组合动画里
         *         setAnimation.addAnimation(alpha);
         *         setAnimation.addAnimation(rotate);
         *         setAnimation.addAnimation(translate);
         *         setAnimation.addAnimation(scale1);
         *
         *         mButton.startAnimation(setAnimation);
         *         // 步骤5:播放动画
         */


        AnimationSet setAnimation = new AnimationSet(true);// 步骤1:创建组合动画对象(设置为true)
        // 步骤2:设置组合动画的属性
        // 特别说明以下情况
        // 因为在下面的旋转动画设置了无限循环(RepeatCount = INFINITE)
        // 所以动画不会结束，而是无限循环
        // 所以组合动画的下面两行设置是无效的
        setAnimation.setRepeatMode(Animation.RESTART);
        setAnimation.setRepeatCount(1);// 设置了循环一次,但无效

// 步骤3:逐个创建子动画(方式同单个动画创建方式,此处不作过多描述)

        // 子动画1:旋转动画
        Animation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(1000);
        rotate.setRepeatMode(Animation.RESTART);
        rotate.setRepeatCount(Animation.INFINITE);

        // 子动画2:平移动画
        Animation translate = new TranslateAnimation(TranslateAnimation.RELATIVE_TO_PARENT, -0.5f,
                TranslateAnimation.RELATIVE_TO_PARENT, 0.5f,
                TranslateAnimation.RELATIVE_TO_SELF, 0
                , TranslateAnimation.RELATIVE_TO_SELF, 0);
        translate.setDuration(10000);

        // 子动画3:透明度动画
        Animation alpha = new AlphaAnimation(1, 0);
        alpha.setDuration(3000);
        alpha.setStartOffset(7000);

        // 子动画4:缩放动画
        Animation scale1 = new ScaleAnimation(1, 0.5f, 1, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        scale1.setDuration(1000);
        scale1.setStartOffset(4000);

        // 步骤4:将创建的子动画添加到组合动画里
        setAnimation.addAnimation(alpha);
        setAnimation.addAnimation(rotate);
        setAnimation.addAnimation(translate);
        setAnimation.addAnimation(scale1);

        mAllJava.startAnimation(setAnimation);

    }

    @OnClick(R.id.btn_all_xml_mending_activity)
    public void allXmlClicked() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.all_anim);
        mAllXml.startAnimation(animation);
    }

    @OnClick(R.id.btn_all2_xml_mending_activity)
    public void allXml2Clicked() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.connect_error_tips_animation);
        mAllXml2.startAnimation(animation);
    }

}
