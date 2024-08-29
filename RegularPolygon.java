/**
 * Author: Aubrie McIntyre
 * Date: 8/29/2024
 * Description: This program is meant to produce three regular polygons, however, I have had a lot of problems figuring
 * out the logic of this assignment, so it is unfinished. I'm sorry.
 */
public class RegularPolygon {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int i, double j) {
        n = i;
        side = j;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int i, double j, double k, double l) {
        n = i;
        side = j;
        x = k;
        y = l;
    }

    //Getters
    public int getNum() {
        return n;
    }
    public double getSide() {
        return side;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    //Setters
    public void setNum(int num) {
        n = num;
    }
    public void setSide(double s) {
        side = s;
    }
    public void setX (double xNum) {
        x = xNum;
    }
    public void setY (double yNum) {
        y = yNum;
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}