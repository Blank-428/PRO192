package point1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class IntPoint2 {
    int x=7;
    int y=3;

    public IntPoint2() {
        output();
        x=100;
        y=1000;
        output();
    }

    public IntPoint2(int x, int y) {
        output();
        this.x = x;
        this.y = y;
        output();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void output() {
        System.out.println("[" + x + ", " + y + "]");
    }
    
}
