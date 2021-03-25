// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecConsumecardOrdertrywithdrawResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 试算总提现金额(单位:元,精确到分)
    @NameInMap("withdraw_total_amount")
    public String withdrawTotalAmount;

    // 试算提现订单总笔数
    @NameInMap("withdraw_total_count")
    public Long withdrawTotalCount;

    public static ExecConsumecardOrdertrywithdrawResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecConsumecardOrdertrywithdrawResponse self = new ExecConsumecardOrdertrywithdrawResponse();
        return TeaModel.build(map, self);
    }

    public ExecConsumecardOrdertrywithdrawResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecConsumecardOrdertrywithdrawResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecConsumecardOrdertrywithdrawResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecConsumecardOrdertrywithdrawResponse setWithdrawTotalAmount(String withdrawTotalAmount) {
        this.withdrawTotalAmount = withdrawTotalAmount;
        return this;
    }
    public String getWithdrawTotalAmount() {
        return this.withdrawTotalAmount;
    }

    public ExecConsumecardOrdertrywithdrawResponse setWithdrawTotalCount(Long withdrawTotalCount) {
        this.withdrawTotalCount = withdrawTotalCount;
        return this;
    }
    public Long getWithdrawTotalCount() {
        return this.withdrawTotalCount;
    }

}
