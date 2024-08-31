 import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // fazer um programa que lê um valor inteiro N e depois N numeros inteitos. Ao final, mostra a soma dos numeros inteiro
    
 // System.out.println("digite quantos números serão somados:");
//   int N = sc.nextInt();
//   int soma = 0;
//   for (int i = N; i > 0; i--){
//     System.out.println("O número a ser somado:");
//     int y = sc.nextInt();
//     soma += y;
//   }
//    System.out.println("A soma dos números é : " + soma);
    
    System.out.println("digite quantos números serão subtraídos:");
   int N = sc.nextInt();
   int diminui = 0;
   for (int i = N; i > 0; i--){
     System.out.println("O número a ser diminuido:");
     int y = sc.nextInt();
     diminui -= y;
   }
    System.out.println("O Resultado da subtração dos números é : " + diminui);

   // for(int i = 0; i < 5; i++){
   //   System.out.println(i);
  //  }

  //  for(int j = 4; j >= 0; j --){
  //    System.out.println(j);
  //  }

    //for(início; condição; incremento){
    //comandos
    //}
    sc.close();
  }
}