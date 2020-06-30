-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 30, 2020 at 06:30 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bengkel`
--

-- --------------------------------------------------------

--
-- Table structure for table `jenislayananservice`
--

CREATE TABLE `jenislayananservice` (
  `kodeService` varchar(20) NOT NULL,
  `kodeJenisMobilFK` varchar(20) NOT NULL,
  `jenisService` varchar(20) NOT NULL,
  `Biaya` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jenislayananservice`
--

INSERT INTO `jenislayananservice` (`kodeService`, `kodeJenisMobilFK`, `jenisService`, `Biaya`) VALUES
('FS-HBA', 'HBA', 'Full Servis', 800000),
('FS-HBM', 'HBM', 'Full Servis', 750000),
('FS-LCA', 'LCA', 'Full Servis', 590000),
('FS-LCM', 'LCM', 'Full Servis', 550000),
('FS-MPA', 'MPA', 'Full Servis ', 850000),
('FS-MPM', 'MPM', 'Full Servis ', 800000),
('FS-SEA', 'SEA', 'Full Servis', 750000),
('FS-SEM', 'SEM', 'Full Servis', 650000),
('FS-SUA', 'SUA', 'Full Servis ', 1100000),
('FS-SUM', 'SUM', 'Full Servis ', 1000000),
('LS-HBA', 'HBA', 'Servis Ringan', 550000),
('LS-HBM', 'HBM', 'Servis Ringan', 500000),
('LS-LCA', 'LCA', 'Servis Ringan', 420000),
('LS-LCM', 'LCM', 'Servis Ringan', 380000),
('LS-MPA', 'MPA', 'Servis Ringan', 600000),
('LS-MPM', 'MPM', 'Servis Ringan', 550000),
('LS-SEA', 'SEA', 'Servis Ringan', 500000),
('LS-SEM', 'SEM', 'Servis Ringan', 400000),
('LS-SUA', 'SUA', 'Servis Ringan', 800000),
('LS-SUM', 'SUM', 'Servis Ringan', 700000),
('MS-HBA', 'HBA', 'Medium Servis', 650000),
('MS-HBM', 'HBM', 'Servis Medium', 600000),
('MS-LCA', 'LCA', 'Servis Medium', 480000),
('MS-LCM', 'LCM', 'Servis Medium', 430000),
('MS-MPA', 'MPA', 'Servis Medium', 700000),
('MS-MPM', 'MPM', 'Servis Medium', 650000),
('MS-SEA', 'SEA', 'Servis Medium', 600000),
('MS-SEM', 'SEM', 'Servis Medium', 500000),
('MS-SUA', 'SUA', 'Servis Medium', 900000),
('MS-SUM', 'SUM', 'Servis Medium', 800000);

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `kodeJenisMobil` varchar(20) NOT NULL,
  `jenisMobil` varchar(20) NOT NULL,
  `tipe` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mobil`
--

INSERT INTO `mobil` (`kodeJenisMobil`, `jenisMobil`, `tipe`) VALUES
('HBA', 'Hatch Back', 'Matic'),
('HBM', 'Hatch Back', 'Manual'),
('LCA', 'LCGC', 'Matic'),
('LCM', 'LCGC', 'Manual'),
('MPA', 'MPV', 'Matic'),
('MPM', 'MPV', 'Manual'),
('SEA', 'Sedan', 'Triptonic'),
('SEM', 'Sedan', 'Manual'),
('SUA', 'SUV', 'Matic'),
('SUM', 'SUV', 'Manual');

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `idPelanggan` int(20) NOT NULL,
  `namaPelanggan` varchar(45) NOT NULL,
  `alamatPelanggan` varchar(50) DEFAULT NULL,
  `noTelp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`idPelanggan`, `namaPelanggan`, `alamatPelanggan`, `noTelp`) VALUES
(1, 'Al Yusufa', 'Wonogiri', '08123456789'),
(2, 'Ika Kusuma', 'Sukoharjo', '085643221567'),
(3, 'Ridho Nuh', 'Karanganyar', '081229666554'),
(4, 'Doni Kusmianto', 'Surakarta', '089776454321'),
(5, 'Devi Novita', 'Wonogiri', '087454298743');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `noTransaksi` int(20) NOT NULL,
  `kodeServiceFK` varchar(20) NOT NULL,
  `idPelangganFK` int(20) NOT NULL,
  `tanggalTransaksi` datetime(6) NOT NULL,
  `totalBiaya` int(20) NOT NULL,
  `jenisPembayaran` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`noTransaksi`, `kodeServiceFK`, `idPelangganFK`, `tanggalTransaksi`, `totalBiaya`, `jenisPembayaran`) VALUES
(1, 'FS-HBA', 1, '2020-06-29 09:18:44.000000', 800000, 'Tunai'),
(2, 'FS-HBM', 4, '2020-06-30 00:00:00.000000', 750000, 'Non Tunai');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jenislayananservice`
--
ALTER TABLE `jenislayananservice`
  ADD PRIMARY KEY (`kodeService`),
  ADD KEY `kodeJenisMobil` (`kodeJenisMobilFK`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`kodeJenisMobil`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`idPelanggan`);

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`noTransaksi`),
  ADD KEY `kodeServiceFK` (`kodeServiceFK`),
  ADD KEY `idPelangganFK` (`idPelangganFK`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jenislayananservice`
--
ALTER TABLE `jenislayananservice`
  ADD CONSTRAINT `jenislayananservice_ibfk_1` FOREIGN KEY (`kodeJenisMobilFK`) REFERENCES `mobil` (`kodeJenisMobil`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`idPelangganFK`) REFERENCES `pelanggan` (`idPelanggan`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `transaksi_ibfk_2` FOREIGN KEY (`kodeServiceFK`) REFERENCES `jenislayananservice` (`kodeService`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
