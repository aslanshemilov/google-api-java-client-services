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

package com.google.api.services.sheets.v4.model;

/**
 * The domain of a chart. For example, if charting stock prices over time, this would be the date.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BasicChartDomain extends com.google.api.client.json.GenericJson {

  /**
   * The data of the domain. For example, if charting stock prices over time, this is the data
   * representing the dates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChartData domain;

  /**
   * True to reverse the order of the domain values (horizontal axis).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reversed;

  /**
   * The data of the domain. For example, if charting stock prices over time, this is the data
   * representing the dates.
   * @return value or {@code null} for none
   */
  public ChartData getDomain() {
    return domain;
  }

  /**
   * The data of the domain. For example, if charting stock prices over time, this is the data
   * representing the dates.
   * @param domain domain or {@code null} for none
   */
  public BasicChartDomain setDomain(ChartData domain) {
    this.domain = domain;
    return this;
  }

  /**
   * True to reverse the order of the domain values (horizontal axis).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReversed() {
    return reversed;
  }

  /**
   * True to reverse the order of the domain values (horizontal axis).
   * @param reversed reversed or {@code null} for none
   */
  public BasicChartDomain setReversed(java.lang.Boolean reversed) {
    this.reversed = reversed;
    return this;
  }

  @Override
  public BasicChartDomain set(String fieldName, Object value) {
    return (BasicChartDomain) super.set(fieldName, value);
  }

  @Override
  public BasicChartDomain clone() {
    return (BasicChartDomain) super.clone();
  }

}