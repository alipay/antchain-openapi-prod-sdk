// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeAccountStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信申请状态
    @NameInMap("data")
    public CustomStatus data;

    // 支付账户签约结果
    @NameInMap("pay_method_lock_result")
    public PayMethodLockResult payMethodLockResult;

    // 支付账户锁定结果
    @NameInMap("fund_chain_lock_result")
    public java.util.List<FundChainLockResult> fundChainLockResult;

    public static QueryDubbridgeAccountStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeAccountStatusResponse self = new QueryDubbridgeAccountStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeAccountStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeAccountStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeAccountStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeAccountStatusResponse setData(CustomStatus data) {
        this.data = data;
        return this;
    }
    public CustomStatus getData() {
        return this.data;
    }

    public QueryDubbridgeAccountStatusResponse setPayMethodLockResult(PayMethodLockResult payMethodLockResult) {
        this.payMethodLockResult = payMethodLockResult;
        return this;
    }
    public PayMethodLockResult getPayMethodLockResult() {
        return this.payMethodLockResult;
    }

    public QueryDubbridgeAccountStatusResponse setFundChainLockResult(java.util.List<FundChainLockResult> fundChainLockResult) {
        this.fundChainLockResult = fundChainLockResult;
        return this;
    }
    public java.util.List<FundChainLockResult> getFundChainLockResult() {
        return this.fundChainLockResult;
    }

}
