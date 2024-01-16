package ru.artmcoder.catsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.artmcoder.catsapi.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, String> {

}
