# 📱 Kotlin Android Clean Architecture Template

A modern Android starter template using **Kotlin**, **Jetpack Compose**, **MVI architecture**, **Hilt for DI**, and **modular Clean Architecture**. Designed to be scalable, testable, and developer-friendly.

## 📦 Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **MVI (Model-View-Intent)**
- **Hilt (Dependency Injection)**
- **Room** (Local database)
- **Retrofit + OkHttp** (Networking)
- **Coil** (Image loading)
- **Navigation Compose**
- Modular project structure with Clean Architecture principles

## 🚀 Getting Started

1. **Clone this template**
   ```bash
   git clone https://github.com/rizkisepriadi/template-compose-mvi-cleanarch.git
   cd template-compose-mvi-cleanarch
   
2. **Change module name and package**
   - Use Android Studio’s Refactor > Rename to change the package. 
   - Search and replace com.yourcompany.template with your desired package.
   
3. **Run the project**
   - Sync Gradle and run on any emulator or device with Android 8.0+.

## 🛠 Features

- Modularization
- State management using MVI pattern
- Navigation using Navigation Compose
- ViewModels scoped via Hilt
- Built-in networking and local persistence
- Sample UI using Material3

## 🧪 Testing

- Unit tests with JUnit
- Mocking with Mockito
- Architecture ready for UI testing