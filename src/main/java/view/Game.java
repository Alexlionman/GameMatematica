
package view;
import java.util.Scanner;
import model.Calcular;

/**
 *
 * @author a.pereira
 */
public class Game {
    
    static Scanner teclado = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;
 
    
    public static void main(String[] args){
     Game.jogar();
    }
    
    public static void jogar(){
        System.out.println("Informe o nivel de dificuldade desejado [1, 2, 3, 4]: ");
        int dificuldade = Game.teclado.nextInt();
        
        Game.calc = new Calcular(dificuldade);
        
        System.out.println("Informe o resultado para a seguinte operação: ");
        
        //somar
        if(calc.getOperacao() == 0){
            System.out.println(calc.getValor1() + " + " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            
            if(calc.somar(resposta)){
              Game.pontos += 1;
                System.out.println("Voce tem " + Game.pontos + " ponto(s).");
            }
        }
        
        
        //diminuir
        else if(calc.getOperacao() == 1){
            System.out.println(calc.getValor1() + " - " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            
            if(calc.subtrair(resposta)){
              Game.pontos += 1;
                System.out.println("Voce tem " + Game.pontos + " ponto(s).");
            }
        
    }
        
         //multiplicar
        else if(calc.getOperacao() == 2){
            System.out.println(calc.getValor1() + " X " + calc.getValor2());
            int resposta = Game.teclado.nextInt();
            
            if(calc.multiplicar(resposta)){
              Game.pontos += 1;
                System.out.println("Voce tem " + Game.pontos + " ponto(s).");
            }
    }else{
            System.out.println("A operação " + calc.getOperacao() + " não é reconhecida");
        }
        
        
        System.out.println("Deseja continuar? [1 - Sim, 2 - Não]");
        int continuar = Game.teclado.nextInt();
        
        if(continuar == 1){
         Game.jogar();
        }else{
            System.out.println("Voce fez " + Game.pontos + " ponto(s)");
            System.out.println("Saindo...");
            System.exit(0);
        }
    }
    
}
