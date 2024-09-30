
package interfazcontraseñas.metodos;

import javax.swing.table.DefaultTableModel;


public class recorrerTabla {
    //private Fichero metodoEscritura = new Fichero();
    private String nombreFichero;
    
    
    public void recorrerTabla (DefaultTableModel tabla){
        
        int rowNumber = tabla.getRowCount();
        //Se recorre la fila
        for(int i= 0; i<=(rowNumber-1); i++){
            //Se reccoren las columnas para sacar los valores
            for(int y= 0; y<= 1; y++){              
               //metodoEscritura.escribir("contraseñas.txt",tabla.getValueAt(i,y));
                System.out.println(tabla.getValueAt(i, y));                
            }
        }
    }
}
