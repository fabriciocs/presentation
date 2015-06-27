// To run this code, edit file 
// index.html or index.jade and change
// html data-ng-app attribute from
// angle to myAppName
// ----------------------------------- 

var myApp = angular.module('presentation', [ 'angle' ]);

myApp.run(function($log) {

	$log.log('I\'m a line from custom.js');

});

myApp.config(function(RouteHelpersProvider) {

	// Custom Route definition

});

myApp.controller('SingleCtrl', [ '$scope', 'Restangular', '$log',
		function($scope, Restangular, $log) {
			$log.log(Restangular);
		} ]);

myApp.directive('oneOfMyOwnDirectives', function() {
	/* directive code */
});

myApp.config(['$stateProvider','helper',function($stateProvider, helper) {
	$stateProvider.state('app', {
		url : '/app',
		abstract : true,
		templateUrl : helper.basepath('app.html'),
		controller : 'AppController',
		resolve : helper.resolveFor('modernizr', 'icons')
	}).state('app.singleview', {
		url : '/singleview',
		controller : 'SingleCtrl',
		title : 'Single View',
		resolve : helper.resolveFor('modernizr', 'icons'),
		templateUrl : helper.basepath('singleview.html')
	}).state('app.submenu', {
		url : '/submenu',
		title : 'Submenu',
		templateUrl : helper.basepath('submenu.html')
	})
}]);
