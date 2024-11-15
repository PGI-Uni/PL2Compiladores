import java.util.*;

public class Juego {
    private final int TAMANO_MAPA = 5;
    private Casilla[][] mapa;
    private int puntuacion;
    private int tesorosRestantes;
    
    // Constructor que inicializa el juego
    public Juego(List<MapaParser.PosicionInfoContext> posiciones, List<MapaParser.BarcoInfoContext> barcos) {
        this.mapa = new Casilla[TAMANO_MAPA][TAMANO_MAPA];
        this.puntuacion = 0;
        this.tesorosRestantes = 0;

        // Inicializar el mapa vacío
        for (int i = 0; i < TAMANO_MAPA; i++) {
            for (int j = 0; j < TAMANO_MAPA; j++) {
                mapa[i][j] = new Casilla();
            }
        }

        // Colocar los barcos en el mapa
        for (MapaParser.PosicionInfoContext posicion : posiciones) {
            int x = Integer.parseInt(posicion.NUMERO(0).getText()) - 1;
            int y = Integer.parseInt(posicion.NUMERO(1).getText()) - 1;
            Casilla casilla = mapa[x][y];
            casilla.setBarco(true);
        }

        // Colocar los barcos y los tesoros (puntuación)
        for (MapaParser.BarcoInfoContext barco : barcos) {
            int puntos = Integer.parseInt(barco.NUMERO().getText());
            String nombre = barco.NOMBRE_BARCO().getText();
            // Aumentar la cantidad de tesoros
            tesorosRestantes++;
        }
    }

    // Método para bucear en una casilla
    public String bucear(int x, int y) {
        if (x < 0 || x >= TAMANO_MAPA || y < 0 || y >= TAMANO_MAPA) {
            return "¡Coordenadas fuera del mapa!";
        }
        
        Casilla casilla = mapa[x][y];
        StringBuilder resultado = new StringBuilder();

        // Comprobar si la casilla tiene un barco
        if (casilla.hasBarco()) {
            puntuacion += 10; // Sumar puntos si encontramos un barco
            casilla.setBarco(false); // El barco desaparece
            resultado.append("¡Encontraste un barco! Puntuacion: ").append(puntuacion).append("\n");
            tesorosRestantes--;
        } 

        //Posibilidades del resto de casillas
        else { resultado.append("No hay tesoro aqui. Sigue buscando.\n"); }

        // Comprobar si todos los tesoros han sido encontrados
        if (tesorosRestantes == 0) {
            resultado.append("¡Felicidades! Has encontrado todos los tesoros.\n");
            return resultado.toString();
        }

        return resultado.toString();
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    // Casilla del mapa
    private static class Casilla {
        private boolean tieneBarco;
        
        public Casilla() {
            this.tieneBarco = false;
        }

        public boolean hasBarco() {
            return tieneBarco;
        }

        public void setBarco(boolean tieneBarco) {
            this.tieneBarco = tieneBarco;
        }
    }
}
