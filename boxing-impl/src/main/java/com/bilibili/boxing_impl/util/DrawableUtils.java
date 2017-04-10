package com.bilibili.boxing_impl.util;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;

/**
 * Helper methods for the {@link Drawable}.
 */
public class DrawableUtils {

    /**
     * Changes the given drawable tint color.
     *
     * @param context {@link Context}.
     * @param drawableRes The drawable resource id.
     * @param colorRes The tint color resource id.
     * @return The tinted drawable.
     */
    public static Drawable getTintedDrawable(@NonNull final Context context,
                                             @DrawableRes int drawableRes, @ColorRes int colorRes) {
        Drawable d = ContextCompat.getDrawable(context, drawableRes);
        d = DrawableCompat.wrap(d);
        DrawableCompat.setTint(d.mutate(), ContextCompat.getColor(context, colorRes));
        return d;
    }
}
