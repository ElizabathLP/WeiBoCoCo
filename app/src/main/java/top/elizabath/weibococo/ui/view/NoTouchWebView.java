package top.elizabath.weibococo.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.qmuiteam.qmui.widget.webview.QMUIWebView;

public class NoTouchWebView extends QMUIWebView {

    public NoTouchWebView(Context context) {
        super(context);
    }

    public NoTouchWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoTouchWebView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }
}
