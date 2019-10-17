/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;
import java.util.Scanner;

/**
 *
 * @author jsandi321
 */
public class Battleship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola Bienvenidos a Battleship");
        System.out.println("Jugador 1 por favor introduce tu nombre: ");
        String name1 = sc.next();
        System.out.println("Jugador 2 por favor introduce tu nombre: ");
        String name2 = sc.next();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        System.out.println("Hola jugador 1 "+player1.getName());
        System.out.println("Hola jugador 2 "+player2.getName());
        player1.generateShips();
        player2.generateShips();
        player1.generateBoard(player1.getPrincipalBoard());
        player1.generateBoard(player1.getShootsBoard());
        player1.showShipsBoard();
        player1.showShootBoard();
    }
    
}
