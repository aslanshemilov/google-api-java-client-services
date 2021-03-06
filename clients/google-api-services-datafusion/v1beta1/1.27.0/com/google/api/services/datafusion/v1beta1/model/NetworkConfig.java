/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.datafusion.v1beta1.model;

/**
 * Network configuration for a Data Fusion instance. These configurations are used for peering with
 * the customer network. Configurations are optional when a public Data Fusion instance is to be
 * created. However, providing these configurations allows several benefits, such as reduced network
 * latency while accessing the customer resources from managed Data Fusion instance nodes, as well
 * as access to the customer on-prem resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkConfig extends com.google.api.client.json.GenericJson {

  /**
   * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range
   * must not overlap with any other ranges used in the Data Fusion instance network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAllocation;

  /**
   * Name of the network in the customer project with which the Tenant Project will be peered for
   * executing pipelines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range
   * must not overlap with any other ranges used in the Data Fusion instance network.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAllocation() {
    return ipAllocation;
  }

  /**
   * The IP range in CIDR notation to use for the managed Data Fusion instance nodes. This range
   * must not overlap with any other ranges used in the Data Fusion instance network.
   * @param ipAllocation ipAllocation or {@code null} for none
   */
  public NetworkConfig setIpAllocation(java.lang.String ipAllocation) {
    this.ipAllocation = ipAllocation;
    return this;
  }

  /**
   * Name of the network in the customer project with which the Tenant Project will be peered for
   * executing pipelines.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * Name of the network in the customer project with which the Tenant Project will be peered for
   * executing pipelines.
   * @param network network or {@code null} for none
   */
  public NetworkConfig setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  @Override
  public NetworkConfig set(String fieldName, Object value) {
    return (NetworkConfig) super.set(fieldName, value);
  }

  @Override
  public NetworkConfig clone() {
    return (NetworkConfig) super.clone();
  }

}
