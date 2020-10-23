public class Tester{
  public static String arrToString(int[] arr){
  String result = "{";
  if(arr.length == 0){
      return "{}";
    }
  for(int i = 0; i < arr.length; i++){
    if(i == arr.length-1){
      result = result + arr[i] + "}";
    }
    else
    result = result + arr[i] + ", ";
  }
  return result;
  }
  public static String arrayDeepToString(int[][] arr){
  String result = "{";
  for(int i = 0; i < arr.length; i++){
      result = result + arrToString(arr[i]) + ", ";
  }
  return result + "}";
  }
  public static void main(String[]args){
    int[] a = {1,2,3,4,5};
    System.out.println(ArrayOps.sum(a));
    System.out.println(ArrayOps.largest(a));
    int[][] b ={{1,2,3,4}, {}, {5,10}, {5}};
    System.out.println(arrToString(ArrayOps.sumRows(b)));
  }
}
