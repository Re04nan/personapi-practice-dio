package com.digitalinnovation.personapi.utils;

import com.digitalinnovation.personapi.dto.request.PersonDTO;
import com.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final Long PERSON_ID = 1L;
    private static final String FIRST_NAME = "Fernanda";
    private static final String LAST_NAME = "Ribeiro";
    private static final String CPF_NUMBER = "111.111.111-11";
    private static final LocalDate BIRTH_DATE = LocalDate.of(1990, 10, 31);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("31-10-1990")
                .phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .birthDate(BIRTH_DATE)
                .cpf(CPF_NUMBER)
                .phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
                .build();
    }
}
