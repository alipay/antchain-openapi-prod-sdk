// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityVideoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 视频公开访问 URL
    @NameInMap("video_url")
    @Validation(required = true)
    public String videoUrl;

    // 归一化后须 video 前缀，否则拒绝
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识（老值兼容替换）
    @NameInMap("business_id")
    public String businessId;

    // 应用码
    @NameInMap("app_code")
    public String appCode;

    // 消息 ID
    @NameInMap("message_id")
    public String messageId;

    // 企业标识
    @NameInMap("enterprise")
    public String enterprise;

    // 访问控制维度
    @NameInMap("account_id")
    public String accountId;

    public static QuerySecurityVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityVideoRequest self = new QuerySecurityVideoRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityVideoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityVideoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityVideoRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public QuerySecurityVideoRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QuerySecurityVideoRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityVideoRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QuerySecurityVideoRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityVideoRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public QuerySecurityVideoRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
