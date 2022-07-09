/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tudienanhviet;

import java.awt.List;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sang
 */
public class MainClass {

    public static ArrayList<TuDienClass> listTuDien = new ArrayList<TuDienClass>();

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("App");
        MainJFrame mainScreen = new MainJFrame();
        mainScreen.setVisible(true);
        
        
// test
//        JSONArray a1 = new JSONArray("[{\"text\":\"to take up residence in the United States\",\"content\":\"??nh c? M?\" },{text:\"to make narrow, to begin to close\",content:\"h?p l?i\" }]");
//        String tmp = "[{\"text\":\"Adam\",\"content\":\"A Dong \"},{\"text\":\"Arhant, Lohan (follower of Buddha)\",\"content\":\"A La H�n \"}]";
//        System.out.println(tmp);
//        JSONArray a = new JSONArray(tmp);
//        System.out.println(a.get(0));
//        for (int i = 0; i < a.length(); i++) {
//            JSONObject item = new JSONObject(a.get(i).toString());
//            
//            TuDienClass tuDien1;
//            tuDien1 = new TuDienClass(item.get("text").toString(),item.get("content").toString());
//            listTuDien.add(tuDien1);
//        }
//        System.out.println("da them vào: "+listTuDien.size());
//        System.out.println(listTuDien.get(0).text);

    }
}
