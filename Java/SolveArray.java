//import java.util.Arrays;

import java.util.Random;
public class SolveArray{

    public static void main(String[] args){
//    
//        int[] array = {1,2,3,4,5,6};
//        
//        for(int count = 0; count < array.length; count ++){
//            array[count] = count + 1;
//        }
//        System.out.println(Arrays.toString(array));

//    int [][] array = {{2,3},{2,4}};
//    
//    for(int count = 0; count < array.length; count++){
//        for(int value = 0; value < array[count].length; value++){
//            array[count] = array[value];
//              }
//          }
//               System.out.println(Arrays.deepToString(array));
    Random rand = new Random();
    
    int[] array = new int [5];
    
    for(int count = 0; count < array.length; count++){
        array[count] = rand.nextInt(100);
    }
        
        try{
           System.out.println(array[67]);
        
        }catch( Exception e){
        System.out.println("The Maximum index is 5");
        }
 
    
        for(int value : array){
        System.out.println(value);
        }
    
 
    

     }
     

}
