var app = Sammy('#content', function() {
        
    this.get('#/publish-picture', function() {
    	this.partial('/publish/picture')
    })

});

jQuery(function() {
    app.run()
});