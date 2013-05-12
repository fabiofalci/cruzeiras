var app = Sammy('#content', function() {
        
    this.get('#/publish-picture', function() {
    	this.partial('/publish/picture')
    })

    this.get('#/information', function() {
    	this.partial('/information')
    })

    this.get('#/groups', function() {
    	this.$element().html("<span class='label label-success'>Groups!</span>")
    })

});

jQuery(function() {
    app.run()
});