const passwordController = {

    async getPassword(req, res){
        try {           
        } catch (error) {
            return res.status(500).send(error);
        }
    res.status(200).send({msg:"funcionas estupendamente"});
       
    }

}

export default passwordController;