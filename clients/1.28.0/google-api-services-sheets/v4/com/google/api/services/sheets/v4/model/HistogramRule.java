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
 * Allows you to organize the numeric values in a source data column into buckets of a constant
 * size. All values from HistogramRule.start to HistogramRule.end are placed into groups of size
 * HistogramRule.interval. In addition, all values below HistogramRule.start are placed in one
 * group, and all values above HistogramRule.end are placed in another. Only HistogramRule.interval
 * is required, though if HistogramRule.start and HistogramRule.end are both provided,
 * HistogramRule.start must be less than HistogramRule.end. For example, a pivot table showing
 * average purchase amount by age that has 50+ rows:
 *
 *     +-----+-------------------+     | Age | AVERAGE of Amount |     +-----+-------------------+
 * | 16  |            $27.13 |     | 17  |             $5.24 |     | 18  |            $20.15 |
 * ...     +-----+-------------------+ could be turned into a pivot table that looks like the one
 * below by applying a histogram group rule with a HistogramRule.start of 25, an
 * HistogramRule.interval of 20, and an HistogramRule.end of 65.
 *
 *     +-------------+-------------------+     | Grouped Age | AVERAGE of Amount |
 * +-------------+-------------------+     | < 25        |            $19.34 |     | 25-45       |
 * $31.43 |     | 45-65       |            $35.87 |     | > 65        |            $27.55 |
 * +-------------+-------------------+     | Grand Total |            $29.12 |
 * +-------------+-------------------+
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramRule extends com.google.api.client.json.GenericJson {

  /**
   * The maximum value at which items are placed into buckets of constant size. Values above end are
   * lumped into a single bucket. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double end;

  /**
   * The size of the buckets that are created. Must be positive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double interval;

  /**
   * The minimum value at which items are placed into buckets of constant size. Values below start
   * are lumped into a single bucket. This field is optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double start;

  /**
   * The maximum value at which items are placed into buckets of constant size. Values above end are
   * lumped into a single bucket. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.Double getEnd() {
    return end;
  }

  /**
   * The maximum value at which items are placed into buckets of constant size. Values above end are
   * lumped into a single bucket. This field is optional.
   * @param end end or {@code null} for none
   */
  public HistogramRule setEnd(java.lang.Double end) {
    this.end = end;
    return this;
  }

  /**
   * The size of the buckets that are created. Must be positive.
   * @return value or {@code null} for none
   */
  public java.lang.Double getInterval() {
    return interval;
  }

  /**
   * The size of the buckets that are created. Must be positive.
   * @param interval interval or {@code null} for none
   */
  public HistogramRule setInterval(java.lang.Double interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The minimum value at which items are placed into buckets of constant size. Values below start
   * are lumped into a single bucket. This field is optional.
   * @return value or {@code null} for none
   */
  public java.lang.Double getStart() {
    return start;
  }

  /**
   * The minimum value at which items are placed into buckets of constant size. Values below start
   * are lumped into a single bucket. This field is optional.
   * @param start start or {@code null} for none
   */
  public HistogramRule setStart(java.lang.Double start) {
    this.start = start;
    return this;
  }

  @Override
  public HistogramRule set(String fieldName, Object value) {
    return (HistogramRule) super.set(fieldName, value);
  }

  @Override
  public HistogramRule clone() {
    return (HistogramRule) super.clone();
  }

}