/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.kieckegard.samples.validators;

import java.time.LocalDate;

/**
 *
 * @author Pedro Arthur <pfernandesvasconcelos@gmail.com>
 */
public class Answer {
    
    private String text;
    private LocalDate date;
    private AnswerType type;

    public static class Builder {

        private String text;
        private LocalDate date;
        private AnswerType type;

        private Builder() {
        }

        public Builder text(final String value) {
            this.text = value;
            return this;
        }

        public Builder date(final LocalDate value) {
            this.date = value;
            return this;
        }

        public Builder type(final AnswerType value) {
            this.type = value;
            return this;
        }

        public Answer build() {
            return new io.github.kieckegard.samples.validators.Answer(text, date, type);
        }
    }

    public static Answer.Builder builder() {
        return new Answer.Builder();
    }

    private Answer(final String text, final LocalDate date, final AnswerType type) {
        this.text = text;
        this.date = date;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public AnswerType getType() {
        return type;
    }

    public void setType(AnswerType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Answer{" + "text=" + text + ", date=" + date + ", type=" + type + '}';
    }
}
