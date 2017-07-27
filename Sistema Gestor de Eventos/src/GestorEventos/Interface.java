package GestorEventos;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import java.awt.Choice;
import java.awt.Scrollbar;

import javax.swing.table.DefaultTableModel;

import java.awt.ScrollPane;

import javax.swing.border.TitledBorder;
 
public class Interface extends JFrame{
	private JTextField tfBuscador;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	
	private String[] titulos = {"Nombre", "Fecha","Ubicacion", "Tipo"};

	  Object[][] casillas = {
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2"}
	      
	  };
	  
	  private String[] titulos2 = {"Nombre", "Apellido","Telefono", "Direccion","Sexo","Mail"};

	  Object[][] casillas2 = {
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer", "GradeHer","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer2", "gradeHer2","nameHer2", "gradeHer2","nameHer2", "gradeHer2"},
	      {"nameHer3", "gradeHer3","nameHer2", "gradeHer2","nameHer2", "gradeHer2"}
	      
	  };
	  private JTable table_3;
	  
    public Interface(){
 
        //Parametros asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 861, 556);
        setVisible(true);
        setTitle("Ejemplo JTabbedPane");
        getContentPane().setLayout(null);
 
        //Creamos el conjunto de pestañas
        JTabbedPane pestañas=new JTabbedPane();
        pestañas.setBounds(260, 0, 579, 500);
        

 
        //Realizamos lo mismo con el resto
        JPanel PanelEventos=new JPanel();
        pestañas.addTab("Panel Eventos", PanelEventos);
        PanelEventos.setLayout(new GridLayout(1, 0, 0, 0));
        
        JPanel panel = new JPanel();
        PanelEventos.add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(15, 16, 544, 61);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblBuscarVisitante = new JLabel("Buscar visitante");
        lblBuscarVisitante.setBounds(12, 25, 109, 20);
        panel_1.add(lblBuscarVisitante);
        
        tfBuscador = new JTextField();
        tfBuscador.setBounds(136, 16, 301, 29);
        panel_1.add(tfBuscador);
        tfBuscador.setColumns(10);
        
        JButton btnX = new JButton("X");
        btnX.setBackground(new Color(255, 0, 0));
        btnX.setBounds(441, 15, 41, 30);
        panel_1.add(btnX);
        
        JButton button = new JButton("\u2713");
        button.setBackground(new Color(0, 255, 0));
        button.setBounds(484, 14, 45, 31);
        panel_1.add(button);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
        panel_2.setBounds(15, 81, 544, 369);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblListaDeEventos = new JLabel("Lista de Eventos");
        lblListaDeEventos.setBounds(2, 0, 130, 36);
        panel_2.add(lblListaDeEventos);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(2, 31, 540, 105);
        panel_2.add(scrollPane);
        
        
        table_2 = new JTable(casillas, titulos);
        scrollPane.setViewportView(table_2);
        
        JLabel lblListaInvitados = new JLabel("Lista Invitados");
        lblListaInvitados.setBounds(2, 162, 111, 36);
        panel_2.add(lblListaInvitados);
        

        
        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(2, 194, 540, 105);
        panel_2.add(scrollPane_1);
        
        table_3 = new JTable(casillas2, titulos2);
        scrollPane_1.setViewportView(table_3);
        
        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(427, 139, 115, 29);
        panel_2.add(btnEliminar);
        
        JButton btnEliminar_1 = new JButton("Eliminar");
        btnEliminar_1.setBounds(427, 304, 115, 29);
        panel_2.add(btnEliminar_1);
        
        
	
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        btnX.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        
 
 
        getContentPane().add(pestañas);
        
               //Creamos el panel y lo añadimos a las pestañas
               JPanel PanelLlamadas=new JPanel();
               
                
                       //Añadimos un nombre de la pestaña y el panel
                       pestañas.addTab("Panel Llamadas", PanelLlamadas);
                       PanelLlamadas.setLayout(new GridLayout(1, 0, 0, 0));
                       
                       JLabel lblPrueba = new JLabel("");
                       lblPrueba.setBounds(0, 0, 262, 238);
                       getContentPane().add(lblPrueba);
                       lblPrueba.setIcon(new ImageIcon("C:\\Users\\Paul\\Pictures\\rsz_1rsz_1rsz_1rsz_3usuario-sin-foto.png"));
                       
                       JLabel lblNombre = new JLabel("Nombre:");
                       lblNombre.setBounds(10, 311, 69, 20);
                       getContentPane().add(lblNombre);
                       
                       JLabel lblApellido = new JLabel("Apellido:");
                       lblApellido.setBounds(10, 348, 69, 20);
                       getContentPane().add(lblApellido);
                       
                       JLabel lblUsuario = new JLabel("Usuario");
                       lblUsuario.setBounds(85, 254, 69, 20);
                       getContentPane().add(lblUsuario);
                       
                       


    }
 
    public static void main(String[] args) {
 
        Interface ventana=new Interface();

 
    }
}