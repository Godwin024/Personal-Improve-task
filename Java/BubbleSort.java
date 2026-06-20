import java.util.Arrays;
public class BubbleSort{

    public static void main(String[] args){
    int []array = {4,5,6,3,8,7};
    
    
   System.out.println(Arrays.toString(getSwapElement(array)));
   
   
    }
    public static int [] getSort(int [] array){
        for(int count = 0; count < array.length -1; count++){
            for(int index = 0; index < array.length -count -1; index++){
                if(array[index] > array[index +1]){
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index +1] = temp;
                }
            }
        }
        return array;
    }
    
    public static int [] getSwapElement(int[] array ){
    
        for(int count = 0; count < array.length; count++){
               int temp = array[count];
               array[count] = array[array.length -1];
               array[array.length -1] = temp;
               break;
            
        }
        return array;
    }

}
