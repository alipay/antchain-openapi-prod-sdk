// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseDisburseinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 共管账户，网商清分
    @NameInMap("active_account")
    @Validation(required = true)
    public String activeAccount;

    // 对结果的简要描述信息
    @NameInMap("active_result_desc")
    @Validation(required = true)
    public String activeResultDesc;

    // 成功/失败 0表示失败，1表示成功
    @NameInMap("active_result_status")
    @Validation(required = true)
    public Long activeResultStatus;

    // 授信成功日期，格式为"2019-07-31 12:00:00"
    @NameInMap("active_return_date")
    @Validation(required = true)
    public String activeReturnDate;

    // 本金+利息，精确到毫厘，即123400表示12.34元
    @NameInMap("active_return_money")
    @Validation(required = true)
    public Long activeReturnMoney;

    // 支用期限，精确到毫秒
    @NameInMap("disburse_limit")
    @Validation(required = true)
    public Long disburseLimit;

    // 支用金额，精确到毫厘，即123400表示12.34元
    @NameInMap("disburse_money")
    @Validation(required = true)
    public Long disburseMoney;

    // 支用科目，服务费/租金，精确到毫厘，即123400表示12.34元
    @NameInMap("disburse_service")
    @Validation(required = true)
    public Long disburseService;

    // 逾期天数，支用到期日开始计算，天数为单位
    @NameInMap("exceed_duration")
    @Validation(required = true)
    public Long exceedDuration;

    // 1未还款，2已还款
    @NameInMap("exceed_pay_back_status")
    @Validation(required = true)
    public Long exceedPayBackStatus;

    // 逾期利率，精确到小数点后四位 12.34% 表示为1234
    @NameInMap("exceed_rate")
    @Validation(required = true)
    public Long exceedRate;

    // 逾期应还款总额，本金+利息+逾期利息，精确到毫厘，即123400表示12.34元
    @NameInMap("exceed_return_money")
    @Validation(required = true)
    public Long exceedReturnMoney;

    // 贷款利率,银行同步利率，年化8%-15%,精确到小数点后四位 12.34% 表示为1234
    @NameInMap("loan_rate")
    @Validation(required = true)
    public Long loanRate;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 到期还款日，T+支用期限，节假日顺延至第一个工作日，格式为"2019-07-31 12:00:00"
    @NameInMap("pay_back_date")
    @Validation(required = true)
    public String payBackDate;

    // 到期还款金额，本金+利息，精确到毫厘，即123400表示12.34元
    @NameInMap("pay_back_money")
    @Validation(required = true)
    public Long payBackMoney;

    // 应还利息，系统自动计算当日应还利息（T+1），精确到毫厘，即123400表示12.34元
    @NameInMap("return_interest")
    @Validation(required = true)
    public Long returnInterest;

    public static CreateLeaseDisburseinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseDisburseinfoRequest self = new CreateLeaseDisburseinfoRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseDisburseinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseDisburseinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseDisburseinfoRequest setActiveAccount(String activeAccount) {
        this.activeAccount = activeAccount;
        return this;
    }
    public String getActiveAccount() {
        return this.activeAccount;
    }

    public CreateLeaseDisburseinfoRequest setActiveResultDesc(String activeResultDesc) {
        this.activeResultDesc = activeResultDesc;
        return this;
    }
    public String getActiveResultDesc() {
        return this.activeResultDesc;
    }

    public CreateLeaseDisburseinfoRequest setActiveResultStatus(Long activeResultStatus) {
        this.activeResultStatus = activeResultStatus;
        return this;
    }
    public Long getActiveResultStatus() {
        return this.activeResultStatus;
    }

    public CreateLeaseDisburseinfoRequest setActiveReturnDate(String activeReturnDate) {
        this.activeReturnDate = activeReturnDate;
        return this;
    }
    public String getActiveReturnDate() {
        return this.activeReturnDate;
    }

    public CreateLeaseDisburseinfoRequest setActiveReturnMoney(Long activeReturnMoney) {
        this.activeReturnMoney = activeReturnMoney;
        return this;
    }
    public Long getActiveReturnMoney() {
        return this.activeReturnMoney;
    }

    public CreateLeaseDisburseinfoRequest setDisburseLimit(Long disburseLimit) {
        this.disburseLimit = disburseLimit;
        return this;
    }
    public Long getDisburseLimit() {
        return this.disburseLimit;
    }

    public CreateLeaseDisburseinfoRequest setDisburseMoney(Long disburseMoney) {
        this.disburseMoney = disburseMoney;
        return this;
    }
    public Long getDisburseMoney() {
        return this.disburseMoney;
    }

    public CreateLeaseDisburseinfoRequest setDisburseService(Long disburseService) {
        this.disburseService = disburseService;
        return this;
    }
    public Long getDisburseService() {
        return this.disburseService;
    }

    public CreateLeaseDisburseinfoRequest setExceedDuration(Long exceedDuration) {
        this.exceedDuration = exceedDuration;
        return this;
    }
    public Long getExceedDuration() {
        return this.exceedDuration;
    }

    public CreateLeaseDisburseinfoRequest setExceedPayBackStatus(Long exceedPayBackStatus) {
        this.exceedPayBackStatus = exceedPayBackStatus;
        return this;
    }
    public Long getExceedPayBackStatus() {
        return this.exceedPayBackStatus;
    }

    public CreateLeaseDisburseinfoRequest setExceedRate(Long exceedRate) {
        this.exceedRate = exceedRate;
        return this;
    }
    public Long getExceedRate() {
        return this.exceedRate;
    }

    public CreateLeaseDisburseinfoRequest setExceedReturnMoney(Long exceedReturnMoney) {
        this.exceedReturnMoney = exceedReturnMoney;
        return this;
    }
    public Long getExceedReturnMoney() {
        return this.exceedReturnMoney;
    }

    public CreateLeaseDisburseinfoRequest setLoanRate(Long loanRate) {
        this.loanRate = loanRate;
        return this;
    }
    public Long getLoanRate() {
        return this.loanRate;
    }

    public CreateLeaseDisburseinfoRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseDisburseinfoRequest setPayBackDate(String payBackDate) {
        this.payBackDate = payBackDate;
        return this;
    }
    public String getPayBackDate() {
        return this.payBackDate;
    }

    public CreateLeaseDisburseinfoRequest setPayBackMoney(Long payBackMoney) {
        this.payBackMoney = payBackMoney;
        return this;
    }
    public Long getPayBackMoney() {
        return this.payBackMoney;
    }

    public CreateLeaseDisburseinfoRequest setReturnInterest(Long returnInterest) {
        this.returnInterest = returnInterest;
        return this;
    }
    public Long getReturnInterest() {
        return this.returnInterest;
    }

}
