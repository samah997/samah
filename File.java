/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atest;

import java.util.Date;

public   abstract class File {
    private  int size,pages;
   private   String name,path,language;
    private Date date=new Date();
    
    public  void printFileType(){System.out.println("File");}

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
public File(){}
    public File(int size, int pages, String name, String path, String language) {
        this.size = size;
        this.pages = pages;
        this.name = name;
        this.path = path;
        this.language = language;
    }
     //public PdfFile(){System.out.println("hi");}
   // @Override
    public String toString ()
    {
       String line="";
       line+="Pdf File Size: "+ this.size+"\n";
       line+="Pdf File Name: "+this.name+"\n";
       line+="Pdf File path: "+ this.path+"\n";
    return line;
    }
    
    
}
