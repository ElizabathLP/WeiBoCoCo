package top.elizabath.weibococo.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;

public class NoTouchWebView extends WebView {
    public NoTouchWebView(Context context) {
        super(context);
    }

    public NoTouchWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoTouchWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public NoTouchWebView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    /**
     * @deprecated
     * @param context
     * @param attrs
     * @param defStyleAttr
     * @param privateBrowsing
     */
    public NoTouchWebView(Context context, AttributeSet attrs, int defStyleAttr, boolean privateBrowsing) {
        super(context, attrs, defStyleAttr, privateBrowsing);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
