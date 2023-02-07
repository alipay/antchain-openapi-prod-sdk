// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateFeatureRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // feature_id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 可以序列化成Map的Json字符串
    @NameInMap("content")
    public String content;

    // 详情参考 https://velocity.apache.org/engine/
    @NameInMap("conditional_content")
    public String conditionalContent;

    public static UpdateFeatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFeatureRequest self = new UpdateFeatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFeatureRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateFeatureRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateFeatureRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateFeatureRequest setConditionalContent(String conditionalContent) {
        this.conditionalContent = conditionalContent;
        return this;
    }
    public String getConditionalContent() {
        return this.conditionalContent;
    }

}
