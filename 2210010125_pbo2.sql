-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 17, 2025 at 01:10 PM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010125_pbo2`
--

-- --------------------------------------------------------

--
-- Table structure for table `divisi`
--

CREATE TABLE `divisi` (
  `id` int NOT NULL,
  `kode` int NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kepala_divisi` varchar(50) NOT NULL,
  `kontak` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `divisi`
--

INSERT INTO `divisi` (`id`, `kode`, `nama`, `kepala_divisi`, `kontak`) VALUES
(1, 100, 'Udin', 'Sekretaris', '08995425321'),
(2, 101, 'Wanda', 'Manajemen', '08965547123'),
(3, 103, 'Abdan', 'Manajemen', '0895703182793'),
(4, 104, 'Elza', 'Sekretaris', '0888779944');

-- --------------------------------------------------------

--
-- Table structure for table `inventaris`
--

CREATE TABLE `inventaris` (
  `id` int NOT NULL,
  `kode` int NOT NULL,
  `jenis` varchar(25) NOT NULL,
  `merk` varchar(25) NOT NULL,
  `id_kategori` int NOT NULL,
  `unit_bebas` varchar(25) NOT NULL,
  `unit_total` varchar(25) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `inventaris`
--

INSERT INTO `inventaris` (`id`, `kode`, `jenis`, `merk`, `id_kategori`, `unit_bebas`, `unit_total`, `keterangan`) VALUES
(2, 100, 'Sapu', 'Honda', 1, '1', '10', 'Sapu'),
(3, 100, 'Pel', 'Honda', 1, '1', '10', 'Pel');

-- --------------------------------------------------------

--
-- Table structure for table `inventaris_masuk`
--

CREATE TABLE `inventaris_masuk` (
  `id` int NOT NULL,
  `id_inventaris` int NOT NULL,
  `id_pemasok` int NOT NULL,
  `id_user` int NOT NULL,
  `unit` varchar(25) NOT NULL,
  `tgl_masuk` date NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal_pemeliharaan`
--

CREATE TABLE `jadwal_pemeliharaan` (
  `id` int NOT NULL,
  `id_petugas` int NOT NULL,
  `status` varchar(255) NOT NULL,
  `tgl` date NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kategori`
--

CREATE TABLE `kategori` (
  `id` int NOT NULL,
  `kode` int NOT NULL,
  `jenis` varchar(25) NOT NULL,
  `unit` varchar(25) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kategori`
--

INSERT INTO `kategori` (`id`, `kode`, `jenis`, `unit`, `keterangan`) VALUES
(1, 111, 'Berat', 'KG', 'Kilogram'),
(2, 112, 'Berat', 'G', 'Gram');

-- --------------------------------------------------------

--
-- Table structure for table `kondisi`
--

CREATE TABLE `kondisi` (
  `id` int NOT NULL,
  `nama` varchar(50) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `kondisi`
--

INSERT INTO `kondisi` (`id`, `nama`, `keterangan`) VALUES
(1, 'Bagus', 'Masih Bagus'),
(2, 'Kurang Bagus', 'Mulai Rusak'),
(3, 'Ruask', 'Rusak Total');

-- --------------------------------------------------------

--
-- Table structure for table `kondisi_inventaris`
--

CREATE TABLE `kondisi_inventaris` (
  `id` int NOT NULL,
  `tgl_cek` date NOT NULL,
  `id_divisi` int NOT NULL,
  `id_inventaris` int NOT NULL,
  `id_kondisi` int NOT NULL,
  `jumlah` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pemasok`
--

CREATE TABLE `pemasok` (
  `id` int NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kontak` varchar(16) NOT NULL,
  `alamat` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pemasok`
--

INSERT INTO `pemasok` (`id`, `nama`, `kontak`, `alamat`) VALUES
(1, 'Wanda', '089756573', 'Jl. A Yani KM.9'),
(3, 'Elza', '0845345542', 'Jl. Zam Zam');

-- --------------------------------------------------------

--
-- Table structure for table `pembelian`
--

CREATE TABLE `pembelian` (
  `id` int NOT NULL,
  `tgl` varchar(50) NOT NULL,
  `id_divisi` int NOT NULL,
  `nama_inventaris` varchar(50) NOT NULL,
  `unit` varchar(25) NOT NULL,
  `total_pembelian` varchar(50) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `pembelian`
--

INSERT INTO `pembelian` (`id`, `tgl`, `id_divisi`, `nama_inventaris`, `unit`, `total_pembelian`, `keterangan`) VALUES
(1, '2024-10-10', 1, 'Sektor A', '1', '10', 'Pembelian Berkala'),
(2, '2024-10-10', 1, 'Sektor B', '1', '10', 'Pembelian Berkala');

-- --------------------------------------------------------

--
-- Table structure for table `pemeliharaan`
--

CREATE TABLE `pemeliharaan` (
  `id` int NOT NULL,
  `id_jadwal` int NOT NULL,
  `tgl_pemeliharaan` varchar(50) NOT NULL,
  `id_divisi` int NOT NULL,
  `id_inventaris` int NOT NULL,
  `unit` varchar(25) NOT NULL,
  `service` varchar(255) NOT NULL,
  `keterangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `permohonan`
--

CREATE TABLE `permohonan` (
  `id` int NOT NULL,
  `id_inventaris` int NOT NULL,
  `id_divisi` int NOT NULL,
  `nama_pemohon` varchar(50) NOT NULL,
  `unit` varchar(25) NOT NULL,
  `keterangan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `permohonan`
--

INSERT INTO `permohonan` (`id`, `id_inventaris`, `id_divisi`, `nama_pemohon`, `unit`, `keterangan`) VALUES
(1, 2, 1, 'Pengajuan Pembelian', '10', 'Pembelian Pel'),
(2, 2, 1, 'Pengajuan Pembelian', '10', 'Pembelian Chainsaw');

-- --------------------------------------------------------

--
-- Table structure for table `rusak`
--

CREATE TABLE `rusak` (
  `id` int NOT NULL,
  `id_divisi` int NOT NULL,
  `id_inventaris` int NOT NULL,
  `unit` varchar(25) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `tgl_rusak` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `rusak`
--

INSERT INTO `rusak` (`id`, `id_divisi`, `id_inventaris`, `unit`, `keterangan`, `tgl_rusak`) VALUES
(1, 1, 2, '1', 'TIdak Sengaja', '2024-11-11'),
(2, 2, 3, '10', 'Rusak Total', '2024-11-11');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `kontak` varchar(16) NOT NULL,
  `foto` varchar(255) NOT NULL,
  `hak_akses` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `divisi`
--
ALTER TABLE `divisi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `inventaris`
--
ALTER TABLE `inventaris`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id` (`id_kategori`);

--
-- Indexes for table `inventaris_masuk`
--
ALTER TABLE `inventaris_masuk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_inventaris_m` (`id_inventaris`),
  ADD KEY `id_user_m` (`id_user`),
  ADD KEY `id_pemasok_m` (`id_pemasok`);

--
-- Indexes for table `jadwal_pemeliharaan`
--
ALTER TABLE `jadwal_pemeliharaan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kategori`
--
ALTER TABLE `kategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kondisi`
--
ALTER TABLE `kondisi`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `kondisi_inventaris`
--
ALTER TABLE `kondisi_inventaris`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_kondisi` (`id_kondisi`),
  ADD KEY `id_divisi_i` (`id_divisi`),
  ADD KEY `id_inventaris_i` (`id_inventaris`);

--
-- Indexes for table `pemasok`
--
ALTER TABLE `pemasok`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_divisi_p` (`id_divisi`);

--
-- Indexes for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_jadwal_p` (`id_jadwal`),
  ADD KEY `id_divisi_pe` (`id_divisi`),
  ADD KEY `id_inventaris_pe` (`id_inventaris`);

--
-- Indexes for table `permohonan`
--
ALTER TABLE `permohonan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_inventaris` (`id_inventaris`),
  ADD KEY `id_divisi` (`id_divisi`);

--
-- Indexes for table `rusak`
--
ALTER TABLE `rusak`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_divisi_r` (`id_divisi`),
  ADD KEY `id_inventaris_r` (`id_inventaris`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `divisi`
--
ALTER TABLE `divisi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `inventaris`
--
ALTER TABLE `inventaris`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `inventaris_masuk`
--
ALTER TABLE `inventaris_masuk`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `jadwal_pemeliharaan`
--
ALTER TABLE `jadwal_pemeliharaan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `kategori`
--
ALTER TABLE `kategori`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `kondisi`
--
ALTER TABLE `kondisi`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `kondisi_inventaris`
--
ALTER TABLE `kondisi_inventaris`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pemasok`
--
ALTER TABLE `pemasok`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pembelian`
--
ALTER TABLE `pembelian`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `permohonan`
--
ALTER TABLE `permohonan`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `rusak`
--
ALTER TABLE `rusak`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `inventaris`
--
ALTER TABLE `inventaris`
  ADD CONSTRAINT `id` FOREIGN KEY (`id_kategori`) REFERENCES `kategori` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `inventaris_masuk`
--
ALTER TABLE `inventaris_masuk`
  ADD CONSTRAINT `id_inventaris_m` FOREIGN KEY (`id_inventaris`) REFERENCES `inventaris` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_pemasok_m` FOREIGN KEY (`id_pemasok`) REFERENCES `pemasok` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_user_m` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `kondisi_inventaris`
--
ALTER TABLE `kondisi_inventaris`
  ADD CONSTRAINT `id_divisi_i` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_inventaris_i` FOREIGN KEY (`id_inventaris`) REFERENCES `inventaris` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `kondisi_inventaris_ibfk_1` FOREIGN KEY (`id_kondisi`) REFERENCES `kondisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pembelian`
--
ALTER TABLE `pembelian`
  ADD CONSTRAINT `id_divisi_p` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  ADD CONSTRAINT `id_divisi_pe` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_inventaris_pe` FOREIGN KEY (`id_inventaris`) REFERENCES `inventaris` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_jadwal_p` FOREIGN KEY (`id_jadwal`) REFERENCES `jadwal_pemeliharaan` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `permohonan`
--
ALTER TABLE `permohonan`
  ADD CONSTRAINT `id_divisi` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_inventaris` FOREIGN KEY (`id_inventaris`) REFERENCES `inventaris` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `rusak`
--
ALTER TABLE `rusak`
  ADD CONSTRAINT `id_divisi_r` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_inventaris_r` FOREIGN KEY (`id_inventaris`) REFERENCES `inventaris` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
