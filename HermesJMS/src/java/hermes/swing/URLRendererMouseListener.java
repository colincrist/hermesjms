/* 
 * Copyright 2003,2004 Colin Crist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package hermes.swing;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableColumnModel;

import org.apache.log4j.Logger;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: URLRendererMouseListener.java,v 1.3 2007/02/18 16:13:41 colincrist Exp $
 */

public class URLRendererMouseListener implements MouseListener
{
   private static final Logger log = Logger.getLogger(URLRendererMouseListener.class) ;
    private JTable table;

    public URLRendererMouseListener(JTable table)
    {
        this.table = table;
    }

    private void forwardEvent(MouseEvent evt)
    {
        TableColumnModel columnModel = table.getColumnModel();
        int column = columnModel.getColumnIndexAtX(evt.getX());
        int row = evt.getY() / table.getRowHeight();
        Object value;
        URLLabel button;
        MouseEvent buttonEvent;

        if (row >= table.getRowCount() || row < 0 || column >= table.getColumnCount() || column < 0)
        {
            return;
        }

        value = table.getValueAt(row, column);

        if (value instanceof URLLabel)
        {
            button = (URLLabel) value;
            buttonEvent = (MouseEvent) SwingUtilities.convertMouseEvent(table, evt, button);
            button.dispatchEvent(buttonEvent);
            table.repaint();
        }
    }

    /**
     * @see MouseListener#mouseClicked(MouseEvent)
     */
    public void mouseClicked(MouseEvent arg0)
    {
        forwardEvent(arg0);
    }

    /**
     * @see MouseListener#mousePressed(MouseEvent)
     */
    public void mousePressed(MouseEvent arg0)
    {
        forwardEvent(arg0);
    }

    /**
     * @see MouseListener#mouseReleased(MouseEvent)
     */
    public void mouseReleased(MouseEvent arg0)
    {
        forwardEvent(arg0);
    }

    /**
     * @see MouseListener#mouseEntered(MouseEvent)
     */
    public void mouseEntered(MouseEvent arg0)
    {
        forwardEvent(arg0);
    }

    /**
     * @see MouseListener#mouseExited(MouseEvent)
     */
    public void mouseExited(MouseEvent arg0)
    {
        forwardEvent(arg0);
    }

}