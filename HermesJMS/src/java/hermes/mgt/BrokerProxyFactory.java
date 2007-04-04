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

package hermes.mgt;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: BrokerProxyFactory.java,v 1.1 2006/07/11 06:26:38 colincrist Exp $
 */

public interface BrokerProxyFactory
{
   public BrokerProxy createBrokerManager() ;

}
