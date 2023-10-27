-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-10-2023 a las 01:18:14
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar23`
--
CREATE DATABASE IF NOT EXISTS `vacunar23` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `vacunar23`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--
-- Creación: 27-10-2023 a las 22:23:29
--

CREATE TABLE `citavacunacion` (
  `codCita` int(11) NOT NULL,
  `persona` int(11) NOT NULL,
  `fechaHoraCita` varchar(9) NOT NULL,
  `centroVacunacion` varchar(80) NOT NULL,
  `fechaHoraColoca` date NOT NULL,
  `dosis` int(11) NOT NULL,
  `cancelada` tinyint(1) NOT NULL,
  `nroSerie` bigint(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--
-- Creación: 20-10-2023 a las 22:08:06
--

CREATE TABLE `ciudadano` (
  `dni` int(11) NOT NULL,
  `nombreCompleto` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `celular` bigint(18) DEFAULT NULL,
  `nota` varchar(30) DEFAULT NULL,
  `esencial` tinyint(4) DEFAULT NULL,
  `sintomas` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`dni`, `nombreCompleto`, `email`, `celular`, `nota`, `esencial`, `sintomas`) VALUES
(3213467, 'Toledo, Pablo', 'ptoledo@gmail.com', 2147483647, NULL, NULL, NULL),
(11008267, 'Fazzito, Rodrigo', 'rodrigofazzito@gmail.com', 114875268, NULL, NULL, NULL),
(32134358, 'Choque, Sabrina', 'choques@gmail.com', 114472795, NULL, NULL, NULL),
(38134358, 'Palacio, Agustin', 'peraagustin@gmail.com', 351571951, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--
-- Creación: 27-10-2023 a las 22:21:36
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cuit` bigint(12) NOT NULL,
  `nomLaboratorio` varchar(80) NOT NULL,
  `pais` varchar(80) NOT NULL,
  `domComercial` varchar(80) NOT NULL,
  `Stock` int(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `cuit`, `nomLaboratorio`, `pais`, `domComercial`, `Stock`) VALUES
(1, 37122548768, 'Pfizer y BioNTech', 'E.E.U.U. y Alemania', '235 East 42nd Street', 1000),
(2, 17154789768, 'Moderna,Inc.', 'E.E.U.U. ', 'Cambridge, MA 02139', 1000),
(3, 41228568918, 'Johnson & Johnson (Janssen)', 'E.E.U.U. y Alemania', ' Raritan, NJ 08869.', 1000),
(4, 27184135848, 'AstraZeneca', 'Reino Unido', 'Capability Green 600', 1000),
(5, 17239273688, 'C.H.P.G.', 'China', 'Ande Road N16', 1000),
(6, 41389428468, 'Sinovac Biotech', 'China', 'Haidian 28', 1000),
(7, 17528787358, 'Instituto Gamaleya', 'Rusia', 'Ulitsa Gamalei 18', 1000),
(8, 41567377058, 'Bharat Biotech', 'India', 'Telangana 500078', 1000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--
-- Creación: 27-10-2023 a las 22:21:36
-- Última actualización: 27-10-2023 a las 22:23:06
--

CREATE TABLE `vacuna` (
  `marca` varchar(30) NOT NULL,
  `medida` double NOT NULL,
  `fechaCaduca` date NOT NULL,
  `colocada` tinyint(1) NOT NULL,
  `idLaboratorio` int(11) NOT NULL,
  `nroSerie` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`marca`, `medida`, `fechaCaduca`, `colocada`, `idLaboratorio`, `nroSerie`) VALUES
('Pfizer-BioNTech', 0.3, '2023-12-21', 0, 1, 1),
('Moderna', 0.3, '2023-12-25', 0, 2, 2),
('Pfizer-BioNTech', 0.5, '2023-12-21', 0, 1, 3),
('Moderna', 0.5, '2023-12-25', 0, 2, 4),
('Pfizer-BioNTech', 0.9, '2023-12-21', 0, 1, 5),
('Moderna', 0.9, '2023-12-25', 0, 2, 6),
('Johnson & Johnson (Janssen)', 0.3, '2023-01-16', 0, 3, 7),
('AstraZeneca', 0.3, '2023-01-05', 0, 4, 8),
('Johnson & Johnson (Janssen)', 0.5, '2023-01-16', 0, 3, 9),
('AstraZeneca', 0.5, '2023-01-05', 0, 4, 10),
('Johnson & Johnson (Janssen)', 0.9, '2023-01-16', 0, 3, 11),
('AstraZeneca', 0.9, '2023-01-05', 0, 4, 12),
('Sinopharm', 0.3, '2023-01-14', 0, 5, 13),
('Sinovac ', 0.3, '2023-12-15', 0, 6, 14),
('Sinopharm', 0.5, '2023-01-14', 0, 5, 15),
('Sinovac ', 0.5, '2023-12-15', 0, 6, 16),
('Sinopharm', 0.9, '2023-01-14', 0, 5, 17),
('Sinovac ', 0.9, '2023-12-15', 0, 6, 18),
('Covaxin', 0.3, '2023-12-29', 0, 8, 19),
('Sputnik V', 0.3, '2023-02-04', 0, 7, 20),
('Covaxin', 0.5, '2023-12-29', 0, 8, 21),
('Sputnik V', 0.5, '2023-02-04', 0, 7, 22),
('Covaxin', 0.9, '2023-12-29', 0, 8, 23),
('Sputnik V', 0.9, '2023-02-04', 0, 7, 24);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`codCita`),
  ADD UNIQUE KEY `nroSerie` (`nroSerie`),
  ADD KEY `persona` (`persona`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `cuit` (`cuit`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`nroSerie`),
  ADD KEY `idLaboratorio` (`idLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `codCita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`persona`) REFERENCES `ciudadano` (`dni`),
  ADD CONSTRAINT `citavacunacion_ibfk_3` FOREIGN KEY (`nroSerie`) REFERENCES `vacuna` (`nroSerie`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `laboratorio` (`idLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
