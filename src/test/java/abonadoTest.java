/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import temaF.Abonado;

/**
 *
 * @author alybe
 */
public class abonadoTest {

    static Abonado ciu;
    static int i = 1;

    @BeforeAll
    public static void antesDeTodo() {
        ciu = new Abonado();
        ciu.cambioPassword("1212"); 
        System.out.println("INGRESO de abonado del bien");
    }

    @AfterAll
    public static void despuesDeTodo() {
        LocalDate fechaAyer = LocalDate.now().minusDays(1);
        System.out.println(fechaAyer + " Modem rotos reparados, Abonados Felices");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("--------------------------------------------------");
        System.out.println("Ejecutando test numero: " + i);
        i++;
    }

    @AfterEach
    public void tearDown() {
        System.out.println("--------------------------------------------------");
    }
}

