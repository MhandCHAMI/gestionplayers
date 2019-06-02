package com.checkconsulting.back.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsMajeurValidator implements ConstraintValidator<IsMajeur, Integer> {
   public void initialize(IsMajeur constraint) {
   }

   public boolean isValid(Integer age, ConstraintValidatorContext context) {

      if (age < 18) return false;
      return true;
   }

}
