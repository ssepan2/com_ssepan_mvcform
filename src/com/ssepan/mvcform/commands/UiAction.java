package com.ssepan.mvcform.commands;

import java.awt.event.ActionEvent;
//import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.AbstractAction;
//import static javax.swing.Action.*;
import javax.swing.*;

/**
 *
 * @author ssepan
 */
@SuppressWarnings("serial")
public class UiAction
    extends AbstractAction
{
    //Note:need Java 8 (JDK 1.8) to do lambdas
    //Runnable  _delegate = () -> { dosomething(); }
    Runnable _delegate;

    /**
     * 
     * @param text
     * @param icon
     * @param desc
     * @param mnemonic
     * @param accelerator
     */
    public UiAction
    (
        String text,
        ImageIcon icon,
        String desc,
        Integer mnemonic,
        KeyStroke accelerator
    )
    {
        super(text, icon);
        putValue(SHORT_DESCRIPTION, desc);
        putValue(MNEMONIC_KEY, mnemonic);
        putValue(ACCELERATOR_KEY, accelerator);
    }
    
    /**
     *
     * @param text
     * @param icon
     * @param desc
     * @param mnemonic
     * @param accelerator
     * @param delegate
     */
    public UiAction
    (
        String text,
        ImageIcon icon,
        String desc,
        Integer mnemonic,
        KeyStroke accelerator,
        Runnable delegate
    )
    {
        this(text, icon, desc, mnemonic, accelerator);
        _delegate = delegate;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        _delegate.run();
    }
    
    /**
     *
     * @param uiAction
     * @param buttonsAndMenus
     */
    public static void initActionUi
    (
        AbstractAction uiAction,
        List<AbstractButton> buttonsAndMenus
    )
    {
        if (buttonsAndMenus != null)
        {
            for (AbstractButton abstractButton : buttonsAndMenus)
            {
                abstractButton.setAction(uiAction);
            }
        }
    }
}
