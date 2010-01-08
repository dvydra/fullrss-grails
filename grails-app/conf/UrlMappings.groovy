class UrlMappings {
    static mappings = {
      "/$controller/$action?/$id?"{
	      constraints {
			 // apply constraints here
		  }
	  }
	  "/feed/import/$id" {
	      controller = "feed"
	      action = "importer"
	  }
      "/"(view:"/index")
	  "500"(view:'/error')
	}
}
