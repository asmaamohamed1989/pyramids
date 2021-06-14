/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Muslim
 */
public class pyramidsCSVDAO {
    
    public List<Pyramids> readPyramidsFromCSV(String filepath){
        List<Pyramids> Pyramid = new ArrayList<>();
        try{
            List<String> a = new ArrayList<>();
            Scanner SC = new Scanner (new File(filepath));
            int i = 0;
            while(SC.hasNextLine()){
                a.add(SC.nextLine());
                if(i >= 1){
                    String[] row =a.get(i).split(",");
                    if(!row[0].isEmpty()  && !row[2].isEmpty() && !row[4].isEmpty() && !row[7].isEmpty()){
                        Pyramid.add(new Pyramids(row[0], row[2],row[4], Double.parseDouble(row[7])));
                        
                    }
                }
                i++;
            }
            SC.close();
        }
    
    catch(Exception e){
        System.out.println(" error happened");
      
    }
           
   return Pyramid; 
}
}