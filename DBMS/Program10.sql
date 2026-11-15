CREATE DATABASE Company;
USE Company;
CREATE TABLE emp2 (
   empno INT,
   ename VARCHAR(10),
   job VARCHAR(10),
   sal VARCHAR(5)
);

INSERT INTO emp2 VALUES
 (1, 'Rishi', 'Manager', '25k');

INSERT INTO emp2 VALUES
 (2, 'Dimple', 'Programmer', '75');
 
INSERT INTO emp2 VALUES
(3, 'Shanu', 'Developer', '80k');

INSERT INTO emp2 VALUES
(4, 'Vaishnavi', 'Manager', '60k'); 

SELECT * FROM emp2;

DELIMITER //
CREATE PROCEDURE show_emp2()
BEGIN
   DECLARE done INT DEFAULT 0;
   DECLARE v_empno INT;
   DECLARE v_ename VARCHAR(10);
   
   DECLARE cur_emp CURSOR FOR
      SELECT empno, ename FROM emp2 ORDER BY job, sal;
      
   DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
   OPEN cur_emp;
   read_loop: Loop
      FETCH cur_emp INTO v_empno, v_ename;
      IF done = 1 THEN
         LEAVE read_loop;
      END IF;
      SELECT v_empno AS empno, 
             v_ename AS ename;
   END LOOP;
   CLOSE cur_emp;
END //
DELIMITER ;   

CALL show_emp2();