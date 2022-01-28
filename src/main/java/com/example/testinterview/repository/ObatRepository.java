package com.example.testinterview.repository;

import com.example.testinterview.entity.Obat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObatRepository extends JpaRepository<Obat, String> {
}
