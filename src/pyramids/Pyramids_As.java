/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramids;

import java.util.List;

/**
 *
 * @author Muslim
 */
public class Pyramids_As {
    public static void main(String[] args) {
        pyramidsCSVDAO pDAO = new pyramidsCSVDAO(); 
        List<Pyramids> x = pDAO.readPyramidsFromCSV("pyramids.csv");
        for(Pyramids pyramid : x)
        {  System.out.println(pyramid.getPharoh());
    }
    
}
}
