-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 27-Nov-2017 às 20:52
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
  `email_aluno` varchar(90) CHARACTER SET utf8 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_aluno`
--

INSERT INTO `cadastro_aluno` (`id_aluno`, `nome_aluno`, `curso`, `matricula`, `cpf_aluno`, `periodo`, `email_aluno`) VALUES
(1, 'Daniel Perrone', 'Direito', '457931', '561.242.453-10', 5, 'DanielHelix@gmail.com'),
(5, 'xxxxxxxx', 'asdasd', '12132', '050.415.656-00', 4, 'asdasd@asdasd.com');

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_autenticacao`
--

CREATE TABLE `cadastro_autenticacao` (
  `id_autenticacao` int(10) NOT NULL,
  `nome_usuario` varchar(60) CHARACTER SET utf8 NOT NULL,
  `senha_usuario` varchar(40) NOT NULL,
  `matricula` varchar(30) NOT NULL,
  `cpf_usuario` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_autenticacao`
--

INSERT INTO `cadastro_autenticacao` (`id_autenticacao`, `nome_usuario`, `senha_usuario`, `matricula`, `cpf_usuario`) VALUES
(2, 'admin', '202cb962ac59075b964b07152d234b70', '123456789', '123.456.789-10'),
(6, 'teste', '202cb962ac59075b964b07152d234b70', '147789', '496.715.677-03');

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
  `quantidade_estoque` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_livro`
--

INSERT INTO `cadastro_livro` (`id_livro`, `nome_livro`, `autor`, `editora`, `lancamento_livro`, `volume`, `quantidade_estoque`) VALUES
(21, 'asdsad', 'asdasd', 'asdasd', '1985-11-30', 1, 0),
(22, 'asdasdasdasd', 'sdas', 'dasdasd', '1987-12-11', 1, 0),
(24, 'dsadasasdasdasdasdasdasd', 'dasda', 'sdasdasdasd', '1995-10-15', 4, 4);

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastro_locacao`
--

CREATE TABLE `cadastro_locacao` (
  `id_locacao` int(10) NOT NULL,
  `periodo_locacao` date NOT NULL,
  `loc_aluno` int(10) NOT NULL,
  `loc_livro` int(10) NOT NULL,
  `id_select_aluno` int(10) NOT NULL,
  `id_select_livro` int(10) NOT NULL,
  `data_locacao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cadastro_locacao`
--

INSERT INTO `cadastro_locacao` (`id_locacao`, `periodo_locacao`, `loc_aluno`, `loc_livro`, `id_select_aluno`, `id_select_livro`, `data_locacao`) VALUES
(6, '2017-11-28', 5, 22, 2, 2, '2017-11-27 04:03:59'),
(13, '2017-11-28', 1, 22, 1, 2, '2017-11-27 19:47:19');

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
  MODIFY `id_livro` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
--
-- AUTO_INCREMENT for table `cadastro_locacao`
--
ALTER TABLE `cadastro_locacao`
  MODIFY `id_locacao` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
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
