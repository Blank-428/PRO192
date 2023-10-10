package DTO;

import static GetInput.GetValues.getIntValue;
import static GetInput.GetValues.getBooleanValue;


public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }
    
    public void inputPainting() {
        super.input();
        System.out.println("Input height: ");
        this.height = getIntValue();
        System.out.println("Input width: ");
        this.width = getIntValue();
        System.out.println("Input isWatercolour: ");
        this.isWatercolour = getBooleanValue();
        System.out.println("Input isFramed: ");
        this.isFramed = getBooleanValue();
    }
    
    public void outputPainting() {
        System.out.println("Their Painting's attributes are: ");
        super.output();
        System.out.println("Height: " + this.height);
        System.out.println("Width: " + this.width);
        System.out.println("Watercolour: " + this.isWatercolour);
        System.out.println("Framed: " + this.isFramed);
    }
}
