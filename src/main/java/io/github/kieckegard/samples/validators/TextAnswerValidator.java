/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.util.Objects;
import org.springframework.stereotype.Component;

/**
 *
 * Implementaçao de um validador de {@link Answer} 
 * do tipo {@link AnswerType#TEXT}.<br>
 * Esta implementaçao foi separada em uma classe e nao esta na<br>
 * classe {@link TypeAnswerValidatorsBasicImpl} por ter uma regra de validaçao<br>
 * mais complexa e faz uso de dependencias que nao eh necessario para os outros tipos,<br>
 * logo faz sentido estar em outra classe.
 * 
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */

@Component(AnswerValidator.TEXT)
public class TextAnswerValidator implements AnswerValidator {

    @Override
    public void validate(Answer answer) throws Exception {
        if (Objects.isNull(answer.getText())) {
            throw new Exception("Text is required.");
        }
    }
    
}
