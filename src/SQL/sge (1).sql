-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2015 a las 19:35:40
-- Versión del servidor: 5.6.24
-- Versión de PHP: 5.5.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sge`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE IF NOT EXISTS `articulo` (
  `CODIGO` int(11) NOT NULL,
  `NOMBRE` varchar(150) NOT NULL,
  `PRECIO` double NOT NULL,
  `CANTIDAD` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo_pedido`
--

CREATE TABLE IF NOT EXISTS `articulo_pedido` (
  `CODIGO_DOCUMENTO` int(11) NOT NULL,
  `CODIGO_ARTICULO` int(11) NOT NULL,
  `CANTIDAD` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `DNI` varchar(9) NOT NULL,
  `NOMBRE` varchar(150) NOT NULL,
  `APELLIDOS` varchar(150) NOT NULL,
  `DOMICILIO` varchar(150) NOT NULL,
  `CORREO` varchar(150) NOT NULL,
  `TELEFONO` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cobro`
--

CREATE TABLE IF NOT EXISTS `cobro` (
  `CODIGO_COBRO` int(11) NOT NULL,
  `CODIGO_PEDIDO` int(11) NOT NULL,
  `FORMA_PAGO` varchar(150) NOT NULL,
  `FECHA` varchar(10) NOT NULL,
  `IMPORTE` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documento`
--

CREATE TABLE IF NOT EXISTS `documento` (
  `CODIGO` int(11) NOT NULL,
  `DNI_CLIENTE` varchar(9) DEFAULT NULL,
  `CIF_PROVEEDOR` varchar(16) DEFAULT NULL,
  `TIPO` varchar(150) NOT NULL,
  `FECHA_PEDIDO` varchar(10) NOT NULL,
  `BASE` double NOT NULL,
  `IVA` double NOT NULL,
  `TOTAL` double NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE IF NOT EXISTS `proveedor` (
  `CIF` varchar(16) NOT NULL,
  `DENOMINACION_SOCIAL` varchar(150) NOT NULL,
  `TELEFONO` varchar(12) NOT NULL,
  `CORREO` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`CODIGO`);

--
-- Indices de la tabla `articulo_pedido`
--
ALTER TABLE `articulo_pedido`
  ADD PRIMARY KEY (`CODIGO_DOCUMENTO`,`CODIGO_ARTICULO`), ADD KEY `cod_art_fk` (`CODIGO_ARTICULO`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `cobro`
--
ALTER TABLE `cobro`
  ADD PRIMARY KEY (`CODIGO_COBRO`), ADD KEY `cod_ped_fk` (`CODIGO_PEDIDO`);

--
-- Indices de la tabla `documento`
--
ALTER TABLE `documento`
  ADD PRIMARY KEY (`CODIGO`), ADD KEY `cod_docClient_fk` (`DNI_CLIENTE`), ADD KEY `cod_docProv_fk` (`CIF_PROVEEDOR`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`CIF`), ADD UNIQUE KEY `denominacion_social_unique` (`DENOMINACION_SOCIAL`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `cobro`
--
ALTER TABLE `cobro`
  MODIFY `CODIGO_COBRO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `documento`
--
ALTER TABLE `documento`
  MODIFY `CODIGO` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=7;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `articulo_pedido`
--
ALTER TABLE `articulo_pedido`
ADD CONSTRAINT `cod_art_fk` FOREIGN KEY (`CODIGO_ARTICULO`) REFERENCES `articulo` (`CODIGO`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `cod_doc_fk` FOREIGN KEY (`CODIGO_DOCUMENTO`) REFERENCES `documento` (`CODIGO`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `cobro`
--
ALTER TABLE `cobro`
ADD CONSTRAINT `cod_ped_fk` FOREIGN KEY (`CODIGO_PEDIDO`) REFERENCES `documento` (`CODIGO`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `documento`
--
ALTER TABLE `documento`
ADD CONSTRAINT `cod_docClient_fk` FOREIGN KEY (`DNI_CLIENTE`) REFERENCES `cliente` (`DNI`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `cod_docProv_fk` FOREIGN KEY (`CIF_PROVEEDOR`) REFERENCES `proveedor` (`CIF`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
