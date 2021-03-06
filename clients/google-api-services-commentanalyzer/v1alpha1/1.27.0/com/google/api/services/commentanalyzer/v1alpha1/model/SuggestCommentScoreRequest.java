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

package com.google.api.services.commentanalyzer.v1alpha1.model;

/**
 * The comment score suggestion request message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Perspective Comment Analyzer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestCommentScoreRequest extends com.google.api.client.json.GenericJson {

  /**
   * Attribute scores for the comment. The map keys are attribute names, same as the
   * requested_attribute field in AnalyzeCommentRequest (for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc.). This field has the same type as the `attribute_scores` field in
   * AnalyzeCommentResponse.
   *
   * To specify an overall attribute score for the entire comment as a whole, use the
   * `summary_score` field of the mapped AttributeScores object. To specify scores on specific
   * subparts of the comment, use the `span_scores` field. All SpanScore objects must have begin and
   * end fields set.
   *
   * All Score objects must be explicitly set (for binary classification, use the score values 0 and
   * 1). If Score objects don't include a ScoreType, `PROBABILITY` is assumed.
   *
   * `attribute_scores` must not be empty. The mapped AttributeScores objects also must not be
   * empty. An `INVALID_ARGUMENT` error is returned for all malformed requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, AttributeScores> attributeScores;

  static {
    // hack to force ProGuard to consider AttributeScores used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttributeScores.class);
  }

  /**
   * Opaque token that is echoed from the request to the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientToken;

  /**
   * The comment being scored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextEntry comment;

  /**
   * Optional identifier associating this comment score suggestion with a particular sub-community.
   * Different communities may have different norms and rules. Specifying this value enables
   * training community-specific models.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String communityId;

  /**
   * The context of the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Context context;

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> languages;

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionId;

  /**
   * Attribute scores for the comment. The map keys are attribute names, same as the
   * requested_attribute field in AnalyzeCommentRequest (for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc.). This field has the same type as the `attribute_scores` field in
   * AnalyzeCommentResponse.
   *
   * To specify an overall attribute score for the entire comment as a whole, use the
   * `summary_score` field of the mapped AttributeScores object. To specify scores on specific
   * subparts of the comment, use the `span_scores` field. All SpanScore objects must have begin and
   * end fields set.
   *
   * All Score objects must be explicitly set (for binary classification, use the score values 0 and
   * 1). If Score objects don't include a ScoreType, `PROBABILITY` is assumed.
   *
   * `attribute_scores` must not be empty. The mapped AttributeScores objects also must not be
   * empty. An `INVALID_ARGUMENT` error is returned for all malformed requests.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, AttributeScores> getAttributeScores() {
    return attributeScores;
  }

  /**
   * Attribute scores for the comment. The map keys are attribute names, same as the
   * requested_attribute field in AnalyzeCommentRequest (for example "ATTACK_ON_AUTHOR",
   * "INFLAMMATORY", etc.). This field has the same type as the `attribute_scores` field in
   * AnalyzeCommentResponse.
   *
   * To specify an overall attribute score for the entire comment as a whole, use the
   * `summary_score` field of the mapped AttributeScores object. To specify scores on specific
   * subparts of the comment, use the `span_scores` field. All SpanScore objects must have begin and
   * end fields set.
   *
   * All Score objects must be explicitly set (for binary classification, use the score values 0 and
   * 1). If Score objects don't include a ScoreType, `PROBABILITY` is assumed.
   *
   * `attribute_scores` must not be empty. The mapped AttributeScores objects also must not be
   * empty. An `INVALID_ARGUMENT` error is returned for all malformed requests.
   * @param attributeScores attributeScores or {@code null} for none
   */
  public SuggestCommentScoreRequest setAttributeScores(java.util.Map<String, AttributeScores> attributeScores) {
    this.attributeScores = attributeScores;
    return this;
  }

  /**
   * Opaque token that is echoed from the request to the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientToken() {
    return clientToken;
  }

  /**
   * Opaque token that is echoed from the request to the response.
   * @param clientToken clientToken or {@code null} for none
   */
  public SuggestCommentScoreRequest setClientToken(java.lang.String clientToken) {
    this.clientToken = clientToken;
    return this;
  }

  /**
   * The comment being scored.
   * @return value or {@code null} for none
   */
  public TextEntry getComment() {
    return comment;
  }

  /**
   * The comment being scored.
   * @param comment comment or {@code null} for none
   */
  public SuggestCommentScoreRequest setComment(TextEntry comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Optional identifier associating this comment score suggestion with a particular sub-community.
   * Different communities may have different norms and rules. Specifying this value enables
   * training community-specific models.
   * @return value or {@code null} for none
   */
  public java.lang.String getCommunityId() {
    return communityId;
  }

  /**
   * Optional identifier associating this comment score suggestion with a particular sub-community.
   * Different communities may have different norms and rules. Specifying this value enables
   * training community-specific models.
   * @param communityId communityId or {@code null} for none
   */
  public SuggestCommentScoreRequest setCommunityId(java.lang.String communityId) {
    this.communityId = communityId;
    return this;
  }

  /**
   * The context of the comment.
   * @return value or {@code null} for none
   */
  public Context getContext() {
    return context;
  }

  /**
   * The context of the comment.
   * @param context context or {@code null} for none
   */
  public SuggestCommentScoreRequest setContext(Context context) {
    this.context = context;
    return this;
  }

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLanguages() {
    return languages;
  }

  /**
   * The language(s) of the comment and context (if none are specified, the language is
   * automatically detected). If multiple languages are specified, the text is checked in all of
   * them that are supported. Both ISO and BCP-47 language codes are accepted. Current Language
   * Restrictions:  * Only English text ("en") is supported. If none of the languages specified by
   * the caller are supported, an `UNIMPLEMENTED` error is returned.
   * @param languages languages or {@code null} for none
   */
  public SuggestCommentScoreRequest setLanguages(java.util.List<java.lang.String> languages) {
    this.languages = languages;
    return this;
  }

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionId() {
    return sessionId;
  }

  /**
   * Session ID. Used to join related RPCs into a single session. For example, an interactive tool
   * that calls both the AnalyzeComment and SuggestCommentScore RPCs should set all invocations of
   * both RPCs to the same Session ID, typically a random 64-bit integer.
   * @param sessionId sessionId or {@code null} for none
   */
  public SuggestCommentScoreRequest setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  @Override
  public SuggestCommentScoreRequest set(String fieldName, Object value) {
    return (SuggestCommentScoreRequest) super.set(fieldName, value);
  }

  @Override
  public SuggestCommentScoreRequest clone() {
    return (SuggestCommentScoreRequest) super.clone();
  }

}
