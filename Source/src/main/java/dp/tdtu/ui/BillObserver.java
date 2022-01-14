
package dp.tdtu.ui;

import javax.swing.JFrame;


public abstract class BillObserver extends JFrame{
    protected BillJFrame billJframe;
    protected abstract void update();
}
