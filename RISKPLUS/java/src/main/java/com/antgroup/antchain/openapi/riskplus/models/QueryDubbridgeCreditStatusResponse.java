// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeCreditStatusResponse extends TeaModel {
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

    // 资金方编号
    @NameInMap("fund_code")
    public String fundCode;

    // 冷静期结束日期
    @NameInMap("cooling_period")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String coolingPeriod;

    // 资金源编码
    @NameInMap("loan_inst_code")
    public String loanInstCode;

    // JSON字符串
    @NameInMap("ext_info")
    public String extInfo;

    public static QueryDubbridgeCreditStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeCreditStatusResponse self = new QueryDubbridgeCreditStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeCreditStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeCreditStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeCreditStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeCreditStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryDubbridgeCreditStatusResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeCreditStatusResponse setCreditAmt(Long creditAmt) {
        this.creditAmt = creditAmt;
        return this;
    }
    public Long getCreditAmt() {
        return this.creditAmt;
    }

    public QueryDubbridgeCreditStatusResponse setPeriod(Long period) {
        this.period = period;
        return this;
    }
    public Long getPeriod() {
        return this.period;
    }

    public QueryDubbridgeCreditStatusResponse setRepayType(String repayType) {
        this.repayType = repayType;
        return this;
    }
    public String getRepayType() {
        return this.repayType;
    }

    public QueryDubbridgeCreditStatusResponse setCreditInfo(CreditAmount creditInfo) {
        this.creditInfo = creditInfo;
        return this;
    }
    public CreditAmount getCreditInfo() {
        return this.creditInfo;
    }

    public QueryDubbridgeCreditStatusResponse setCustomNo(String customNo) {
        this.customNo = customNo;
        return this;
    }
    public String getCustomNo() {
        return this.customNo;
    }

    public QueryDubbridgeCreditStatusResponse setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public QueryDubbridgeCreditStatusResponse setFundCode(String fundCode) {
        this.fundCode = fundCode;
        return this;
    }
    public String getFundCode() {
        return this.fundCode;
    }

    public QueryDubbridgeCreditStatusResponse setCoolingPeriod(String coolingPeriod) {
        this.coolingPeriod = coolingPeriod;
        return this;
    }
    public String getCoolingPeriod() {
        return this.coolingPeriod;
    }

    public QueryDubbridgeCreditStatusResponse setLoanInstCode(String loanInstCode) {
        this.loanInstCode = loanInstCode;
        return this;
    }
    public String getLoanInstCode() {
        return this.loanInstCode;
    }

    public QueryDubbridgeCreditStatusResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

}
