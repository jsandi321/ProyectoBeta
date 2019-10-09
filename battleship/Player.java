/*
 * Contiene informacion del jugador y sus respectivos tableros,
 * 2 tableros por jugador que corresponde al tablero principal donde se encuantran
 * los barcos y otro de disparos para cada jugador.
 */
package battleship;

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
    //Definir si seran atribustos u objetos
    private String principalBoard[][]= new String[10][10];
    private String shootsBoard[][]= new String[10][10];
    
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
/**
 * Descripcion: Metodo que rellena el tablero de disparos son Strings que se 
 * reemplazaran por lo disparos del jugador.
 */
    public void shootBoardField(){
        for(int i = 0; i < shootsBoard.length; i++){
            for(int j = 0; j < shootsBoard.length; j++){
                String field = "~";
                shootsBoard[i][j] = field;
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
}