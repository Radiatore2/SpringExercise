package com.example.Ex2Repository.repository;

import com.example.Ex2Repository.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = {"http://localhost:5050"})
@RepositoryRestResource(path = "repo-prog-languages")
public interface RepoProgLanguages extends JpaRepository<ProgrammingLanguage, Long> {
}
