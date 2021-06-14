/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;


public class Pyramids{
private String pharoh;
private String modern_name;
private String site;
private double height;

    public Pyramids(String pharoh, String modern_name, String site, double height) {
        this.pharoh = pharoh;
        this.modern_name = modern_name;
        this.site = site;
        this.height = height;
    }

    public String getPharoh() {
        return pharoh;
    }

    public String getModern_name() {
        return modern_name;
    }

    public String getSite() {
        return site;
    }

    public double getHeight() {
        return height;
    }

    public void setPharoh(String pharoh) {
        this.pharoh = pharoh;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    
}
