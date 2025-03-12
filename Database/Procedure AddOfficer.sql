use librix;

-- Creating AddOfficer Procedure
Delimiter //
Create Procedure AddOfficer(
	prOffName Varchar(50),
    PrOffEmail Varchar(30),
    prOffTelp Varchar(15)
)
Begin
	Declare NewOffID Char(10);
    
    -- Auto OffID
    Select Concat(
				'ID',
                '-',
                'OFF',
                '-',
                LPAD(Coalesce(Min(Cast(Substring(OffID,8) AS Unsigned)),0)+1, 3, '0')
			)
    Into NewOffID
    From Officer
    Where Cast(Substring(OffID,8) AS Unsigned)+1
    Not In (Select Cast(Substring(OffID,8) AS Unsigned) From Officer);
    
    -- Entering Data into the Officer Table
    Insert Into Officer (OffID, OffName, OffEmail, OffTelp)
    Values (NewOffID, prOffName, prOffEmail, prOffTelp);
End;