package com.ivydra

class Feed {
    static hasMany = [items:Item]
    String title
    String description
    String link
    Date lastBuildDate
    String url
    String bodyElement
    String bodyClass
    
    static constraints = {
    }
    
}
