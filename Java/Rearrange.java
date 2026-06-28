import java.util.Arrays;
public class Rearrange{

     static int number = 0;
    
    public static void main(String[] args){
    int[] array = {4,3,1,6,4,3,6,4};
    //Output = [4,4,4,3,3,6,6,1];
    int [][] sortArray = new int [array.length][2];
    
    //System.out.println(Arrays.toString(getSortedNumber(array)));
    
    array = getSortedNumber(array);
    sortArray[number][0] = array[0];
    
    for(int count = 1; count < array.length; count++){
        if(array[count] == array[count -1]){
            sortArray[number][1] = sortArray[number][1] +1;    
             
        }
        else{
            number++;
            sortArray[number][0] = array[count]; 
        }
    }
    number++;
    
    sortArray = sort(sortArray);
    
    for(int element = 0; element < number; element++){
        for(int value = 0; value <= sortArray[element][1]; value++){
            System.out.print(" " + sortArray[element][0]);
        }
        
    }
    
    
    
    
    }
    public static int [] getSortedNumber(int [] array){
    
        for(int count = 0; count < array.length; count++){
            for(int value = count; value < array.length; value++){
                if(array[count] > array[value]){
                    int temp = array[count];
                    array[count] = array[value];
                    array[value] = temp;
                }
            }
        }
        return array;
    
    }
    public static int [][] sort(int [][]sortArray){
    
        int[] getNo = new int [2];
        for(int count = 0; count < sortArray.length; count++){
            for(int value = count; value < sortArray.length; value++){
                if(sortArray[count][1] < sortArray[value][1]){
                    getNo = sortArray[count];
                    sortArray[count] = sortArray[value];
                    sortArray[value] = getNo;
                }
                
            }
            
        }
        return sortArray;
        
    }
}
