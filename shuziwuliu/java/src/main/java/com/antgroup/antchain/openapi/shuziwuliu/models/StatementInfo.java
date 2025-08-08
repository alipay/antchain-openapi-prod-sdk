// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class StatementInfo extends TeaModel {
    // 信用流转批次号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("batch_id")
    @Validation(required = true)
    public String batchId;

    // 全局唯一业务号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("out_biz_no")
    @Validation(required = true)
    public String outBizNo;

    // 信用流转凭证
    /**
     * <strong>example:</strong>
     * <p>1212312</p>
     */
    @NameInMap("issue_id")
    @Validation(required = true)
    public String issueId;

    // 合同号（预留）
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("contract_id")
    public String contractId;

    // 发行信用流转的运单号
    /**
     * <strong>example:</strong>
     * <p>321312</p>
     */
    @NameInMap("waybill_id")
    @Validation(required = true)
    public String waybillId;

    // 发行信用流转的支付单号
    /**
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("pay_order")
    @Validation(required = true)
    public String payOrder;

    // 金额信息
    /**
     * <strong>example:</strong>
     * <p>18.67</p>
     */
    @NameInMap("credit_limit")
    @Validation(required = true)
    public String creditLimit;

    // 流水类型
    /**
     * <strong>example:</strong>
     * <p>FINANCE</p>
     */
    @NameInMap("state_type")
    @Validation(required = true)
    public String stateType;

    // 流水类型说明
    /**
     * <strong>example:</strong>
     * <p>融资</p>
     */
    @NameInMap("state_msg")
    @Validation(required = true)
    public String stateMsg;

    // 凭证来源方did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c</p>
     */
    @NameInMap("from_did")
    @Validation(required = true)
    public String fromDid;

    // 凭证流转方did
    /**
     * <strong>example:</strong>
     * <p>did:mychain:fa142b66cb1dece6a36cd66081ceeece19674409149c32679f2e17ed2dd8312c</p>
     */
    @NameInMap("to_did")
    @Validation(required = true)
    public String toDid;

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

    public static StatementInfo build(java.util.Map<String, ?> map) throws Exception {
        StatementInfo self = new StatementInfo();
        return TeaModel.build(map, self);
    }

    public StatementInfo setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public StatementInfo setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
        return this;
    }
    public String getOutBizNo() {
        return this.outBizNo;
    }

    public StatementInfo setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public StatementInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public StatementInfo setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

    public StatementInfo setPayOrder(String payOrder) {
        this.payOrder = payOrder;
        return this;
    }
    public String getPayOrder() {
        return this.payOrder;
    }

    public StatementInfo setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public String getCreditLimit() {
        return this.creditLimit;
    }

    public StatementInfo setStateType(String stateType) {
        this.stateType = stateType;
        return this;
    }
    public String getStateType() {
        return this.stateType;
    }

    public StatementInfo setStateMsg(String stateMsg) {
        this.stateMsg = stateMsg;
        return this;
    }
    public String getStateMsg() {
        return this.stateMsg;
    }

    public StatementInfo setFromDid(String fromDid) {
        this.fromDid = fromDid;
        return this;
    }
    public String getFromDid() {
        return this.fromDid;
    }

    public StatementInfo setToDid(String toDid) {
        this.toDid = toDid;
        return this;
    }
    public String getToDid() {
        return this.toDid;
    }

    public StatementInfo setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public StatementInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

}
