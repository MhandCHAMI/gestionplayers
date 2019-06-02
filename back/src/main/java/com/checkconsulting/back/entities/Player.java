package com.checkconsulting.back.entities;


import com.checkconsulting.back.validations.IsCorrecteName;
import com.checkconsulting.back.validations.IsMajeur;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@IsCorrecteName(message = "surcharger le message d'erreur")
public class Player {

    private Long id;
    private String nom;
    private String prenom;
    @IsMajeur
    private Integer age;
    private String club;
    private Poste poste;


}
