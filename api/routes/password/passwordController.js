const passwordController = {

    async getPassword(req, res){
        try {
            console.log('hola');
            
        } catch (error) {
            return res.status(500).send(error);
        }
    res.status(200).send({msg:"funcionas estupendamente"});
       
    }

}

export default passwordController;