package GestorEventos;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Test
{
public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        JFrame vindu = new popo();
        vindu.setVisible(true);
      }
    });
  }
}

class popo extends JFrame
{
  private String[] name = {"Name", "grade"};

  Object[][] cells = {
      {"nameHer", "GradeHer"},
      {"nameHer2", "gradeHer2"},
      {"nameHer3", "gradeHer3"},
      {"nameHer", "GradeHer"},
      {"nameHer2", "gradeHer2"},
      {"nameHer3", "gradeHer3"},
      {"nameHer", "GradeHer"},
      {"nameHer2", "gradeHer2"},
      {"nameHer3", "gradeHer3"},
      {"nameHer", "GradeHer"},
      {"nameHer2", "gradeHer2"},
      {"nameHer3", "gradeHer3"}
      
  };

  public popo()
  {
    setTitle("Planettabell");
    setSize(500, 210);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JTable tabell = new JTable(cells, name);

    Container c = getContentPane();
    getContentPane().setLayout(null);
    JScrollPane scrollPane = new JScrollPane(tabell);
    scrollPane.setBounds(15, 0, 452, 149);
    c.add(scrollPane);
  }
}