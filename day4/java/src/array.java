public class array {
    //    this is my code for array
    public static void main(String[] args) {
//        array has too ways for attach
//        for the first way
        int[] arr = new int[20];
        System.out.println(arr);
        System.out.println(arr[2]);
//        just like you see,this way always init a new array full of zero,so I don't think is good
        int[] arr1 = new int[]{11,23,43};
        //or you can try int arr = {11,23,43}
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }
}
