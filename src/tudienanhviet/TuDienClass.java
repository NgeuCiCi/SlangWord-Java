/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tudienanhviet;

/**
 *
 * @author binhbt.it
 */
public class TuDienClass {
    public String text;
    public String content;
    public TuDienClass(String text,String content){
        this.text=text;
        this.content=content;
    }
    public void setText(String text){
        this.text=text;
    }
    public void setContent(String content){
        this.content=content;
    }
    public String getText(){
        return this.text;
    }
    public String getContent(){
        return this.content;
    }
}
