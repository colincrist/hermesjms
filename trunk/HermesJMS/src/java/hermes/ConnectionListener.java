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

package hermes;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: ConnectionListener.java,v 1.1 2006/10/29 07:37:22 colincrist Exp $
 */

public interface ConnectionListener
{
   public void onConnectionOpen(Hermes hermes) ;
   
   public void onConnectionClosed(Hermes hermes) ;
}
