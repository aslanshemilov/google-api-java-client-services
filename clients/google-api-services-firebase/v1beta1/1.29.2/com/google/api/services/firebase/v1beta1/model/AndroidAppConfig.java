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

package com.google.api.services.firebase.v1beta1.model;

/**
 * Configuration metadata of a single Firebase App for Android.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AndroidAppConfig extends com.google.api.client.json.GenericJson {

  /**
   * The contents of the JSON configuration file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configFileContents;

  /**
   * The filename that the configuration artifact is typically saved as. For example: `google-
   * services.json`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configFilename;

  /**
   * The contents of the JSON configuration file.
   * @see #decodeConfigFileContents()
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigFileContents() {
    return configFileContents;
  }

  /**
   * The contents of the JSON configuration file.
   * @see #getConfigFileContents()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeConfigFileContents() {
    return com.google.api.client.util.Base64.decodeBase64(configFileContents);
  }

  /**
   * The contents of the JSON configuration file.
   * @see #encodeConfigFileContents()
   * @param configFileContents configFileContents or {@code null} for none
   */
  public AndroidAppConfig setConfigFileContents(java.lang.String configFileContents) {
    this.configFileContents = configFileContents;
    return this;
  }

  /**
   * The contents of the JSON configuration file.
   * @see #setConfigFileContents()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public AndroidAppConfig encodeConfigFileContents(byte[] configFileContents) {
    this.configFileContents = com.google.api.client.util.Base64.encodeBase64URLSafeString(configFileContents);
    return this;
  }

  /**
   * The filename that the configuration artifact is typically saved as. For example: `google-
   * services.json`
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigFilename() {
    return configFilename;
  }

  /**
   * The filename that the configuration artifact is typically saved as. For example: `google-
   * services.json`
   * @param configFilename configFilename or {@code null} for none
   */
  public AndroidAppConfig setConfigFilename(java.lang.String configFilename) {
    this.configFilename = configFilename;
    return this;
  }

  @Override
  public AndroidAppConfig set(String fieldName, Object value) {
    return (AndroidAppConfig) super.set(fieldName, value);
  }

  @Override
  public AndroidAppConfig clone() {
    return (AndroidAppConfig) super.clone();
  }

}
