CREATE DATABASE College;
USE College;
CREATE TABLE Student (
    Rno INT PRIMARY KEY,
	Stdname VARCHAR(20),
    Course VARCHAR(10)
 );
 INSERT INTO Student VALUES
	(101, 'Ravi', 'BCA'),
    (102, 'Priya', 'BCom'),
    (103, 'Anil', 'BSc');
    
DELIMITER //
CREATE PROCEDURE Getstudent(In p_Rno INT)
BEGIN
   DECLARE v_Name VARCHAR(20);
   DECLARE v_Course VARCHAR(10);
   
   DECLARE EXIT HANDLER FOR NOT FOUND
   BEGIN
      SELECT 'Student not found' AS Message;
   END;
   
   SELECT Stdname, Course
   INTO v_Name, v_Course
   FROM student
   WHERE Rno = p_Rno;
   
   SELECT v_Name AS StudentName,
          v_Course AS Course;
END //
DELIMITER ;

CALL GetStudent(101);
CALL GetStudent(999);          