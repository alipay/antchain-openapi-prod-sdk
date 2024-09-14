// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class SignInfo extends TeaModel {
    // 司机证件号
    @NameInMap("employee_cert_no")
    @Validation(required = true)
    public String employeeCertNo;

    // 灵工卡号
    @NameInMap("employee_card_no")
    @Validation(required = true)
    public String employeeCardNo;

    // 借贷专户ID，用于后续资金相关操作
    @NameInMap("account_book_id")
    @Validation(required = true)
    public String accountBookId;

    // 签约状态，枚举值
    // ● SIGNED：已签约【灵工卡状态正常，可入金出金】
    // ● TERMINATED：已解约【不可入金出金】
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 签约时间 "yyyy-MM-dd HH:mm:ss"
    @NameInMap("sign_time")
    public String signTime;

    // 解约时间 "yyyy-MM-dd HH:mm:ss"
    @NameInMap("terminate_time")
    public String terminateTime;

    // 月租金额：单位为元
    @NameInMap("payment_amount")
    @Validation(required = true)
    public String paymentAmount;

    public static SignInfo build(java.util.Map<String, ?> map) throws Exception {
        SignInfo self = new SignInfo();
        return TeaModel.build(map, self);
    }

    public SignInfo setEmployeeCertNo(String employeeCertNo) {
        this.employeeCertNo = employeeCertNo;
        return this;
    }
    public String getEmployeeCertNo() {
        return this.employeeCertNo;
    }

    public SignInfo setEmployeeCardNo(String employeeCardNo) {
        this.employeeCardNo = employeeCardNo;
        return this;
    }
    public String getEmployeeCardNo() {
        return this.employeeCardNo;
    }

    public SignInfo setAccountBookId(String accountBookId) {
        this.accountBookId = accountBookId;
        return this;
    }
    public String getAccountBookId() {
        return this.accountBookId;
    }

    public SignInfo setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SignInfo setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public SignInfo setTerminateTime(String terminateTime) {
        this.terminateTime = terminateTime;
        return this;
    }
    public String getTerminateTime() {
        return this.terminateTime;
    }

    public SignInfo setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }
    public String getPaymentAmount() {
        return this.paymentAmount;
    }

}
