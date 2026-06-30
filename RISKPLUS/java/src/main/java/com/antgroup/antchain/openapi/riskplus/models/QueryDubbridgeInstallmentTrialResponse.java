// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeInstallmentTrialResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信额度
    @NameInMap("credit_amount")
    public String creditAmount;

    // 可用额度
    @NameInMap("rest_amount")
    public String restAmount;

    // 期数费用列表
    @NameInMap("installment_list")
    public java.util.List<InstallmentTrial> installmentList;

    public static QueryDubbridgeInstallmentTrialResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeInstallmentTrialResponse self = new QueryDubbridgeInstallmentTrialResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeInstallmentTrialResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeInstallmentTrialResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeInstallmentTrialResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeInstallmentTrialResponse setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }
    public String getCreditAmount() {
        return this.creditAmount;
    }

    public QueryDubbridgeInstallmentTrialResponse setRestAmount(String restAmount) {
        this.restAmount = restAmount;
        return this;
    }
    public String getRestAmount() {
        return this.restAmount;
    }

    public QueryDubbridgeInstallmentTrialResponse setInstallmentList(java.util.List<InstallmentTrial> installmentList) {
        this.installmentList = installmentList;
        return this;
    }
    public java.util.List<InstallmentTrial> getInstallmentList() {
        return this.installmentList;
    }

}
