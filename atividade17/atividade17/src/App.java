import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o tamanho da area a ser pintada: ");
        double area = ler.nextDouble();
        System.out.println("");

        double litro = area / 6;
        double lata = Math.ceil(litro / 18);
        double valorLata = lata * 80.00;
        double galao = Math.ceil(litro / 3.6);
        double valorGalao = galao * 25.00;

        System.out.printf("Voce vai precisar de %2.2f litros para pintar sua area", litro);
        System.out.println("");
        System.out.printf("Voce precisaria de %2.2f lata e vai custar R$%2.2f.",lata,valorLata);
        System.out.println("");
        System.out.printf("Voce precisaria de %2.2f galao e vai custar R$%2.2f.",galao,valorGalao);
        System.out.println("");
        
        double misturaLata = litro / 18.00;
        double misturaGalao = litro / 3.60;
        double x = 0;
        double y = 0;
        double valorGalaoMistura = misturaGalao * 25.00;
        double valorLataMistura = misturaLata * 80.00;
        double valorMistura = valorGalaoMistura + valorLataMistura;

        System.out.println(misturaGalao);
        if (litro < 18){
            while(x < misturaGalao){
                x++;
            }
        }
        if (litro >= 18){
            while(x < misturaLata){
                x++;
            }
                
            }
            
            System.out.println(x);
        }
        }
        

        
    

