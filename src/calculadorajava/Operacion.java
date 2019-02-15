/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorajava;

/**
 *
 * @author pbeni
 */
public class Operacion {

    public float sumar(float x, float y) {
        return x + y;
    }

    public float restar(float x, float y) {
        return x - y;
    }

    public float multiplicar(float x, float y) {
        return x * y;
    }

    public float dividir(float x, float y) {
        return x / y;
    }

    public float porcentaje(float x, float y) {
        return y / 100 * x;
    }

}
