/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 *
 * @author alybe
 */
public class parameterABOTest {

    public static boolean ValidarMail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@") && email.contains(".") && email.length() < 20;
    }

    @ParameterizedTest
    @CsvSource({
        "alybelp7@gmail.com, true",
        "correo-sin-arroba.com, false",
        "correo@sinpunto, false",
        "correo_super_mega_largo_que_falla@gmail.com, false"
    })
    public void testValidarEmailParametrizado(String email, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, ValidarMail(email));
    }
}
