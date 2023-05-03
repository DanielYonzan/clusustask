 create database `fx-deals`;

use `fx-deals`;

DROP TABLE IF EXISTS `deals`;

CREATE TABLE deals (
    id bigint AUTO_INCREMENT PRIMARY KEY,
    deal_unique_id VARCHAR(255) NOT NULL,
    ordering_currency_iso_code VARCHAR(3) NOT NULL,
    to_currency_iso_code VARCHAR(3) NOT NULL,
    deal_timestamp TIMESTAMP NOT NULL,
    deal_amount_in_ordering_currency double(19, 4) NOT NULL,
    created_at datetime NOT NULL,
    UNIQUE KEY deal_unique_id (deal_unique_id)
);CREATE TABLE `deals` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `deal_unique_id` varchar(255) NOT NULL,
  `ordering_currency_iso_code` varchar(3) NOT NULL,
  `to_currency_iso_code` varchar(3) NOT NULL,
  `deal_timestamp` timestamp NOT NULL,
  `deal_amount_in_ordering_currency` double(19,4) NOT NULL,
  `created_at`datetime DEFAULT CURRENT_TIMESTAMP  NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `deal_unique_id` (`deal_unique_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

