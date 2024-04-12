package com.spring.tuto.repository;

import com.spring.tuto.entity.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepostory extends JpaRepository<Tache , Integer> {
}
