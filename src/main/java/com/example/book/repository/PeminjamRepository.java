package com.example.book.repository;

import com.example.book.entity.Peminjam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeminjamRepository extends JpaRepository<Peminjam, Long> {
}
