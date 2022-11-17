-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2022 at 08:44 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.2.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentsecure_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `computerscience`
--

CREATE TABLE `computerscience` (
  `id` int(11) NOT NULL,
  `fname` varchar(25) NOT NULL,
  `lname` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `grade` int(5) NOT NULL,
  `phone` int(15) NOT NULL,
  `highschool` varchar(50) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `computerscience`
--

INSERT INTO `computerscience` (`id`, `fname`, `lname`, `email`, `grade`, `phone`, `highschool`, `created_at`) VALUES
(1, 'Moyosore ', 'Weke', 'wekem0@gmail.com', 20, 781234583, 'ALU', '2022-04-23 22:37:25'),
(2, 'Michael ', 'Okolie', 'mike@gmail.com', 20, 783246729, 'BrightLight', '2022-04-24 01:10:03'),
(3, 'Vincent', 'Jesse', 'vin@gmail.com', 18, 781236729, 'CrossStar', '2022-04-24 01:10:32'),
(4, 'Jake', 'John', 'juke@gmail.com', 19, 981236739, 'Rodne', '2022-04-24 01:10:59'),
(5, 'Cynthia', 'Blue', 'CB@hotmail.com', 19, 98128773, 'Jesilo', '2022-04-24 01:11:47'),
(6, 'Modesta', 'Joseph', 'MJ@hotmail.com', 18, 98122273, 'ALA', '2022-04-24 01:12:12');

-- --------------------------------------------------------

--
-- Table structure for table `global`
--

CREATE TABLE `global` (
  `id` int(11) NOT NULL,
  `fname` varchar(25) NOT NULL,
  `lname` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `grade` int(5) NOT NULL,
  `phone` int(15) NOT NULL,
  `highschool` varchar(50) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `global`
--

INSERT INTO `global` (`id`, `fname`, `lname`, `email`, `grade`, `phone`, `highschool`, `created_at`) VALUES
(1, 'VICTORIA ', 'OLAOYE', 'wekem=@gmail.com', 16, 2132, 'Convenant University', '2022-04-23 22:37:52'),
(2, 'JAVAN', 'Stone', 'Javan@apple.com', 16, 9812113, 'BookStill', '2022-04-24 01:12:51'),
(3, 'Irene', 'Marra', 'Irene@apple.com', 17, 981211122, 'ALZ', '2022-04-24 01:13:24'),
(4, 'Juke', 'James', 'rnfaae@apple.com', 17, 391211122, 'HIJI', '2022-04-24 01:13:54'),
(5, 'Precious', 'Djoteng', 'ndgahee@apple.com', 17, 3222213, 'Hause', '2022-04-24 01:14:30');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(15) NOT NULL,
  `fname` varchar(25) NOT NULL,
  `lname` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `grade` int(5) NOT NULL,
  `phone` int(15) NOT NULL,
  `highschool` varchar(50) NOT NULL,
  `created_at` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `fname`, `lname`, `email`, `grade`, `phone`, `highschool`, `created_at`) VALUES
(1, 'Oriola ', 'Olanike ', 'ola@gmail.com', 13, 2132, 'ABUAD', '2022-04-23 22:38:30'),
(2, 'Mimi', 'Jeff', 'Mjeff@apple.com', 14, 123344212, 'Chrisland', '2022-04-24 01:14:59'),
(3, 'Alic', 'Omo', 'AliOmo@apple.com', 14, 176823442, 'Dowen', '2022-04-24 01:15:31'),
(4, 'Raoulita', 'Joanita', 'Raojo@apple.com', 14, 80234234, 'Jextoban', '2022-04-24 01:16:06');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `fullname` varchar(25) NOT NULL,
  `username` varchar(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `password` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `fullname`, `username`, `email`, `password`) VALUES
(1, 'Moyosore Weke', 'admin', 'wekemoyo@gmail.com', '1234'),
(101, 'Oriola Nike ', 'nikkyo', 'nike@gmail.com', '123'),
(103, 'Ore Fisher', 'orezy', 'ore123@gmail.com', '789'),
(104, 'Diane Uwiduye', 'dianee', 'diane@mail.com', 'd111'),
(105, 'Fareedah', 'far', 'shshhs', '234');

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_computerscience`
-- (See below for the actual view)
--
CREATE TABLE `v_computerscience` (
`id` int(11)
,`fname` varchar(25)
,`lname` varchar(25)
,`email` varchar(25)
,`grade` int(5)
,`phone` int(15)
,`highschool` varchar(50)
,`created_at` datetime
,`Roll_Number` varchar(7)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_global`
-- (See below for the actual view)
--
CREATE TABLE `v_global` (
`id` int(11)
,`fname` varchar(25)
,`lname` varchar(25)
,`email` varchar(25)
,`grade` int(5)
,`phone` int(15)
,`highschool` varchar(50)
,`created_at` datetime
,`Roll_Number` varchar(7)
);

-- --------------------------------------------------------

--
-- Stand-in structure for view `v_student`
-- (See below for the actual view)
--
CREATE TABLE `v_student` (
`id` int(15)
,`fname` varchar(25)
,`lname` varchar(25)
,`email` varchar(25)
,`grade` int(5)
,`phone` int(15)
,`highschool` varchar(50)
,`created_at` datetime
,`Roll_Number` varchar(7)
);

-- --------------------------------------------------------

--
-- Structure for view `v_computerscience`
--
DROP TABLE IF EXISTS `v_computerscience`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_computerscience`  AS SELECT `computerscience`.`id` AS `id`, `computerscience`.`fname` AS `fname`, `computerscience`.`lname` AS `lname`, `computerscience`.`email` AS `email`, `computerscience`.`grade` AS `grade`, `computerscience`.`phone` AS `phone`, `computerscience`.`highschool` AS `highschool`, `computerscience`.`created_at` AS `created_at`, concat_ws('/',right(year(`computerscience`.`created_at`),4),lpad(`computerscience`.`id`,2,0)) AS `Roll_Number` FROM `computerscience``computerscience`  ;

-- --------------------------------------------------------

--
-- Structure for view `v_global`
--
DROP TABLE IF EXISTS `v_global`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_global`  AS SELECT `global`.`id` AS `id`, `global`.`fname` AS `fname`, `global`.`lname` AS `lname`, `global`.`email` AS `email`, `global`.`grade` AS `grade`, `global`.`phone` AS `phone`, `global`.`highschool` AS `highschool`, `global`.`created_at` AS `created_at`, concat_ws('/',right(year(`global`.`created_at`),4),lpad(`global`.`id`,2,0)) AS `Roll_Number` FROM `global``global`  ;

-- --------------------------------------------------------

--
-- Structure for view `v_student`
--
DROP TABLE IF EXISTS `v_student`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `v_student`  AS SELECT `student`.`id` AS `id`, `student`.`fname` AS `fname`, `student`.`lname` AS `lname`, `student`.`email` AS `email`, `student`.`grade` AS `grade`, `student`.`phone` AS `phone`, `student`.`highschool` AS `highschool`, `student`.`created_at` AS `created_at`, concat_ws('/',right(year(`student`.`created_at`),4),lpad(`student`.`id`,2,0)) AS `Roll_Number` FROM `student``student`  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `computerscience`
--
ALTER TABLE `computerscience`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `global`
--
ALTER TABLE `global`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `computerscience`
--
ALTER TABLE `computerscience`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `global`
--
ALTER TABLE `global`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=106;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
