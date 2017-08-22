package com.bala.algos;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{

    public static int [] array ={4,9,3,1,7};
    public static int [] array1 ={4,1,3,9,7};
    public static int [] array2 ={4,1,3,9,7,8};
    public static void main( String[] args )
    {
       bubbleSort(array);
     System.out.println(Arrays.toString(array));
   /*  insertionSort(array1);
     System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(selectionSort(array2))); */
      // mergeSort(array2);
       
    }


    public static int[] bubbleSort(int [] array){
        boolean swap =true;
        for(int i=0; i< array.length;i++){
            int temp=0;
            if(swap){

                for(int j=0,  l=0;j<array.length-i-1;j++){
                    if(array[j]> array[j+1]){
                        temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                        swap=false;
                    }
                    System.out.println(Arrays.toString(array)+" "+l);
                }
            }
        }
        return array;
    }

    public static int [] insertionSort(int [] array){

        for(int i=0;i<array.length;i++){
            int temp=0;
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    temp=array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;

                }
            }
        }
        return array;
    }

    public static int[] selectionSort( int [] array){
        int temp=0;
        for( int j=0;j<array.length;j++){
        int minimum=j;
            
         for(int i=j;i<array.length;i++){
              minimum = array[i]<array[minimum]?i:minimum;
           
            }
          temp=array[j];
    
          array[j]=array[minimum];
      
          array[minimum]=temp;
         System.out.println(Arrays.toString(array));
        }
        return array;
  
    }

    public static int [] mergeSort(int [] array){

       int midpoint = array.length/2;
      int  ending =array.length-midpoint;
      if(array.length==1){
        //  return;
      }
     //  System.out.println("ending: "+ending);
       int [] firstHalf = new int[midpoint];
       int [] secondHalf= new int[ending];
     
       for(int i=0;i<midpoint;i++){
           firstHalf[i]=array[i];
       }
       for(int i=0;i<ending;i++){
           
        secondHalf[i]=array[midpoint+i];
       }

      while(firstHalf.length> 1 && secondHalf.length>1){
          mergeSort(array);
        System.out.println(Arrays.toString(firstHalf));
        System.out.println(Arrays.toString(secondHalf));
      }





        return array;
    }
}
