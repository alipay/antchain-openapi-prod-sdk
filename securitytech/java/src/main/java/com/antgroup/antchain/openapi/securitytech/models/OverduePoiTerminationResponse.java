// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OverduePoiTerminationResponse extends TeaModel {
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

    public static OverduePoiTerminationResponse build(java.util.Map<String, ?> map) throws Exception {
        OverduePoiTerminationResponse self = new OverduePoiTerminationResponse();
        return TeaModel.build(map, self);
    }

    public OverduePoiTerminationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OverduePoiTerminationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OverduePoiTerminationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OverduePoiTerminationResponse setGoodsBalance(String goodsBalance) {
        this.goodsBalance = goodsBalance;
        return this;
    }
    public String getGoodsBalance() {
        return this.goodsBalance;
    }

}
