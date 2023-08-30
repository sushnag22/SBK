/**
 * Copyright (c) KMG. All Rights Reserved..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package io.sbk.Pravega;

public class PravegaConfig {
    public String controllerUri;
    public String scopeName;
    public String streamName;
    public int segmentCount;
    public boolean recreate;
    public boolean connPooling;
}
