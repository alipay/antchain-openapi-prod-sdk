// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryConsumecardWalletredeemableResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 可回退的金额
    @NameInMap("redeemable_amount")
    public String redeemableAmount;

    public static QueryConsumecardWalletredeemableResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryConsumecardWalletredeemableResponse self = new QueryConsumecardWalletredeemableResponse();
        return TeaModel.build(map, self);
    }

    public QueryConsumecardWalletredeemableResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryConsumecardWalletredeemableResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryConsumecardWalletredeemableResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryConsumecardWalletredeemableResponse setRedeemableAmount(String redeemableAmount) {
        this.redeemableAmount = redeemableAmount;
        return this;
    }
    public String getRedeemableAmount() {
        return this.redeemableAmount;
    }

}
