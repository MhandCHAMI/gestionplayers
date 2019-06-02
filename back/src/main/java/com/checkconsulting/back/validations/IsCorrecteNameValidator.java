package com.checkconsulting.back.validations;

import com.checkconsulting.back.entities.Player;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IsCorrecteNameValidator implements ConstraintValidator<IsCorrecteName, Player> {
   public void initialize(IsCorrecteName constraint) {
   }

   public boolean isValid(Player player, ConstraintValidatorContext context) {
      if(player.getNom().equals(player.getPrenom())) return false;
      return true;
   }
}
