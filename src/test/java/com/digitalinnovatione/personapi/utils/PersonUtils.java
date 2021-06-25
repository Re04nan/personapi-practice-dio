package com.digitalinnovatione.personapi.utils;

import com.digitalinnovatione.personapi.dto.request.PersonDTO;
import com.digitalinnovatione.personapi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final Long PERSON_ID = 1L;
    private static final String FIRST_NAME = "Renan";
    private static final String LAST_NAME = "Marques";
    private static final String CPF_NUMBER = "010.110.111-10";
    private static final LocalDate BIRTH_DATE = LocalDate.of(1996, 5, 04);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("04-05-1996")
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
