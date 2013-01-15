package question;

import gui.Interface;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.util.Scanner;

public class question {
    
    public static Scanner s1 = new Scanner(System.in);
    
//    public static String question(String question){
//        System.out.println(question);
//        return s1.nextLine();
//    }
    public static String question(String question){
        System.out.println(question);
        String s="n";
        ActionEvent evt=null;
        Interface inter = null;
        addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        s = jButtonActionPerformeds(evt);
        return s;
    }
    public static boolean questionTT(boolean b1, boolean b2){
        if(b1 & b2){
            return true;
        }else if(b1 && !b2){
            return true;
        }return false;
    }
}
