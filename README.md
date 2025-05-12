# Turf Mate ⚽🏟️

![Turf Mate Logo](./assets/front_page.png) <!-- Using front page as a sort of logo/banner -->

**Mini Project-III for B.Tech in Computer Engineering**
Ramrao Adik Institute of Technology (RAIT), Navi Mumbai
November 2024

---

## Overview

Turf Mate is an Android application designed to streamline the process of searching, browsing, checking availability, and booking sports turfs. It aims to provide a centralized, user-friendly platform for sports enthusiasts while offering turf managers efficient tools for managing their facilities and bookings.

---

## Problem Statement

Finding and booking sports turfs in urban areas can be inefficient and fragmented. Users often rely on scattered information across social media or word-of-mouth, leading to frustration and missed opportunities. Existing systems sometimes suffer from:

*   Lack of a centralized platform for multiple turfs.
*   Slow data retrieval and lack of real-time availability updates.
*   Poor user interfaces and difficult navigation.
*   Inadequate communication channels between users and turf managers.
*   Limited search and filtering options.
*   Inefficient booking management tools for turf owners.

Turf Mate directly addresses these challenges by offering a comprehensive, real-time, and intuitive mobile solution.

---

## Key Features

*   **User Authentication:** Secure registration and login for users.
*   **Turf Discovery:** Browse and search for turfs based on location, sport type, availability, pricing, and amenities.
*   **Real-Time Availability:** Check turf slot availability instantly to prevent double bookings.
*   **Seamless Booking:** Easy, in-app booking process with just a few taps.
*   **Turf Management Module:** Allows turf managers to add, update, and manage their turf listings, pricing, and availability.
*   **Integrated Communication:** In-app messaging feature for users to connect with turf managers for queries and confirmations.
*   **User Reviews & Ratings:** (Implied/Objective) Users can provide feedback to help others make informed decisions.
*   **Manager Dashboard:** (Implied/Objective) Tools for managers to track bookings, availability, and user interactions.

---

## Screenshots

Here are some glimpses of the Turf Mate application:

| Front Page                               | Home Page                                | Turf Details Page                          |
| :---------------------------------------: | :---------------------------------------: | :---------------------------------------: |
| ![Front Page](./docs/images/front_page.png) | ![Home Page](./docs/images/home_page.png) | ![Turf Details](./docs/images/details_page.png) |

---

## Technology Stack

*   **Platform:** Android (Min SDK: Lollipop 5.0)
*   **Language:** Java
*   **IDE:** Android Studio
*   **Backend & Database:** Firebase (Realtime Database, Firebase Authentication)
*   **APIs:** Firebase RESTful API
*   **Version Control:** Git

---

## Setup and Installation

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd TurfMate
    ```
2.  **Save Images:**
    *   Create a `docs/images` folder inside your project directory.
    *   Save the provided screenshots as `front_page.png`, `home_page.png`, and `details_page.png` inside `docs/images/`.
3.  **Firebase Setup:**
    *   Create a new project on the [Firebase Console](https://console.firebase.google.com/).
    *   Add an Android app to your Firebase project, using the package name found in `app/build.gradle`.
    *   Download the `google-services.json` configuration file.
    *   Place the `google-services.json` file in the `app/` directory of your Android project.
    *   Enable **Firebase Authentication** (e.g., Email/Password sign-in).
    *   Enable **Firebase Realtime Database**. Set up appropriate security rules for development/production.
4.  **Open in Android Studio:**
    *   Open the cloned project directory in Android Studio.
    *   Let Gradle sync and download dependencies.
5.  **Build and Run:**
    *   Connect an Android device (or use an emulator) running Android 5.0 (Lollipop) or higher.
    *   Build and run the application from Android Studio.

---

## Usage

1.  Launch the app.
2.  Tap "Get Started" on the Front Page.
3.  Register for a new account or log in if you already have one.
4.  Browse available turfs on the Home Page or use the search/notification icons.
5.  Tap "Book" on a turf card or tap the card itself to view details.
6.  On the Turf Details Page, review information like location, price, timings, and description.
7.  Tap "Book Now" to proceed with selecting a date/time slot and confirming the booking (booking flow details not shown in screenshots).
8.  Use the bottom navigation bar to switch between Chat, Home, and Account sections.
9.  (For Turf Managers) Log in and access the management section (if applicable) to add/update turf details and manage bookings.

---

## Future Scope

Potential enhancements for Turf Mate include:

*   **In-App Payment Gateway Integration.**
*   **Loyalty Programs & Membership Tiers.**
*   **Booking Calendar Integration.**
*   **Enhanced Geolocation Features & Map View.**
*   **Advanced Analytics Dashboard for Turf Managers.**
*   **Social Features:** Organizing matches, team creation, event postings.

---

## Project Team

*   Ashay Gupta (22CE1157)
*   Shrutkirti Kadam (22CE1129)
*   Vaibhav Hingnekar (22CE1121)
*   Rehan George Varghese (22CE1100)

---

## Supervision & Guidance

*   **Supervisor:** Mrs. Apurva Shinde
*   **Project Co-ordinator:** Mrs. Shweta Ashtekar
*   **Head of Department:** Dr. Amarsinh V. Vidhate
*   **Principal:** Dr. Mukesh D. Patil

---

## Acknowledgements

We thank our guides, the Head of Department, the Principal of RAIT, and everyone who supported the successful completion of this project.

---

## License

*(License information was not specified in the report. Consider adding an open-source license like MIT or Apache 2.0 if applicable.)*
