// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktEffectsimpleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id，每一次请求保持唯一；若重复，则更新原数据；
    @NameInMap("request_id")
    @Validation(required = true)
    public String requestId;

    // 项目ID，待蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true)
    public String projectId;

    // 营销模式，AI_HANGUP_SMS("AI挂短")， AI_OFFICIAL_ACCOUNT("AI公众号"), BPO_WECHAT("BPO企微"), AI_BPO("AI_BPO")
    @NameInMap("marketing_mode")
    @Validation(required = true)
    public String marketingMode;

    // 投保特征短链
    @NameInMap("insure_short_url")
    @Validation(required = true)
    public String insureShortUrl;

    // 加密类型：MD5，32位[小]
    @NameInMap("encryption_type")
    @Validation(required = true)
    public String encryptionType;

    // 加密用户标识
    @NameInMap("encrypted_user_id")
    @Validation(required = true)
    public String encryptedUserId;

    // 应以识别当前用户点击投保页面的唯一标识
    @NameInMap("landing_visit_id")
    @Validation(required = true)
    public String landingVisitId;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点状态（0-未完成；1-已完成）
    @NameInMap("node_status")
    @Validation(required = true)
    public String nodeStatus;

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    @NameInMap("event_time")
    @Validation(required = true)
    public String eventTime;

    public static CallbackMktEffectsimpleRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktEffectsimpleRequest self = new CallbackMktEffectsimpleRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktEffectsimpleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktEffectsimpleRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktEffectsimpleRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackMktEffectsimpleRequest setMarketingMode(String marketingMode) {
        this.marketingMode = marketingMode;
        return this;
    }
    public String getMarketingMode() {
        return this.marketingMode;
    }

    public CallbackMktEffectsimpleRequest setInsureShortUrl(String insureShortUrl) {
        this.insureShortUrl = insureShortUrl;
        return this;
    }
    public String getInsureShortUrl() {
        return this.insureShortUrl;
    }

    public CallbackMktEffectsimpleRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public CallbackMktEffectsimpleRequest setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public CallbackMktEffectsimpleRequest setLandingVisitId(String landingVisitId) {
        this.landingVisitId = landingVisitId;
        return this;
    }
    public String getLandingVisitId() {
        return this.landingVisitId;
    }

    public CallbackMktEffectsimpleRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CallbackMktEffectsimpleRequest setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
        return this;
    }
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    public CallbackMktEffectsimpleRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

}
