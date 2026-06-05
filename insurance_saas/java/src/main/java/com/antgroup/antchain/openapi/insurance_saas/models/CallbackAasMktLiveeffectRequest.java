// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.insurance_saas.models;

import com.aliyun.tea.*;

public class CallbackAasMktLiveeffectRequest extends TeaModel {
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

    // 营销模式，AI_HANGUP_SMS("AI挂短")， AI_OFFICIAL_ACCOUNT("AI公众号"), BPO_WECHAT("BPO企微"), AI_BPO("AI_BPO")， LIVE_STREAMING("直播")
    @NameInMap("marketing_mode")
    @Validation(required = true)
    public String marketingMode;

    // 加密类型：MD5，32位[小]
    @NameInMap("encryption_type")
    @Validation(required = true)
    public String encryptionType;

    // 加密用户标识
    @NameInMap("encrypted_user_id")
    @Validation(required = true)
    public String encryptedUserId;

    // 事件完成时间（yyyy-MM-dd HH:mm:ss）
    @NameInMap("event_time")
    @Validation(required = true)
    public String eventTime;

    // 节点类型
    @NameInMap("node_type")
    @Validation(required = true)
    public String nodeType;

    // 节点详细信息
    @NameInMap("node_info")
    @Validation(required = true)
    public String nodeInfo;

    // 用户转化的落地页 URL，H5 类落地页
    @NameInMap("landing_page_url")
    @Validation(required = true)
    public String landingPageUrl;

    // N	点击 ID，来自落地页 URL、小程序 path 的埋点
    @NameInMap("click_id")
    public String clickId;

    // 产品 ID-固定参数，与商品详情页的 H5 进行绑定
    // 或者通过埋点数据获取
    @NameInMap("product_id")
    public String productId;

    // 用户 IP
    @NameInMap("ip")
    public String ip;

    // ua
    @NameInMap("ua")
    public String ua;

    // 直播间号 - 动参，每日直播时添加至 URL
    @NameInMap("live_room_id")
    public String liveRoomId;

    // 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
    @NameInMap("live_start_time")
    public String liveStartTime;

    // 扩展字段
    @NameInMap("ext_info")
    public String extInfo;

    public static CallbackAasMktLiveeffectRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAasMktLiveeffectRequest self = new CallbackAasMktLiveeffectRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAasMktLiveeffectRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAasMktLiveeffectRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallbackAasMktLiveeffectRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CallbackAasMktLiveeffectRequest setMarketingMode(String marketingMode) {
        this.marketingMode = marketingMode;
        return this;
    }
    public String getMarketingMode() {
        return this.marketingMode;
    }

    public CallbackAasMktLiveeffectRequest setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
        return this;
    }
    public String getEncryptionType() {
        return this.encryptionType;
    }

    public CallbackAasMktLiveeffectRequest setEncryptedUserId(String encryptedUserId) {
        this.encryptedUserId = encryptedUserId;
        return this;
    }
    public String getEncryptedUserId() {
        return this.encryptedUserId;
    }

    public CallbackAasMktLiveeffectRequest setEventTime(String eventTime) {
        this.eventTime = eventTime;
        return this;
    }
    public String getEventTime() {
        return this.eventTime;
    }

    public CallbackAasMktLiveeffectRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public CallbackAasMktLiveeffectRequest setNodeInfo(String nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }
    public String getNodeInfo() {
        return this.nodeInfo;
    }

    public CallbackAasMktLiveeffectRequest setLandingPageUrl(String landingPageUrl) {
        this.landingPageUrl = landingPageUrl;
        return this;
    }
    public String getLandingPageUrl() {
        return this.landingPageUrl;
    }

    public CallbackAasMktLiveeffectRequest setClickId(String clickId) {
        this.clickId = clickId;
        return this;
    }
    public String getClickId() {
        return this.clickId;
    }

    public CallbackAasMktLiveeffectRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public CallbackAasMktLiveeffectRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public CallbackAasMktLiveeffectRequest setUa(String ua) {
        this.ua = ua;
        return this;
    }
    public String getUa() {
        return this.ua;
    }

    public CallbackAasMktLiveeffectRequest setLiveRoomId(String liveRoomId) {
        this.liveRoomId = liveRoomId;
        return this;
    }
    public String getLiveRoomId() {
        return this.liveRoomId;
    }

    public CallbackAasMktLiveeffectRequest setLiveStartTime(String liveStartTime) {
        this.liveStartTime = liveStartTime;
        return this;
    }
    public String getLiveStartTime() {
        return this.liveStartTime;
    }

    public CallbackAasMktLiveeffectRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
