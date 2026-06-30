// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubheCreditStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授信状态（0-通过/1-不通过2-处理中）
    @NameInMap("status")
    public String status;

    // 拒绝原因
    @NameInMap("msg")
    public String msg;

    // 授信额度
    @NameInMap("credit_amt")
    public Long creditAmt;

    // 期数
    @NameInMap("period")
    public Long period;

    // 还款方式
    @NameInMap("repay_type")
    public String repayType;

    // 额度信息
    @NameInMap("credit_info")
    public CreditAmount creditInfo;

    // 客户编号(该客户的唯一标识，后续接口需要用到)
    @NameInMap("custom_no")
    public String customNo;

    // 授信申请编号
    @NameInMap("apply_no")
    public String applyNo;

    public static QueryDubheCreditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubheCreditStatusResponse self = new QueryDubheCreditStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubheCreditStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubheCreditStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubheCreditStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubheCreditStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubheCreditStatusResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubheCreditStatusResponse setCreditAmt(Long creditAmt) {
        this.creditAmt = creditAmt;
        return this;
    }
    public Long getCreditAmt() {
        return this.creditAmt;
    }

    public QueryDubheCreditStatusResponse setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QueryDubheCreditStatusResponse setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public QueryDubheCreditStatusResponse setCreditInfo(CreditAmount creditInfo) {
        this.creditInfo = creditInfo;
        return this;
    }
    public CreditAmount getCreditInfo() {
        return this.creditInfo;
    }

    public QueryDubheCreditStatusResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubheCreditStatusResponse setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

}
