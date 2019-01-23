# WMF-MS
Step 1: Set-up the database as per "Database Details" provided below.
Step 2: Set-up the application properties as per "Application Properties" provided below.
Step 3: Run the application
Step 4: Access the ReSTful Service


******************************************************************
Database Details
******************************************************************
Database: MySQL
Schema: wmf
Create Table Query:
create table song(
   song_id INT NOT NULL AUTO_INCREMENT,
   song_name VARCHAR(100) NOT NULL,
   song_artist VARCHAR(100) NOT NULL,
   song_year VARCHAR(100) NOT NULL,
   song_origin VARCHAR(100) NOT NULL,
   PRIMARY KEY ( song_id )
);

******************************************************************
Application Properties
******************************************************************
Set following properties in application.properties file as per deployment server.
spring.datasource.url
spring.datasource.username
spring.datasource.password

******************************************************************
Run The Application
******************************************************************
Install Maven on the system, cd to location of WMF-MS directory and run the following command-
mvn spring-boot:run

******************************************************************
API
******************************************************************
Fetch Records: 
	Request Method: GET 
	URL: http://localhost:8086/wmf/songs/

Insert Records: 
	Request Method: POST
	URL: http://localhost:8086/wmf/songs/
	Payload: {"songName":"name of the song","songYear":"year of song","songArtist":"artist name","songOrigin":"country of origin"}
	
******************************************************************
