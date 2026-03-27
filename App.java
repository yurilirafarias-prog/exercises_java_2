import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();


    }

    // EX 01

    //Crie um Algoritmo que leia o valor de um produto e calcule o desconto de 5% e exiba esse valor.

    public static void ex01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor para calcular o desconto: ");

        double valor = sc.nextDouble();
        double desconto = valor * 0.05;
        double valorFinal = valor - desconto;

        System.out.println("Desconto: " + desconto);
        System.out.println("Valor Final " + valorFinal);
    }

    // EX 02

    //2. Crie um Algoritmo que leia o valor em real e a cotação do dólar. Logo depois, escreva o valor correspondente em dólares.

    public static void ex02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade em reais: ");
        double reais = sc.nextDouble();

        System.out.println("Digite a cotação do dollar atual: ");
        double dollar = sc.nextDouble();
        double cotacao = reais / dollar;

        System.out.println("Seu valor em dollar é: " + cotacao);


    }

    //3. Crie um Algoritmo que leia o preço do combustível e o valor a ser abastecido. Logo depois, exiba a quantidade de litros.

    public static void ex03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o preço do combustível: ");
        double preco = sc.nextDouble();

        System.out.println("Digite o valor que deseja abastecer: ");
        double valor = sc.nextDouble();

        double litros = valor / preco;
        System.out.println("Quantidade de litros abastecido: " + litros);

    }
    //4. Uma empresa contrata um pedreiro com a diária de R$150,00. Crie um
    //Algoritmo que leia a quantidade de dias trabalhados e logo depois exiba
    //o valor a ser pago com o desconto de 7% do INSS e 15% do IR

    public static void ex04() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de dias trabalhados: ");
        double diasTrabalhados = sc.nextDouble();

        double diariasTotais = diasTrabalhados * 150;

        double inss = diariasTotais * 0.07;
        double ir = diariasTotais * 0.15;

        double diarias = diariasTotais - inss - ir;

        System.out.println("Seu valor a receber é: " + diarias);

    }

    //5. Crie um algoritmo que leia o valor de um produto e calcule o valor final
    //com acréscimo de 8%. Exiba o valor do acréscimo e o valor final.

    public static void ex05() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorProduto = sc.nextDouble();

        double valorProdutofinal = valorProduto * 0.08;
        System.out.println("O valor do aumento é: " + valorProdutofinal);

        double valorFinal = valorProduto + valorProdutofinal;
        System.out.println("O valor total com aumento é: " + valorFinal);


    }

    //6. Crie um algoritmo que leia: O valor em reais e a cotação do euro. Logo
    //depois, exiba o valor convertido em euros.
    public static void ex06() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade em euro: ");
        double reais = sc.nextDouble();

        System.out.println("Digite a cotação do euro atual: ");
        double euro = sc.nextDouble();

        double cotacao = reais / euro;
        System.out.println("Seu valor em euro é: " + cotacao);

    }
    //7. Crie um algoritmo que leia: A quantidade de kWh consumidos e o valor
    //do kWh. Logo depois, calcule e exiba o valor total da conta de energia.


    public static void ex07() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de kWh: ");
        double kwh = sc.nextDouble();

        System.out.println("Digite o valor do kWh: ");
        double valorKwh = sc.nextDouble();

        double total = kwh * valorKwh;
        System.out.println("Valor total da sua conta é: " + total);

    }

    //8. Cálculo de Média Escolar: P1, P2 e P3 são as provas. A P1 e P2 tem
    //peso de 40% da média final e a P3 60%. Exiba as notas e a média final

    public static void ex08() {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a nota da P1: ");
        double p1 = sc.nextDouble();

        System.out.println("Digite a nota da P2: ");
        double p2 = sc.nextDouble();

        System.out.println("Digite a nota da P3: ");
        double p3 = sc.nextDouble();

        double notap1 = p1 * 0.2;
        System.out.println("A sua nota p1 é: " + p1);

        double notap2 = p2 * 0.2;
        System.out.println("A sua nota p2 é: " + p2);

        double notap3 = p3 * 0.6;
        System.out.println("A sua nota p3 é: " + p3);

        double media = (notap1) + (notap2) + (notap3);
        System.out.println("A sua média é: " + media);


    }
    //9. Crie um algoritmo que leia a idade de uma pessoa em anos e exiba essa
    //idade em dias.

    public static void ex09() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = sc.nextInt();

        int dias = idade * 365;

        System.out.println("Sua idade em dias é: " + dias);

    }

    //10.Crie um algoritmo que leia: Valor do produto e a Quantidade de parcelas.
    //Considere juros de 2% ao mês e exiba o valor total a pagar

    public static void ex10() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valorP = sc.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        int parcelas = sc.nextInt();

        double total = valorP / parcelas;

        double totalComjuros = ((valorP/parcelas)*0.02)+total;
        System.out.println("Valor total da parcela com juros: "+totalComjuros);

        double valorPj = ((valorP/parcelas)*1.02)*parcelas;


        System.out.println("O valor total a pagar: " + valorPj);


            sc.close();

    }
}