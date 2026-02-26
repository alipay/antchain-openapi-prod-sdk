// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackMktEffectRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 请求id，每一次请求保持唯一；若重复，则更新原数据；
    @NameInMap("request_id")
    @Validation(required = true, maxLength = 128)
    public String requestId;

    // 项目ID，待蚂蚁分配
    @NameInMap("project_id")
    @Validation(required = true, maxLength = 64)
    public String projectId;

    // 营销模式
    // ADVERTISING_TRAFFIC("广告投流"),   
    // LIVE_STREAMING("直播"),    
    // INFLUENCER("达人"),    
    // AI_HANGUP_SMS("AI挂短"), 
    // AI_OFFICIAL_ACCOUNT("AI公众号"),    
    // BPO_WECHAT("BPO企微")
    @NameInMap("marketing_mode")
    @Validation(required = true, maxLength = 64)
    public String marketingMode;

    // 投保特征短链
    @NameInMap("insure_short_url")
    @Validation(required = true, maxLength = 256)
    public String insureShortUrl;

    // 加密类型：MD5，32位[小]
    @NameInMap("encryption_type")
    @Validation(required = true, maxLength = 32)
    public String encryptionType;

    // 加密用户标识
    @NameInMap("encrypted_user_id")
    @Validation(required = true, maxLength = 64)
    public String encryptedUserId;

    // 用户点击投保页唯一标识
    @NameInMap("click_id")
    @Validation(required = true, maxLength = 128)
    public String clickId;

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    @NameInMap("click_time")
    @Validation(required = true, maxLength = 32)
    public String clickTime;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true, maxLength = 64)
    public String nodeType;

    // 节点详细信息
    @NameInMap("node_info")
    @Validation(required = true, maxLength = 1024)
    public String nodeInfo;

    public static CallbackMktEffectRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMktEffectRequest self = new CallbackMktEffectRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMktEffectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMktEffectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackMktEffectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackMktEffectRequest setMarketingMode(String marketingMode) {
        this.marketingMode = marketingMode;
        return this;
    }
    public String getMarketingMode() {
        return this.marketingMode;
    }

    public CallbackMktEffectRequest setInsureShortUrl(String insureShortUrl) {
        this.insureShortUrl = insureShortUrl;
        return this;
    }
    public String getInsureShortUrl() {
        return this.insureShortUrl;
    }

    public CallbackMktEffectRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public CallbackMktEffectRequest setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public CallbackMktEffectRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public CallbackMktEffectRequest setClickTime(String clickTime) {
        this.clickTime = clickTime;
        return this;
    }
    public String getClickTime() {
        return this.clickTime;
    }

    public CallbackMktEffectRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CallbackMktEffectRequest setNodeInfo(String nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }
    public String getNodeInfo() {
        return this.nodeInfo;
    }

}
