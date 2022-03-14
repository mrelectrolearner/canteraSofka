const mongoose=require('mongoose');
const Schema=mongoose.Schema;
const mongooseSoftDelete=require('mongoose-delete');
const userSchema=new Schema({
    id:{
        type:String,
        require: [true, 'id is required']
    },
    gamers: {
        type: [String],
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