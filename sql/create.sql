-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th6 06, 2023 lúc 10:39 AM
-- Phiên bản máy phục vụ: 8.0.17
-- Phiên bản PHP: 7.3.10

CREATE DATABASE IF NOT EXISTS Note;
USE Note;

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `note`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `notes`
--

CREATE TABLE `notes` (
  `id` int(11) NOT NULL,
  `content` longtext,
  `time` datetime NOT NULL,
  `title` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Đang đổ dữ liệu cho bảng `notes`
--

INSERT INTO `notes` (`id`, `content`, `time`, `title`) VALUES
(1, 'Quạt: 50k\nĐiều hòa: 100k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-02 17:10:01', 'Tiền điện tháng 1'),
(2, 'Quạt: 60k\nĐiều hòa: 130k', '2023-06-02 17:10:01', 'Tiền điện tháng 2'),
(3, 'Quạt: 52k\nĐiều hòa: 200k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-02 17:10:01', 'Tiền điện tháng 3'),
(4, 'Quạt: 45k\nĐiều hòa: 500k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-02 17:10:01', 'Tiền điện tháng 4'),
(5, 'Quạt: 56k\nĐiều hòa: 560k', '2023-06-02 17:10:01', 'Tiền điện tháng 5'),
(6, 'Quạt: 50k\nĐiều hòa: 100k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-06 17:25:43', 'Tiền điện tháng 1'),
(7, 'Quạt: 60k\nĐiều hòa: 130k', '2023-06-06 17:25:43', 'Tiền điện tháng 2'),
(8, 'Quạt: 52k\nĐiều hòa: 200k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-06 17:25:43', 'Tiền điện tháng 3'),
(11, 'Quạt: 50k\nĐiều hòa: 100k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-06 17:29:37', 'Tiền điện tháng 1'),
(12, 'Quạt: 60k\nĐiều hòa: 130k', '2023-06-06 17:29:37', 'Tiền điện tháng 2'),
(13, 'Quạt: 52k\nĐiều hòa: 200k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-06 17:29:37', 'Tiền điện tháng 3'),
(14, 'Quạt: 45k\nĐiều hòa: 500k\nQuạt: 50k\nĐiều hòa: 100k', '2023-06-06 17:29:37', 'Tiền điện tháng 4');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `notes`
--
ALTER TABLE `notes`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `notes`
--
ALTER TABLE `notes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
