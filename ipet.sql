-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2020 at 11:52 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ipet`
--
CREATE DATABASE IF NOT EXISTS `ipet` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ipet`;

-- --------------------------------------------------------

--
-- Table structure for table `appoint`
--

CREATE TABLE `appoint` (
  `AID` int(11) NOT NULL,
  `petID` int(11) NOT NULL,
  `NIC` varchar(12) NOT NULL,
  `reqDate` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appoint`
--

INSERT INTO `appoint` (`AID`, `petID`, `NIC`, `reqDate`) VALUES
(1, 1, '973071017v', '19-05-2020'),
(2, 6, '973071017v', '19-05-2020'),
(7, 3, '973071018v', '20-05-2020');

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `EID` int(11) NOT NULL,
  `Title` varchar(255) NOT NULL,
  `Date` date NOT NULL,
  `Time` varchar(50) NOT NULL,
  `Place` text NOT NULL,
  `Type` varchar(100) NOT NULL,
  `Descr` text NOT NULL,
  `Thumbnail` text,
  `Lat` varchar(255) DEFAULT NULL,
  `Lon` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`EID`, `Title`, `Date`, `Time`, `Place`, `Type`, `Descr`, `Thumbnail`, `Lat`, `Lon`) VALUES
(1, 'Colombo Dog Show 2020', '2020-06-01', '13:00', 'NSBM Sky-Grounds', 'Competition', 'Sri Lanka\'s Biggest Dog Show Organized by Ceylon Kennel club', 'event~1589646754.jpeg', '6.8211', '80.0409'),
(2, 'Dog Vaccination ', '2021-01-02', '14:02', 'Galle Face', 'Clinic', 'Dog Vaccination Clinic Organized Sri Lanka Veterinary Association', 'event~1589705749.jpg', '6.9017', '79.8734'),
(10, 'Dog Fitness campaign', '2020-06-01', '09:00', 'BMICH', 'Motivation', 'Animals also need fitness', 'event ~1589966865.png', '6.901690331312179', '79.87337350845337');

-- --------------------------------------------------------

--
-- Table structure for table `lost`
--

CREATE TABLE `lost` (
  `LID` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Type` varchar(20) NOT NULL,
  `Age` varchar(20) NOT NULL,
  `Colour` varchar(20) NOT NULL,
  `LSLoc` varchar(255) NOT NULL,
  `ONIC` varchar(12) NOT NULL,
  `Lat` varchar(255) DEFAULT NULL,
  `Lon` varchar(255) DEFAULT NULL,
  `Dis` text,
  `isFound` tinyint(1) NOT NULL,
  `Thumbnail` varchar(255) DEFAULT NULL,
  `FNIC` varchar(12) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lost`
--

INSERT INTO `lost` (`LID`, `Name`, `Type`, `Age`, `Colour`, `LSLoc`, `ONIC`, `Lat`, `Lon`, `Dis`, `isFound`, `Thumbnail`, `FNIC`) VALUES
(1, 'Jemmy', 'Dog', '5 Years', 'White', 'Moratuwa', '973071018v', '6.786496291854718', '79.89825191451673', 'Playful and active short legged pet', 0, 'lost~1589964920.png', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `CName` varchar(50) NOT NULL,
  `Address` text NOT NULL,
  `City` varchar(50) NOT NULL,
  `District` varchar(50) NOT NULL,
  `PName` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Age` varchar(10) NOT NULL,
  `Colour` varchar(30) NOT NULL,
  `Decs` text NOT NULL,
  `Thumb` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `shelter`
--

CREATE TABLE `shelter` (
  `petID` int(11) NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Type` varchar(20) NOT NULL,
  `Gender` varchar(20) NOT NULL,
  `Age` varchar(20) DEFAULT NULL,
  `Colour` varchar(20) NOT NULL,
  `isHere` tinyint(1) NOT NULL,
  `Description` text,
  `Thumb` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shelter`
--

INSERT INTO `shelter` (`petID`, `Name`, `Type`, `Gender`, `Age`, `Colour`, `isHere`, `Description`, `Thumb`) VALUES
(1, 'Garfield ', 'Cat', 'Male', '6 Years', 'Orange', 0, 'He loves sleeping in the day, and loves a chat and lots of playing with his feather toy. He would be happiest as the only cat in the household as we rehoused his from his previous owner because he was nervous of a cat He was living with.\r\n', 'garfield.jpg'),
(2, 'Odie', 'Dog', 'Male', '2 Years', 'Yellow', 1, 'Hello akjgrkuaybhguygjkb  kjewhgfb kh  wyeghbfkjwhegf kjwehgbf  kiwehf k wieh f', 'odie.jpg'),
(3, 'Blue', 'Parrot', 'Male', '3 Years', 'Green', 0, 'one of the most playful, intelligent and beautiful parakeet . They are extremely inquisitive and constantly on the move. Always up to something, their comical antics will always... ', 'blue.jpg'),
(4, 'Nermo', 'Cat', 'Female', '2 Years', 'Grey', 1, 'She will be fully independent and litter trained. Both parents have pedigree papers and can be seen. Kitten has a veery loving character, loves to be around people. ', 'nermo.jpg'),
(5, 'Timmie', 'Dog', 'Male', '6 Years', 'White', 1, 'A greedy cat. Always wanted to eat and sleep', 'timmie.jpg'),
(6, 'Tyler', 'Dog', 'Male', '3 Years', 'Grey', 1, 'These pups will grow to be physical specimens as functional bully’s with great personalities. A perfect fit as a family companion and guardian and great all round performance dog. ', 'shelter~1589964100.png'),
(14, 'Jemmy', 'Dog', 'Female', '7 Years', 'White', 1, 'Playful and active short legged pet', 'shelter~1589967399.png');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `NIC` varchar(12) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Gender` varchar(6) NOT NULL,
  `DOB` date NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` text NOT NULL,
  `City` varchar(20) NOT NULL,
  `District` varchar(20) NOT NULL,
  `Password` text NOT NULL,
  `profile` varchar(255) DEFAULT NULL,
  `cover` varchar(255) DEFAULT NULL,
  `type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`NIC`, `Name`, `Gender`, `DOB`, `Email`, `Address`, `City`, `District`, `Password`, `profile`, `cover`, `type`) VALUES
('973071017v', 'Tharusha Kudagala', 'Male', '1997-11-02', 'tharushakudagala1997@gmail.com', '112 Mullegama', 'Meegoda', 'Colombo', 'G+TMFBFbJX9AIhRlEbXKeg==', '1589867768.png', 'default.jpg', 'admin'),
('973071018v', 'Suchith Fernando', 'Male', '1997-11-02', 'msdfdo@icloud.com', '112 Moratuwa', 'Moratuwa', 'Colombo', 'G+TMFBFbJX9AIhRlEbXKeg==', '1589867768.png', 'default.jpg', 'user'),
('982591031V', 'Suchith Fernando', 'Male', '1998-09-15', 'Suchithdevfdo@gmail.com', '37/6 Moratumulla South, Moratuwa', 'Moratuwa', 'Colombo', 'yW+yxcIHLpH8KgHrG8AC/g==', 'female.jpg', 'default.jpg', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `appoint`
--
ALTER TABLE `appoint`
  ADD PRIMARY KEY (`AID`),
  ADD KEY `appTOshe` (`petID`);

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`EID`);

--
-- Indexes for table `lost`
--
ALTER TABLE `lost`
  ADD PRIMARY KEY (`LID`);

--
-- Indexes for table `report`
--
ALTER TABLE `report`
  ADD PRIMARY KEY (`CName`);

--
-- Indexes for table `shelter`
--
ALTER TABLE `shelter`
  ADD PRIMARY KEY (`petID`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`NIC`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `appoint`
--
ALTER TABLE `appoint`
  MODIFY `AID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `events`
--
ALTER TABLE `events`
  MODIFY `EID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `lost`
--
ALTER TABLE `lost`
  MODIFY `LID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `shelter`
--
ALTER TABLE `shelter`
  MODIFY `petID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `appoint`
--
ALTER TABLE `appoint`
  ADD CONSTRAINT `appTOshe` FOREIGN KEY (`petID`) REFERENCES `shelter` (`petID`) ON DELETE CASCADE;


--
-- Metadata
--
USE `phpmyadmin`;

--
-- Metadata for table appoint
--

--
-- Metadata for table events
--

--
-- Metadata for table lost
--

--
-- Metadata for table report
--

--
-- Metadata for table shelter
--

--
-- Metadata for table users
--

--
-- Metadata for database ipet
--
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
