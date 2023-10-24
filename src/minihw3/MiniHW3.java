/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihw3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sande
 */
public class MiniHW3 {

    /**
     * @param args the command line arguments
     */
    //Exception added in case file not found
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        //First read the data from the File and storing into an array List
        BufferedReader br = new BufferedReader(new FileReader ("MOCK_DATA.CVS"));
        List<String> allData = new ArrayList<>();
        
        
        
        
    }
    
}
