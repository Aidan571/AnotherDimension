public class ArrayOps{
  public static int sum(int[] arr){
    if(arr.length == 0){
      return 0;
    }
    int result = 0;
    for(int i = 0; i < arr.length; i++){
      result += arr[i];
    }
    return result;
  }
  public static int largest(int[] arr){
    int large = 0;
    for(int i = 0; i < arr.length; i++){
      if(arr[i] > large){
        large = arr[i];
      }
    }
    return large;
  }
}
