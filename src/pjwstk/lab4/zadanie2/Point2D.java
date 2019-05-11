/*
    Zadanie 2
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie2;

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x  = x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y  = y;
    }

    public float[] getXY() {
        float[] values = {this.x, this.y};
        return values;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }

    public static void main(String[] args)
    {
        Point2D Point2DObj = new Point2D();
        System.out.println(Point2DObj.toString());
        System.out.println("Zmiana wartosci dla x i y:");
        Point2DObj.setXY(11, 12);
        System.out.println(Point2DObj.toString());
    }
}