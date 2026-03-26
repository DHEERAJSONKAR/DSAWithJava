//1. square star pattern
// class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i =1; i<=n; i++){
//             for(int j =1; j<=n; j++){
//                 System.out.print0("*");
                
//             }
//             System.out.println();
//         }
//     }
// }

//2. square number pattern
// class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i =1; i<=n; i++){
//             for(int j = 1; j <=n; j++){
//                 System.out.print("1");
//             }
//             System.out.println();
//         }
//     }
// }


// 3. Increasing number Square

// class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i =1; i<=n; i++){
//             for(int j = 1; j<=n; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// 4. Rigth Triangle Star Pattern
// class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i =1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 5. print number triangle
// class pattern{
//     public static void main(String[] args){
//         int n = 5;
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


// 6. Inverted rigth - angle triangle
// class pattern{
//   public static void main(String[] args){
//     for(int i =5; i>=1; i--){
//       for(int j = 1; j<=i; j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// 7.right-angle number triangle where each row repeats.

// class pattern{
//   public static void main(String[] args){
//     for(int i =1; i<=5; i++){
//       for(int j= 1; j<=i; j++){
//         System.out.print(i);
//       }
//       System.out.println();
//     }
//   }
// }
// 8.alphabetical triangle
class pattern{
  public static void main(String[] args){
    for(int i=1; i<=4; i++){
      for(int j =1; j<=i; j++){
        System.out.print((char)(64+i));
      }
      System.out.println();
    }
  }
}