<--CRUD OPS-->
/*
Create
Read
Update
Delete

Sub-Languages of SQL
DDL - Data Definition Language (Auto-Commits)
Structure of the data base
Commands:
    Create
        ex: CREATE TABLE A(NUMBER ID, VARCHAR2 (50) NAME);
    Alter
        ex: ALTER TABLE A DROP COLUMN ID;
    Drop
        ex: DROP TABLE A;
    Trucate
        deleting the data in the table but not the table itself

        
DML - Data Manipulation Language (Not(Auto-Commit))
Data entries themselves
Commands:
    Insert
        Inserts a row (data entry)
        ex: INSERT INTO A VALUES(14,'Bob');
            INSERT INTO A (ID) VALUES (15);
            Insertr data from another table
             ex: INSERT INTO TABLE_NAME
                    [(Column1,Coulmn2)]
                    SELECT [('Column1','Column2')]
                    FROM TABLE_NAME2
                    [WHERE CONDITIONS]
                    
    Update
        Modify a row(s) (data modification)
        ex UPDATE A SET NAME='DALE' WHERE NAME = 'BOB';
    Delete
        Delete rows
        ex DELETE FROM A WHERE NAME='BOB';
        
        
DQL - Data Query Language 
Command:
    Select
        ex: SELECT * FROM *;
            SELECT * FROM A;
            SELECT NAME FROM A;
            
            
DCL - Data Control Language
control access of who can see/use data
Commands:
    Grant
    Revoke
        View - virtual table/saved select state (grant/revoke access to entries to preserve sensitive info


TCL - Transaction Control Language
controls transactoins
Commands:
    Commit - permanant save
        commit;
    SavePoint - save a point tmporarily (local checkpoint)
    savepoint sp1;
    Rollback - roll the DB back to the last commit or a specified savepoint.
    rollback sp1;
    

*/