## QuoteAsImageFBApi

This is an API to produce randomised Quotes into Image and post it on Facebook Timeline of the User with Access Token.

## Getting Your API Keys

While logged in to a Facebook account, navigate to https://developers.facebook.com/tools/explorer/.
Click on the drop down menu named 'Get Token' and select 'Get User Access Token'.
A dialog Box will open up, select all check boxes for now then click 'Get Access Token' button.
Once you do it, the field ahead of the drop-down menu gets updated with your new API key.
Copy and paste this String in Application.java class as value for 'accessToken'.

## Classes

QuotesLoader : provides random quotes , use method 'randomisedQuote()'.

QuoteToImage : take String and convert that to image. Conversion is done with some predefined settings for text,color,font etc.

PostOnFB : Takes 2 String parameter, first one is quote or any message you wish to display with your image, second paramter is for accessToken

##How To Run

Simply download or clone on your PC and run this on any IDE(intelliJ preferred).
Either execute main() method directly, this will start a localhost with port 8080.
Open browser and go to http://localhost:8080/

##Heroku Deployed
 While logged in on a Facebook account, go to https://quote-as-image-facebook-post.herokuapp.com/ to use browser version.
 You need Access Token for second field, read Section: #Getting Your API Keys.
 for First Field use String length of above 10 for quote , also entering String 'random' will post some random Quote on Facebook timeline