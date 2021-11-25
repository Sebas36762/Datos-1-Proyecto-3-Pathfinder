package DijkstraPath;

/**
 * Instituto Tecnologico de Costa Rica
 * Area Ingenieria en Computadores
 *
 * Lenguaje: Java
 * Clase: dijkstra_Path
 * @version 1.0
 * @author Angelo Ceciliano, Byron Mata, Gustavo Alvarado y Sebastian Chaves
 *
 * Descripcion: Clase que aplica el algoritmo de Dijkstra para encontrar la ruta más rapida entre 2 puntos
 */
public class dijkstra_Path {
    private final int node = 15;
    private final double[][] graph = {
            /*1 Muelle*/           {-1, 2.5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            /*2 Memorial*/         {-1, -1, -1, 8.2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            /*3 Internacional*/    {20.5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            /*4 Getty*/            {-1, -1, 20, -1, -1, 16.2, 16, -1, -1, -1, -1, -1, -1, -1, -1},
            /*5 Amigos*/           {-1, -1, -1, 22.5, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            /*6 Chinesse*/         {-1, -1, -1, -1, -1, -1, -1, 7.8, -1, -1, -1, -1, -1, -1, -1},
            /*7 Country museum*/   {-1, -1, -1, -1, -1, 6, -1, -1, -1, -1, -1, 9.5, -1, -1, -1},
            /*8 Griffith*/         {-1, -1, -1, -1, 14.6, -1, -1, -1, 25.5, -1, -1, -1, -1, -1, -1},
            /*9 Institute*/        {-1, -1, -1, -1, -1, -1, -1, -1, -1, 15.5, -1, 18.1, -1, -1, -1},
            /*10 Walmart*/         {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 4.6, -1, -1, -1, -1},
            /*11 Angelus*/         {-1, -1, -1, -1, -1, -1, -1, 12, -1, -1, -1, 4.6, -1, -1, -1},
            /*12 Gas station*/     {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25},
            /*13 In N Out*/        {-1, -1, 23.3, -1, -1, -1, 17.2, -1, -1, -1, -1, -1, -1, 28.6, -1},
            /*14 Palos Verdes*/    {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 51.6},
            /*15 Raising*/         {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 25.7, -1, 19.6, -1, -1},
    };

    /**
     * Constructor vacio del Singletoon
     */
    protected dijkstra_Path(){

    }

    /**
     * Metodo que implementa el patron singletoon dentro de esta clase
     *
     * @return instance
     */
    public static dijkstra_Path getInstance(){
        if (instance == null){
            instance = new dijkstra_Path();
        }
        return instance;
    }

    /**
     * Metodo que calcula la distancia minima
     *
     * @param graph de lista que contiene las distancias dadas
     * @param spSet
     * @return index
     */
    public double minDistance(double graph[], Boolean spSet[] ){
        double infinite = Integer.MAX_VALUE, index = -1;

        for (int i = 0; i < node; i++){

            if (spSet[i] == false && graph[i] <= infinite){
                infinite = graph[i];
                index = i;
            }
        }

        return index;
    }

    public void printSolution(double distance[], int j){
        for (int i = 0; i<j; i ++){
            System.out.println("To: " + i +" camino mas corto " + distance[i]);
        }
    }

    public double giveDistance(double distance[], int destine, int start){
        int elem = distance.length;
        int i = 0;
        double dist = 0;

        while (i < elem){
            if (i == destine){
                dist = distance[i];
                i = elem;
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("La distancia mas corta de: "+ start +" a "+ destine +" es: "+ dist);
        return dist;
    }

    public double dijsktra(int start, int destine){
        double distance[] = new double[node];
        Boolean spSet[] = new Boolean[node];

        for (int i = 0; i<node; i++){
            distance[i] = Integer.MAX_VALUE;
            spSet[i] = false;
        }

        distance[start] = 0;

        for (int j = 0; j<node; j++){
            double min = minDistance(distance, spSet);
            spSet[(int) min] = true;

            for (int k = 0; k<node; k++){
                if (!spSet[k] && graph[(int) min][k] != -1 && distance[(int) min] != Integer.MAX_VALUE && distance[(int) min] + graph[(int) min][k] < distance[k]){
                    distance[k] = distance[(int) min] + graph[(int) min][k];
                }
            }
        }
        //printSolution(distance, node);
        return giveDistance(distance, destine, start);
    }

}
