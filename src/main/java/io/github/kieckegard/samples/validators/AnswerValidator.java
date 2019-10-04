/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

/**
 * Interface que representa um validador de uma {@link Answer}.<br>
 * Esta interface sera utilizada para descrever validadores de {@link Answer}
 * de um tipo especifico.
 * 
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
@FunctionalInterface
public interface AnswerValidator {
    
    public static final String DATE = "DATE";
    public static final String TEXT = "TEXT";
    
    void validate(final Answer answer) throws Exception;
}
