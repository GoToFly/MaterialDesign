package com.gc.materialdesign.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import com.gc.materialdesign.R;

/**
 * Created by horrywu on 2015/1/2.
 */
public class ProgressBarDialog extends Dialog {
    String message;
    TextView msg;
    /**
     * Similar to \\, you should initialize your dialog
     * in this method, including calling {@link #setContentView}.
     *
     * @param savedInstanceState If this dialog is being reinitalized after a
     *                           the hosting activity was previously shut down, holds the result from
     *                           the most recent call to {@link #onSaveInstanceState}, or null if this
     *                           is the first time.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_dialog);
        msg= (TextView) findViewById(R.id.message);
        msg.setText(message);
        setCanceledOnTouchOutside(false);
    }

    /**
     * Create a Dialog window that uses the default dialog frame style.
     *
     * @param context The Context the Dialog is to run it.  In particular, it
     *                uses the window manager and theme in this context to
     *                present its UI.
     */
    public ProgressBarDialog(Context context,String message) {
        super(context);
        this.message=message;
    }

    /**
     * Create a Dialog window that uses a custom dialog style.
     *
     * @param context The Context in which the Dialog should run. In particular, it
     *                uses the window manager and theme from this context to
     *                present its UI.
     * @param theme   A style resource describing the theme to use for the
     *                window. See <a href="{@docRoot}guide/topics/resources/available-resources.html#stylesandthemes">Style
     *                and Theme Resources</a> for more information about defining and using
     *                styles.  This theme is applied on top of the current theme in
     */
    public ProgressBarDialog(Context context, int theme,String message) {
        super(context,theme);
        this.message=message;
    }

    /**
     * Start the dialog and display it on screen.  The window is placed in the
     * application layer and opaque.  Note that you should not override this
     * method to do initialization when the dialog is shown, instead implement
     * that in {@link #onStart}.
     */
    @Override
    public void show() {
        super.show();
    }

    /**
     * Hide the dialog, but do not dismiss it.
     */
    @Override
    public void hide() {
        super.hide();
    }
}
