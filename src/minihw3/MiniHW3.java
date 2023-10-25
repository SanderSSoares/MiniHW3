/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihw3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author sande
 */
public class MiniHW3 {
    
//GIT HUB LINK -> https://github.com/SanderSSoares/MiniHW3
    /**
     * @param args the command line arguments
     */
    //Exception added in case file not found
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        //First read the data from the File and storing into an array List
        List<String> allData = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader ("MOCK_DATA.csv"));
        
        
        String line = br.readLine();//Read the first line of the file
        
        //Now reading each line and adding them into the list
        while(line != null){//looping the process until there is no data/line
            allData.add(line);//add the line read to the list
            line = br.readLine();//go forward and read the next line
        }

        //using Shuffle method in order to get random data from the array
        Collections.shuffle(allData, new Random());
        
        int teamSize = 5; //number of people in each team
        int totalTeams = 20; //as I have 100 data, in the end 20 teams will be created
        
        List<List<String>> teams = new ArrayList<>(); //Creating a new array list to stored the data
        
        //Looping the process
        for (int i=0;i<totalTeams;i++){
            List<String> singleTeam = new ArrayList<>(); //creating array for a single team
            for (int k=0; k<teamSize; k++){//Loop to add members to the single team
                String person = allData.remove(0);//to remove and add a person to the team
                singleTeam.add(person);//adding the person to the current team
            }
            teams.add(singleTeam);//now adding the single team to the list of teams.
        }
        
        //Now printing the teams
        //Looping the process     
        for(int i=0; i<teams.size();i++){
            
            System.out.println("Team " + (i+1) + ":");//Printinh the team number. Team 1, Team 2, so on
            for (String person : teams.get(i)){//looping through the members of the singleTeam
                System.out.println(person);//Printing the name/line of the data
            }
            System.out.println("---------------------------------------------------------");//just to add something between the teams
        }
    }
    
}
