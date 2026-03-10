// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryDubbridgeRepaymentLxResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 还款状态，
    // 1、成功(结算成功)
    // 2、失败(结算失败)
    // 3. 还款中(结算处理中)
    // 4. 查无此通知（会重复发起还款）
    @NameInMap("repay_status")
    public Long repayStatus;

    // 处理成功时间，成功必填YYYY-MM-DD HH:MM:SS
    @NameInMap("process_time")
    public String processTime;

    // 还款描述，失败时，需给出的错误描述
    @NameInMap("msg")
    public String msg;

    // 还款总额,保留两位有效数字(单位:元)
    @NameInMap("repay_amount")
    public Long repayAmount;

    // 实还本金,保留两位有效数字(单位:元)
    @NameInMap("repay_principal")
    public String repayPrincipal;

    // 实还利息,保留两位有效数字(单位:元)
    @NameInMap("repay_interest")
    public String repayInterest;

    // 实还罚息,保留两位有效数字(单位:元)
    @NameInMap("repay_muclt")
    public Long repayMuclt;

    // 实还担保费,保留两位有效数字(单位:元)
    @NameInMap("repay_guarantee")
    public Long repayGuarantee;

    // 实还信用评估费,保留两位有效数字(单位:元)
    @NameInMap("repay_credit_fee")
    public Long repayCreditFee;

    // 实还咨询服务费,保留两位有效数字(单位:元)
    @NameInMap("repay_grantee_consult_service_fee")
    public Long repayGranteeConsultServiceFee;

    public static QueryDubbridgeRepaymentLxResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDubbridgeRepaymentLxResponse self = new QueryDubbridgeRepaymentLxResponse();
        return TeaModel.build(map, self);
    }

    public QueryDubbridgeRepaymentLxResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDubbridgeRepaymentLxResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDubbridgeRepaymentLxResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayStatus(Long repayStatus) {
        this.repayStatus = repayStatus;
        return this;
    }
    public Long getRepayStatus() {
        return this.repayStatus;
    }

    public QueryDubbridgeRepaymentLxResponse setProcessTime(String processTime) {
        this.processTime = processTime;
        return this;
    }
    public String getProcessTime() {
        return this.processTime;
    }

    public QueryDubbridgeRepaymentLxResponse setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayAmount(Long repayAmount) {
        this.repayAmount = repayAmount;
        return this;
    }
    public Long getRepayAmount() {
        return this.repayAmount;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayPrincipal(String repayPrincipal) {
        this.repayPrincipal = repayPrincipal;
        return this;
    }
    public String getRepayPrincipal() {
        return this.repayPrincipal;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayInterest(String repayInterest) {
        this.repayInterest = repayInterest;
        return this;
    }
    public String getRepayInterest() {
        return this.repayInterest;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayMuclt(Long repayMuclt) {
        this.repayMuclt = repayMuclt;
        return this;
    }
    public Long getRepayMuclt() {
        return this.repayMuclt;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayGuarantee(Long repayGuarantee) {
        this.repayGuarantee = repayGuarantee;
        return this;
    }
    public Long getRepayGuarantee() {
        return this.repayGuarantee;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayCreditFee(Long repayCreditFee) {
        this.repayCreditFee = repayCreditFee;
        return this;
    }
    public Long getRepayCreditFee() {
        return this.repayCreditFee;
    }

    public QueryDubbridgeRepaymentLxResponse setRepayGranteeConsultServiceFee(Long repayGranteeConsultServiceFee) {
        this.repayGranteeConsultServiceFee = repayGranteeConsultServiceFee;
        return this;
    }
    public Long getRepayGranteeConsultServiceFee() {
        return this.repayGranteeConsultServiceFee;
    }

}
