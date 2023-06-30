#Airline Project
##Encapsulation OOP
###Created by Sir Jomari Joseph Barera | Instructor at Visayas State University

**Introduction**
The *Maharlika Filipina Airlines* owns several airplanes and an airline booking system. Some of their airplanes may have or may not have business class seats but all of them have economy seats of at least 7 rows. 

Even though each airplane might vary in seat size, they have the same seat column arrangement, they only differ in how many rows each airplane can contain. In business class, there are four columns W, X, Y, and Z in that order from the left. In economy, there are 7 columns A, B, C, D, E, F, and G. Therefore, an airplane having the minimum number of seats can contain no business class seats (0 rows) and 49 economy seats (7 rows). Thus, the seat capacity of an airplane can only be increased by the seat proportional to the number of rows, e.g. in business class: 12 seats (3 rows) or 28 seats (7 rows) and in economy: 63 seats (9 rows) or 84 seats (12 rows).

When booking an economy seat, all seats in the first row is reserved for PWD passengers. If a passenger booking the first row is not a PWD and there is at least 1 vacant seat any row from 2 onwards, the passenger cannot successfully book that seat. If all seats are taken from row 2 onwards, then that passenger can book in any of the first row seat even if he/she is not a PWD. In booking a business class seat there is no such restriction.

![Airline UML Diagram](https://ibb.co/dbFcvST)

Given the UML with relationships above, implement the **Airplane** class with the following constraints:

1. Implement the attributes as shown in the UML class diagram.
2. For the constructor, just initialize the name attribute by the value of its parameter. Initialize the default values for economyCapacity to 49 (since all airplanes have a minimum of 7 rows), businessClassCapacity to 0, numEconomyPassengers and numBusinessClassPassengers attributes to 0 values since initally all seats are not yet assigned with a passenger. Following these, initialize the businessClassSeats and economySeats according to their capacities and consequently initialize Seat objects in these attributes with their appropriate names starting with 1W, 1X, ..., 2W, 2X, 2Y, ... etc. for business class seats and 1A, 1B, .... 5A, 5B, 5C, ... 5G, 6A, ... etc. for economy seats.
3. For the setEconomyCapacity and setBusinessClassCapacity mutators, allow it to change their equivalent respective attributes only when there are still no passengers booked in any type of seats, the capacity is proportional to the number of seats per row, and is greater than the minimum number of seats assigned per seat type. Make sure to update the economySeats or businessClassSeats attribute; whichever is necessary, everytime the mutator has successfully executed since when the capacity changes so are capacity of the seat collection.
4. For the bookPassenger method, just assign the passenger to its appropriate seat if that seat is still available. Return true if the assignment has been done and return false otherwise. Remember to execute the condition stated in the introduction about whether a passenger can book a specific seat given if he is a PWD or not.
5. For getAllEconomyPassengers and getAllBusinessClassPassengers methods, just return a list containing all Passenger objects book in their appropriate seat type. The list shall contain no null objects.

Implement the **Passenger** class with the following contstraints:

1. Implement the attributes, constructor, and accessor as shown in the UML class diagram.
2. Override the equals method that compares 2 passenger as equal if their name is the same, otherwise they are not equal.

Implement the **Seat** class with the following constraints:

1. Implement the attributes and accessors as shown in the UML class diagram.
2. For the constructor, just initialize the name attribute by the value of its parameter.
3. For the isAvailable method, return true if there exist a Passenger object in the seat and false otherwise.
4. For the setPassenger mutator, assign the passenger attribute by the value of its parameter if currently there exist no Passenger object in the seat then return true, otherwise, the assignment should not be done and the mutator should return false.

###This project is part of our Laboratory Exam in OOP in Java at VSU.