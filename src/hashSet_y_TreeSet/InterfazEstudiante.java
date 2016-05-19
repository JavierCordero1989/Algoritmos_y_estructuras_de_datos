/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashSet_y_TreeSet;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 * Ejemplo que usa las clases Hashtable y TreeSet
 * @author Javi Cordero
 */
public class InterfazEstudiante extends javax.swing.JFrame {

    private Hashtable tablaHash;
    
    public InterfazEstudiante() 
    {
        initComponents();
        
        /* Crea una nueva tabla hash. */
        tablaHash = new Hashtable();
        ejemplos(); //Agregar cinco ejemplos al Hashtable tablaHash.
        
        setLocationRelativeTo(null);
    }

    /* Este método agregar cinco objetos de tipo Estudiante a la tabla de hash, 
    se deben agregar a la tabla de hash la llave que identifica el objeto y
    el objeto. */
    public void ejemplos()
    {
        Estudiante estudiante1 = new Estudiante("1", "Javier");
        Estudiante estudiante2 = new Estudiante("2", "Andres");
        Estudiante estudiante3 = new Estudiante("3", "Sara");
        Estudiante estudiante4 = new Estudiante("4", "Veronica");
        Estudiante estudiante5 = new Estudiante("5", "Roberto");
        
        /* Se puede apreciar que se envía la cédula como llave, y luego el objeto
        como parámetros. */
        agregarEstudiantes(estudiante1.getCedula(), estudiante1);
        agregarEstudiantes(estudiante2.getCedula(), estudiante2);
        agregarEstudiantes(estudiante3.getCedula(), estudiante3);
        agregarEstudiantes(estudiante4.getCedula(), estudiante4);
        agregarEstudiantes(estudiante5.getCedula(), estudiante5);
    }
    
    /* Recibe la cédula, que será la llave del objeto en la tabla de hash y el objeto
    de tipo Estudiante. */
    public void agregarEstudiantes(String cedula, Estudiante estudiante)
    {
        /* Se agregan mediante el método push. */
        tablaHash.put(cedula, estudiante);
    }
    
    /* Este es un método que recibe una colección como parámetro e itera a través 
    de la colección para imprimir uno a uno sus elementos. */
    public String imprimirTabla(Collection coleccion)
    {
        String info = "";
        
        /* Crea el iterador de la colección. Es el elemento que se utiliza para
        recorrer la lista elemento por elemento. */
        Iterator iterador = coleccion.iterator();
        
        /* Objeto de tipo Estudiante para ir procesando cada objeto en la colección. */
        Estudiante e = null;
        
        /* Mientras que el iterador contenga un elemento siguiente. */
        while(iterador.hasNext())
        {
            /* Obtiene el elemento siguiente de la colección y hace un casting 
            al tipo Estudiante para guardarlo en la variable declarada en la 
            línea 72. */
            e = (Estudiante)iterador.next();
            
            /* Si el iterador no tiene elemento siguiente, imprime el ultimo elemento
            con un punto al final, de lo contrario imprimirá un salto de línea. */
            if(!iterador.hasNext())
            {
                info += (e.getCedula() + " - " + e.getNombre() + ". ");
            }
            else
            {
                info += (e.getCedula() + " - " + e.getNombre() + "\n");
            }
        }//Fin del while.
        
        return info;
    }//Fin del metodo imprimirTabla.
    
    /* Ordena la tabla de hash por nombres mediante la clase Compara. */
    public void ordenarPorNombre()
    {
        /* Se crea un objeto TreeSet que ordenará sus datos por orden alfabetico. */
        TreeSet treeSet = new TreeSet(new Comparador());
        
        /* Agregar los datos de la tabla de hash al treeSet. */
        treeSet.addAll(tablaHash.values());
        
        /* Imprime la colección, mediante el método imprimirTabla. */
        System.out.println("Elementos ordenados:\n" + imprimirTabla(treeSet));
    }//Fin del metodo ordenarPorNombre.

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar_BarraMenu = new javax.swing.JMenuBar();
        jMenu_Estudiantes = new javax.swing.JMenu();
        jMenuItem_AgregarNuevo = new javax.swing.JMenuItem();
        jMenuItem_Ordenar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu_Estudiantes.setText("Estudiantes");

        jMenuItem_AgregarNuevo.setText("Agregar nuevo");
        jMenuItem_AgregarNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_AgregarNuevoActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem_AgregarNuevo);

        jMenuItem_Ordenar.setText("Ordenar por nombre");
        jMenuItem_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_OrdenarActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem_Ordenar);

        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu_Estudiantes.add(jMenuItem1);

        jMenuBar_BarraMenu.add(jMenu_Estudiantes);

        setJMenuBar(jMenuBar_BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_AgregarNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_AgregarNuevoActionPerformed
        /* A la interfaz de agregarNuevo se le pasa la tabla de hash completa, para
        que se puedan agregar nuevos regsitros a esa tabla desde esa interfaz. */
        AgregarNuevo agregarNuevo = new AgregarNuevo(tablaHash);
        agregarNuevo.setVisible(true);
    }//GEN-LAST:event_jMenuItem_AgregarNuevoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        /* Guarda la cédula del estudiante que se quiere eliminar por el usuario. */
        String cedula = JOptionPane.showInputDialog(null, "Ingrese la cedula del estudiante que desea eliminar.");
        
        /* Si la tabla de hash contiene el elemento con esa cédula. */
        if(tablaHash.containsKey(cedula))
        {
            /* Remueve un objeto mediante la cédula, es decir, la llave del objeto
            almacenado en la tabla. */
            tablaHash.remove(cedula);
            JOptionPane.showMessageDialog(null, "El estudiante se ha eliminado.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El estudiante que busca no existe.");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_OrdenarActionPerformed
        // TODO add your handling code here:
        ordenarPorNombre();
    }//GEN-LAST:event_jMenuItem_OrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar_BarraMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem_AgregarNuevo;
    private javax.swing.JMenuItem jMenuItem_Ordenar;
    private javax.swing.JMenu jMenu_Estudiantes;
    // End of variables declaration//GEN-END:variables
}
