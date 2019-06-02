package com.checkconsulting.back.controller;


import com.checkconsulting.back.entities.Player;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.checkconsulting.back.entities.Poste.MILIEU;


@RestController
@RequestMapping("player")
@Slf4j
public class PlayerController {


    @Autowired
    Validator validator;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("get")
    public Player getPlayer() {


        log.info("un appel a été effectué");
        return Player.builder()
                .id(1L)
                .nom("iniesta")
                .prenom("andreas")
                .poste(MILIEU)
                .age(35)
                .club("Fc Barcelone")
                .build();
    }


    @PostMapping("add")
    public String addPlayer(@RequestBody @Valid Player player) {

        return "ajout effectué avec succès";
    }


    @PostMapping("add_manual_validation")
    public List<String> addPlayerWithManualValidation(@RequestBody Player player) {

        Set<ConstraintViolation<Player>> errors = validator.validate(player);

        return errors.stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
    }

}
