const express=require('express');
const router=express.Router();

const User=require('../models/users');
router.post('/',function(req,res,next){
    const user=new User({
        name:req.body.name,
        age: req.body.age
    });

    user
     .save()
     .then(result=>res.json(result))
     .catch(err=>res.json(err));
    console.log(req.body.name);
});

module.exports=router;