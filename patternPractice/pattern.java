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
class pattern{
    public static void main(String[] args){
        int n = 5;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}