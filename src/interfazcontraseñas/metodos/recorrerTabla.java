
package interfazcontraseñas.metodos;

import javax.swing.table.DefaultTableModel;


public class recorrerTabla {
    private Fichero metodoEscritura = new Fichero();
    private String nombreFichero;
    
    
    public void recorrerTabla (DefaultTableModel tabla){
        
        int rowNumber = tabla.getRowCount();
        for(int i= 0; i<=(rowNumber-1); i++){
            for(int y= 0; y<= 1; y++){              
               metodoEscritura.escribir("contraseñas.txt",tabla.getValueAt(i,y));
                System.out.println(tabla.getValueAt(i, y));                
            }
        }
    }
}
