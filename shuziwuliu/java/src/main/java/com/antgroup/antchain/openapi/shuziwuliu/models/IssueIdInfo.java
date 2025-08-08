// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class IssueIdInfo extends TeaModel {
    // 信用流转凭证
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 全局唯一业务号
    /**
     * <strong>example:</strong>
     * <p>fa142b66cb1</p>
     */
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 合同号（预留）
    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("contract_id")
    public String contractId;

    // 发行信用流转的运单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    // 支付订单
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("pay_order")
    @Validation(required = true)
    public String payOrder;

    // 凭证金额
    /**
     * <strong>example:</strong>
     * <p>198.76</p>
     */
    @NameInMap("ticket_amt")
    @Validation(required = true)
    public String ticketAmt;

    // 信用凭证发起时间
    /**
     * <strong>example:</strong>
     * <p>1581579336000</p>
     */
    @NameInMap("issue_date")
    @Validation(required = true)
    public String issueDate;

    // 信用凭证到期时间
    /**
     * <strong>example:</strong>
     * <p>1581579336000</p>
     */
    @NameInMap("expire_date")
    @Validation(required = true)
    public String expireDate;

    // 发行结果状态 -1:发行失败状态， 0:未完成状态， 1:已发行状态
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 失败原因信息
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("err_msg")
    @Validation(required = true)
    public String errMsg;

    public static IssueIdInfo build(java.util.Map<String, ?> map) throws Exception {
        IssueIdInfo self = new IssueIdInfo();
        return TeaModel.build(map, self);
    }

    public IssueIdInfo setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public IssueIdInfo setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public IssueIdInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public IssueIdInfo setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public IssueIdInfo setPayOrder(String payOrder) {
        this.payOrder = payOrder;
        return this;
    }
    public String getPayOrder() {
        return this.payOrder;
    }

    public IssueIdInfo setTicketAmt(String ticketAmt) {
        this.ticketAmt = ticketAmt;
        return this;
    }
    public String getTicketAmt() {
        return this.ticketAmt;
    }

    public IssueIdInfo setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public IssueIdInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public IssueIdInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IssueIdInfo setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

}
