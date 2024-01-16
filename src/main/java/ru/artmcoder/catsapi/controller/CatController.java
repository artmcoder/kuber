package ru.artmcoder.catsapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.artmcoder.catsapi.dto.CatDto;
import ru.artmcoder.catsapi.entity.Cat;
import ru.artmcoder.catsapi.service.CatService;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService service;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return service.save(cat);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return service.getAll();
    }

}
