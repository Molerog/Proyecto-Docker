import { getPasswordFromApi } from "./password.bll.js";

const passwordController = {

    async getPassword(req, res){
        try {           
            const password = await getPasswordFromApi();            
            res.status(200).send(password);
        } catch (error) {
            return res.status(500).send(error);
        }      
    }

}

export default passwordController;