/*
 * Copyright Terracotta, Inc.
 * Copyright Super iPaaS Integration LLC, an IBM Company 2024
 */
package com.tc.object.locks;

import com.tc.object.locks.LockLevel;

public enum ServerLockLevel {
  READ, WRITE;

  public static LockLevel toClientLockLevel(ServerLockLevel lockLevel) {
    switch (lockLevel) {
      case READ:
        return LockLevel.READ;
      case WRITE:
        return LockLevel.WRITE;
      default:
        throw new AssertionError("Unknown State: " + lockLevel);
    }
  }

  public static ServerLockLevel fromClientLockLevel(LockLevel lockLevel) {
    switch (lockLevel) {
      case READ:
        return ServerLockLevel.READ;
      case SYNCHRONOUS_WRITE:
      case WRITE:
        return ServerLockLevel.WRITE;
      default:
        throw new AssertionError("Unknown State: " + lockLevel);
    }
  }  
}
