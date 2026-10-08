# Hackathon1_2620040033
Question 3: Municipal Waste Collection Optimizer

3a) Data Types:

Write a Java program to store and display the following details of a waste collection vehicle:

Vehicle number – integer
Waste collected in kilograms – decimal value
Number of collection points – integer
Vehicle status – character
Use appropriate Java data types for each value and display all the details.

SAMPLE OUTPUT

Enter vehicle number:
101

Enter waste collected in kg:
125.5

Enter number of collection points:
8

Enter vehicle status:
A
Vehicle Number: 101

Waste Collected: 125.5 kg

Number of Collection Points: 8

Vehicle Status: A

3b) If-Else Condition:

Write a Java program to check the waste collection status based on the amount of waste collected. Read the waste collected in kilograms.

If the waste collected is 100 kg or more, display "Collection Target Achieved".
Otherwise, display "More Waste Collection Required".
Use an if-else statement.

SAMPLE OUTPUT

If the waste collected is greater than 100, the output is:

Enter waste collected in kg:
120

Collection target archived

If the waste collected is less than 100, the output is:

Enter waste collected in kg:
80

More waste collection required

3c) Methods:

Write a Java program to calculate the total waste collected from two collection points using a method.

Create the following method:

calculateTotalWaste(double point1Waste, double point2Waste)
The method should return the total waste collected. Read the waste collected at the two collection points from the user, call the method, and display the total waste collected.

SAMPLE OUTPUT

Enter waste collected at point1:
50.5

Enter waste collected at point2:
75.5

Total waste collected: 126.0 kg


HACKATHON 2 

Write a Java program to implement a Cinema Ticket Booking System.

Create a class named MovieTicket with the following data members: movieName, ticketPrice and numberOfTickets.

Create a parameterized constructor to initialize the movie name, ticket price and number of tickets.

Implement the following methods:

calculateTotal() - Calculates the total ticket amount using ticket price × number of tickets.
calculateDiscount() - Provides a 10% discount if the number of tickets is 5 or more. Otherwise, no discount is given.
calculateFinalAmount() - Calculates the final amount after deducting the discount.
displayBill() - Displays the movie name, ticket price, number of tickets, discount and final amount.
In the main() method, read the required input values and create a MovieTicket object using the constructor. Invoke the required methods to calculate the total amount, discount and final amount. Finally, display the complete booking bill.

Use separate methods for each calculation and display monetary values with two decimal places.

SAMPLE OUTPUT 

Ticket Price: Rs400.0

Number of Tickets: 5

Total Price: Rs2000.0

Discount: Rs200.0

Final Amount to Pay: Rs1800.0
