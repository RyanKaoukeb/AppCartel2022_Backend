INSERT INTO ECOLE(id,name) VALUES(1,'EMSE')
INSERT INTO ECOLE(id,name) VALUES(2,'ALBI')
INSERT INTO ECOLE(id,name) VALUES(3,'ALES')
INSERT INTO ECOLE(id,name) VALUES(4,'NANCY')
INSERT INTO ECOLE(id,name) VALUES(5,'PARIS')
INSERT INTO ECOLE(id,name) VALUES(6,'BOCHUM')
INSERT INTO ECOLE(id,name) VALUES(7,'DOUAI')
INSERT INTO ECOLE(id,name) VALUES(8,'IMT ATLANTIQUE')
INSERT INTO ECOLE(id,name) VALUES(9,'TELECOM SAINTE')
INSERT INTO ECOLE(id,name) VALUES(10,'ENSTA PARIS')

INSERT INTO SPORT(id,name) VALUES(1,'FOOTBALL M')
INSERT INTO SPORT(id,name) VALUES(2,'FOOTBALL F')
INSERT INTO SPORT(id,name) VALUES(3,'VOLLEY M')
INSERT INTO SPORT(id,name) VALUES(4,'VOLLEY F')
INSERT INTO SPORT(id,name) VALUES(5,'RUGBY M')
INSERT INTO SPORT(id,name) VALUES(6,'RUGBY F')
INSERT INTO SPORT(id,name) VALUES(7,'HANDBALL M')
INSERT INTO SPORT(id,name) VALUES(8,'HANDBALL F')
INSERT INTO SPORT(id,name) VALUES(9,'BASKET M')
INSERT INTO SPORT(id,name) VALUES(10,'BASKET F')

INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(1,'EMSE',1,1)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(2,'EMSE',1,2)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(3,'EMSE',1,3)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(4,'EMSE',1,4)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(5,'EMSE',1,5)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(6,'EMSE',1,6)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(7,'EMSE',1,7)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(8,'EMSE',1,8)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(9,'EMSE',1,9)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(10,'EMSE',1,10)

INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(11,'ALBI',2,1)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(12,'ALBI',2,2)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(13,'ALBI',2,3)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(14,'ALBI',2,4)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(15,'ALBI',2,5)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(16,'ALBI',2,6)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(17,'ALBI',2,7)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(18,'ALBI',2,8)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(19,'ALBI',2,9)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(20,'ALBI',2,10)

INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(21,'ALES',3,1)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(22,'ALES',3,2)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(23,'ALES',3,3)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(24,'ALES',3,4)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(25,'ALES',3,5)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(26,'ALES',3,6)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(27,'ALES',3,7)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(28,'ALES',3,8)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(29,'ALES',3,9)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(30,'ALES',3,10)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(1,'21-04-22 10:00',1,1,11,5,0)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(2,'21-04-22 10:30',1,11,21,3,3)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(3,'21-04-22 11:00',1,21,1)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(4,'21-04-22 10:00',2,2,22,0,0)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(5,'21-04-22 10:30',2,12,21)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(6,'21-04-22 11:00',2,22,12)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(7,'21-04-22 12:00',3,3,23,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(8,'21-04-22 12:30',3,13,23,5,7)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(9,'21-04-22 14:00',3,3,13)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(10,'21-04-22 15:00',4,4,24,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(11,'21-04-22 15:30',4,14,24,2,6)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(12,'21-04-22 16:00',4,4,14)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(13,'21-04-22 16:00',5,5,25,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(14,'21-04-22 12:30',5,15,25,2,6)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(15,'21-04-22 6:00',5,5,15)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(16,'22-04-22 16:00',6,6,26,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(17,'22-04-22 12:30',6,16,26,2,6)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(18,'22-04-22 6:00',6,6,16)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(19,'22-04-22 17:00',7,7,27,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(20,'22-04-22 12:30',7,17,27,2,6)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(21,'22-04-22 6:00',7,7,17)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(22,'23-04-22 7:00',9,9,29,6,2)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(23,'23-04-22 14:30',9,19,29,2,6)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(24,'22-04-22 16:00',9,9,19)

