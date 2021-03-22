/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.io.Serializable;

/**
 *
 * @author vinicius
 */
public class Bookstore implements Serializable{
    // Data Types
    private String author;
    private String title;
    private String cost;
    private String fileFormat;
    private String narrator;
    
    // Constructor 
    public Bookstore(String author, String title, String cost, String fileFormat, String narrator) {
        this.author = author;
        this.title = title;
        this.cost = cost;
        this.fileFormat = fileFormat;
        this.narrator = narrator;
    }

    public Bookstore(){
        author = new String();
        title = new String();
        cost = new String();
        fileFormat = new String();
        narrator = new String();
    }
    
    // Setters and Getters 

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    
    
}
