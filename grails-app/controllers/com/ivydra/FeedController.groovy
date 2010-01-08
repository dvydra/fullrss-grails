package com.ivydra

class FeedController {
    def importer = {
        def feed = Feed.findById(params.id)
        def xmlFeed = new XmlParser().parse(feed.url)

        def addedCount = 0
        
        (0..< xmlFeed.channel.item.size()).each {
            def item = xmlFeed.channel.item.get(it)
            Item feedItem = new Item(feed: feed, title:item.title.text(), link:item.link.text(), pubDate:item.pubDate.text(), guid:item.guid.text(), description:"not yet")

            feedItem.save()
            
            
            addedCount = addedCount + 1
        }
    }
    
    def scaffold = true
}
