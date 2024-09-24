import Router from 'express';
import passwordController from './passwordController.js';

const router = Router();

router.get('/getPassword', passwordController.getPassword);

export default router