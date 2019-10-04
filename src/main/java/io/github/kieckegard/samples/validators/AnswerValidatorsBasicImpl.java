/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 * Implementaçoes basicas de validadores de respostas perguntas
 * aqui sao contemplados os tipos
 * <ul>
 *   <li>{@link AnswerType#DATE}</li>
 * </ul>
 * 
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
@Component
public class AnswerValidatorsBasicImpl {
    
    public void validateDateAnswer(final Answer answer) throws Exception {
        if (Objects.isNull(answer.getDate())) {
            throw new Exception("Date is required.");
        }
    }
}
