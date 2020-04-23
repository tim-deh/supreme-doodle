# problem 1
SELECT noOfCopies FROM tbl_book_copies bc
INNER JOIN tbl_book bk
ON bk.bookId = bc.bookId
INNER JOIN tbl_library_branch lb
ON lb.branchId = bc.branchId
WHERE bk.title = "The Lost Stribe" AND lb.branchName = "Sharpstown";

# problem 2
SELECT SUM(noOfCopies) FROM tbl_book_copies bc
INNER JOIN tbl_book bk
ON bk.bookId = bc.bookId
INNER JOIN tbl_library_branch lb
ON lb.branchId = bc.branchId
WHERE bk.title = "The Lost Tribe";

# problem 3
SELECT name FROM tbl_borrower bw
INNER JOIN tbl_book_loans bl
ON bw.cardNo = bl.cardNo
WHERE bl.cardNo = bw.cardNo AND bl.dateOut = NULL;

# problem 4
SELECT bw.name, bw.address, bk.title FROM tbl_borrower bw
INNER JOIN tbl_book_loans bl
ON bw.cardNo = bl.cardNo
INNER JOIN tbl_library_branch lb
ON lb.branchId = bl.branchId
INNER JOIN tbl_book bk
ON bk.bookId = bl.bookId
WHERE lb.branchName = "Sharpstown" AND bl.dueDate = CURDATE();

# problem 5
SELECT lb.branchName, COUNT(bl.dateOut) FROM tbl_library_branch lb
INNER JOIN tbl_book_loans bl
ON lb.branchId = bl.branchId
WHERE bl.dateOut != NULL AND dateIn = NULL
GROUP BY lb.branchName;

# problem 6
SELECT name, COUNT(dateOut) AS loans FROM tbl_book_loans bl
INNER JOIN tbl_borrower bw
ON bw.cardNo = bl.cardNo
WHERE bl.dateOut != NULL AND dateIn = NULL
GROUP BY name
HAVING loans > 5;

# problem 7
SELECT bk.title, bc.noOfCopies FROM tbl_book bk
INNER JOIN tbl_book_copies bc
ON bc.bookId = bk.bookId
INNER JOIN tbl_library_branch lb
ON lb.branchId = bc.branchId
INNER JOIN tbl_book_authors ba
ON ba.bookId = bk.bookId
INNER JOIN tbl_author au
ON ba.authorId = au.authorId
WHERE au.authorName = "Stephen King" AND lb.branchName = "Central";
