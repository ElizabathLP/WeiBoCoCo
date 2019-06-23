package top.elizabath.weibococo.ui.util;

import android.content.Context;
import android.widget.Toast;

/**
 * created by Administrator on 2017/10/16/016.
 */

public class ToastUtil {

    private static Toast toast;

    public static void showToast(Context context, String msg) {
        if (toast == null) {
            toast = Toast.makeText(context,
                    msg,
                    Toast.LENGTH_SHORT);
        } else {
            toast.setText(msg);
        }
        toast.show();
    }

}