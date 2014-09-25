var power = {
    wakeup: function(enable, successCallback, errorCallback) {
        cordova.exec(
            successCallback, 
            errorCallback, 
            'Power',
            'wakeup', 
            []
        ); 
    },
	sleep: function(enable, successCallback, errorCallback) {
        cordova.exec(
            successCallback, 
            errorCallback, 
            'Power',
            'sleep', 
            []
        ); 
    }
}
module.exports = power;