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

package hermes.browser.tasks;

import javax.swing.Icon;

/**
 * @author colincrist@hermesjms.com
 * @version $Id: Task.java,v 1.1 2004/11/17 17:24:06 colincrist Exp $
 */

public interface Task 
{
    public String getTitle() ;
    
    public Icon getIcon() ;
    
    public void addTaskListener(TaskListener taskListener) ;
    
    public void removeTaskListener(TaskListener taskListener) ;
    
    public void stop() ;
    
    public boolean isRunning() ;
    
    public void invoke() throws Exception ;
    
    public void start() ;
}