/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class User {
    private int ID;
    private String NAME;
    private String PHONE;
    private String USERNAME;
    private String PASSWORD;
    private String ABOUT;
    private String FAVOURITES;
    private String ROLE;

   

    
    public int getID() {
        return ID;
    }

    public String getNAME() {
        return NAME;
    }

    public String getPHONE() {
        return PHONE;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public String getABOUT() {
        return ABOUT;
    }

    public String getFAVOURITES() {
        return FAVOURITES;
    }

    public String getROLE() {
        return ROLE;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public void setABOUT(String ABOUT) {
        this.ABOUT = ABOUT;
    }

    public void setFAVOURITES(String FAVOURITES) {
        this.FAVOURITES = FAVOURITES;
    }

    public void setROLE(String ROLE) {
        this.ROLE = ROLE;
    }

    @Override
    public String toString() {
        return NAME;
    }

    
    
}
