/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

/**
 *
 * @author roban
 */
public class SimplexMAX {

    /*double Matriz[][] = null;
    int restricciones = 0, variables = 0, iter = 0, iteracion = 0;
    Object array[] = null;
    Object EtiquetaX[] = null, EtiquetaY[] = null;*/
    public void MaximizarFuncion(int varialbes, int restricciones) {

    }

    public int ColumnaPivote(double Matriz[][], int restricciones, int variables) {
        int pos = 0;
        double aux = Matriz[restricciones][0];
        for (int i = 1; i < restricciones + variables; i++) {
            if (aux > Matriz[restricciones][i]) {
                aux = Matriz[restricciones][i];
                pos = i;
            }
        }
        return pos;
    }

    public int FilaPivote(double Matriz[][], int restricciones, int variables) {
        int columna = this.ColumnaPivote(Matriz, restricciones, variables);
        double temp = 0, razon = Matriz[0][variables + restricciones] / Matriz[0][columna];
        int pos = 0;
        for (int i = 1; i < restricciones; i++) {
            if (Matriz[i][columna] != 0) {
                temp = Matriz[i][variables + restricciones] / Matriz[i][columna];
                if (razon > temp && temp >= 0) {
                    razon = temp;
                    pos = i;
                }
            }

        }
        return pos;
    }

    public boolean ComprobarResultado(int restricciones, int variables, double Matriz[][]) {
        boolean result = true;
        for (int i = 0; i < restricciones + variables; i++) {
            if (Matriz[restricciones][i] < 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public double[][] NuevaTabla(double Matriz[][], int restricciones, int variables, int Fila, int Columna) {
        double pivote = Matriz[Fila][Columna], temp = 0;
        for (int i = 0; i < restricciones + variables + 1; i++) {
            Matriz[Fila][i] = Matriz[Fila][i] / pivote;
        }
        for (int i = 0; i < restricciones + 1; i++) {
            temp = Matriz[i][Columna];
            for (int j = 0; j < variables + restricciones + 1; j++) {
                if (i != Fila) {
                    Matriz[i][j] = Matriz[i][j] - temp * Matriz[Fila][j];
                } else {
                    break;
                }
            }
        }
        return Matriz;
    }

}
