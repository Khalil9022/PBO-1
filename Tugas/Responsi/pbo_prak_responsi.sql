-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 20 Bulan Mei 2020 pada 06.40
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_prak_responsi`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pinjam_buku`
--

CREATE TABLE `pinjam_buku` (
  `id` int(11) NOT NULL,
  `id_anggota` varchar(20) NOT NULL,
  `nama_anggota` varchar(30) NOT NULL,
  `id_buku` varchar(20) NOT NULL,
  `judul_buku` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `pinjam_buku`
--

INSERT INTO `pinjam_buku` (`id`, `id_anggota`, `nama_anggota`, `id_buku`, `judul_buku`) VALUES
(2, '123180119', 'khalil', '123456', 'Melengkung'),
(4, '123180200', 'Lamina', '555', 'Butterfly'),
(5, '123180099', 'Lengkuas Makan', '521111', 'Metamorposis');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `pinjam_buku`
--
ALTER TABLE `pinjam_buku`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pinjam_buku`
--
ALTER TABLE `pinjam_buku`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
