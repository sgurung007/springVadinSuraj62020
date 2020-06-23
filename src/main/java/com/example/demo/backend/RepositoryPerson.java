package com.example.demo.backend;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepositoryPerson extends JpaRepository<Person,Long> {
    List<Person> findByLastNameStartsWithIgnoreCase(String lastName);
}
