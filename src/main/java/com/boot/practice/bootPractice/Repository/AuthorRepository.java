package com.boot.practice.bootPractice.Repository;

import com.boot.practice.bootPractice.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
