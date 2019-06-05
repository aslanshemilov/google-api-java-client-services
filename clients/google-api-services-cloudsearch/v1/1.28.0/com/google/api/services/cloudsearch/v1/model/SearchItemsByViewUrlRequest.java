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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Model definition for SearchItemsByViewUrlRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchItemsByViewUrlRequest extends com.google.api.client.json.GenericJson {

  /**
   * Common debug options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DebugOptions debugOptions;

  /**
   * The next_page_token value returned from a previous request, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Specify the full view URL to find the corresponding item. The maximum length is 2048
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String viewUrl;

  /**
   * Common debug options.
   * @return value or {@code null} for none
   */
  public DebugOptions getDebugOptions() {
    return debugOptions;
  }

  /**
   * Common debug options.
   * @param debugOptions debugOptions or {@code null} for none
   */
  public SearchItemsByViewUrlRequest setDebugOptions(DebugOptions debugOptions) {
    this.debugOptions = debugOptions;
    return this;
  }

  /**
   * The next_page_token value returned from a previous request, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * The next_page_token value returned from a previous request, if any.
   * @param pageToken pageToken or {@code null} for none
   */
  public SearchItemsByViewUrlRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Specify the full view URL to find the corresponding item. The maximum length is 2048
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getViewUrl() {
    return viewUrl;
  }

  /**
   * Specify the full view URL to find the corresponding item. The maximum length is 2048
   * characters.
   * @param viewUrl viewUrl or {@code null} for none
   */
  public SearchItemsByViewUrlRequest setViewUrl(java.lang.String viewUrl) {
    this.viewUrl = viewUrl;
    return this;
  }

  @Override
  public SearchItemsByViewUrlRequest set(String fieldName, Object value) {
    return (SearchItemsByViewUrlRequest) super.set(fieldName, value);
  }

  @Override
  public SearchItemsByViewUrlRequest clone() {
    return (SearchItemsByViewUrlRequest) super.clone();
  }

}