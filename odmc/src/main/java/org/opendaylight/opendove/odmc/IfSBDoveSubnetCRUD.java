/*
 * Copyright IBM Corporation, 2013.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

package org.opendaylight.opendove.odmc;

import java.util.List;

public interface IfSBDoveSubnetCRUD {
    public boolean subnetExists(String subnetUUID);

    public OpenDoveSubnet getSubnet(String subnetUUID);

    public void addSubnet(String subnetUUID, OpenDoveSubnet domain);

    public List<OpenDoveSubnet> getSubnets();
    
    public void removeSubnet(String subnetUUID);
}
