# C451-Project

RentaCar System Application:

  Microsoft Access: used to construct RentaCar database
  Java: used to create the program and user interface (JavaFx GUI)

Java Fx GUI:

    User Interface: users will be required to log in to access the application

    Customer Page - a user, verified as a customer in the RentaCar database, will be able to see a list of tabs
        Tabs include : Vehicle Search, Branch Search, Reserve, Update Reservation, and Rental History
        
            Vehicle Search: a customer may search for a vehicle in the RentaCar database by vinNumber, make, model, year, or number of seats in the car.
            A list of matching results will be displayed. If the vehicle is unavailable, the customer will be asked to search a different vehicle.
            
            Branch Search: a customer may search for a RentaCar branch based on the city, state, or country entered. If a match is found, the results will be displayed to the user.
            If a branch is not found near the location entered, the user will be prompted to enter a different location.
            
            Reserve: a customer may reserve a selected car. Customers must enter a valid date and time to pick up and drop off the vehicle. 
            **It is important to note that a customer can reserve/rent many cars, but a car can only be associated to one customer.**
            
            Update Reservation: a customer may update the date and time of pick up/drop off times for car rental reservations. Reservations may be cancelled from this tab as well.
            
            Rental history: a list of a customer's car reservations will be displayed on this tab.
    
    Employee Page - a user, verified as an employee in the RentaCar database, will be able to see a list of tabs
        Tabs include : Vehicle Search, Customer Search, and Reservation History
        
            Vehicle Search: an employee may search for a vehicle in the RentaCar database by vin number, make, model, year, or number of seats in the car. 
            A list of matching results will be displayed. If the vehicle is unavailable, the user will be asked to search a different vehicle.
            
            Customer Search: an employee may search for a customer in the RentaCar database by customer ID, or name (first and last name). 
            A list of matching results will be displayed, however if no match is found, a message will appear stating "Customer was not found."
            
            Reservation History: an employee may lookup a reservation, or a customer to access a log of a customer's car rental history with RentaCar.


Microsoft Access:
Tables: User, Customer, Employee, Address, Branch, Car, Reservation
          
          User: stores attributes such as User ID, EmployeeID, CustomerID, First Name, Last Name, Username, and Password.
          
          **A user may be a customer or an employee, but a customer/employee must be a user.**
          
          Customer: stores attributes such as User ID, Customer ID, Address ID, and Favorite Vin Number.
          
          **A customer must be a user of the program, but a user does not have to be a customer.**
          
          Employee: stores attributes such as User ID, Employee ID, Branch ID, and Position.
          
          **An employee must be a user of the program, but a user does not have to be an employee.**
          
          Address: stores attributes such as Address ID, Street, City, State, ZipCode, and Country.
          
          **An address is associated to one customer, and a customer has one address.**
          
          Branch: stores attributes such as Branch ID, Address ID, Branch Name, and Phone Number.
          
          **A branch has only one address, and an address can only be associated to one branch location.**
          
          Car: stores attributes such as VIN Number, Color, Make, Model, Year, and Number of Seats.
          **A car may be favorited by a customer, but a customer does not have to favorite a car.**
          
          Reservation: stores attributes such as Reservation ID, Customer ID, VIN Number, Branch ID, Reservation Date, Pickup Date, Pickup Time, 
          Dropoff Date, and Dropoff Time.
          
          **A customer can have many reservations, but a reservation must be associated to only one customer.**
          **A branch may be associated to many reservations, but a reservation must be associated to only one branch.**
          **A car may be associated to many reservations, but a reservation must be associated to only one car.**
          
    Tables will be implemented into the JavaFX GUI in the next phase of the project. 
          
           
 
