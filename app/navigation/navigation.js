/**
 * Created by shruti on 10/7/16.
 */
import angular from 'angular';

'use strict';
import './navigation.html';

(function() {


    angular.module('myApp.navBar', ['ngRoute'])
        .config(['$routeProvider', function($routeProvider){
            $routeProvider.when('/navigation',{
                templateUrl: 'navigation/navigation.html',
                controller: 'NavCtrl'
            });
        }])
        .controller('NavCtrl', [function() {

        }]);

        
    function NavCtrl($scope) {
        $scope.currentNavItem = 'Invitar';
    }
 })();

// angular.module('App', ['ngMaterial'])
//     .config(function($mdThemingProvider) {
//         $mdThemingProvider.theme('default')
//             .primaryPalette('pink')
//             .accentPalette('orange');
//     });

//
// angular.module('myApp.home', ['ngRoute'])
//
//     .config(['$routeProvider', function($routeProvider) {
//         $routeProvider.when('/home', {
//             templateUrl: 'home/home.html',
//             controller: 'homeCtrl'
//         });
//     }])
//
//     .controller('homeCtrl', [function() {
//
//     }]);