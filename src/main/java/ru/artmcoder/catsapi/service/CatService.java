package ru.artmcoder.catsapi.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.artmcoder.catsapi.dto.CatDto;
import ru.artmcoder.catsapi.entity.Cat;
import ru.artmcoder.catsapi.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        Cat cat = new Cat()
            .setName(catDto.getName())
            .setBirthDay(catDto.getBirthDay())
            .setId(UUID.randomUUID().toString())
            .setCreatedAt(LocalDateTime.now());

        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {
        return catRepository.findAll();
    }

}
