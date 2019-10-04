/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
@Configuration
public class AnswerValidationProvider {
    
    private final AnswerValidatorsBasicImpl typeAnswerValidatorsBasicImpl;

    @Autowired
    public AnswerValidationProvider(AnswerValidatorsBasicImpl validatorsBasicImpl) {
        this.typeAnswerValidatorsBasicImpl = validatorsBasicImpl;
    }
    
    @Bean(AnswerValidator.DATE)
    public AnswerValidator provideDateAnswerValidator() {
        return this.typeAnswerValidatorsBasicImpl::validateDateAnswer;
    }
    
    @Bean(AnswerValidationService.MAP)
    public AnswerValidationService provideAnswerValidator(
            @Qualifier(AnswerValidator.DATE) final AnswerValidator dateAnswerValidator,
            @Qualifier(AnswerValidator.TEXT) final AnswerValidator textAnswerValidator) {
        
        final Map<AnswerType, AnswerValidator> validatorsByType = new HashMap<>();
        validatorsByType.put(AnswerType.DATE, dateAnswerValidator);
        validatorsByType.put(AnswerType.TEXT, textAnswerValidator);
        
        return new MapAnswerValidationService(validatorsByType);
    }
}
