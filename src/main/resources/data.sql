INSERT INTO ECOLE(id,name) VALUES(1,'EMSE')
INSERT INTO ECOLE(id,name) VALUES(2,'ALBI')

INSERT INTO SPORT(id,name) VALUES(1,'FOOTBALL')
INSERT INTO SPORT(id,name) VALUES(3,'VOLLEY')
INSERT INTO SPORT(id,name) VALUES(4,'RUGBY')

INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(1,'MASSE',1,1)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(2,'MORSE',1,4)
INSERT INTO TEAM(id,name,ecole_id,sport_id) VALUES(3,'LIONS',2,3)

INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id,score_1,score_2) VAlUES(1,'21/04/22 10:00',1,2,3,5,0)
INSERT INTO MATCH(id,date,sport_id,team1_id,team2_id) VAlUES(2,'21/04/22 10:30',1,1,1)

