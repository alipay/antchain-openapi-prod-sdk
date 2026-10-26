// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class QuerySecurityAudioRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 音频公网 URL
    @NameInMap("audio_url")
    @Validation(required = true)
    public String audioUrl;

    // 缺省从 URL 后缀或 magic number 推断
    @NameInMap("audio_format")
    public String audioFormat;

    // Boolean 降噪（null 时服务端默认 true）
    @NameInMap("denoise")
    public String denoise;

    // 须 audio 前缀，
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 租户标识（老值兼容替换）
    @NameInMap("business_id")
    @Validation(required = true)
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

    public static QuerySecurityAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySecurityAudioRequest self = new QuerySecurityAudioRequest();
        return TeaModel.build(map, self);
    }

    public QuerySecurityAudioRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySecurityAudioRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySecurityAudioRequest setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
        return this;
    }
    public String getAudioUrl() {
        return this.audioUrl;
    }

    public QuerySecurityAudioRequest setAudioFormat(String audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }
    public String getAudioFormat() {
        return this.audioFormat;
    }

    public QuerySecurityAudioRequest setDenoise(String denoise) {
        this.denoise = denoise;
        return this;
    }
    public String getDenoise() {
        return this.denoise;
    }

    public QuerySecurityAudioRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QuerySecurityAudioRequest setBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }
    public String getBusinessId() {
        return this.businessId;
    }

    public QuerySecurityAudioRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public QuerySecurityAudioRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public QuerySecurityAudioRequest setEnterprise(String enterprise) {
        this.enterprise = enterprise;
        return this;
    }
    public String getEnterprise() {
        return this.enterprise;
    }

    public QuerySecurityAudioRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
