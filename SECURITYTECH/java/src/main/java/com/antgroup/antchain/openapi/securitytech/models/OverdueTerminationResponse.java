// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class OverdueTerminationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户商城可用余额金额
    @NameInMap("goods_balance")
    public String goodsBalance;

    public static OverdueTerminationResponse build(java.util.Map<String, ?> map) throws Exception {
        OverdueTerminationResponse self = new OverdueTerminationResponse();
        return TeaModel.build(map, self);
    }

    public OverdueTerminationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public OverdueTerminationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public OverdueTerminationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public OverdueTerminationResponse setGoodsBalance(String goodsBalance) {
        this.goodsBalance = goodsBalance;
        return this;
    }
    public String getGoodsBalance() {
        return this.goodsBalance;
    }

}
