package org.zg.monsterid;

import android.content.Context;
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

    public static int dip2px(float dip, Context ctx) {
        return dip2px(dip, ctx.getResources().getDisplayMetrics());
    }

    public static int dip2px(float dip, DisplayMetrics metrics) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, metrics);
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