/* 
 * Copyright 2003,2004,2005 Colin Crist
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

package hermes.renderers;

import hermes.util.MessageUtils;
import hermes.util.XmlUtils;

import java.awt.Font;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.swing.JComponent;
import javax.swing.JEditorPane;

import org.apache.log4j.Logger;

/**
 * A renderer that displays toString() on a JMS message in a text area.
 * 
 * @author colincrist@hermesjms.com
 * @version $Id: XMLMessageRenderer.java,v 1.3 2007/02/18 16:13:41 colincrist Exp $
 */

public class XMLMessageRenderer extends AbstractMessageRenderer
{
   private static final Logger log = Logger.getLogger(XMLMessageRenderer.class);

   public XMLMessageRenderer()
   {
      super();
      // TODO Auto-generated constructor stub
   }

   public JComponent render(Message m)
   {
      //
      // Raw Panel.

      JEditorPane pane = new JEditorPane();
      
      //final JTextArea textArea = new MyTextArea() ; 

      pane.setEditable(false);     
       
      pane.setContentType("text/xml") ;
      
      
      //pane.setLineWrap(true) ;
      //pane.setWrapStyleWord(true) ;
      
      
      try
      {
          String string = MessageUtils.asString(m);
       
          //textArea.setLineWrap(true) ;
          pane.setText(XmlUtils.prettyPrintXml(string));
          pane.setCaretPosition(0) ;
          pane.setFont(Font.decode("Monospaced-PLAIN-12")) ; 
      }
      catch (Throwable e)
      {
         pane.setText(e.getMessage()) ;
          log.error("exception converting message to byte[]: ", e);
      }

      pane.setCaretPosition(0);

      return pane ;
   }


   /**
    * Any JMS message is rederable.
    */
   public boolean canRender(Message message)
   {
      try
      {
         if (message instanceof TextMessage)
         {
            final String text = ((TextMessage) message).getText() ;
            
            return XmlUtils.isXML(text) ;
         }
      }
      catch (JMSException e)
      {
         log.error("error getting text: " + e.getMessage(), e) ;
      }
      
      return false ;
   }

   public String getDisplayName()
   {
      return "XML";
   }
}