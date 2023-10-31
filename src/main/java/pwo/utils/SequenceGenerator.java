/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pwo.utils;

import java.math.BigDecimal;

public interface SequenceGenerator {

    void reset();

    BigDecimal nextTerm();

    BigDecimal getTerm(int i);
}
