package com.example.test;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class abc extends View {
    public abc(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        int[] RGB = new int[3];
        boolean plus = true;
        int m = 2;
        RGB[0] = 255;
        //paint.setColor(Color.rgb(0, 250, 250));

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 256; j++) {
                if (plus) RGB[m] = j;
                else RGB[m] = 255 - j;
                canvas.drawRGB(RGB[0],RGB[1],RGB[2]);
                invalidate();
            }
            m = (m + 1) % 3;
            plus = !plus;
        }/*int x=0, y=10, step = 10;
        while (y<canvas.getWidth()) {

                    //(x, y, canvas.getWidth(), y, paint);
            y+=step;
        }*/
    }
}