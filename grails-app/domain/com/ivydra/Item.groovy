package com.ivydra

class Item {
    static belongsTo = [feed : Feed]
	String title
	String description
	String link
	String guid
	Date pubDate
	
    static constraints = {
    }
    
    static mapping = {
        sort pubDate:"desc"
    }
}
