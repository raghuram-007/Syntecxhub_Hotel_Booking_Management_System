
#📚 Hotel Booking Management System
This is a Java CLI-based Hotel Booking Management System developed for the Syntecxhub Internship.

It allows users to view available rooms, book rooms, and cancel bookings. The program uses ArrayList to store room data and includes input validation and proper handling of edge cases.

#✨ Features
➕ View all available rooms
➕ Book rooms by entering room number
❌ Cancel booked rooms by entering room number
⚠️ Handles invalid inputs gracefully (invalid menu choice, already booked room, or cancelling unbooked room)
🗂 Project Structure

Syntecxhub_Hotel_Booking_Management_System/
│
├── HotelBookingSystem.java       # Main program (CLI)
└── README.md                     # Project description and instructions

▶️ How to Run
Open terminal/PowerShell and navigate to the project folder.
Compile the program:
```bash
javac HotelBookingSystem.java
````

Run the program:

```bash
java HotelBookingSystem
```

Follow the menu prompts in the console.

#🖥 Sample Output
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

