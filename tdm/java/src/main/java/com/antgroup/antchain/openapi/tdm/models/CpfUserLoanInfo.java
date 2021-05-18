// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tdm.models;

import com.aliyun.tea.*;

public class CpfUserLoanInfo extends TeaModel {
    // 用户证件号码
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 证件类型
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 配偶证件号码
    @NameInMap("po_id")
    @Validation(required = true)
    public String poId;

    // 配偶姓名
    @NameInMap("po_name")
    @Validation(required = true)
    public String poName;

    // 贷款合同编号
    @NameInMap("loan_id")
    @Validation(required = true)
    public String loanId;

    // 贷款余额
    @NameInMap("loan_balance")
    @Validation(required = true)
    public String loanBalance;

    // 贷款合同状态
    @NameInMap("loan_status")
    @Validation(required = true)
    public String loanStatus;

    public static CpfUserLoanInfo build(java.util.Map<String, ?> map) throws Exception {
        CpfUserLoanInfo self = new CpfUserLoanInfo();
        return TeaModel.build(map, self);
    }

    public CpfUserLoanInfo setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CpfUserLoanInfo setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public CpfUserLoanInfo setPoId(String poId) {
        this.poId = poId;
        return this;
    }
    public String getPoId() {
        return this.poId;
    }

    public CpfUserLoanInfo setPoName(String poName) {
        this.poName = poName;
        return this;
    }
    public String getPoName() {
        return this.poName;
    }

    public CpfUserLoanInfo setLoanId(String loanId) {
        this.loanId = loanId;
        return this;
    }
    public String getLoanId() {
        return this.loanId;
    }

    public CpfUserLoanInfo setLoanBalance(String loanBalance) {
        this.loanBalance = loanBalance;
        return this;
    }
    public String getLoanBalance() {
        return this.loanBalance;
    }

    public CpfUserLoanInfo setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
        return this;
    }
    public String getLoanStatus() {
        return this.loanStatus;
    }

}
