// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class QueryDacDepositlimitsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可以deposit的最大金额
    @NameInMap("deposit_max_amount")
    public String depositMaxAmount;

    // 可以deposit的最小金额
    @NameInMap("deposit_min_amount")
    public String depositMinAmount;

    public static QueryDacDepositlimitsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDacDepositlimitsResponse self = new QueryDacDepositlimitsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDacDepositlimitsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDacDepositlimitsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDacDepositlimitsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDacDepositlimitsResponse setDepositMaxAmount(String depositMaxAmount) {
        this.depositMaxAmount = depositMaxAmount;
        return this;
    }
    public String getDepositMaxAmount() {
        return this.depositMaxAmount;
    }

    public QueryDacDepositlimitsResponse setDepositMinAmount(String depositMinAmount) {
        this.depositMinAmount = depositMinAmount;
        return this;
    }
    public String getDepositMinAmount() {
        return this.depositMinAmount;
    }

}
