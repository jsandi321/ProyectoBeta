/*
 * A traves de esta clase es posible crear los distintos tipos de barcos,
 * requeridos en el juego, adicionalmente a traves de sus métodos es posible
 * determinar el estado de los mismos y el ultimo espacio que ocupan.
 */

package battleship;

/**
 *
 * @author Emmanuel
 */
public class Ship {
    private String name;
    private int size;
    private int lives;
    private boolean isSunk;
    private boolean isTouched;
    
    
    
    //Métodos
    public Ship(String name, int size){
            this.name = name;
            this.size = size;
            this.lives = size;
            this.isSunk = false;
            this.isTouched = false;       
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getLives() {
        return lives;
    }

    public boolean isIsSunk() {
        return isSunk;
    }

    public boolean isIsTouched() {
        return isTouched;
    }

    public void setIsSunk(boolean isSunk) {
        this.isSunk = isSunk;
    }

    public void setIsTouched(boolean isTouched) {
        this.isTouched = isTouched;
    }

    //Para pruebas
    public void setLives(int lives) {
        this.lives = lives;
    }
    
        
 /**
 * Descripcion: Método que determina la ultima celda o espacio en el tablero que
 * ocupa una determinada nave o barco dependiendo la direccion elegida.
 */
    
    public int finalPosition(int startPosition, String direction){
        
        if((("arriba".equals(direction)) || ("ARRIBA".equals(direction)) || ("Arriba".equals(direction))) || (("izquierda".equals(direction)) || ("IZQUIERDA".equals(direction)) || ("Izquierda".equals(direction)))){
            int finalPosition = startPosition - (size - 1);
            return finalPosition;
            
        } else if((("abajo".equals(direction)) || ("ABAJO".equals(direction)) || ("Abajo".equals(direction))) || (("derecha".equals(direction)) || ("DERECHA".equals(direction)) || ("Derecha".equals(direction)))){
            int finalPosition = startPosition + (size - 1);
            return finalPosition;
            
        } else {
            return 404; //Error por introducir mal la dirección.. Luego hay que incluir String en game!
        }
    }
    
 /**
 * Descripcion: Método que permite actualizar el estado del barco, indicando
 * si el mismo ya se encuenta tocado o completamente hundido.
 */
    
    public void shipWasHit() {
        if(lives == 0) {
            isSunk = true;
            isTouched = false;
            System.out.println("El " + name + "esta hundido");//Esto podria ir en game tambien, la interaccion con el usuario
            return;
        }
        isTouched = true;
        System.out.println("El " + name + "fue tocado");//Esto podria ir en game tambien, la interaccion con el usuario
        lives--;
    }
   
}
