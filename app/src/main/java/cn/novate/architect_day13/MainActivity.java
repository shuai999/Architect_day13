package cn.novate.architect_day13;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = null ;
        ObjectAnimator animator = ObjectAnimator.ofFloat(imageView , "scaleX" , 0f , 1f , 2f) ;
        animator.setInterpolator(new DecelerateInterpolator());
        animator.setDuration(4000).start();

        // 如果要你实现属性动画，该如何实现？
        // 开一个线程，不断的调用 setScale() 方法，传的值是后面的 0f,1f,2f参数，
        // 如何才能调用到 imageView 的 setScaleX() 方法，可以通过反射调用
    }
}
