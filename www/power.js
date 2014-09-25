var power = {
    enable: function(enable, successCallback, errorCallback) {
        cordova.exec(
            successCallback, 
            errorCallback, 
            'Power',
            'wakeup', 
            []
        ); 
    },
	disable: function(enable, successCallback, errorCallback) {
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