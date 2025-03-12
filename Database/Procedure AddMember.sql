use Librix;

Delimiter //
Create Procedure AddMember(
	prMemName Varchar(50),
    prMemEmail Varchar(30),
    prMemTelp Varchar(15),
    prMemAddress Varchar(100)
)
BEGIN
	Declare NewMemID Char(11);
    
    -- Automatic MemID
    Select Concat(
				'ID',
                '-',
                Substring(prMemName,1,3),
                '-',
                LPAD(Coalesce(Min(Cast(Substring(MemID,10,2) AS Unsigned)),0)+1, 4, '0')
            )
	Into NewMemID
    From Member
    Where Cast(Substring(MemID,10,2) AS Unsigned)+1
	Not In (Select Cast(Substring(MemID,10,2) AS Unsigned) From Member);
    
    -- Entering data into the Member table
    Insert Into Member (MemID, MemName, MemEmail, MemTelp, MemAddress, RegDate)
    Values (NewMemID, prMemName, prMemEmail, prMemTelp, prMemAddress, curdate());
END;