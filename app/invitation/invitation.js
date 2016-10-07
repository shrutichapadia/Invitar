'use strict';

angular.module('myApp.invitation', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/invitation', {
    templateUrl: 'invitation/invitation.html',
    controller: 'invCtrl'
  });
}])

.controller('invCtrl', [function() {

}]);