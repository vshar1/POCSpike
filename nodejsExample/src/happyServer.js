var express = require('express');
var app = module.exports = express();

var fs = require("fs");

var port = 9080;

module.exports = {
    start: function () {
        app.get('/', function (req, res) {
            console.log("Server is being pinged ");
            fs.readFile(__dirname + "/" + "response.json", 'utf8', function (err, data) {
                res.setHeader('Content-Type', 'application/json');
                res.end(data);
            });
        });

        app.listen(port, function () {
            console.log("Server is listening at internal port [" + port + "]");
        })
    }
};
