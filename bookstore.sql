-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 26 Ağu 2019, 11:09:09
-- Sunucu sürümü: 10.1.40-MariaDB
-- PHP Sürümü: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `bookstore`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author`
--

CREATE TABLE `author` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `author`
--

INSERT INTO `author` (`id`, `name`) VALUES
(4, 'Oguz Atay');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `author_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `price_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `book`
--

INSERT INTO `book` (`id`, `name`, `author_id`, `category_id`, `price_id`) VALUES
(5, 'Tutunamayanlar', 4, 1, 3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `category`
--

CREATE TABLE `category` (
  `id` int(11) NOT NULL,
  `category` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `category`
--

INSERT INTO `category` (`id`, `category`) VALUES
(1, 'Adventure');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `city`
--

CREATE TABLE `city` (
  `id` int(11) NOT NULL,
  `city` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `city`
--

INSERT INTO `city` (`id`, `city`) VALUES
(2, 'Istanbul');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(7),
(7),
(7),
(7),
(7),
(7);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `price`
--

CREATE TABLE `price` (
  `id` int(11) NOT NULL,
  `currency` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `city_id` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `price`
--

INSERT INTO `price` (`id`, `currency`, `price`, `city_id`) VALUES
(3, 'TL', 25, 2);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `store`
--

CREATE TABLE `store` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `store`
--

INSERT INTO `store` (`id`, `name`) VALUES
(6, 'Eminonu Kitapcisi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `store_books`
--

CREATE TABLE `store_books` (
  `book_store_id` int(11) NOT NULL,
  `books_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Tablo döküm verisi `store_books`
--

INSERT INTO `store_books` (`book_store_id`, `books_id`) VALUES
(6, 5);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKklnrv3weler2ftkweewlky958` (`author_id`),
  ADD KEY `FKam9riv8y6rjwkua1gapdfew4j` (`category_id`),
  ADD KEY `FKo4ttp1uketb6l1klqxnlijm7p` (`price_id`);

--
-- Tablo için indeksler `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `city`
--
ALTER TABLE `city`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `price`
--
ALTER TABLE `price`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKbhaijc5yjjm5o73motxyg7t13` (`city_id`);

--
-- Tablo için indeksler `store`
--
ALTER TABLE `store`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `store_books`
--
ALTER TABLE `store_books`
  ADD KEY `FKa340xxi3xpev5q7jtcm2ve05l` (`books_id`),
  ADD KEY `FK4t7so58ukfsym6r941700siep` (`book_store_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
