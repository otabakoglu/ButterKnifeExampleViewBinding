# ButterKnifeExampleViewBinding

## Annotation	& Description



 https://github.com/JakeWharton/butterknife/tree/master/butterknife-annotations/src/main/java/butterknife
 
 #### @BindView	Binds view object. TextView, Button, Spinner or any view object

 @BindView(R.id.logo)
 ImageView imgLogo;

---
  #### @BindViews	Binds array of views into List

 @BindViews({R.id.lbl_name, R.id.lbl_email, R.id.lbl_address})
 List<TextView> lblArray;

 ---
  #### @BindDrawable	Binds drawable element. Loads the drawable image from res folder

 @BindDrawable(R.mipmap.ic_launcher)
 Drawable drawableLogo;

 ---
  #### @BindString	Binds string resource

 @BindString(R.string.app_name)
 String appName;

 ---
  #### @BindColor	Binds color resource

 @BindColor(R.color.colorPrimaryDark)
 int colorTitle;

 ---
  #### @BindDimen	Binds dimen resource

 @BindDimen(R.id.padding_hori)
 float paddingHorizontal;

 ---
  #### @BindAnim	Binds animation from anim resource

 @BindAnim(R.anim.move_up)
 Animation animMoveUp;

 ---
  #### @BindBitmap	Binds bitmap object.

 @BindBitmap(R.mipmap.ic_launcher)
 Bitmap logo;

 ---
  #### @BindFont	Binds font resource

 @BindViews({R.id.lbl_name, R.id.lbl_email, R.id.lbl_address})
 List<TextView> lblArray;

 ---
  #### @BindFloat	Binds float value

 @BindFloat(R.dimen.radius)
 float radius;

 ---
  #### @BindInt	Binds int resource

 @BindInt(R.integer.distance)
 int distance;
