const express=require('express');
const router=express.Router();

const User=require('../models/users');
router.post('/',function(req,res,next){
    
    const gamer1=new User({
        gamer:req.body.gamer1,
        type:req.body.type,
        id:req.body.id
    });

    const gamer2=new User({
        gamer:req.body.gamer1,
        type:req.body.type,
        id:req.body.id
    });

    const gamer3=new User({
        gamer:req.body.gamer1,
        type:req.body.type,
        id:req.body.id
    });

    user
     .save()
     .then(result=>
        res.json({
            "id": result.id,
            "type":result.type,
            "gamer":result.gamers
        }))
     .catch(err=>res.json(err));

  
         

    
});

module.exports=router;