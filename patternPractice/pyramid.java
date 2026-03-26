// 1.star pyramid pattern
// class pyramid{
//     public static void main(String[] args){
//         int rows = 5;
//         for(int i = 1; i<=rows; i++){
//             for(int j= i; j<rows; j++){
//                 System.err.print(" ");
//             }
//             for(int k =1; k<=(2*i-1); k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// 2. number pyramid pattern

// class pyramid{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=(2*i-1); j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// 3. palindrome pyramid pattern

// class pyramid{
//     public static void main(String[] args){
//         int n=5;
//         for(int i =1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j =1; j<=i; j++){    // increasing
//                 System.out.print(j);
//             }
//             for(int j=i-1; j>=1; j--){ // descreasing
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }


// 4. inverted pyramid

// class pyramid{
//     public static void main(String[] args){
//         int n=5;
//         for(int i = n; i>=1; i--){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j=1; j<=(2*i-1); j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// diamond pyramid

// class pyramid{
//     public static void main(String[] args){
//         int n= 5;
//         for(int i= 1; i<=n; i++){
//             for(int j=1; j<=n-i; j++) System.out.print(" ");
//             for(int j=1; j<=(2*i-1); j++) System.out.print("*");
//             System.out.println();
//         }
//         for(int i=n-1; i>=1; i--){
//             for(int j=1; j<=n-i; j++) System.out.print(" ");
//             for(int j=1; j<=(2*i-1); j++) System.out.print("*");
//             System.out.println();
//         }
//     }
// }


// hollow pyramid

class pyramid{
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(i==n || j==1 || j==2*i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}
