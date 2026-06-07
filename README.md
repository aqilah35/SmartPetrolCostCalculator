# Smart Petrol Cost Calculator with BUDI MADANI Rebate

## Overview

Smart Petrol Cost Calculator with BUDI MADANI Rebate is a mobile application developed as part of the ICT602 Mobile Technology course individual assignment.

This application helps users estimate their petrol expenses in Malaysia and calculate the BUDI MADANI fuel subsidy rebate for eligible users. The system computes the total petrol cost, rebate amount, and total savings based on the user’s input.

---

## Features

### Home Page
- Select petrol type:
  - RON95
  - RON97
  - Diesel
- Enter petrol price per liter (RM)
- Enter fuel usage (liters)
- Select BUDI MADANI eligibility status (Yes/No)
- Calculate total petrol cost
- Calculate BUDI MADANI rebate
- Display total savings

### About Page
- Application icon
- Author information
- Copyright notice
- GitHub repository URL

### Navigation Menu
- Home
- About

---

## Technologies Used

- Kotlin
- Android Studio
- Android SDK
- XML Layout
- Material Design Components
- AndroidX Libraries
- Gradle Build System

---

## Android Requirements

| Requirement | Version |
|------------|---------|
| Minimum Android Version | Android 10 (API Level 29) |
| Android Studio | Latest Version |
| JDK | Version 8 or Higher |

---

## Installation

### Clone the Repository

```bash
git clone https://github.com/aqilah35/SmartPetrolCostCalculator.git
```

### Open the Project in Android Studio

1. Open Android Studio.
2. Select **Open**.
3. Select "Open an Existing Project"
4. Choose the project folder "Smart Petrol Cost Calculator".
5. Wait for Gradle synchronization to complete, it may take a few minutes.
6. Connect an Android device or launch an emulator.
7. Click the "Run" button (green triangle) in Android Studio.

No additional API keys or external services are required.

---

## Project Structure

```
text
SmartPetrolCostCalculator/
│
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/
│   │       │   └── com.example.smartpetrolcostcalculator/
│   │       │       ├── MainActivity.kt
│   │       │       └── AboutActivity.kt
│   │       │
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   ├── menu/
│   │       │   ├── drawable/
│   │       │   ├── mipmap/
│   │       │   └── values/
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
├── gradle/
├── build.gradle
├── settings.gradle
└── README.md
```

---

## Input Parameters

The application accepts the following inputs:

| Input | Description |
|---------|-------------|
| Petrol Type | RON95, RON97, or Diesel |
| Petrol Price | Petrol price per liter (RM) |
| Fuel Usage | Total fuel usage in liters |
| Eligibility Status | BUDI MADANI eligibility (Yes/No) |

---

## Calculation Formula

### Total Petrol Cost

```text
Total Petrol Cost = Fuel Usage × Petrol Price per Liter
```

### BUDI MADANI Rebate

```text
BUDI Rebate = Fuel Usage × RM1.99
```

*Applicable only to eligible RON95 users.*

### Total Savings

```text
Total Savings = Total Petrol Cost − BUDI Rebate
```

---

## Example Usage

### Input

| Item | Value |
|--------|--------|
| Petrol Type | RON95 |
| Petrol Price per Liter | RM4.27 |
| Fuel Usage | 40 Liters |
| BUDI MADANI Eligibility | Yes |

### Calculation

```text
Step 1

Total Petrol Cost
= Fuel Usage × Petrol Price

= 40 × RM4.27
= RM170.80
```

```text
Step 2

BUDI Rebate
= Fuel Usage × RM1.99

= 40 × RM1.99
= RM79.60
```

```text
Step 3

Total Savings
= Total Petrol Cost − BUDI Rebate

= RM170.80 − RM79.60
= RM91.20
```

### Output

```text
Total Petrol Cost : RM170.80
BUDI Rebate       : RM79.60
Total Savings     : RM91.20
```

---

## Screenshots

### Home Page
![Home Page] (<img src="https://github.com/user-attachments/assets/d357b204-702a-4c73-a804-caf9db3dcc2f" />)



### About Page
![About Page] (<img src="https://github.com/user-attachments/assets/575a4c87-608c-4a13-98c5-bbe3012002e4" />)



## Author Information

**Name:** Siti Nur Aqilah Binti Shamri

**Course:** ICT602 – Mobile Technology

**Institution:** Universiti Teknologi MARA (UiTM)

**Year:** 2026

---

## Copyright

```text
© 2026 Siti Nur Aqilah Binti Shamri.
All Rights Reserved.
```

---

## GitHub Repository

Repository URL:

```text
https://github.com/aqilah35/SmartPetrolCostCalculator

```

---

## Future Enhancements

- Support for multiple subsidy schemes
- Dark mode support
- Improved UI design
- Data persistence using local storage


---

## Contribution

Contributions are welcome.

To contribute:

1. Fork the repository.
2. Create a new feature branch.

```bash
git checkout -b feature-name
```

3. Commit your changes.

```bash
git commit -m "Add new feature"
```

4. Push the branch.

```bash
git push origin feature-name
```

5. Create a Pull Request.

---

## License

This project is licensed under the MIT License. See the LICENSE file for details.
