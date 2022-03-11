const mongoose=require('mongoose');
const Schema=mongoose.Schema;
const mongooseSoftDelete=require('mongoose-delete');
const userSchema=new Schema({
    name: {
        type: String,
        trim:true,
        require:[true, 'el nombre es requerido']
    },
    age: {
        type: Number,
        min: [18, 'la edad minima es 18'],
        max: [90, 'la edad maxima es 90']
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
        type: Date,
        default:Date.now
    }

});

userSchema.plugin(mongooseSoftDelete);
module.exports=user=mongoose.model('user',userSchema);