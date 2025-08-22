package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

@Service
@RequiredArgsConstructor
@Validated
public class PersonService {
    private final PersonRepository personRepository;

    @Transactional
    public long count() {
        return personRepository.count();
    }
}
