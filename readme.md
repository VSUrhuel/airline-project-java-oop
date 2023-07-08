# Airline Booking System

This repository contains the implementation of an airline booking system for Maharlika Filipina Airlines. The system manages seat reservations for airplanes owned by the airline, including both business class and economy class seats.

## Problem Description

Maharlika Filipina Airlines has a fleet of airplanes with varying seat configurations. While not all airplanes have business class seats, all of them have economy seats with at least 7 rows. The seat arrangement is consistent across airplanes, with business class seats labeled as W, X, Y, and Z, and economy class seats labeled as A, B, C, D, E, F, and G.

The seat capacity of an airplane can be increased by adding seats proportional to the number of rows. For example, in business class, additional rows can have 12 seats (3 rows) or 28 seats (7 rows), while in economy class, additional rows can have 63 seats (9 rows) or 84 seats (12 rows).

Booking restrictions apply to economy seats. The first row is reserved for passengers with disabilities (PWD). If a passenger who is not a PWD tries to book a seat in the first row and there is at least one vacant seat in any row starting from the second row, the booking cannot be made. However, if all seats from the second row onwards are taken, the passenger can book a seat in the first row even if they are not a PWD. Business class seats do not have any such restrictions.

## UML Diagaram


![Airline UML Diagram](AirlineProject (1).png)

## Repository Contents

- `Airplane.java`: Implementation of the `Airplane` class, which represents an airplane with seat reservations.
- `Passenger.java`: Implementation of the `Passenger` class, which represents a passenger with a name.
- `Seat.java`: Implementation of the `Seat` class, which represents a seat on an airplane.
- `Main.java`: A demo program showcasing the usage of the airline booking system.

## Class Descriptions

### Airplane

The `Airplane` class represents an airplane and manages seat reservations. It has the following attributes:

- `name`: The name of the airplane.
- `economyCapacity`: The capacity of economy class seats in terms of rows.
- `businessClassCapacity`: The capacity of business class seats in terms of rows.
- `numEconomyPassengers`: The number of passengers booked in economy class seats.
- `numBusinessClassPassengers`: The number of passengers booked in business class seats.
- `economySeats`: An array of `Seat` objects representing the economy class seats.
- `businessClassSeats`: An array of `Seat` objects representing the business class seats.

The `Airplane` class provides the following constraints:

1. Implement the attributes as shown in the UML class diagram.
2. For the constructor, just initialize the name attribute by the value of its parameter. Initialize the default values for economyCapacity to 49 (since all airplanes have a minimum of 7 rows), businessClassCapacity to 0, numEconomyPassengers and numBusinessClassPassengers attributes to 0 values since initally all seats are not yet assigned with a passenger. Following these, initialize the businessClassSeats and economySeats according to their capacities and consequently initialize Seat objects in these attributes with their appropriate names starting with 1W, 1X, ..., 2W, 2X, 2Y, ... etc. for business class seats and 1A, 1B, .... 5A, 5B, 5C, ... 5G, 6A, ... etc. for economy seats.
3. For the setEconomyCapacity and setBusinessClassCapacity mutators, allow it to change their equivalent respective attributes only when there are still no passengers booked in any type of seats, the capacity is proportional to the number of seats per row, and is greater than the minimum number of seats assigned per seat type. Make sure to update the economySeats or businessClassSeats attribute; whichever is necessary, everytime the mutator has successfully executed since when the capacity changes so are capacity of the seat collection.
4. For the bookPassenger method, just assign the passenger to its appropriate seat if that seat is still available. Return true if the assignment has been done and return false otherwise. Remember to execute the condition stated in the introduction about whether a passenger can book a specific seat given if he is a PWD or not.
5. For getAllEconomyPassengers and getAllBusinessClassPassengers methods, just return a list containing all Passenger objects book in their appropriate seat type. The list shall contain no null objects.

### Passenger

The `Passenger` class represents a passenger with a name. It has the following attributes:

- `name`: The name of the passenger.

The `Passenger` class provides the following constraints:

1. Implement the attributes, constructor, and accessor as shown in the UML class diagram.
2. Override the equals method that compares 2 passenger as equal if their name is the same, otherwise they are not equal.


### Seat

The `Seat` class represents a seat on an airplane. It has the following attributes:

- `name`: The name of the seat.
- `passenger`: The passenger assigned to the seat.

The `Seat` class has the following constraints:

1. Implement the attributes and accessors as shown in the UML class diagram.
2. For the constructor, just initialize the name attribute by the value of its parameter.
3. For the isAvailable method, return true if there exist a Passenger object in the seat and false otherwise.
4. For the setPassenger mutator, assign the passenger attribute by the value of its parameter if currently there exist no Passenger object in the seat then return true, otherwise, the assignment should not be done and the mutator should return false.


## Usage

To use the airline booking system, follow these steps:

1. Create an instance of the `Airplane` class, providing the name of the airplane.
2. Use the appropriate methods to set the capacities of economy and business class seats, if needed.
3. Call the `bookPassenger` method to book passengers in available seats.
4. Use the `getAllEconomyPassengers` and `getAllBusinessClassPassengers` methods to retrieve lists of booked passengers.

See the `AirlineBookingSystemDemo.java` file for an example of how to use the system.

## Credits

This project was created by Sir Jomari Joseph Barera, an instructor at Visayas State University, as part of the Laboratory Exam in OOP in Java.
