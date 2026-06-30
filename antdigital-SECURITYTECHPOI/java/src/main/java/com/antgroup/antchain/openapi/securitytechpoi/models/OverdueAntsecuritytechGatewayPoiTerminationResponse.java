// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class OverdueAntsecuritytechGatewayPoiTerminationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 商城可用余额金额
    @NameInMap("goods_balance")
    public String goodsBalance;

    public static OverdueAntsecuritytechGatewayPoiTerminationResponse build(java.util.Map<String, ?> map) throws Exception {
        OverdueAntsecuritytechGatewayPoiTerminationResponse self = new OverdueAntsecuritytechGatewayPoiTerminationResponse();
        return TeaModel.build(map, self);
    }

    public OverdueAntsecuritytechGatewayPoiTerminationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OverdueAntsecuritytechGatewayPoiTerminationResponse setGoodsBalance(String goodsBalance) {
        this.goodsBalance = goodsBalance;
        return this;
    }
    public String getGoodsBalance() {
        return this.goodsBalance;
    }

}
