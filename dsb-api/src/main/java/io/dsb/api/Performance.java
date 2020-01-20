/**
 * Copyright (c) 2020 KMG. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package io.dsb.api;

import java.util.concurrent.ExecutionException;

public interface Performance {
    /**
     * Start the performance statistics.
     *
     * @param startTime start time time
     */
    public  void start(long startTime);

    /**
     * End the final performance statistics.
     *
     * @param endTime End time
     * @throws ExecutionException   If an exception occurred.
     * @throws InterruptedException If an exception occurred.
     */
    public void shutdown(long endTime) throws ExecutionException, InterruptedException;

    /**
     * Record the data write/read time of data.
     *
     * @param startTime starting time
     * @param endTime   End time
     * @param bytes     number of bytes written or read
     * @param records   number of records written or read
     **/
    public void recordTime(long startTime, long endTime, int bytes, int records);

}
