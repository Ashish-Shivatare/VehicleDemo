/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.6.19 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `vehicle_info` (
	`v_id` int (11),
	`v_type` int (11),
	`v_name` varchar (42),
	`v_model` varchar (42),
	`v_date` date ,
	`v_company` varchar (240),
	`v_category` int (14),
	`v_torque` double ,
	`v_hp` double ,
	`v_maxspeed` double ,
	`v_acc` double ,
	`v_run` double 
); 
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('1','1','appe','asa','2020-08-12','tata','2','222','33','2321','23231','231');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('2','2','truck','123','2012-08-23','force','4','222','444','232','121','4234');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('3','3','appels','223','2019-06-27','tat','3','234','123','3333','222','333');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('4','1','piaggo','as21','2018-01-17','piaggo','2','2323','343','545','23','12');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('5','2','tempo','sad23','2020-02-12','force','3','221','32321','5555','656','655');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('6','2','traveller','assa21','2015-11-17','force','3','2121','123','1000','1012','23123');
insert into `vehicle_info` (`v_id`, `v_type`, `v_name`, `v_model`, `v_date`, `v_company`, `v_category`, `v_torque`, `v_hp`, `v_maxspeed`, `v_acc`, `v_run`) values('7','2','trucks','asa','2020-12-24','23ada','3','211','3443','323','3434','232');
