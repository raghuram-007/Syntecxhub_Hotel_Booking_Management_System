import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    boolean isBooked;

    Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.isBooked = false;
    }
}

public class HotelBookingSystem {

    static ArrayList<Room> rooms = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize rooms
        for (int i = 1; i <= 10; i++) {
            rooms.add(new Room(i));
        }

        while (true) {
            System.out.println("\n--- Hotel Booking Management System ---");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next();
                continue;
            }

            switch (choice) {
                case 1:
                    viewAvailableRooms();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    System.out.println("Thank you for using the system.");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static void viewAvailableRooms() {
        boolean found = false;
        System.out.println("\nAvailable Rooms:");
        for (Room room : rooms) {
            if (!room.isBooked) {
                System.out.println("Room " + room.roomNumber);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No rooms available.");
        }
    }

    static void bookRoom() {
        System.out.print("Enter room number to book: ");
        int roomNo = sc.nextInt();

        for (Room room : rooms) {
            if (room.roomNumber == roomNo) {
                if (!room.isBooked) {
                    room.isBooked = true;
                    System.out.println("Room booked successfully!");
                } else {
                    System.out.println("Room is already booked.");
                }
                return;
            }
        }
        System.out.println("Invalid room number.");
    }

    static void cancelBooking() {
        System.out.print("Enter room number to cancel booking: ");
        int roomNo = sc.nextInt();

        for (Room room : rooms) {
            if (room.roomNumber == roomNo) {
                if (room.isBooked) {
                    room.isBooked = false;
                    System.out.println("Booking cancelled successfully!");
                } else {
                    System.out.println("Room is not booked.");
                }
                return;
            }
        }
        System.out.println("Invalid room number.");
    }
}
