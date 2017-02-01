package project.aamir.sheikh.circletextview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Aamir on 30-01-2017.
 */

public class CircleTextView extends TextView {
    private float strokeWidth;
    Paint circlePaint;
    int strokeColor, solidColor;
    String Text;
    Float size = -1f;

    public CircleTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Model.setContext(context);
        initViews(context, attrs);
        setWillNotDraw(false);

    }

    private void initViews(Context context, AttributeSet attrs) {

        //paint object for drawing in onDraw
        circlePaint = new Paint();

    }

    @Override
    public void draw(Canvas canvas) {
        final int diameter, radius, h, w;

        circlePaint.setColor(solidColor);
        circlePaint.setFlags(Paint.ANTI_ALIAS_FLAG);
        Paint strokePaint = new Paint();
        strokePaint.setColor(strokeColor);
        strokePaint.setFlags(Paint.ANTI_ALIAS_FLAG);

        //get Height and Width
        h = this.getHeight();
        w = this.getWidth();

        diameter = ((h > w) ? h : w);
        radius = diameter / 2;

        //setting Height and width
        this.setHeight(diameter);
        this.setWidth(diameter);
        this.setText(Text);

        if (size != -1f) {

            this.setTextSize(size);
        } else {

            this.setTextSize(diameter / 5);
        }

        canvas.drawCircle(diameter / 2, diameter / 2, radius - strokeWidth, circlePaint);
        super.draw(canvas);
    }

    public void setStrokeWidth(int dp) {
        float scale = getContext().getResources().getDisplayMetrics().density;
        this.strokeWidth = dp * scale;

    }

    public void setStrokeColor(int color) {
        this.strokeColor = color;
    }


    public void setSolidColor(int pos) {

        if (Utils.LoadCircleColor(pos) == -1) {

            //first start save color in shared prefs
            this.solidColor = Color.parseColor(Utils.genRandomColor());
            Utils.setCircleColor(pos, this.solidColor);
        } else {

            //color has been saved load from shared prefs
            this.solidColor = Utils.LoadCircleColor(pos);
        }

    }

    public void setSolidColor() {


        this.solidColor = Color.parseColor(Utils.genRandomColor());


    }

    public void setCustomText(String value) {

        this.Text = String.valueOf(value.charAt(0));
    }

    public void setCustomTextSize(float value) {

        this.size = value;
    }

}