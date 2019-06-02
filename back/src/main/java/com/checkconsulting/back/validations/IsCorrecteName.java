package com.checkconsulting.back.validations;

import com.checkconsulting.back.entities.Error;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = IsCorrecteNameValidator.class)
public @interface IsCorrecteName {


    /**
     * @return the associated error code.
     */
    Error error() default Error.E01;

    /**
     * @return the error message template.
     */
    String message() default "le nom et prénom doivent pas etre les memes";

    /**
     * @return the groups the constraint belongs to
     */
    Class<?>[] groups() default {};

    /**
     * @return the payload associated to the constraint
     */
    Class<? extends Payload>[] payload() default {};

}
