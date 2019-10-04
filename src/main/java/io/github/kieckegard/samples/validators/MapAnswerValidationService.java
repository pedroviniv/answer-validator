/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.util.Map;

/**
 * Implementaçao de um serviço de validaçao de {@link Answer} que usa um mapa
 * de {@link AnswerValidator} baseado no tipo da resposta {@link AnswerType}.
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
public class MapAnswerValidationService implements AnswerValidationService {

    private Map<AnswerType, AnswerValidator> validatorsByType;

    public MapAnswerValidationService(Map<AnswerType, AnswerValidator> validatorsByType) {
        this.validatorsByType = validatorsByType;
    }
    
    @Override
    public void validate(final Answer answer) throws Exception {
        AnswerValidator validator = this.validatorsByType.get(answer.getType());
        validator.validate(answer);
    }
}
