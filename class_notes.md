#### Intro to JetPack Compose
activity_main.xml -> ActivityMainBinding

#### Resources
Can use string resources in the kotlin file     
Toast.makeText(this, getString(R.string.toast_text), Toast.LENGTH_LONG).show()

#### Components
Snackbars are better than Toasts, they have more advanced features, like extra actions.      
Like undo on an "Email sent" notification     
Snackbar.make( // code ... ).setAction("Undo") { // code.. }.show()

#### Logging
You can see this message in the log cat, indicated by "TAG_DEMO"      
Typically, devs write a lot of logs and the production mechanism cleans them out before
the app is published       
Log.d("TAG_DEMO", "Button pressed $current")


### Keyboard 
