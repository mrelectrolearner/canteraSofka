const express=require('express');
const router=express.Router();

const User=require('../models/users');

router.delete('/:id',function(req,res,next){
    User.deleteById(req.params.id)
    .then(result=>res.json(result))
    .catch(err=>res.json(err));
})