package com.googy.emoji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

import com.googy.emoji.provider.Emoji;

final class EmojiSpan extends DynamicDrawableSpan {
    private int size;
    private Paint.FontMetricsInt fontMetrics = null;
    private final Context context;
    private final Emoji emoji;
    private Drawable deferredDrawable;

    EmojiSpan(final Context context, final Emoji emoji, final float size, Paint.FontMetricsInt original) {
        this.context = context;
        this.emoji = emoji;
        this.fontMetrics = original;
        if (original != null) {
            this.size = Math.abs(fontMetrics.descent) + Math.abs(fontMetrics.ascent);
            if (this.size == 0) {
                this.size = dp(20);
            }
        }
    }

    @Override
    public Drawable getDrawable() {
        if (deferredDrawable == null) {
            deferredDrawable = emoji.getDrawable(context);
            deferredDrawable.setBounds(0, 0, size, size);
        }
        return deferredDrawable;
    }

    @Override
    public int getSize(final Paint paint, final CharSequence text,
                       final int start, final int end, Paint.FontMetricsInt fm) {
        if (fm == null) {
            fm = new Paint.FontMetricsInt();
        }
        if (fontMetrics == null) {
            int sz = super.getSize(paint, text, start, end, fm);
            int offset = dp(8);
            int w = dp(10);
            fm.top = -w - offset;
            fm.bottom = w - offset;
            fm.ascent = -w - offset;
            fm.leading = 0;
            fm.descent = w - offset;
            return sz;
        } else {
            fm.ascent = fontMetrics.ascent;
            fm.descent = fontMetrics.descent;
            fm.top = fontMetrics.top;
            fm.bottom = fontMetrics.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, size, size);
            }
            return size;
        }
    }

    @Override
    public void draw(final Canvas canvas, final CharSequence text, final int start,
                     final int end, final float x, final int top, final int y,
                     final int bottom, final Paint paint) {
        final Drawable drawable = getDrawable();
        final Paint.FontMetrics paintFontMetrics = paint.getFontMetrics();
        final float fontHeight = paintFontMetrics.descent - paintFontMetrics.ascent;
        final float centerY = y + paintFontMetrics.descent - fontHeight / 2;
        final float transitionY = centerY - size / 2;

        canvas.save();
        canvas.translate(x, transitionY);
        drawable.draw(canvas);
        canvas.restore();
    }

    public int dp(float value) {
        float density = context.getResources().getDisplayMetrics().density;
        if (value == 0) {
            return 0;
        }
        return (int) Math.ceil(density * value);
    }
}
