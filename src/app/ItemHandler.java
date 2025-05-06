package app;

import javax.swing.*;
import java.awt.*;

public class ItemHandler {

 private int width = 0;
 private int height = 0;
 private JFrame frame = null;
 private Color bg_color = null;

 private JButton add_btn = null;
 private JTextField product_name_text;
 private JTextField product_quantity_text;
 private JLabel product_name_label;
 private JLabel product_quantity_label;

 private JButton add_image_icon;

 public ItemHandler(int w, int h, Color color) {
  width = w;
  height = h;
  bg_color = color;

  add_btn = new JButton();
  product_name_text = new JTextField();
  product_quantity_text = new JTextField();
  product_name_label = new JLabel("Product Name : ", SwingConstants.CENTER);
  product_quantity_label = new JLabel("Product Quantity : ", SwingConstants.CENTER);
  add_image_icon = new JButton();
 }

 public void layout() {
   add_btn.setBounds(width/2-30, height-120, 60, 30);
   add_btn.setText("add");
   add_btn.setFocusable(false);

   product_name_text.setBounds(width/2-100, height-300, 250, 25);
   product_quantity_text.setBounds(width/2-100, height-250, 250, 25);

  product_name_label.setBounds(width/2-210, height-300, 100, 25);
  product_quantity_label.setBounds(width/2-230, height-250, 150, 25);

  add_image_icon.setBounds(width/2-60, height-400, 120, 30);
   add_image_icon.setText("Add Image");
   add_image_icon.setFocusable(false);
 }


 public void show() {
  frame = new JFrame("ItemHandler");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  //frame.setResizable(false);
  frame.setLayout(null);
  frame.setSize(width, height);
  frame.getContentPane().setBackground(bg_color);
  frame.getContentPane().add(add_btn);
  frame.getContentPane().add(product_name_text);
  frame.getContentPane().add(product_quantity_text);
  frame.getContentPane().add(product_name_label);
  frame.getContentPane().add(product_quantity_label);

  frame.getContentPane().add(add_image_icon);

  frame.setLocationRelativeTo(null);
  frame.setVisible(true);
 }
}
