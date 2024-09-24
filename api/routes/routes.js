import Router from 'express';
import passwordRouter from './password/password.router.js';
const router = Router();

// El método "use" redirige a la ruta passwordRouter.
router.use('/password', passwordRouter);

export default router;