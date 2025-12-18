
# Hotel_Booking_Management_System

## 📌 Project Overview
This is a **Java CLI-based Hotel Booking Management System** developed as part of the **Syntecxhub Java Programming Internship (Project-2)**.  
The application enables users to manage hotel room bookings efficiently through a simple command-line interface.

---

## ✨ Features
- View all available rooms  
- Book a room by entering the room number  
- Cancel booked rooms  
- Handles invalid inputs gracefully:
  - Invalid menu choice  
  - Booking an already booked room  
  - Cancelling a non-booked room  

---

## 🛠 Technologies Used
- **Java**  
- **ArrayList** for dynamic room storage  
- **Scanner** for user input handling  

---

## ▶ How to Run
1. Open terminal/PowerShell and navigate to the project folder.  
2. Compile the program:

javac HotelBookingSystem.java

## Follow the on-screen menu:

1: View Available Rooms

2: Book a Room

3: Cancel Booking

4: Exit

# 🖥 Sample Output
--- Hotel Booking Management System ---

1. View Available Rooms
2. Book a Room
3. Cancel Booking
4. Exit
   Enter your choice: 1

Available Rooms:
Room 1
Room 2
Room 3
Room 4
Room 5
Room 6
Room 7
Room 8
Room 9
Room 10

Enter your choice: 2
Enter room number to book: 3
Room booked successfully!

Enter your choice: 1
Available Rooms:
Room 1
Room 2
Room 4
Room 5
Room 6
Room 7
Room 8
Room 9
Room 10

Enter your choice: 3
Enter room number to cancel booking: 3
Booking cancelled successfully!

#👤 Author
Raghu Ram, Intern at Syntecxhub

#📝 Notes
This is a console-based CLI application, no GUI required.
Room data is stored in ArrayList at runtime.
Handles invalid menu choices and edge cases like booking already booked rooms or cancelling unbooked rooms.

