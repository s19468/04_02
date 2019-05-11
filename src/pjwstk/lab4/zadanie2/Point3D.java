/*
    Zadanie 2
    Autor: Rafał Tęcza & Damian Brzoskowski
    Index: s19468 & s18499
*/

package pjwstk.lab4.zadanie2;

public class Point3D extends Point2D {

    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D()
    {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }


    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] values = {getX(), getY(), this.z};
        return values;
    }
    public String toString()
    {
        return "(" + getX() + ", " + getX() + ", " + this.z + ")";
    }

    public static void main(String[] args)
    {
        Point3D Point3DObj = new Point3D();
        System.out.println("Inicjowanie obiektu z wartosciami:");
        System.out.println(Point3DObj.toString());
        System.out.println("Zmiana wartosci dla x i y i z:");
        Point3DObj.setXYZ(11, 12, 14);
        System.out.println(Point3DObj.toString());
    }
}