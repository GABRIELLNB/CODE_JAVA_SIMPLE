import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanI = new Scanner(System.in);
        Scanner OP0 = new Scanner(System.in);
        Scanner OP2 = new Scanner(System.in);
        Scanner scanD = new Scanner(System.in);
        double salB, salL = 0, restSal;
        int dep = 0, op, op2, op3;
        double porcdep = 0, porc = 0.02, tikt = 15.0, porc2 = 0.2;
        double desct;
        double PassT = 301.6;
        double PassM = 228.8;

        for (int i = 0; i < 4; i++) {
            System.out.println("Qual é o seu salario: ");
            salB = scanD.nextDouble();

            System.out.println("Quantos dependentes você tem: ");
            dep = scanI.nextInt();

            System.out.println("Você trabalha todos os dias? SIM(1) OU NÃO(2)");
            op = OP0.nextInt();

            System.out.println("Você atual como vendedor? SIM(1) OU NÃO(2)");
            op2 = OP2.nextInt();

            System.out.println("Você recebe pensão? SIM(1) OU NÃO(2)");
            op3 = scanI.nextInt();

            // Benefícios obrigatórios
            salB += tikt;

            if (op == 1) {
                salB += PassT;
            } else
                salB += PassM;

            // Ele tem mais que 5 dependentes?
            if (dep > 5) {
                dep = 5;
            }

            // Ele é vendedor?
            if (op2 == 1) {
                salB = 1412;
                if (op == 1) {
                    salB += PassT;
                }
                if (op != 1) {
                    salB += PassM;
                }
                salB += tikt;
            }
            // Ele é recebe pensão?
            if (op3 == 1) {
                desct = porc2 * salB;
                salB = salB - desct;
            }

            porcdep = porc * dep;
            salL = salB + (porcdep * salB);
            System.out.println("Seu salario Liquido é : " + salL);
        }
    }
}
