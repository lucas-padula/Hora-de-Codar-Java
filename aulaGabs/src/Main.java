import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Scanner entrada = new Scanner(System.in);
       //String planeta = ("Plutão");
       //System.out.println(planeta);
/// ///////////////////////////////////////////////////////////
        //Scanner entrada = new Scanner(System.in);
        //String nome = (" ");
        //System.out.println("Qual o seu nome?");
        //nome = entrada.next();
        //System.out.println("Olá, "+nome);
/// //////////////////////////////////////////////////////////
        //Scanner entrada = new Scanner(System.in);
        //String nome = (" ");
        //System.out.println("Qual o seu nome?");
        //nome = entrada.next();
        //int idade = 0;
        //System.out.println("Qual a sua idade?");
        //idade = entrada.nextInt();
        //System.out.println("Olá, "+nome+" sua idade é: "+idade);
        //entrada.close();
/////////////////////////////////////////////////////////////////////
        //Scanner entrada = new Scanner (System.in);
        //int num = 0;
        //System.out.println("Digite um número: ");
        //num = entrada.nextInt();
        //if(num > 0){
            //System.out.println("Número positivo!");
        //}
        //else if(num < 0){
            //System.out.println("Número negativo!");
        //}
        //else if(num == 0){
            //System.out.println("Número neutro!");
        //}
/// ///////////////////////////////////////////////////////////////////
        Scanner entrada = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        System.out.println("Digite o primeiro valor:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        num2 = entrada.nextInt();
        System.out.println("Digite o terceiro valor:");
        num3 = entrada.nextInt();

        if(num1 > num2 || num1 > num3 ){
            System.out.println("O maior é: "+num1);
        }
        else if(num2 > num1 || num2 > num3 ){
            System.out.println("O maior é: "+num2);
        }
        else if(num3 > num1 || num3 > num2 ){
            System.out.println("O maior é: "+num3);
        }

    }
}