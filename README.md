
# Dans Multi Pro - Java Developer Test




## Installation


1.Buat database terlebih dahulu. Disini saya menggunakan database MySql phpMyAdmin dan diberi nama **dans**

```
 -- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 03, 2023 at 02:20 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dans`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(10) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
(1, 'felix', '$2a$10$twz/J62EZk8BNjh0zDKh..5Z4vgDc9G5wX5TNEVSY4UHADvHOpMB2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

```


## API Reference

## Login

```http
  POST /authenticate
```

#### Body
```
{
    "username" : "felix",
    "password" : "password"
}
```

#### Response
```
{"token":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJmZWxpeCIsImV4cCI6MTY4MzEyMTYzOSwiaWF0IjoxNjgzMTAzNjM5fQ.2usHEdBEdJir6vcfeb5aV2cBlPyNN1MJOaaEYG8BTnM4l6p0s4FLC4F4PceRfNl_-SY-0nXdrX_zfPms4y7B4w"}
```

## Get Job List 
```http
  GET /api/job-list
```
#### Headers
| Key       | Value                       |
| :-------- | :---------------------------|
| `Authorization`      | `Bearer {token}` |



## Get Job List Details
```http
  GET /api/job-list/{id}
```
#### Headers
| Key       | Value                       |
| :-------- | :---------------------------|
| `Authorization`      | `Bearer {token}` |

#### Parameter

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |



