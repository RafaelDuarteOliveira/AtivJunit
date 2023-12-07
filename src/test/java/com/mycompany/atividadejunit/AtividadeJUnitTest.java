/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.atividadejunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aluno tds
 */
public class AtividadeJUnitTest {

    AtividadeJUnit test = new AtividadeJUnit();
    
    @Test
    public void testAdicao() {
        assertEquals(7, test.adicao(3, 4));
        assertEquals(7, test.adicao(4, 3));
        assertEquals(4, test.adicao(-2, 3)); // forçando o erro, resultado 1
    }

    @Test
    public void testSubtracao() {
        assertEquals(5, test.subtracao(8, 3));
        assertEquals(5, test.subtracao(-2, -5));//erro, espera resultado -7
        assertEquals(0, test.subtracao(0, 0));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(3, test.multiplicacao(1, 3));
        assertEquals(20, test.multiplicacao(-4, 5));//vai dar erro espera resultado -20
        assertEquals(0, test.multiplicacao(0, 7));
    }

    @Test
    public void testDivisao() {
        assertEquals(4, test.divisao(8, 2));
        assertEquals(2, test.divisao(5, 10));
        assertEquals(1, test.divisao(7, 7));
    }    
    
}
