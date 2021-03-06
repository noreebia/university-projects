/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;
import javax.swing.ImageIcon;
import Model.*;
import Control.*;
/**
 *
 * @author 이상명'spc
 */
public class A_BasicForm extends B_BasicForm { //알촌종족 메인프레임입니다.
    
    private ImageIcon spImage;
    /**
     * Creates new form A_BasicForm
     */
    public A_BasicForm() {
        initComponents();
    }
    
    public A_BasicForm(Player p,GameThread thread, UnitControl umc){
        this();
        this.p = p;
        this.thread = thread;
        this.umc = umc;
        this.gg = new GameEnd(this,p);
        frameModi();
        mySetting();
        enemySetting();
        synchronization();
    }
    
    public void frameModi(){ //상속받은 프레임을 개조해주는 메소드.
        this.setTitle("Clash Of Foods");
        this.spName.setText("알촌");
        spImage = new ImageIcon(getClass().getResource("/image/알촌로고.jpg"));
        this.spImageLabel.setIcon(spImage);
        this.pMoneyLabel.setText(Integer.toString(p.getPlayerMon()));
        this.pHpLabel.setText(Integer.toString(p.getPlayerHp()));
    } 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
