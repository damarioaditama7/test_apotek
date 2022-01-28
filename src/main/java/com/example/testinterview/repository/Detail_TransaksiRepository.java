package com.example.testinterview.repository;

import com.example.testinterview.entity.Detail_Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Detail_TransaksiRepository extends JpaRepository<Detail_Transaksi, String> {
}
