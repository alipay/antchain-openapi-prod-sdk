// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commerce.models;

import com.aliyun.tea.*;

public class PayInstanceBillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 月账单唯一标识
    @NameInMap("summary_unique_id")
    @Validation(required = true)
    public String summaryUniqueId;

    // 支付请求号
    @NameInMap("pay_request_id")
    @Validation(required = true)
    public String payRequestId;

    // 租户id
    @NameInMap("settle_user_id")
    @Validation(required = true)
    public String settleUserId;

    // 支付产品code
    // ALIPAY_GLOBAL_CARD - antom卡支付
    // STABLE_COIN - 稳定币支付
    @NameInMap("pay_product_code")
    @Validation(required = true)
    public String payProductCode;

    // 支付场景code
    // TRADE_CREATE - 填卡支付
    // MIT_TRADE_CREATE - MIT支付
    // TRADE_SYNC - 支付结果同步
    @NameInMap("pay_scene_code")
    @Validation(required = true)
    public String paySceneCode;

    // 扩展信息
    @NameInMap("extend_info")
    public java.util.List<MapEntry> extendInfo;

    // 来源编码
    @NameInMap("source")
    public String source;

    // 渠道编码
    @NameInMap("channel")
    public String channel;

    public static PayInstanceBillRequest build(java.util.Map<String, ?> map) throws Exception {
        PayInstanceBillRequest self = new PayInstanceBillRequest();
        return TeaModel.build(map, self);
    }

    public PayInstanceBillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PayInstanceBillRequest setSummaryUniqueId(String summaryUniqueId) {
        this.summaryUniqueId = summaryUniqueId;
        return this;
    }
    public String getSummaryUniqueId() {
        return this.summaryUniqueId;
    }

    public PayInstanceBillRequest setPayRequestId(String payRequestId) {
        this.payRequestId = payRequestId;
        return this;
    }
    public String getPayRequestId() {
        return this.payRequestId;
    }

    public PayInstanceBillRequest setSettleUserId(String settleUserId) {
        this.settleUserId = settleUserId;
        return this;
    }
    public String getSettleUserId() {
        return this.settleUserId;
    }

    public PayInstanceBillRequest setPayProductCode(String payProductCode) {
        this.payProductCode = payProductCode;
        return this;
    }
    public String getPayProductCode() {
        return this.payProductCode;
    }

    public PayInstanceBillRequest setPaySceneCode(String paySceneCode) {
        this.paySceneCode = paySceneCode;
        return this;
    }
    public String getPaySceneCode() {
        return this.paySceneCode;
    }

    public PayInstanceBillRequest setExtendInfo(java.util.List<MapEntry> extendInfo) {
        this.extendInfo = extendInfo;
        return this;
    }
    public java.util.List<MapEntry> getExtendInfo() {
        return this.extendInfo;
    }

    public PayInstanceBillRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public PayInstanceBillRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

}
