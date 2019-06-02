package com.checkconsulting.back.validations;


import com.checkconsulting.back.entities.Error;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target(FIELD)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = IsMajeurValidator.class)
public @interface IsMajeur {

    /**
     * @return the associated error code.
     */
    Error error() default Error.E01;

    /**
     * @return the error message template.
     */
    String message() default "le joueur doit etre majeur";

    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};

    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};
}
