// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class IssueInfo extends TeaModel {
    // 信用流转批次号
    @NameInMap("batch_id")
    public String batchId;

    // 合同编号
    @NameInMap("contract_id")
    public String contractId;

    // 信用凭证额度
    @NameInMap("credit_limit")
    public String creditLimit;

    // 失败原因信息
    @NameInMap("err_msg")
    public String errMsg;

    // 信用凭证到期时间
    @NameInMap("expire_date")
    public String expireDate;

    // 信用凭证发起时间
    @NameInMap("issue_date")
    public String issueDate;

    // 信用流转凭证
    @NameInMap("issue_id")
    public String issueId;

    // 发行结果状态 
    // -1:发行失败状态， 0:未完成状态， 1:已发行状态
    @NameInMap("status")
    public Long status;

    // 发行信用流转的运单号
    @NameInMap("waybill_id")
    public String waybillId;

    public static IssueInfo build(java.util.Map<String, ?> map) throws Exception {
        IssueInfo self = new IssueInfo();
        return TeaModel.build(map, self);
    }

    public IssueInfo setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public IssueInfo setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }
    public String getContractId() {
        return this.contractId;
    }

    public IssueInfo setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public String getCreditLimit() {
        return this.creditLimit;
    }

    public IssueInfo setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public IssueInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public IssueInfo setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public IssueInfo setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public IssueInfo setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IssueInfo setWaybillId(String waybillId) {
        this.waybillId = waybillId;
        return this;
    }
    public String getWaybillId() {
        return this.waybillId;
    }

}
