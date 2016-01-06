# MyRep

How to run this project

* Open the project in Android Studio. 
* Goto Java -> HTMLActivity
* Inside HTMLActivity, the primary method is called as init_html_screen(arg_url, arg_title).
* The init_url_screen(url, title) method is invoked from inside the onCreate method.
* The 'url' is defined as global variable and is set to "http://youtube.com" by default. You can change it to a different URL.
* Similarly, 'title' is set to "FAQs" by default and can be changed if needed.
* On running the app, the ActorActivity will appear. Hence a screen will appear with "Frequently Asked Questions" button.
* Click this button and you will be redirected to the HTMLActivity, which will show the set HTML file or the webpage.
