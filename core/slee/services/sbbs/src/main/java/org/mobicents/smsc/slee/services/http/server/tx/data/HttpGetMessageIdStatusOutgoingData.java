/*
 * TeleStax, Open Source Cloud Communications  Copyright 2012. 
 * and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.smsc.slee.services.http.server.tx.data;

import org.mobicents.smsc.slee.services.http.server.tx.enums.Status;

/**
 * Created by tpalucki on 14.09.16.
 */
public class HttpGetMessageIdStatusOutgoingData {

    private Integer status = 0;
    private String statusMessage = "";

    /**
     * Returns status string
     * @return Status string - Success/Error
     */
    public String getStatusString() {
        return status == 0 ? "Success" : "Error";
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(int newStatus) {
        this.status = newStatus;
    }

    public void setStatus(Status newStatus) {
        this.status = newStatus.getValue();
    }

    public String getStatusMessage(){
        return statusMessage;
    }

    public void setStatusMessage(String msg){
        this.statusMessage = msg;
    }
}
