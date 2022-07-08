/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tudienanhviet;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;

/**
 *
 * @author binhbt.it
 */
public class JSONParser {
    public static String getJSONFromFile(String filename) {
        String jsonText = "";
//        System.out.println("getJSONFromFile:"+filename);
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText += line ;
            }

            bufferedReader.close();
            System.out.println(jsonText);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText;
    }

}
