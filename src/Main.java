import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//   Scanner scan=new Scanner(System.in);
//        System.out.println(kai(scan.nextInt()));
//         }
//         static boolean kai(int a){
//        if (a>=0){
//            return true;
//        }else {
//            return false;
//        }

//        int[] work = {1, 34, 55, 675, 5};   //5==5 kolichestva kaitar
//        System.out.println(java(work));
//    }
//
//    static int java(int[] work) {
//        int summa=0;
//        for (int i = 1; i < work.length; i++) {
//            if(work[i]==5){
//              summa++;
//            }
//
//
//        }return summa;


//        int[]san={1,2,34,5,6,78,9};
//        System.out.println(max(san));
//
////    }
//        static int max ( int[] a){
//            int poli = a[0];
//            for (int i = 0; i < a.length; i++) {
//                if (poli < a[i]) {
//                    poli = a[i];
//                }
//
//            }
//             return poli;

        //  S=biyiktik * uzunduk;
//        Scanner scan=new Scanner(System.in); //тик бурч аянты таптым
//        System.out.println(san(scan.nextDouble(), scan.nextDouble()));
//    }
//  static double san(double a, double b){
//
//      return a-b;
//       Scanner scan =new Scanner(System.in);
//        int san= scan.nextInt();
//        String word=san>10? "hello": "java";
//        System.out.println(word);

        //masiv arr zadan
//          int[] san={1,2,3,4,5,6,7,8,9,10};
//        for (int i = 0; i < san.length ; i++) {
//            if(san[i]%2==0){
//                System.out.print("jup "+san[i]);
//            }
//        }
//        int a = 0;
//        int b = 0;
//        int[] arr = new int[100];
//        for (int i = 0; i < arr.length; i++) {
//
//            if (i % 10 == 7) {
//                a += arr[i];
//                arr[i] = i;
//                System.out.println(arr[i]);
//                b += arr[i];
//            }
//
//        }System.out.println(b);
//       System.out.println(san(12, 45, 8, 9, 10));
//    }
//
//    static boolean san(int... var) {
//        for (int i = 0; i < var.length; i++) {
//            if(var[i]==10) {
//                return true;
//            }
//        }
//        return false;

//      boolean d=  5<3 ? true:false;   //ternar opar
//        System.out.println(d);
//
//        Random ran=new Random();     //maciv bir
//        int[]arr=new int[20];
//        for (int i = 0; i < 20; i++) {
//            arr[i]= ran.nextInt(1,20);
//
//        } int max=arr[0];
//        for (int a = 0; a < arr.length ; a++) {
//
//            if(max<arr[a]){
//                max=arr[a];
//            }
//            System.out.println(max);
//        }


//        Random ran = new Random();
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = ran.nextInt(1, 200);
//
//        }
//        System.out.println(Arrays.toString(method(arr)));
//
//    }
//
//    static int[] method(int[] array) {
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            if (array[i] % 2 == 1) {
//                arr[i] = array[i];
//            }
//        }
//        return arr;

//        int[]san={1,2,3,4,5,6,7,8,9,10};
//        max(san);
//    min(san);
//    }
//    static void min (int[] san){
//      int min=san[0];
//        for (int i = 0; i < san.length; i++) {
//            if(min>san[i]){
//                min=san[i];
//            }
//        }
//        System.out.println(min);
//    }
//         static void max(int[]san1){
//        int max=san1[0];
//             for (int i = 0; i < san1.length; i++) {
//                 if(max<san1[i]){
//                     max=san1[i];
//                 }
//             }
//             System.out.println(max);


//        int a = 20;                 //Math.pow(2)
//        int b = 30;
//        double f = Math.pow(a, 2);
//        double s = Math.pow(b, 2);
//        double san = Math.max(f, s);
//        System.out.println(san);

        
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(min(s));
        System.out.println(dog(s));
    }

    static int min(int[] san) {
        int min = san[0];
        for (int i = 0; i < san.length; i++) {
            min = Math.min(min, san[i]);

        }
        return min;
    }


    static int dog(int[] san) {
        int max = san[0];
        for (int i = 0; i < san.length; i++) {
            max = Math.max(max, san[i]);

        }

        return max;

    }
}
