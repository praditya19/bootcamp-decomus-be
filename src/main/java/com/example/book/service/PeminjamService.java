package com.example.book.service;

import com.example.book.entity.Peminjam;

import java.util.List;

public interface PeminjamService {
    List<Peminjam> getAllPeminjams();
    Peminjam getPeminjamById(Long id);
    Peminjam addPeminjam(Peminjam peminjam) throws Exception;
    Peminjam updatePeminjam(Long id, Peminjam peminjam);
    void deletePeminjam(Long id);
}
