/**
 * Write a description of class myMouseListenerSkeleton here.
 *
 * @author (James Sterry, Jeff Ciferno, Jalin Gatlin, Noah Smith)
 * @version (11/26/17)
 */


import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;

import javax.imageio.*;
import javax.swing.*;
import  java.sql.Timestamp;
class myMouseListenerSkeleton implements MouseListener {
    FileWriter outFile;
    BufferedWriter out = null;
   
    public myMouseListenerSkeleton(){
    
}
 
public void mouseClicked(MouseEvent e) { 
    try{
        Timestamp timeStamp = new Timestamp(System.currentTimeMillis());
    outFile = new FileWriter("record.txt", true);
    
       
       
        out = new BufferedWriter(outFile);
        
         out.close();
        
         
}
catch(Exception ex){
    
}
    
}


public void mouseEntered(MouseEvent e) { 

}


public void mouseExited(MouseEvent e) { 

}


public void mousePressed(MouseEvent e) {
    
}


public void mouseReleased(MouseEvent e) {

}

}