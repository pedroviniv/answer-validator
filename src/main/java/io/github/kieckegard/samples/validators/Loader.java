/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
public class Loader {
    
    public static void main(String[] args) {
        
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("io.github.kieckegard.samples.validators");
        AnswerValidationService validator = context.getBean(AnswerValidationService.class);
        
        final Answer answer = Answer.builder()
                .type(AnswerType.TEXT)
                .date(LocalDate.now())
                .build();
        
        try {
            validator.validate(answer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
