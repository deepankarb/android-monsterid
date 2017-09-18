package org.zg.monsterid_sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.TypedValue;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by deepankar on 12/10/15.
 */
public class Util {

    public static float dip2px(float dip, Context ctx) {
        return dip2px(dip, ctx.getResources().getDisplayMetrics());
    }

    public static float dip2px(float dip, DisplayMetrics metrics) {
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, metrics);
    }

    /**
     * Returns the Euclidean distance between two points.
     *
     * @param p1 First point.
     * @param p2 Second point.
     * @return The distance, as the crow flies, between the given points.
     */
    static double dist(PointF p1, PointF p2) {
        return dist(p1.x, p2.x, p1.y, p2.y);
    }

    private static double dist(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    /**
     * Convenience method. to draw a point on a canvas with a give paint.
     *
     * @param canvas The canvas to draw the point on.
     * @param paint  The paint to draw the point with.
     * @param point  The point to draw.
     */
    static void drawPoint(Canvas canvas, Paint paint, PointF point) {
        canvas.drawPoint(point.x, point.y, paint);
    }

    public static String md5(String in) {
        byte[] bytes;
        StringBuilder hashtext;

        try {
            bytes = in.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(bytes);
            BigInteger bigInt = new BigInteger(1, digest);
            hashtext = new StringBuilder(bigInt.toString(16));
            while (hashtext.length() < 32) {
                hashtext.insert(0, "0", 0, 1);
            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
        return hashtext.toString();
    }
}
