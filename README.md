# Core_Stock_App

Libraries Used
--------------
* [Architecture][10] - Start with classes for managing your UI component lifecycle and handling data
  persistence.
  * [Lifecycles][12] - Create a UI that automatically responds to lifecycle events.
  * [Repository][18] - Repository modules handle data operations.
  * [ViewModel][17] - Easily schedule asynchronous tasks for optimal execution.
* [UI][30] - Details on why and how to use UI Components in your apps - together or separate
  * [Jetpack Compose][34] - A basic unit of composable UI.
* Third party and miscellaneous libraries
  * [Retrofit][90] for turns your HTTP API into a Java interface
  * [Room][94] Apps that handle non-trivial amounts of structured data can benefit greatly from persisting that data locally.
  * [opencsv][91] CSV (Comma Separated Values) format is a very popular import and export format used in spreadsheets and databases.
  * [compose-destinasions][11] A KSP library that processes annotations and generates code that uses Official Jetpack Compose Navigation under the hood. It hides the complex, non-type-safe and boilerplate code you would have to write otherwise.
  * [Dagger-Hilt][93] Hilt is the recommended solution for dependency injection in Android apps, and works seamlessly with Compose.
  
  
[10]: https://developer.android.com/jetpack/compose/architecture
[11]: https://github.com/raamcosta/compose-destinations
[12]: https://developer.android.com/jetpack/compose/lifecycle
[17]: https://developer.android.com/jetpack/compose/state#viewmodel-state
[18]: https://developer.android.com/jetpack/guide#fetch-data
[30]: https://developer.android.com/jetpack/compose/tutorial
[34]: https://developer.android.com/jetpack/compose
[90]: https://square.github.io/retrofit/
[91]: https://chetangupta.net/db-to-csv/
[93]: https://developer.android.com/jetpack/compose/libraries#hilt
[94]: https://developer.android.com/training/data-storage/room
