import java.util.Arrays;
public class ArraysMethods{

    public static void main(String[] args){
       // int [] arrays = {10,20,30,40,50};
        
        //int [] arrays = {10,20,30,40,50,60,70};
        int [] numbers = {10,20,30,40,50};
        
       
        
       //System.out.println(Arrays.toString(swapFirstAndLast(arrays)));
        printArray(numbers);
       // System.out.println(getFirstNumber(numbers));
        //System.out.println(getLastNumber(numbers));
       // System.out.println(getLength(arrays));
       // System.out.println(getElement(numbers));
      //  printWithIndex(numbers);
          //System.out.println(Arrays.toString(updateElement(arrays, 2, 99)));
          System.out.println(sumArrays(numbers));
          System.out.println(averageArray(numbers));
    
    
    }
    
    public static void printArray(int [] numbers){
    
        for(int count = 0; count < numbers.length; count++){
            System.out.println(numbers[count]);
        }   
    }
    
    public static int getFirstNumber(int [] numbers){
        return numbers[0];
    }
    
    public static int getLastNumber(int [] numbers){
        return numbers[4];
    }
    
    public static int getLength(int [] arrays){
      int count = 0;
      for(int element : arrays){
        count++;
      }
      return count;
    }
    
    public static int getElement(int [] numbers){
        return numbers[2];
    }
    
    public static void printWithIndex(int [] numbers){
    
        for(int count = 0; count < numbers.length; count++){
           System.out.printf("%s%d%s%d%n", "index: ", count, " value: ", numbers[count] ); 
        }
             
    }
    
    public static int[] updateElement(int [] arrays, int index, int newNumber){
        
       for(int count = 0; count < arrays.length; count++){
            if(count == index){
            arrays[count] = newNumber;
            }
                        
       }
      
        return arrays;
      
     
    }
    
        public static int[] swapFirstAndLast(int[] arrays){
        
        for(int count = 0; count < arrays.length; count++){
            int temp = arrays[count];
            arrays[count] = arrays[arrays.length -1];
            arrays[arrays.length -1] = temp;
            break;
        }
        return arrays;
    
           
        
    }
    
    public static int sumArrays(int [] numbers){
        int sum = 0;
        for(int count = 0; count < numbers.length; count ++){
            sum += numbers[count];
        
        }
        return sum;
    }
    
    public static double averageArray(int[] numbers){
        int sum = 0;
        double average = 0;
        
        for(int count = 0; count < numbers.length; count++){
            sum += numbers[count];
               
        }
       average = (double) sum /(double) numbers.length;
      
    return average;
    }




}
