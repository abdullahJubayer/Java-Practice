/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I_o_tream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jubayer
 */
public class BufferReader_Writer {
  public static void main(String ar[]) throws IOException{
      try{
      BufferedReader tt=new BufferedReader(new FileReader("/home/jubayer/Desktop/Untitled Document 1"));
      String ss;
      while((ss=tt.readLine())!=null){
          System.out.print(ss);
      }
      tt.close();
      }
      catch(FileNotFoundException n){
          System.err.println("FileNotFoundException");
      }
  }  
}
