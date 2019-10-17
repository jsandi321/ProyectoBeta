/*
 * Contiene informacion del jugador y sus respectivos tableros,
 * 2 tableros por jugador que corresponde al tablero principal donde se encuantran
 * los barcos y otro de disparos para cada jugador.
 */
package battleship;
import java.util.ArrayList;
/**
 *
 * @author jsandi321
 */
public class Player {
    
    private String name;
    private int hits;
    private int misses;
    private int fires;
    private int lives;
    private String principalBoard[][]= new String[10][10];
    private String shootsBoard[][]= new String[10][10];
    private ArrayList<Ship> ships = new ArrayList();
    
    //Constructores de la clase
    public Player(String name){
        this.name = name;
    }
    
    //Metodos
    public String getName(){
        return name;
    }
    public int getHits(){
        return hits;
    }
    public int getMisses(){
        return misses;
    }
    public int getLives(){
        return lives;
    }
    public String[][] getPrincipalBoard(){
        return principalBoard;
    }
    public String[][] getShootsBoard(){
        return shootsBoard;
    }
    public ArrayList getPlayerShips(){
        return ships;
    }
    /**
     * Descripcion: Metodo que me retorna un objeto del tipo barco que se encuentra
     * en el arreglo de barcos del jugador
     * @param pos
     * @return 
     */
    public Ship getShip(int pos){
        Ship ship = ships.get(pos);
        return ship;
    }
/**
 * Descripcion: Metodo que rellena el tablero de disparos son Strings que se 
 * reemplazaran por lo disparos del jugador.
 */
    public void generateBoard(String[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                String field = "~";
                board[i][j] = field;
            }
        }
    }
/**
 * Descripcion: Main verifica el estado del disparo y este metodo introduce en la
 * pos del disparo el caracter correspondiente.
 * X = Agua; F = Hit; o = barco hundido, se reemplaza por cada casilla del mismo.
 * Entrada: las coordenadas de los disparos.
 * Restricciones: La casilla no debe estar ocupada por un disparo anterior y debe
 * estar en los margenes de la matriz.
     * @param pos
     * @param shoot
 */
    public void fire(int[] pos, String shoot){
        int x = pos[0];
        int y = pos[1];
        shootsBoard[x][y] = shoot;
    }
    /**
     * Descripcion: Metodo imprime en pantalla un tablero
     */
    public void showShootBoard(){
        System.out.println("Este es tu tablero de disparos");
        for (int x=0; x < shootsBoard.length; x++) {
            System.out.print("|");
            for (int y=0; y < shootsBoard[x].length; y++) {
                System.out.print (shootsBoard[x][y]);
                if (y!=shootsBoard[x].length-1) System.out.print("  ");
            }
            System.out.println("|");
        }
    }
    public void showShipsBoard(){
        System.out.println("Este es tu tablero de barcos");
        for (int x=0; x < principalBoard.length; x++) {
            System.out.print("|");
            for (int y=0; y < principalBoard[x].length; y++) {
                System.out.print (principalBoard[x][y]);
                if (y!=principalBoard[x].length-1) System.out.print("  ");
            }
            System.out.println("|");
        }
    }
    /**
     * Descripcion: Elimina barcos del arreglo de barcos segun una pos dada
     * Entrada: Resibe un int con la pos en el arreglo del objeto a borrar
     * @param pos 
     */
    public void deleteShip(int pos){
        ships.remove(pos);
    }
    /**
     * Descripcion: Este metodo genera los objetos de tipo Ship y los almacena
     * en un arreglo
     */
    public void generateShips(){
        Ship portaAviones = new Ship("portaAviones" , 4);
        ships.add(portaAviones);
        for (int i = 0; i < 3; i++){
            Ship submarine = new Ship("submarino"+i, 3);
            ships.add(submarine);
        }
        for (int i = 0; i < 3; i++){
            Ship destroyer = new Ship("destructor"+i, 2);
            ships.add(destroyer);
        }
        for(int i = 0; i < 2; i++){
            Ship frigate = new Ship ("fragata"+i, 1);
            ships.add(frigate);
        }
    }
}
