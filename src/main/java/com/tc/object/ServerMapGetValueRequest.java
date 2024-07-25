/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object;

import java.util.Set;

public class ServerMapGetValueRequest {

  private final ServerMapRequestID requestID;
  private final Set<Object>        keys;

  public ServerMapGetValueRequest(final ServerMapRequestID serverMapRequestID, final Set<Object> keys) {
    this.requestID = serverMapRequestID;
    this.keys = keys;
  }

  public ServerMapRequestID getRequestID() {
    return this.requestID;
  }

  public Set<Object> getKeys() {
    return this.keys;
  }

}
