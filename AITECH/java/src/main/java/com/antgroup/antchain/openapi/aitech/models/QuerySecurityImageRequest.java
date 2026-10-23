// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityImageRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 调用方唯一标示
    @NameInMap("enterprise")
    public String enterprise;

    // 租户id
    @NameInMap("business_id")
    @Validation(required = true)
    public String businessId;

    // 图片风险监测code
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 标示是否是同一个Q&A
    @NameInMap("message_id")
    @Validation(required = true)
    public String messageId;

    // 待检测图片地址
    @NameInMap("image_url")
    @Validation(required = true)
    public String imageUrl;

    // 图片检测内容
    @NameInMap("content")
    public String content;

    public static QuerySecurityImageRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityImageRequest self = new QuerySecurityImageRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityImageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityImageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityImageRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public QuerySecurityImageRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityImageRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QuerySecurityImageRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityImageRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public QuerySecurityImageRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
