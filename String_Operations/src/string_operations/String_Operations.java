/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string_operations;

/**
 *
 * @author Raku
 */
public class String_Operations {

    /**
     * @param args the command line arguments
     */
    public static void task_1(String text)
    {
        int max=0;
        int counter = 1;
        text = text + " "; 
        for(int i = 0; i < text.length() - 1  ; i++)
        {
            if(text.charAt(i) == text.charAt(i + 1))
                counter++;
            else{
                 if(counter > max) max = counter;
                 counter = 1;
            }
        }
        System.out.print(max);
    }
    
    
    public static void task_2(String text){
        int sum = 0;
        int ascii;
        for(int i = 0; i < text.length(); i++)
        {
            ascii = text.charAt(i);
            if(ascii >= 48 && ascii <=57 ) sum +=  Character.getNumericValue(text.charAt(i));
        }
        System.out.print(sum);
    }
    
    public static void task_3(String text){
        int  counter = 0;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) == 'z' || text.charAt(i) == 'y') 
            {      
                if(i == text.length() - 1) counter ++;
                else
                if((text.charAt(i + 1) < 90  || text.charAt(i + 1) > 122) 
                        &&(text.charAt(i + 1) < 65  || text.charAt(i + 1) > 90) ) 
                    counter++;
                // Zwraca ilość wyrazów kończących się na "z" lub "y" 
                // po których nie mam dużej lub małej litery
            }
        } 
        System.out.print(counter);
    }   
    
    public static void task_4(String text){
        boolean happy = false;
        int len = text.length();
        
        for(int i = 0; i < len ; i++)
        {
            if(text.charAt(i) == 'g' ) 
            {     
                if(i == 0){ 
                    if(text.charAt(i + 1) == 'g') 
                        happy = true;
                    else 
                       { happy = false; break;}
                          }
                else if ( i == len -1 )
                 {
                     if(text.charAt(i - 1) == 'g') 
                        happy = true;
                    else 
                       { happy = false; break;}
                 }
                else
                {
                if ( text.charAt(i - 1) == 'g' || text.charAt(i + 1) == 'g'){
                    happy = true;
                }
                else
                   { happy = false; break;}
                 }
            }
        }
        if (happy) System.out.println("true"); else System.out.println("false");
    }
    public static void task_5(String text){
        int counter = 0;
        int len = text.length() ;
        
        for( int i = len/2; i < (len ); i++)
                {
                  if (text.charAt(counter) == text.charAt(i)) {
                     for(int j = i; j < len; j++)
                     {
                         if (text.charAt(counter) == text.charAt(j)){
                             //System.out.println(text.charAt(counter)+ " " + text.charAt(j));
                           if (j != len - 1)  counter++;
                             
                         }                              //abbbbxdasdasfsfabbb
                         else{ 
                             if(j < len - 1)
                                 {
                                     
                                counter = 0;
                                break;}
                                   }
                          
                     }
                   }
               } 
       for(int i = 0; i < counter; i++){
           System.out.print(text.charAt(i));
       }
       if(counter == 0) System.out.print("brak");
       
    }
    public static void task_6(String text){
        int len = text.length();
        int sum = 0;
        int counter = 0;
        text = text + " "; //szybsze wyjście // na potem 
        String str="";
        {
            for(int i = 0; i < len; i++)
            {
                int ascii = text.charAt(i);
                 if(ascii >= 48 && ascii <= 57 ) 
                {
                   counter++;
                   for(int j = i + 1; i < len ; j++)
                   {
                       int ascii2 = text.charAt(j);
                       if(ascii2 >= 48 && ascii2 <= 57) counter++;
                       else{
                          str= text.substring(i , i + counter);
                          //System.out.println(sum+ " + "+ str);
                          sum += Integer.parseInt(str);
                           i = j - 1; 
                           counter  = 0;
                           break;
                           } //33dasd4444565
                   }
                }
            }
        }
        System.out.print(sum);
    }
    
    public static void task_7(String base, String remove)
    {
        String newStr ="";
        int counter = 0;
        base= base.toLowerCase();
        remove = remove.toLowerCase();
        for(int i = 0; i < base.length() ; i++)
        {
            if(base.charAt(i) == remove.charAt(0))
            {  counter = 0;
                for(int j = i; counter < remove.length() ;j ++)
                {
                    
                    if(base.charAt(j) == remove.charAt(counter))
                    {
                        counter++;
                    } else {
                        counter = 0;
                        newStr += base.charAt(i);
                        break; }  ///3dasd4444asfa565
                    
                } if(counter == remove.length()) i += counter - 1;
            } else
            {
                newStr += base.charAt(i);
            }
        }
        System.out.println(newStr);
    }
    
    public static void task_8(String text){
        int counter = 0;
        int len = text.length();
        for(int i = 0; i < len -2; i++ )
        {
            
            if(text.charAt(i) == text.charAt( i + 1) 
              && text.charAt(i) == text.charAt(i + 2))
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
    
    public static void task_9(String text){
        int counter = text.length() - 1;
        String str = "";
        for(int i = 0; i < text.length();i++)
        {
            if(text.charAt(i) == text.charAt(counter))
            {
                str +=text.charAt(i);
                counter--;
            } else break;
        }
        System.out.println(str);
    }
    
    public static void task_10(String text){
        int count1  = 0, count2 = 0;
        for(int i = 0; i < text.length()-1; i++)
        {
            if(text.charAt(i) == 'i' && text.charAt(i + 1) == 's') count1++;
            if(text.charAt(i) == 'n' && text.charAt(i + 1) == 'o') count2++;
        }
        if(count1 == count2 && count1 > 0) System.out.println("true");
        else System.out.println("false");
    }
    public static void task_11(int ...value){
        int tab[] = new int[value.length];
        int max=0;
        for(int i = 0; i < tab.length ; i++){
            tab[i]=value[i];
        }
        for(int j = 0; j < tab.length - 1; j++)
        {
           if( tab[j] + tab[j + 1] > max) max = tab[j] + tab[j + 1];
        }
        System.out.println(max);
    }
    
    public static void task_12(int ...value){
        int tab[] = new int[value.length];
        int sum1 = 0; 
        int sum2 = 0;
        for(int i = 0; i < tab.length; i++){
            tab[i] = value[i];
        }
        for(int j = 0; j < tab.length/2; j++)
        {
           sum1 += tab[j]; 
        }
         for(int j = tab.length/2; j < tab.length; j++)
        {
           sum2 += tab[j]; 
        }
         
         if(sum1 ==sum2) System.out.println("true");
         //System.out.println(sum1+" "+sum2);
         if(sum1 > sum2){
             int count = (tab.length/2) - 1;
             while(sum1 > sum2 && count > 0)
             {
                 sum1 -=tab[count];
                 sum2 +=tab[count];
                 count--;
                // System.out.println(sum1+" "+sum2);
             }
             if (sum1 == sum2) System.out.print("true");
             else System.out.print("false");
         } else if( sum1 < sum2){
             int count = (tab.length/2) ;
              while(sum1 < sum2 && count < tab.length)
             {
                 sum1 +=tab[count];
                 sum2 -=tab[count];
                 count++;
                // System.out.println(sum1+" "+sum2);
             }
             if (sum1 == sum2) System.out.print("true");
             else System.out.print("false");
         }
         
    }
    public static void task_13(int n){
        if(n < 0 ) System.out.println("Wrong value");
        else{
            int[] tab  = new int[n*(n+1)/2];
            int count = 0;
            int count2 = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < count2 + 1; j++)
                {
                    tab[count] = j + 1;
                    count++;
                }
                count2++;
            }
            for(int i = 0; i < tab.length; i++)
            {
                System.out.print(tab[i] + ",");
            }
            }
    }
    
    public static void task_14(int small, int big, int goal)
        {
            int rest = goal % 5;
            int x = goal / 5;
            while(true)
            {
            if( small >= goal){ System.out.println("true"); break;}
            if(rest == 0 && x >= big + small) { System.out.println("true"); break;}
            if ((big * 5 + small >= goal ) && rest <= small) { System.out.println("true"); break;}
                System.out.println("false"); break;
            }
       }
    private static int teenTask15(int x)
    {
        if ( x > 12 && x < 20 && x != 15 && x  != 16)
        {
            x = 0;
        } 
        return x;
    }
    public static void task_15(int a, int b, int c)    
    {
        int sum =0;
        sum = teenTask15(a) + teenTask15(b) + teenTask15(c);
        System.out.print(sum);
    }
    
    public static void task_16(int x, int y )
    {
        int k = 0;
        if (x < 22) k = x; 
        if (y < 22 && y > k) k = y;
        System.out.print(k);
    }
    
    public static void main(String[] args) {
       task_15(5,13,24);
    }
    
}
