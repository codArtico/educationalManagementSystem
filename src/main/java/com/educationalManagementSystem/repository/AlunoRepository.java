package com.educationalManagementSystem.repository;

import com.educationalManagementSystem.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}