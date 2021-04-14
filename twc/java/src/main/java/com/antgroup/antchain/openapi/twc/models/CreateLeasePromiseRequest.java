// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeasePromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台生成返回
    @NameInMap("application_id")
    public String applicationId;

    // 审核方式,0为系统自动审核，1为人工审核
    @NameInMap("audit_mode")
    @Validation(required = true)
    public Long auditMode;

    // 清分机构金融科技租户ID
    @NameInMap("clearing_org")
    @Validation(required = true)
    public String clearingOrg;

    // 放款机构金融科技租户ID
    @NameInMap("credit_org")
    @Validation(required = true)
    public String creditOrg;

    // 第一次还款时的日期
    @NameInMap("first_pay_date")
    public String firstPayDate;

    // 融资机构的阿里uid
    @NameInMap("lease_alipay_uid")
    @Validation(required = true)
    public String leaseAlipayUid;

    // 宽限期，精确到毫秒
    @NameInMap("limit")
    @Validation(required = true)
    public Long limit;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 应付租金，精确到毫厘，即123400表示12.34元
    @NameInMap("pay_date_list")
    @Validation(required = true)
    public java.util.List<String> payDateList;

    // 租赁方承诺额外字段
    @NameInMap("pay_extra_info_list")
    public java.util.List<String> payExtraInfoList;

    // 应付租金 精确到毫厘，即123400表示12.34元	
    // 
    @NameInMap("pay_money")
    public Long payMoney;

    // 应付租金 精确到毫厘，即123400表示12.34元
    @NameInMap("pay_money_list")
    @Validation(required = true)
    public java.util.List<Long> payMoneyList;

    // 应付租金的期数
    @NameInMap("pay_period")
    @Validation(required = true)
    public Long payPeriod;

    // 是否启动异步订单处理
    @NameInMap("async")
    public Long async;

    // 首付款代扣流水号，最大长度是128
    @NameInMap("down_payment_serial_number")
    @Validation(maxLength = 128)
    public String downPaymentSerialNumber;

    public static CreateLeasePromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeasePromiseRequest self = new CreateLeasePromiseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeasePromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeasePromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeasePromiseRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeasePromiseRequest setAuditMode(Long auditMode) {
        this.auditMode = auditMode;
        return this;
    }
    public Long getAuditMode() {
        return this.auditMode;
    }

    public CreateLeasePromiseRequest setClearingOrg(String clearingOrg) {
        this.clearingOrg = clearingOrg;
        return this;
    }
    public String getClearingOrg() {
        return this.clearingOrg;
    }

    public CreateLeasePromiseRequest setCreditOrg(String creditOrg) {
        this.creditOrg = creditOrg;
        return this;
    }
    public String getCreditOrg() {
        return this.creditOrg;
    }

    public CreateLeasePromiseRequest setFirstPayDate(String firstPayDate) {
        this.firstPayDate = firstPayDate;
        return this;
    }
    public String getFirstPayDate() {
        return this.firstPayDate;
    }

    public CreateLeasePromiseRequest setLeaseAlipayUid(String leaseAlipayUid) {
        this.leaseAlipayUid = leaseAlipayUid;
        return this;
    }
    public String getLeaseAlipayUid() {
        return this.leaseAlipayUid;
    }

    public CreateLeasePromiseRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public CreateLeasePromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeasePromiseRequest setPayDateList(java.util.List<String> payDateList) {
        this.payDateList = payDateList;
        return this;
    }
    public java.util.List<String> getPayDateList() {
        return this.payDateList;
    }

    public CreateLeasePromiseRequest setPayExtraInfoList(java.util.List<String> payExtraInfoList) {
        this.payExtraInfoList = payExtraInfoList;
        return this;
    }
    public java.util.List<String> getPayExtraInfoList() {
        return this.payExtraInfoList;
    }

    public CreateLeasePromiseRequest setPayMoney(Long payMoney) {
        this.payMoney = payMoney;
        return this;
    }
    public Long getPayMoney() {
        return this.payMoney;
    }

    public CreateLeasePromiseRequest setPayMoneyList(java.util.List<Long> payMoneyList) {
        this.payMoneyList = payMoneyList;
        return this;
    }
    public java.util.List<Long> getPayMoneyList() {
        return this.payMoneyList;
    }

    public CreateLeasePromiseRequest setPayPeriod(Long payPeriod) {
        this.payPeriod = payPeriod;
        return this;
    }
    public Long getPayPeriod() {
        return this.payPeriod;
    }

    public CreateLeasePromiseRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeasePromiseRequest setDownPaymentSerialNumber(String downPaymentSerialNumber) {
        this.downPaymentSerialNumber = downPaymentSerialNumber;
        return this;
    }
    public String getDownPaymentSerialNumber() {
        return this.downPaymentSerialNumber;
    }

}
