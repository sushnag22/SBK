/**
 * Copyright (c) KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 */

package io.time;

/**
 * enum TimeUnit {
 *  ms { public String toString() {return "MILLISECONDS";} },
 *  mcs { public String toString() {return "MICROSECONDS";} },
 *  ns { public String toString() {return "NANOSECONDS";} }
 *  }.
 */
public enum TimeUnit {

    /**
     * <code>ms { public String toString() {return "MILLISECONDS";} }</code>.
     */
    ms {
        public String toString() {
            return "MILLISECONDS";
        }
    },

    /**
     * <code>mcs { public String toString() {return "MICROSECONDS";} }</code>.
     */
    mcs {
        public String toString() {
            return "MICROSECONDS";
        }
    },

    /**
     * <code>ns { public String toString() {return "NANOSECONDS";} }</code>.
     */
    ns {
        public String toString() {
            return "NANOSECONDS";
        }
    }

}
