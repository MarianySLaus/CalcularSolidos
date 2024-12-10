import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double raio=0.0, altura=0.0, volume=0.0, lado = 0.0, comprimento=0.0, largura = 0.0;
        int opcao = 0;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println(" Programa: calcular volume de figuras geométricas ");
            System.out.println("--------------------------------------------------");

            System.out.println(" 1 - Volume do Cilindro ");
            System.out.println(" 2 - Volume do Cone ");
            System.out.println(" 3 - Volume do Prisma ");
            System.out.println(" 4 - Volume da Esfera ");
            System.out.println(" 5 - Volume do Cubo ");
            System.out.println(" 6 - Volume da Pirâmide Quadrangular ");
            System.out.println(" 7 - Volume do Paralelepípedo ");
            System.out.println(" 0 - Sair ");
            System.out.println("\n");
            System.out.print("Escolha sua opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cilindro.calcularVolume(raio,altura);
                    System.out.println("\n");
                    System.out.printf("O volume do cilindro é: %.2f\n\n",volume);
                    break;
                case 2:
                    System.out.print("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Cone.calcularVolume(raio,altura);
                    System.out.println("\n");
                    System.out.printf("O volume do cilindro é: %.2f\n\n",volume);
                    break;
                case 3:
                    System.out.print("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Prisma.calcularVolume(lado,altura);
                    System.out.println("\n");
                    System.out.printf("O volume do prisma é: %.2f\n\n",volume);
                    break;
                case 4:
                    System.out.print("Digite o valor do raio: ");
                    raio = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Esfera.calcularVolume(raio,altura);
                    System.out.println("\n");
                    System.out.printf("O volume da esfera é: %.2f\n\n",volume);
                    break;
                case 5:
                    System.out.print("Digite o valor do lado: ");
                    lado = sc.nextDouble();

                    volume = Cubo.calcularVolume(lado);
                    System.out.println("\n");
                    System.out.printf("O volume do Cubo é: %.2f\n\n",volume);
                    break;
                case 6:
                    System.out.print("Digite o valor do lado: ");
                    lado = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = PiramideQuadrangular.calcularVolume(lado,altura);
                    System.out.println("\n");
                    System.out.printf("O volume da pirâmide quadrangular é: %.2f\n\n",volume);
                    break;
                case 7:
                    System.out.print("Digite o valor do comprimento: ");
                    comprimento = sc.nextDouble();
                    System.out.print("Digite o valor da largura: ");
                    largura = sc.nextDouble();
                    System.out.print("Digite o valor da altura: ");
                    altura = sc.nextDouble();

                    volume = Paralelepipedo.calcularVolume(comprimento,largura,altura);
                    System.out.println("\n");
                    System.out.printf("O volume do paralelepípedo é: %.2f\n\n",volume);
                    break;
                case 0:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }

        }while (opcao !=0);

        sc.close();
    }
}
