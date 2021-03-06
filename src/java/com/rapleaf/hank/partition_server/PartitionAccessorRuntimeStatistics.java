/**
 *  Copyright 2011 Rapleaf
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.rapleaf.hank.partition_server;

public class PartitionAccessorRuntimeStatistics {

  protected final long numRequests;
  protected final long numHits;
  protected final double throughput;
  protected final double responseDataThroughput;
  protected final long numL1CacheHits;
  protected final long numL2CacheHits;

  public PartitionAccessorRuntimeStatistics(long numRequests,
                                            long numHits,
                                            double throughput,
                                            double responseDataThroughput,
                                            long numL1CacheHits,
                                            long numL2CacheHits) {
    this.numRequests = numRequests;
    this.numHits = numHits;
    this.throughput = throughput;
    this.responseDataThroughput = responseDataThroughput;
    this.numL1CacheHits = numL1CacheHits;
    this.numL2CacheHits = numL2CacheHits;
  }
}
