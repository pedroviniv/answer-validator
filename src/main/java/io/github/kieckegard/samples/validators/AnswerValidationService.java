/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

/**
 *
 * Contrate que descreve um serviço de validaçao de {@link Answer}.
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
public interface AnswerValidationService {
    
    public static final String MAP = "MAP";

    void validate(final Answer answer) throws Exception;
    
}
