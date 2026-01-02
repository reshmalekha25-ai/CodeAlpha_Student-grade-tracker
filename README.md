# 🎓 Student Grade Tracker

A comprehensive Java-based application for managing student grades via a console interface. This tool allows educators to efficiently track, manage, and analyze student performance across multiple classes.

---

## ✨ Features

### Core Functionality
- **Student Management**: Add, remove, and search students  
- **Grade Management**: Add, update, and remove student grades  
- **Data Storage**: Uses `ArrayList` for flexible data management  
- **Calculations**: Automatic calculation of averages, highest, and lowest scores  
- **Reporting**: Comprehensive summary and class-specific reports  
- **Sorting**: Sort students by name, average, or class  

### Interface Options
- **Console Interface**: Text-based interface for terminal users  
- **Sample Data**: Pre-loaded with demonstration data  

### Advanced Features
- **Letter Grade Calculation**: Automatic A–F grading based on averages  
- **Class Organization**: Separate students by class/subject  
- **Search Functionality**: Find students by ID, name, or class  
- **Grade Validation**: Ensures grades are within valid range (0–100)  
- **Error Handling**: Robust input validation and error messages  

---

## 📁 Project Structure
Student-grade-tracker/ ├── src/ │   ├── main/ │   │   ├── ConsoleInterface.java       # Console-based user interface │   │   └── GradeManager.java           # Core business logic and data management │   ├── models/ │   │   └── Student.java                # Student model with grade calculations │   └── gui/ │       └── GradeTrackerGUI.java        # Swing-based graphical interface ├── docs/ │   └── UserGuide.md                    # Detailed user documentation ├── README.md                           # This file └── run.sh # Compilation and execution script

---

## ⚙️ Requirements

- Java Development Kit (JDK) 8 or higher  
- Java Swing (included with JDK)  
- Terminal/Command Prompt for console version  

---

## 🚀 Compilation and Execution

### Using the Provided Script (Recommended)

```bash
chmod +x run.sh
./run.sh
Manual Compilation
cd student-grade-tracker/src
javac -d ../classes models/Student.java main/GradeManager.java main/ConsoleInterface.java
java -cp ../classes main.ConsoleInterface
📖 Usage Guide — Console Interface
The console interface provides a menu-driven system with the following options:
- Add New Student: Enter student details and optionally add grades
- View All Students: Display all students with their statistics
- Search Student: Find students by ID, name, or class
- Manage Grades: Add, remove, or update student grades
- Class Reports: Generate reports for specific classes
- Summary Report: View overall system statistics
- Sort Students: Sort by different criteria
- Exit: Close the application

💡 Future Enhancements
- GUI version using JavaFX
- Database integration for persistent storage
- Export reports to CSV or PDF
Sample output:
MAIN MENU
========================================
1. Add New Student
2. View All Students
3. Search Student
4. Manage Grades
5. Class Reports
6. Summary Report
7. Sort Students
8. Exit
========================================
Enter your choice: 4
Student ID: 1003
1. Add grade
2. Remove grade
3. Back
Choice: 1
Grade: 98
1. Add grade
2. Remove grade
3. Back
Choice: 3

Press Enter to continue...

========================================
MAIN MENU
========================================
1. Add New Student
2. View All Students
3. Search Student
4. Manage Grades
5. Class Reports
6. Summary Report
7. Sort Students
8. Exit
========================================
Enter your choice: 5
1. 12th
2. Science
3. Math
Select class: 1
CLASS REPORT: 12th
ID: 1003 | Name: reshma reshma | Class: 12th | Grades: 1 | Average: 98.00 | Letter Grade: A
ID: 1004 | Name: riya riya | Class: 12th | Grades: 0 | Average: 0.00 | Letter Grade: F


Press Enter to continue...

========================================
MAIN MENU
========================================
1. Add New Student
2. View All Students
3. Search Student
4. Manage Grades
5. Class Reports
6. Summary Report
7. Sort Students
8. Exit
========================================
Enter your choice: 6
Total students: 4
