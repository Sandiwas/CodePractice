package Interview;

import java.util.Arrays;

public class AnagramString1 {
	 
    public static void main(String[] args){
        
        String s1= "Army";
        String s2="Mary";
        s1=makeLowerCaseRemoveSpace(s1);
        s2=makeLowerCaseRemoveSpace(s2);
        System.out.println(s1);
        System.out.println(s2);
       
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        
    sortCharArray(arr1);
    sortCharArray(arr2);
    
      System.out.println("Sorted arr1: "+String.valueOf(arr1));
      System.out.println("Sorted arr2:" +String.valueOf(arr2));
      
      System.out.println("Sorted arr1: " +Arrays.toString(arr1));
      System.out.println("Sorted arr2:" +Arrays.toString(arr2));
        
       if(isEquals(arr1,arr2)){
            System.out.println("Anagram String");
       } else{
            System.out.println("Not Anagram String");
       }
    }
    public static void sortCharArray(char[] arr){;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                char temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
    
    public static String makeLowerCaseRemoveSpace(String str){
        char[] arr=str.toCharArray();
        String result="";
        for(int i=0;i<arr.length;i++){
            if(arr[i] !=' '){
                result=result+arr[i];
            }
        }
          return result.toLowerCase();
    }
    
    public static boolean isEquals(char[] arr1,char[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
