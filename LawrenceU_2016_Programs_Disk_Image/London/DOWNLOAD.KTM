// Version KEA! 4.10
// This causes LYNX to coumt through the hitlist of a British
//Library hitlist until it gets to the NEXT button.  Then it saves
//the hitlist and triggers the NEXT button, which puts you at the
//top of the next hitlist.   Notice that it uses bl.ktm to count
//down the hitlist.  Use a special key to invoke it.

   CR = "^M"
  
	

   Run ( "bl" )

	Send( "p" )

   Match( "Save to a local file" )
	 
   Send( CR )

	Match(  "filename:" )
   send ( "verg" + CR )  
   
   Match( "version?" )
   Send( "y" + CR ) 

   //Match( "only." )  


 
