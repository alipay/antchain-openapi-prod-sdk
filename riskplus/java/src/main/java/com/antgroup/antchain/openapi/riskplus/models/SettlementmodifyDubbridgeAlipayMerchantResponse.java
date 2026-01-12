// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class SettlementmodifyDubbridgeAlipayMerchantResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 入驻申请单号
    @NameInMap("order_id")
    public String orderId;

    // 社会统一信用代码
    @NameInMap("usci")
    public String usci;

    // 门店所属子品牌
    @NameInMap("traffic_platform")
    public String trafficPlatform;

    // 外部商户id
    @NameInMap("external_id")
    public String externalId;

    public static SettlementmodifyDubbridgeAlipayMerchantResponse build(java.util.Map<String, ?> map) throws Exception {
        SettlementmodifyDubbridgeAlipayMerchantResponse self = new SettlementmodifyDubbridgeAlipayMerchantResponse();
        return TeaModel.build(map, self);
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setUsci(String usci) {
        this.usci = usci;
        return this;
    }
    public String getUsci() {
        return this.usci;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setTrafficPlatform(String trafficPlatform) {
        this.trafficPlatform = trafficPlatform;
        return this;
    }
    public String getTrafficPlatform() {
        return this.trafficPlatform;
    }

    public SettlementmodifyDubbridgeAlipayMerchantResponse setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
