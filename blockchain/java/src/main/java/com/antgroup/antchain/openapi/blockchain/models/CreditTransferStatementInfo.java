// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreditTransferStatementInfo extends TeaModel {
    // 信用凭证额度
    @NameInMap("credit_limit")
    public String creditLimit;

    // 信用凭证到期时间
    @NameInMap("expire_date")
    public String expireDate;

    // 凭证来源方did
    @NameInMap("from_did")
    public String fromDid;

    // 信用凭证发起时间
    @NameInMap("issue_date")
    public String issueDate;

    // 信用流转凭证
    @NameInMap("issue_id")
    public String issueId;

    // 流水类型
    @NameInMap("state_type")
    public String stateType;

    // 凭证流转方did
    @NameInMap("to_did")
    public String toDid;

    public static CreditTransferStatementInfo build(java.util.Map<String, ?> map) throws Exception {
        CreditTransferStatementInfo self = new CreditTransferStatementInfo();
        return TeaModel.build(map, self);
    }

    public CreditTransferStatementInfo setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }
    public String getCreditLimit() {
        return this.creditLimit;
    }

    public CreditTransferStatementInfo setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public CreditTransferStatementInfo setFromDid(String fromDid) {
        this.fromDid = fromDid;
        return this;
    }
    public String getFromDid() {
        return this.fromDid;
    }

    public CreditTransferStatementInfo setIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }
    public String getIssueDate() {
        return this.issueDate;
    }

    public CreditTransferStatementInfo setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public CreditTransferStatementInfo setStateType(String stateType) {
        this.stateType = stateType;
        return this;
    }
    public String getStateType() {
        return this.stateType;
    }

    public CreditTransferStatementInfo setToDid(String toDid) {
        this.toDid = toDid;
        return this;
    }
    public String getToDid() {
        return this.toDid;
    }

}
