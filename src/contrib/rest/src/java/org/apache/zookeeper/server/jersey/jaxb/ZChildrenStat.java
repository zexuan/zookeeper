/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.zookeeper.server.jersey.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;


/**
 * Represents a STAT using JAXB.
 */
@XmlRootElement(name="childenstat")
public class ZChildrenStat {
    public List<ZStat> children;


    public ZChildrenStat(){
        // needed by jersey
    }

    public ZChildrenStat(List<ZStat> children)
    {
        this.children = children;
    }

    

    
    /**
     * This method considers two ZStats equal if their path, encoding, and
     * data match. It does not compare the ZooKeeper
     * org.apache.zookeeper.data.Stat class fields.
     */
     @Override
    public boolean equals(Object obj) {
        ZChildrenStat o = (ZChildrenStat) obj;
        return children.equals(o.children);
    }

    @Override
    public String toString() {
        return "ZChildrenStat(" + children + ")";
    }
}
