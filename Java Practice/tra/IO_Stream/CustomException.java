/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jubayer
 */
public class CustomException {
    static void rr(int rr)throws InvalidException{
        if(rr<10){
            //throw new InvalidException("pass");
        }
        else{
            System.out.println("pass");
        }
    }
    public static void main(String ar[]){
        try{
            rr(15);
        }
        catch(InvalidException e){
            System.out.println("Exception");
        }
    }
    
}
