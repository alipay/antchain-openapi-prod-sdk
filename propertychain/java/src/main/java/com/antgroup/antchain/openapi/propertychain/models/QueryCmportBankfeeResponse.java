// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.propertychain.models;

import com.aliyun.tea.*;

public class QueryCmportBankfeeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 应付银行本金
    @NameInMap("capital_amount")
    public Long capitalAmount;

    // 应付银行利息
    @NameInMap("interest_amount")
    public Long interestAmount;

    // 应付总金额
    @NameInMap("total_amount")
    public Long totalAmount;

    public static QueryCmportBankfeeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCmportBankfeeResponse self = new QueryCmportBankfeeResponse();
        return TeaModel.build(map, self);
    }

    public QueryCmportBankfeeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCmportBankfeeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCmportBankfeeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCmportBankfeeResponse setCapitalAmount(Long capitalAmount) {
        this.capitalAmount = capitalAmount;
        return this;
    }
    public Long getCapitalAmount() {
        return this.capitalAmount;
    }

    public QueryCmportBankfeeResponse setInterestAmount(Long interestAmount) {
        this.interestAmount = interestAmount;
        return this;
    }
    public Long getInterestAmount() {
        return this.interestAmount;
    }

    public QueryCmportBankfeeResponse setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

}
