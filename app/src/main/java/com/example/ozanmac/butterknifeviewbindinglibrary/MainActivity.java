package com.example.ozanmac.butterknifeviewbindinglibrary;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindColor;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    //Bind View
    @BindView(R.id.act_main_tv_text)
    TextView tvText;

    @BindView(R.id.act_main_et_name)
    EditText etName;


    //Bind Drawable & Color
    @BindDrawable(R.mipmap.ic_launcher)
    Drawable drawableLogo;

    @BindColor(R.color.colorPrimaryDark)
    int colorTitle;

    //Bind List
    @BindViews({R.id.text1, R.id.text2, R.id.text3})
    List<TextView> texts;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        final String[] lblText = new String[]{"Dog1", "Dog2", "Dog3"};

        ButterKnife.Action<TextView> applyText = new ButterKnife.Action<TextView>() {
            @Override
            public void apply(@NonNull TextView view, int index) {
                view.setText(lblText[index]);
            }
        };

        ButterKnife.apply(texts, applyText);
    }

    @OnClick(R.id.act_main_btn_enter)
    public void onClickEnter(View v){
        Toast.makeText(this, "Heyoo!! " + etName.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
/**


 Annotation	& Description

 https://github.com/JakeWharton/butterknife/tree/master/butterknife-annotations/src/main/java/butterknife
 
 @BindView	Binds view object. TextView, Button, Spinner or any view object

 @BindView(R.id.logo)
 ImageView imgLogo;

---
 @BindViews	Binds array of views into List

 @BindViews({R.id.lbl_name, R.id.lbl_email, R.id.lbl_address})
 List<TextView> lblArray;

 ---
 @BindDrawable	Binds drawable element. Loads the drawable image from res folder

 @BindDrawable(R.mipmap.ic_launcher)
 Drawable drawableLogo;

 ---
 @BindString	Binds string resource

 @BindString(R.string.app_name)
 String appName;

 ---
 @BindColor	Binds color resource

 @BindColor(R.color.colorPrimaryDark)
 int colorTitle;

 ---
 @BindDimen	Binds dimen resource

 @BindDimen(R.id.padding_hori)
 float paddingHorizontal;

 ---
 @BindAnim	Binds animation from anim resource

 @BindAnim(R.anim.move_up)
 Animation animMoveUp;

 ---
 @BindBitmap	Binds bitmap object.

 @BindBitmap(R.mipmap.ic_launcher)
 Bitmap logo;

 ---
 @BindFont	Binds font resource

 @BindViews({R.id.lbl_name, R.id.lbl_email, R.id.lbl_address})
 List<TextView> lblArray;

 ---
 @BindFloat	Binds float value

 @BindFloat(R.dimen.radius)
 float radius;

 ---
 @BindInt	Binds int resource

 @BindInt(R.integer.distance)
 int distance;

 **/