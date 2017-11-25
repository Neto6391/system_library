-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 25-Nov-2017 às 22:28
-- Versão do servidor: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `controle_biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_aluno`
--

CREATE TABLE `cadastro_aluno` (
  `id_aluno` int(10) NOT NULL,
  `nome_aluno` varchar(90) CHARACTER SET utf8 NOT NULL,
  `curso` varchar(30) CHARACTER SET utf8 NOT NULL,
  `matricula` varchar(60) CHARACTER SET utf8 NOT NULL,
  `cpf_aluno` varchar(30) CHARACTER SET utf8 NOT NULL,
  `periodo` int(10) NOT NULL,
  `email_aluno` varchar(90) CHARACTER SET utf8 NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_aluno`
--

INSERT INTO `cadastro_aluno` (`id_aluno`, `nome_aluno`, `curso`, `matricula`, `cpf_aluno`, `periodo`, `email_aluno`, `created_at`, `updated_at`) VALUES
(1, 'Daniel Perrone', 'Direito', '457931', '561.242.453-10', 5, 'DanielHelix@gmail.com', '2017-10-06 23:01:23', '0000-00-00 00:00:00'),
(5, 'xxxxxxxx', 'asdasd', '12132', '050.415.656-00', 4, 'asdasd@asdasd.com', '2017-11-17 15:21:04', '2017-11-24 19:35:27');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_autenticacao`
--

CREATE TABLE `cadastro_autenticacao` (
  `id_autenticacao` int(10) NOT NULL,
  `nome_usuario` varchar(60) CHARACTER SET utf8 NOT NULL,
  `senha_usuario` varchar(40) NOT NULL,
  `matricula` varchar(30) NOT NULL,
  `cpf_usuario` varchar(20) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_autenticacao`
--

INSERT INTO `cadastro_autenticacao` (`id_autenticacao`, `nome_usuario`, `senha_usuario`, `matricula`, `cpf_usuario`, `created_at`, `updated_at`) VALUES
(2, 'admin', '202cb962ac59075b964b07152d234b70', '123456789', '123.456.789-10', '2017-11-16 17:23:33', '0000-00-00 00:00:00'),
(6, 'teste', '202cb962ac59075b964b07152d234b70', '147789', '496.715.677-03', '2017-11-24 18:01:43', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_livro`
--

CREATE TABLE `cadastro_livro` (
  `id_livro` int(10) NOT NULL,
  `nome_livro` varchar(30) CHARACTER SET utf8 NOT NULL,
  `autor` varchar(60) CHARACTER SET utf8 NOT NULL,
  `editora` varchar(30) CHARACTER SET utf8 NOT NULL,
  `lancamento_livro` date NOT NULL,
  `volume` int(11) NOT NULL,
  `quantidade_estoque` int(11) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_livro`
--

INSERT INTO `cadastro_livro` (`id_livro`, `nome_livro`, `autor`, `editora`, `lancamento_livro`, `volume`, `quantidade_estoque`, `created_at`, `updated_at`) VALUES
(21, 'asdsad', 'asdasd', 'asdasd', '1985-11-30', 1, 1, '2017-11-24 12:41:09', '0000-00-00 00:00:00'),
(22, 'asdasda', 'sdas', 'dasdasd', '1982-11-11', 1, 1, '2017-11-24 12:48:00', '0000-00-00 00:00:00'),
(23, 'asdasd', 'asdas', 'dasdasd', '1985-10-10', 2, 2, '2017-11-24 13:09:25', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_locacao`
--

CREATE TABLE `cadastro_locacao` (
  `id_locacao` int(10) NOT NULL,
  `periodo_locacao` date NOT NULL,
  `loc_aluno` int(10) NOT NULL,
  `loc_livro` int(10) NOT NULL,
  `data_locacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_locacao`
--

INSERT INTO `cadastro_locacao` (`id_locacao`, `periodo_locacao`, `loc_aluno`, `loc_livro`, `data_locacao`, `updated_at`) VALUES
(2, '2017-11-27', 1, 22, '2017-11-25 16:47:14', '0000-00-00 00:00:00'),
(4, '2017-11-27', 5, 23, '2017-11-25 17:59:41', '0000-00-00 00:00:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `multa_atraso`
--

CREATE TABLE `multa_atraso` (
  `id_multa` int(10) NOT NULL,
  `id_locacao_multa` int(10) NOT NULL,
  `valor_multa` decimal(3,2) NOT NULL DEFAULT '5.00',
  `quantidade` int(10) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cadastro_aluno`
--
ALTER TABLE `cadastro_aluno`
  ADD PRIMARY KEY (`id_aluno`);

--
-- Indexes for table `cadastro_autenticacao`
--
ALTER TABLE `cadastro_autenticacao`
  ADD PRIMARY KEY (`id_autenticacao`);

--
-- Indexes for table `cadastro_livro`
--
ALTER TABLE `cadastro_livro`
  ADD PRIMARY KEY (`id_livro`);

--
-- Indexes for table `cadastro_locacao`
--
ALTER TABLE `cadastro_locacao`
  ADD PRIMARY KEY (`id_locacao`),
  ADD UNIQUE KEY `loc_aluno` (`loc_aluno`),
  ADD KEY `loc_livro_cadastro_livro` (`loc_livro`);

--
-- Indexes for table `multa_atraso`
--
ALTER TABLE `multa_atraso`
  ADD PRIMARY KEY (`id_multa`),
  ADD UNIQUE KEY `id_locacao_multa` (`id_locacao_multa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cadastro_aluno`
--
ALTER TABLE `cadastro_aluno`
  MODIFY `id_aluno` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `cadastro_autenticacao`
--
ALTER TABLE `cadastro_autenticacao`
  MODIFY `id_autenticacao` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `cadastro_livro`
--
ALTER TABLE `cadastro_livro`
  MODIFY `id_livro` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
--
-- AUTO_INCREMENT for table `cadastro_locacao`
--
ALTER TABLE `cadastro_locacao`
  MODIFY `id_locacao` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `multa_atraso`
--
ALTER TABLE `multa_atraso`
  MODIFY `id_multa` int(10) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `cadastro_locacao`
--
ALTER TABLE `cadastro_locacao`
  ADD CONSTRAINT `loc_livro_cadastro_aluno` FOREIGN KEY (`loc_aluno`) REFERENCES `cadastro_aluno` (`id_aluno`),
  ADD CONSTRAINT `loc_livro_cadastro_livro` FOREIGN KEY (`loc_livro`) REFERENCES `cadastro_livro` (`id_livro`);

--
-- Limitadores para a tabela `multa_atraso`
--
ALTER TABLE `multa_atraso`
  ADD CONSTRAINT `multa_atraso_loc` FOREIGN KEY (`id_locacao_multa`) REFERENCES `cadastro_locacao` (`id_locacao`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
