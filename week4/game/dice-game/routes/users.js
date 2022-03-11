var express = require('express');
const users = require('../models/users');
var router = express.Router();
const User=require('../models/users');
/* GET users listing. */
router.get('/', function(req, res, next) {
  const data=User.find({
    $or:[
      {'deleted':{$eq:false}},
      {'deleted':{$exists:false}},
    ]
  });
  data.then(result=>res.json(result)).catch(err=>console.log(err));
});


module.exports = router;
