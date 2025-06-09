// Exercício 01 - Baby Steps
public class Ex01 {
    public static void main(String[] args) {
        String Planeta = "Plutão";
        System.out.println("Planeta: " + Planeta);
    }
}

// Exercício 02 - Hello Clarice
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá, " + nome);
        input.close();
    }
}

// Exercício 03 - A Bit of Information
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Olá, " + nome + ", sua idade é " + idade);
        input.close();
    }
}

// Exercício 04 - A Bit of Geometry (Exemplos de áreas)
import java.util.Scanner;
public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lado do quadrado: ");
        double lado = input.nextDouble();
        System.out.println("Área do quadrado: " + (lado * lado));
        input.close();
    }
}

// Exercício 05 - 1, 2 e 3
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int valor = input.nextInt();
        if (valor > 0) System.out.println("Positivo");
        else if (valor < 0) System.out.println("Negativo");
        else System.out.println("Neutro");
        input.close();
    }
}

// Exercício 06 - Qual o maior?
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        int maior = Math.max(a, Math.max(b, c));
        System.out.println("Maior: " + maior);
        input.close();
    }
}

// Exercício 06.1 - Qual o maior? (4 valores)
import java.util.Scanner;
public class Ex06_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), b = input.nextInt(), c = input.nextInt(), d = input.nextInt();
        int maior = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Maior: " + maior);
        input.close();
    }
}

// Exercício 07 - Soma dos 2 maiores de 3
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = {input.nextInt(), input.nextInt(), input.nextInt()};
        java.util.Arrays.sort(valores);
        int soma = valores[1] + valores[2];
        System.out.println("Soma dos dois maiores: " + soma);
        input.close();
    }
}

// Exercício 07.1 - Soma dos 2 maiores de 5
import java.util.Scanner;
public class Ex07_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] valores = new int[5];
        for (int i = 0; i < 5; i++) valores[i] = input.nextInt();
        java.util.Arrays.sort(valores);
        int soma = valores[3] + valores[4];
        System.out.println("Soma dos dois maiores: " + soma);
        input.close();
    }
}

// Exercício 08 - Enquanto isso
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int a = input.nextInt();
        int b;
        do {
            System.out.print("Digite o segundo valor (positivo e diferente de zero): ");
            b = input.nextInt();
        } while (b <= 0);
        System.out.println("Resultado da divisão: " + (a / (double)b));
        input.close();
    }
}

// Exercício 09 - Cansar de Digitar
import java.util.Scanner;
public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            int valor = input.nextInt();
            soma += valor;
        }
        System.out.println("Média: " + (soma / 10));
        input.close();
    }
}

// Exercício 10 - Parabéns
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            soma += input.nextDouble();
        }
        double media = soma / 4;
        if (media >= 6.0) System.out.println("PARABÉNS! Você foi aprovado!");
        input.close();
    }
}

// Exercício 11 - BOOOOMMM
public class Ex11 {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("EXPLOSÃO");
    }
}

// Exercício 12 - 10 a 1
public class Ex12 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

// Exercício 13 - De quanto até quanto?
import java.util.Scanner;
public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = input.nextInt();
        int soma = 0, cont = 0;
        for (int i = a; i <= b; i++) {
            soma += i;
            cont++;
        }
        System.out.println("Média: " + ((double) soma / cont));
        input.close();
    }
}

// Exercício 14 - Passou no Teste?
import java.util.Scanner;
public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aprovados = 0;
        String resposta;
        do {
            double soma = 0;
            for (int i = 0; i < 6; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                soma += input.nextDouble();
            }
            double media = soma / 6;
            if (media >= 6.5) aprovados++;
            System.out.print("Calcular a média de outro aluno Sim/Não? ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("S"));
        System.out.println("Total de alunos aprovados: " + aprovados);
        input.close();
    }
}

// Exercício 15 - Uma Brincadeira Sobre Alturas
public class Ex15 {
    public static void main(String[] args) {
        double anacleto = 150, felisberto = 110;
        int anos = 0;
        while (felisberto <= anacleto) {
            anacleto += 2;
            felisberto += 3;
            anos++;
        }
        System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior.");
    }
}

// Exercício 16 - O Voto é secreto
import java.util.Scanner;
public class Votos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número total de eleitores: ");
        int total = input.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int brancos = input.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int nulos = input.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int validos = input.nextInt();

        double percBrancos = (brancos * 100.0) / total;
        double percNulos = (nulos * 100.0) / total;
        double percValidos = (validos * 100.0) / total;

        System.out.println("Percentual de votos brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");

        input.close();
    }
}

// Exercício 17 - Custa quanto?
import java.util.Scanner;
public class CustoCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do carro: R$ ");
        double custoFabrica = input.nextDouble();

        double distribuidor = custoFabrica * 0.28;
        double impostos = custoFabrica * 0.45;
        double custoFinal = custoFabrica + distribuidor + impostos;

        System.out.println("Custo final ao consumidor: R$ " + custoFinal);
        input.close();
    }
}

// Exercício 18 - A pagar
import java.util.Scanner;
public class SalarioVendedor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número de carros vendidos: ");
        int carros = input.nextInt();

        System.out.print("Valor total das vendas: R$ ");
        double totalVendas = input.nextDouble();

        double salarioFixo = 5000.00;

        System.out.print("Comissão fixa por carro vendido: R$ ");
        double comissaoFixa = input.nextDouble();

        double comissao = carros * comissaoFixa;
        double percentual = totalVendas * 0.05;

        double salarioFinal = salarioFixo + comissao + percentual;

        System.out.println("Detalhamento:");
        System.out.println("Comissão fixa total: R$ " + comissao);
        System.out.println("Comissão percentual (5%): R$ " + percentual);
        System.out.println("Salário final: R$ " + salarioFinal);

        input.close();
    }
}

// Exercício 19 - É o quê?
import java.util.Scanner;
public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o lado A: ");
        int a = input.nextInt();

        System.out.print("Digite o lado B: ");
        int b = input.nextInt();

        System.out.print("Digite o lado C: ");
        int c = input.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Formam um triângulo.");
        } else {
            System.out.println("Não formam um triângulo.");
        }
        input.close();
    }
}

// Exercício 20 - CPF na nota?
import java.util.Scanner;
public class NotaFiscal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome do produto: ");
        String nome = input.next();

        System.out.print("Quantidade adquirida: ");
        int qtd = input.nextInt();

        System.out.print("Preço unitário: R$ ");
        double preco = input.nextDouble();

        double valorVenda = qtd * preco;
        double desconto = 0;

        if (qtd <= 5) {
            desconto = valorVenda * 0.02;
        } else if (qtd <= 10) {
            desconto = valorVenda * 0.03;
        } else {
            desconto = valorVenda * 0.05;
        }

        double imposto = valorVenda * 0.20;
        double totalPagar = valorVenda - desconto + imposto;

        System.out.println("Recibo:");
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + qtd);
        System.out.println("Valor da venda: R$ " + valorVenda);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Total a pagar: R$ " + totalPagar);
        input.close();
    }
}

// Exercício 21 - Descanso merecido
import java.util.Scanner;
public class Aposentadoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número do empregado: ");
        int codigo = input.nextInt();

        System.out.print("Ano de nascimento: ");
        int nascimento = input.nextInt();

        System.out.print("Ano de ingresso: ");
        int ingresso = input.nextInt();

        int idade = 2025 - nascimento;
        int tempoTrabalho = 2025 - ingresso;

        System.out.println("Idade: " + idade);
        System.out.println("Tempo de trabalho: " + tempoTrabalho);

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
        input.close();
    }
}

// Exercício 22 - Conta comigo
public class ContaComigo {
    public static void main(String[] args) {
        int inicio = 1;
        int valor = 1;

        while (inicio <= 20) {
            System.out.print("(" + inicio + ", ");
            for (int i = 0; i < 10; i++) {
                System.out.print((valor++) + " ");
            }
            System.out.println(")");
            inicio++;
        }
    }
}

// Exercício 23 - Não Conta comigo
public class NaoContaComigo {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.print("(" + i + ", ");
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " ");
            }
            System.out.println(")");
        }
    }
}

// Exercício 24 - Jornada de trabalho
import java.util.Scanner;
public class JornadaTrabalho {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Horas trabalhadas no mês: ");
        int horas = input.nextInt();

        System.out.print("Salário por hora: R$ ");
        double salarioHora = input.nextDouble();

        int horasNormais = Math.min(horas, 160);
        int horasExtras = Math.max(horas - 160, 0);

        double salarioTotal = horasNormais * salarioHora + horasExtras * salarioHora * 1.5;

        System.out.println("Salário total: R$ " + salarioTotal);
        input.close();
    }
}

// Exercício 25 - Invertendo tudo
import java.util.Scanner;
public class InverteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vetor = new String[12];

        System.out.println("Digite 12 elementos (números ou letras):");
        for (int i = 0; i < 12; i++) {
            vetor[i] = input.next();
        }

        System.out.println("Saída 1: ");
        for (int i = 11; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nSaída 2: ");
        String numeros = "";
        String letras = "";
        for (int i = 11; i >= 0; i--) {
            if (Character.isDigit(vetor[i].charAt(0))) {
                numeros += vetor[i] + " ";
            } else {
                letras += vetor[i] + " ";
            }
        }
        System.out.println(numeros + " - " + letras);
        input.close();
    }
}
