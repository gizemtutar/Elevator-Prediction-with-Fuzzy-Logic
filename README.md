
# Fuzzy Logic Project - Elevator Waiting Floor Determination

## Project Description
This project was prepared as part of the **Introduction to Fuzzy Logic and Artificial Neural Networks** course. The aim of the project is to determine the floor where an elevator should wait by evaluating variables such as traffic type and the number of passengers waiting on each floor using a fuzzy logic model.

---

## Technologies Used
- **Java**: Used for application development.
- **Eclipse IDE**: Coding and development environment.
- **JfuzzyLogic Library**: Used to create and execute the fuzzy logic model.

---

## Project Features
1. User inputs traffic type (upward-heavy, downward-heavy, balanced) and the number of passengers.
2. Inputs are sent to an FCL file prepared using JfuzzyLogic.
3. The FCL file determines the elevator waiting floor using fuzzy logic rules.
4. The output is displayed on the application screen.

---

## Required Files
- **Code Files**: Java codes are included in the Eclipse project.
- **FCL File**: Contains fuzzy model rules for JfuzzyLogic.
- **Report**: Includes the theoretical background of the project, membership functions used, and detailed explanations about inputs/outputs.

---
## Project Structure
```
Project Folder:
├── src/
│   ├── Main.java         # Main class of the project
│   └── ElevatorModel.java # Fuzzy model class
├── fuzzy/
│   └── elevator_model.fcl # FCL file
├── report.pdf             # Detailed project report
└── README.md             # Project introduction
```

---

## Installation and Execution
1. **Download and Install Eclipse IDE**: [Download Eclipse IDE](https://www.eclipse.org/downloads/)
2. **Open Project Files**: Open the project via Eclipse.
3. **Add JfuzzyLogic Library**: Include the JfuzzyLogic .jar file in the project.
   - [JfuzzyLogic GitHub](https://github.com/amel-github/fuzzy)
4. **Include FCL File**: Place the `elevator_model.fcl` file in the project path.
5. **Run Main.java**: Run the project via Eclipse IDE and provide user inputs.

---
## Example Input and Output

### Example Input
1. **Traffic Type**: Upward-heavy
2. **Number of Passengers**: 15

### Example Output
- **Elevator Waiting Floor**: 5

