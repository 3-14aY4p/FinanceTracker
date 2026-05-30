/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  tianye
 * Created: May 30, 2026
 */

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;

CREATE TABLE `tbl_transactions` (
    `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
    `date` date DEFAULT NULL,
    `amount` double(11, 2) DEFAULT NULL,
    `type` enum('expense', 'income', 'transfer') DEFAULT NULL,
    `description` varchar(320) DEFAULT NULL,
    `account` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`)
);

COMMIT;