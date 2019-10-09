/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;

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
        Player player1 = new Player("Jeison");
        Player player2 = new Player("Jack");
        System.out.println("Hola jugador 1 "+player1.getName());
        System.out.println("Hola jugador 2 "+player2.getName());
    }
    
}
