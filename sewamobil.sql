-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2021 at 12:18 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sewamobil`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id_admin` varchar(11) NOT NULL,
  `nama_admin` varchar(30) NOT NULL,
  `telepon` int(20) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id_admin`, `nama_admin`, `telepon`, `password`) VALUES
('re', 'rere', 343434, 'r');

-- --------------------------------------------------------

--
-- Table structure for table `mobil`
--

CREATE TABLE `mobil` (
  `data_mobil` varchar(50) NOT NULL,
  `merk` varchar(50) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `warna` varchar(50) NOT NULL,
  `harga` int(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pelanggan`
--

CREATE TABLE `pelanggan` (
  `id_pelanggan` varchar(10) NOT NULL,
  `nama_pelanggan` varchar(30) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `umur` int(10) NOT NULL,
  `telepon` int(20) NOT NULL,
  `jenis_kelamin` varchar(10) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama_pelanggan`, `alamat`, `umur`, `telepon`, `jenis_kelamin`, `password`) VALUES
('2323', 'ra', 'rrf', 34, 566756, 'Perempuan', 'r'),
('adasdas', 'asdasd', 'asdasd', 45454, 23453232, 'Laki-Laki', 'rg'),
('asdasdas', 'asdsad', 'asdasd', 34, 343242, 'Perempuan', 'ra');

-- --------------------------------------------------------

--
-- Table structure for table `pemimpin`
--

CREATE TABLE `pemimpin` (
  `id_pemimpin` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemimpin`
--

INSERT INTO `pemimpin` (`id_pemimpin`, `password`) VALUES
('rai', 'gi');

-- --------------------------------------------------------

--
-- Table structure for table `penyewaan`
--

CREATE TABLE `penyewaan` (
  `sewa_id` varchar(11) NOT NULL,
  `pelanggan_id` varchar(50) NOT NULL,
  `mobil_data` varchar(50) NOT NULL,
  `biaya` int(50) NOT NULL,
  `pelunasan` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penyewaan`
--

INSERT INTO `penyewaan` (`sewa_id`, `pelanggan_id`, `mobil_data`, `biaya`, `pelunasan`) VALUES
('erfdfd', '2323', 'adadsad', 23232323, 232323),
('sdfsdfds', '2323', 'adadsad', 23232323, 23232334);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `mobil`
--
ALTER TABLE `mobil`
  ADD PRIMARY KEY (`data_mobil`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pemimpin`
--
ALTER TABLE `pemimpin`
  ADD PRIMARY KEY (`id_pemimpin`);

--
-- Indexes for table `penyewaan`
--
ALTER TABLE `penyewaan`
  ADD PRIMARY KEY (`sewa_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
