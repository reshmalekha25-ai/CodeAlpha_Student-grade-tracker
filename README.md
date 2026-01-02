Student Grade Tracker

A comprehensive Java-based application for managing student grades  console  interface. This application allows educators to efficiently track, manage, and analyze student performance across multiple classes.


Features

Core Functionality
• **Student Management**: Add, remove, and search students
• **Grade Management**: Add, update, and remove student grades
• **Data Storage**: Uses ArrayList for flexible data management
• **Calculations**: Automatic calculation of averages, highest, and lowest scores
• **Reporting**: Comprehensive summary and class-specific reports
• **Sorting**: Sort students by name, average, or class


Interface Options
• **Console Interface**: Text-based interface for terminal users
• **Sample Data**: Pre-loaded with demonstration data


Advanced Features
• **Letter Grade Calculation**: Automatic A-F grading based on averages
• **Class Organization**: Separate students by class/subject
• **Search Functionality**: Find students by ID, name, or class
• **Grade Validation**: Ensures grades are within valid range (0-100)
• **Error Handling**: Robust input validation and error messages


Project Structure

student-grade-tracker/
\u251c\u2500\u2500 src/
\u2502   \u251c\u2500\u2500 main/
\u2502   \u2502   \u251c\u2500\u2500 ConsoleInterface.java      # Console-based user interface
\u2502   \u2502   \u2514\u2500\u2500 GradeManager.java          # Core business logic and data management
\u2502   \u251c\u2500\u2500 models/
\u2502   \u2502   \u2514\u2500\u2500 Student.java               # Student model with grade calculations
\u2502   \u2514\u2500\u2500 gui/
\u2502       \u2514\u2500\u2500 GradeTrackerGUI.java       # Swing-based graphical interface
\u251c\u2500\u2500 docs/
\u2502   \u2514\u2500\u2500 UserGuide.md                   # Detailed user documentation
\u251c\u2500\u2500 README.md                          # This file
\u2514\u2500\u2500 run.sh                             # Compilation and execution script


Requirements
• Java Development Kit (JDK) 8 or higher
• Java Swing (included with JDK)
• Terminal/Command Prompt for console version


Compilation and Execution

Using the Provided Script (Recommended)
1. Make the script executable:
```bash
chmod +x run.sh
```

2. Run the application:
```bash
./run.sh
```


Manual Compilation
1. Compile all Java files:
```bash
cd student-grade-tracker/src
javac -d ..\classes models\Student.java main\GradeManager.java main\ConsoleInterface.java

```

2. Run Console Version:
```bash
java main.ConsoleInterface

Usage Guide

Console Interface

The console interface provides a menu-driven system with the following options:

1. **Add New Student**: Enter student details and optionally add grades
2. **View All Students**: Display all students with their statistics
3. **Search Student**: Find students by ID, name, or class
4. **Manage Grades**: Add, remove, or update student grades
5. **Class Reports**: Generate reports for specific classes
6. **Summary Report**: View overall system statistics
7. **Sort Students**: Sort by different criteria
8. **Exit**: Close the application


