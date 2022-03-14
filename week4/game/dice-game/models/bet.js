const mongoose=require('mongoose');
const Schema=mongoose.Schema;
const mongooseSoftDelete=require('mongoose-delete');
const betSchema=new Schema({
    id:{
        type:String,
        require: [true, 'id is required']
    },
    gamerBet: {
        type: json,
        trim:true,
        require:[true, "gamer's name is required"]
    },
    type:{
        type: String,
        trim:true,
        require:false
    },
    createdAt:{
        type:Date,
        default:Date.now
    },
    updatedAt:{
        type:Date,
        default:Date.now
    },
    deleteAt:{  
        type: Date
    }

});

userSchema.plugin(mongooseSoftDelete);
module.exports=user=mongoose.model('user',userSchema);


