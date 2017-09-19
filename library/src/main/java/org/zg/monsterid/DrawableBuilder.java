package org.zg.monsterid;

import android.graphics.drawable.Drawable;

public interface DrawableBuilder<T extends Drawable> {

    T actionBarSize();

    T sizeRes(int dimenRes);

    T sizeDp(int dip);

    T sizePx(int px);

    T color(int color);

    T colorRes(int colorRes);

    T alpha(int alpha);

}
