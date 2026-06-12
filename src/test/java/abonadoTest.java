/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Timeout;
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
    @Test
    public void testValidarPsw() {
        assertTrue(ciu.validarIngreso(123456)); 
    }

    @Test
    public void testValidarEmail() {
        String email = "alybelp7@gmail.com";
        boolean esValido = email.contains("@") && email.contains(".") && email.length() < 20;
        assertTrue(esValido);
    }

    @Test
    public void TestCambioPass() {
        String newPass = "1234";
        ciu.cambioPassword(newPass);
        assertEquals(1234, ciu.getPassword()); 
        System.out.println("La contraseña cambió a: " + ciu.getPassword());
    }

    @Test
    
    @Timeout(value = 30, unit = TimeUnit.MILLISECONDS)
    public void testDelay() throws InterruptedException {
        ciu.delay(45);
    }

    @Test
    public void testAbonadosDiferentes() {
        Abonado c1 = new Abonado();
        c1.cambioPassword("1111");
        
        Abonado c2 = new Abonado();
        c2.cambioPassword("2222");
        
        c1.abonadosDiferentes(c2);
        assertNotSame(c1, c2, "misma persona");
    }
}

