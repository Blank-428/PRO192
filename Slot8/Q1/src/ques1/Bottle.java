/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

/**
 *
 * @author admin
 */
public class Bottle {
    protected String maker;
    protected int volume;

    public Bottle() {
        super();
    }

    public Bottle(String maker, int volume) {
        super();
        this.maker = maker;
        this.volume = volume;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
}
