import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("[1] = Adicao\n[2] = Subtracao\n[3] = Multiplicacao\n[4] = Divisao\n[5] = Sair\nEscolha uma opcao: ");
            int vv = scanner.nextInt();
            
            switch (vv) {
                case 1:
                    System.out.print("Primeiro numero: ");
                    int va = scanner.nextInt();
                    System.out.print("Segundo numero: ");
                    int vaI = scanner.nextInt();

                    int rsa = va + vaI;

                    System.out.println(va + " + " + vaI + " = " + rsa);
                    break;
                case 2:
                    System.out.print("Primeiro numero: ");
                    int vs = scanner.nextInt();
                    System.out.print("Segundo numero: ");
                    int vsI = scanner.nextInt();

                    int rss = vs - vsI;

                    System.out.println(vs + " - " + vsI + " = " + rss);
                    break;
                case 3:
                    System.out.print("Primeiro numero: ");
                    int vm = scanner.nextInt();
                    System.out.print("Segundo numero: ");
                    int vmI = scanner.nextInt();

                    int rsm = vm * vmI;

                    System.out.println(vm + " * " + vmI + " = " + rsm);
                    break;
                case 4:
                    System.out.print("Primeiro numero: ");
                    int vd = scanner.nextInt();
                    System.out.print("Segundo numero: ");
                    int vdI = scanner.nextInt();

                    if (vdI == 0) {
                        System.out.println("Erro: Divisao por zero!");
                    } else {
                        int rsd = vd / vdI;
                        System.out.println(vd + " / " + vdI + " = " + rsd);
                    }
                    break;
                case 5:
                    System.out.println("Ok");
                    break;
                default: 
                    System.out.println("Opcao invalida!");
            }

            if (vv == 5) {
                break;
            }
        }

        scanner.close();
    }
}