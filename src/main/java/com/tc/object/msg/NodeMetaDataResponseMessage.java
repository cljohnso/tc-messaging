/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.msg;

import com.tc.object.locks.ThreadID;

public interface NodeMetaDataResponseMessage extends ClusterMetaDataResponseMessage {

  public void initialize(ThreadID threadID, String ip, String hostname);

  public String getIp();

  public String getHostname();

}
