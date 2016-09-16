import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;

/**
 * Created by lakeba on 9/16/16.
 */
public class ShowDialog extends AnAction {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"ENTER Message HERE");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        JOptionPane.showMessageDialog(null,"It's a Sample Test Plugin Shows Dialog");
    }
}
