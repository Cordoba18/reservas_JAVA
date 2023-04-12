-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-11-2022 a las 21:31:10
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reservardiscoteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cervezas`
--

CREATE TABLE `cervezas` (
  `id` int(3) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `img` varchar(20) NOT NULL,
  `precio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cervezas`
--

INSERT INTO `cervezas` (`id`, `nombre`, `img`, `precio`) VALUES
(1, 'Cerveza Corona', 'corona.png', 6000),
(2, 'Cerveza Aguila', 'aguila.png', 3000),
(3, 'Cerveza Poker', 'poker.png', 3000),
(4, 'Cerveza Heineken', 'heineken.png', 2500),
(5, 'Jarra De Cerveza', 'jarracerveza.png', 30000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fino`
--

CREATE TABLE `fino` (
  `id` int(3) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `img` varchar(20) NOT NULL,
  `precio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `fino`
--

INSERT INTO `fino` (`id`, `nombre`, `img`, `precio`) VALUES
(1, 'Buchana', 'buchana.png', 195000),
(2, 'Whisky', 'whisky.png', 110000),
(3, 'Vino', 'vino.png', 95000),
(4, 'Botella Baileys', 'baileys.png', 95000),
(5, 'Botella Jimador', 'jimador.png', 108000),
(6, 'Botella Champagne', 'champaña.png', 65000),
(7, 'Botella Jose Cuervo', 'josecuervo.png', 75000),
(8, 'Botella Smirnoff', 'smirnoff.png', 30000),
(9, 'Vodka Absolut', 'vodka.png', 107000),
(10, 'Botella Flor de Caña', 'flordecana.png', 104500);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `guaro`
--

CREATE TABLE `guaro` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `img` varchar(100) NOT NULL,
  `precio` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `guaro`
--

INSERT INTO `guaro` (`id`, `nombre`, `img`, `precio`) VALUES
(1, 'Botella Aguardiente', 'aguardiente.png', 70000),
(2, 'Botella Ron', 'ron.png', 90000),
(3, 'Garrafa de Aguardiente', 'garrafoaguardiente.png', 120000),
(4, 'Garrafa De Ron', 'garraforon.png', 140000),
(5, 'Arrechon', 'arrechon.png', 80000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservabebida`
--

CREATE TABLE `reservabebida` (
  `id` int(11) NOT NULL,
  `cedula` varchar(11) NOT NULL,
  `cerveza` varchar(45) NOT NULL,
  `cantidadc` int(2) NOT NULL,
  `guaro` varchar(45) NOT NULL,
  `cantidadg` int(2) NOT NULL,
  `fino` varchar(45) NOT NULL,
  `cantidadf` int(2) NOT NULL,
  `total` int(8) NOT NULL,
  `discoteca` varchar(10) NOT NULL,
  `fecha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reservabebida`
--

INSERT INTO `reservabebida` (`id`, `cedula`, `cerveza`, `cantidadc`, `guaro`, `cantidadg`, `fino`, `cantidadf`, `total`, `discoteca`, `fecha`) VALUES
(1, '1111663045', 'Cerveza Corona', 7, 'no', 0, 'no', 0, 42000, 'lolas', '11/26/2022'),
(2, '1111663045', 'Cerveza Poker', 3, 'no', 0, 'no', 0, 9000, 'merecu', '11/26/2022'),
(3, '1111663045', 'Cerveza Poker', 5, 'no', 0, 'no', 0, 15000, 'lolas', '11/26/2022'),
(4, '12345678', 'no', 0, 'Botella Aguardiente', 4, 'Botella Buchana', 1, 475000, 'quickly', '11/26/2022'),
(5, '1111663045', 'Cerveza Aguila', 1, 'no', 0, 'no', 0, 3000, 'quickly', '11/26/2022'),
(6, '1111663045', 'Cerveza Corona', 7, 'Botella Ron', 2, 'no', 0, 222000, 'lolas', '11/27/2022'),
(7, '12345678', 'Cerveza Aguila', 20, 'Botella Aguardiente', 3, 'no', 0, 270000, 'quickly', '11/27/2022'),
(8, '12345678', 'Cerveza Aguila', 2, 'no', 0, 'no', 0, 6000, 'quickly', '11/27/2022'),
(9, '123456789', 'no', 0, 'Botella Aguardiente', 1, 'no', 0, 70000, 'quickly', '11/27/2022'),
(10, '123456789', 'Cerveza Poker', 4, 'no', 0, 'no', 0, 12000, 'quickly', '11/27/2022'),
(11, '12345678', 'Jarra De Cerveza', 2, 'no', 0, 'no', 0, 60000, 'lolas', '11/27/2022'),
(12, '12345678', 'Cerveza Heineken', 8, 'no', 0, 'no', 0, 20000, 'lolas', '11/27/2022'),
(13, '12345678', 'no', 0, 'Arrechon', 2, 'Botella Jose Cuervo', 4, 460000, 'lolas', '11/27/2022'),
(14, '12345678', 'no', 0, 'Garrafa de Aguardiente', 4, 'no', 0, 480000, 'lolas', '11/27/2022'),
(15, '09876543', 'no', 0, 'no', 0, 'Botella Baileys', 2, 190000, 'merecu', '11/27/2022'),
(16, '09876543', 'no', 0, 'no', 0, 'Botella Jimador', 3, 324000, 'merecu', '11/27/2022'),
(17, '09876543', 'no', 0, 'Garrafa De Ron', 2, 'no', 0, 280000, 'merecu', '11/27/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `idpersona` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `cedula` bigint(11) NOT NULL,
  `personas` int(2) NOT NULL,
  `cumpleanos` varchar(2) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `discoteca` varchar(15) NOT NULL,
  `fecha` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`idpersona`, `nombre`, `cedula`, `personas`, `cumpleanos`, `correo`, `discoteca`, `fecha`) VALUES
(1, 'Jhan Carlos', 1111663045, 4, 'si', 'jccq12@gmail.com', 'lolas', '11/26/2022'),
(2, 'juan', 432432434, 3, 'si', 'juan@gmail.com', 'lolas', '11/26/2022'),
(3, 'peter', 234324234, 2, 'no', 'peter@gmail.com', 'lolas', '11/26/2022'),
(4, 'Daniel', 423423434, 2, 'no', 'Daniel@gmail.com', 'lolas', '11/26/2022'),
(5, 'juancho', 1231324324, 3, 'no', 'juancho@gmail.com', 'quickly', '11/26/2022'),
(6, 'Pablo', 34234323, 2, 'no', 'pablo@gmail.com', 'quickly', '11/26/2022'),
(7, 'Camilo', 9678564534, 3, 'si', 'camilo@gmail.com', 'merecu', '11/26/2022'),
(8, 'Steven', 234124324, 3, 'si', 'Steven@gmail.com', 'merecu', '11/26/2022'),
(9, 'jhan', 1111663045, 3, 'no', 'jccq12@gmail.com', 'merecu', '11/26/2022'),
(10, 'Petro', 74643523, 3, 'si', 'petro@gmail.com', 'merecu', '11/26/2022'),
(11, 'Antonela', 324543534, 2, 'si', 'antonela@gmail.com', 'merecu', '11/26/2022'),
(12, 'Mbappe', 7545324532, 4, 'no', 'Mbappe@gmail.com', 'lolas', '11/26/2022'),
(13, 'Pablo', 1111663045, 3, 'si', 'Pablo@gmail.com', 'quickly', '11/26/2022'),
(14, 'Antonio', 12345678, 3, 'si', 'Antonio@gmail.com', 'quickly', '11/26/2022'),
(15, 'Jhan Carlos', 123456789, 10, 'si', 'jccq12@gmail.com', 'quickly', '11/26/2022'),
(16, 'gewgweg', 123456789, 2, 'no', 'afwege@gmail.com', 'lolas', '11/26/2022'),
(17, 'wilfredo', 5325235235, 2, 'si', 'wilfredo@gmail.com', 'lolas', '11/26/2022'),
(18, 'jhan', 23423432, 4, 'no', 'jccq12@gmail.com', 'lolas', '11/26/2022'),
(19, 'ewgwegwegw', 235325325, 4, 'no', 'wtewt@gmail.com', 'lolas', '11/26/2022'),
(20, 'gdsdsgew', 235235235, 4, 'si', 'gwgew@gmail.com', 'lolas', '11/26/2022'),
(21, 'twetwtew', 12412412, 3, 'si', 'gsdgweq@gmail.com', 'lolas', '11/26/2022'),
(22, 'ewgewg', 13213213, 4, 'no', 'egqegqg@gmail.com', 'lolas', '11/26/2022'),
(23, 'sfhdfhdf', 523532414, 2, 'no', 'ewgwg@gmail.com', 'lolas', '11/26/2022'),
(24, 'sbmcx bsknegkml', 30945151, 4, 'no', 'jafw2@gmail.com', 'lolas', '11/26/2022'),
(25, 'juna', 53253225, 3, 'si', 'juafn@gmail.com', 'lolas', '11/26/2022'),
(26, 'tewtwet', 23423423, 3, 'si', 'ghrwhwe@gmail.com', 'lolas', '11/26/2022'),
(27, 'dfdggw', 43242412, 3, 'si', 'gwt23t@gmail.com', 'lolas', '11/26/2022'),
(28, 'xbxbs', 4313123123, 2, 'no', 'hrw3@gmail.com', 'lolas', '11/26/2022'),
(29, 'sesdgsd', 352412989, 3, 'no', 'hfdgdfew@gmail.com', 'lolas', '11/26/2022'),
(30, 'tetwetwet', 432423423, 3, 'no', 'shsgs@gmail.com', 'lolas', '11/26/2022'),
(31, 'gwgewgweg', 123123123, 2, 'si', 'herhwe@gmail.com', 'lolas', '11/26/2022'),
(32, 'sddgsdgewgeq', 243242342, 3, 'si', 'jsvvsdv@gmail.com', 'lolas', '11/26/2022'),
(33, 'Wilfredo', 41241241, 2, 'no', 'wilfredo@gmail.com', 'lolas', '11/27/2022'),
(34, 'Samule', 43242353, 2, 'si', 'samuel@gmail.com', 'quickly', '11/27/2022'),
(35, 'Antonio', 21312312, 2, 'no', 'Antonio@gmail.com', 'merecu', '11/27/2022'),
(36, 'Jhan Carlos', 24241234, 2, 'si', 'jhan@gmail.com', 'lolas', '11/27/2022'),
(37, 'Karla', 1111663045, 2, 'no', 'Karla@gmail.com', 'lolas', '11/27/2022'),
(38, 'Peter', 12345678, 2, 'no', 'peter@gmail.com', 'quickly', '11/27/2022'),
(39, 'Juanchito', 125325352, 4, 'no', 'juanchito@gmail.com', 'lolas', '11/27/2022'),
(40, 'Pepito', 123456789, 9, 'no', 'pepito@gmail.com', 'quickly', '11/27/2022'),
(41, 'Pablo', 52353252, 3, 'si', 'pablo3@gmail.com', 'quickly', '11/27/2022'),
(42, 'Piti', 12345678, 3, 'si', 'piti@gmail.com', 'lolas', '11/27/2022'),
(43, 'Gabriel', 9876543, 2, 'si', 'gabriel12@gmail.com', 'merecu', '11/27/2022'),
(44, 'CARLOS', 324324234, 3, 'si', 'carlos42@gmail.com', 'lolas', '11/27/2022');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `nombre` varchar(45) DEFAULT NULL,
  `correo` varchar(256) NOT NULL,
  `contraseña` varchar(255) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`nombre`, `correo`, `contraseña`, `id`) VALUES
('Jhan Carlos', 'jccq12@gmail.com', 'papichulo1', 1),
('Wilfredo', 'wilfredo@gmail.com', '12345678', 2),
('Juan P', 'juan@gmail.com', '453534tret', 4),
('Jorge', 'jorge@gmail.com', 'sdfe534534', 6),
('juan', 'juan@gmail.com', 'gdsgw325', 7),
('Camilo', 'camilo@gmail.com', '12345678', 8),
('sdgre', 'sqrq17@gmail.com', 'ergert4545', 9),
('dst', 'dst@gmail.com', 'gwe432423', 10),
('gsd', 'gsd@gmail.com', 'fsdwerewr', 11),
('Alberto', 'albert@gmail.com', 'gewrw43242', 13),
('Alfonso', 'alfonoso@gmail.com', '123456789', 15),
('Valentina Grajales', 'valentina@gmail.com', 'teamojhan', 19),
('Sebastian', 'sebas@gmail.com', 'terte5325', 20);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cervezas`
--
ALTER TABLE `cervezas`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `fino`
--
ALTER TABLE `fino`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `guaro`
--
ALTER TABLE `guaro`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservabebida`
--
ALTER TABLE `reservabebida`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`idpersona`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cervezas`
--
ALTER TABLE `cervezas`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `fino`
--
ALTER TABLE `fino`
  MODIFY `id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `guaro`
--
ALTER TABLE `guaro`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `reservabebida`
--
ALTER TABLE `reservabebida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `idpersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
