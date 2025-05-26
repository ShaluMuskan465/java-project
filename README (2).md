# ✉️Email-System-using-📁File-Handling-Console-based
A simple Java console-based Email System where users can compose, send, view, and delete emails. All data is stored in a local text file using File I/O. This project demonstrates OOP concepts, layered architecture, and basic CRUD operations in Java.

# Features
- Send emails between users
- View sent and received emails
- View inbox (only received emails)
- Delete emails

# How to Run
1. Clone the repository: git clone https://github.com/G-SHWETA55/Email-System-using-File-Handling.git
2. Navigate to the project directory: cd email-system
3. Compile the Java code: javac *.java
4. Run the application: java EmailSystem

# 🔧 Requirements
- Java JDK 8 or later
- Any Java IDE (VS Code / IntelliJ / Eclipse) or
- Terminal + Text Editor (Notepad++, Sublime, etc.)

# Usage
1. Launch the application and follow the menu prompts
2. Choose an option:
   - 📩 Send Email: Compose and send an email to another user
   - 📮 View Inbox: View emails in your inbox
    - 📨View Received Emails: View emails received by you
    - 🗑️Delete Email: Delete an email from your inbox
    - 📤Exit: Quit the application

# Project Structure

EmailSystem/  
├── EmailSystem.java        # Main class (UI & Menu)  
├── Email.java              # Model class  
├── EmailDAO.java           # File handling (DAO layer)  
├── EmailService.java       # Business logic (Service layer)  
├── emails.txt              # Data file (auto-created)  
├── images/                 # Screenshots  
└── README.md               # Project documentation

# 
