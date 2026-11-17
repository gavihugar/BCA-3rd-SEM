DELIMITER //
CREATE PROCEDURE fname(
    IN a INT,
    INOUT b INT
 )
 BEGIN
	SET b = a;
    SELECT b;
 END //
 DELIMITER ;
 
 SET @x = 0;
 CALL fname(23, @x);
 SELECT @X AS Output;