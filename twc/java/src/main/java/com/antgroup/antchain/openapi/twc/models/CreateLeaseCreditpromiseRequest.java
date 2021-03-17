// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseCreditpromiseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台创建返回
    @NameInMap("application_id")
    public String applicationId;

    // 融资租赁承诺额外字段
    @NameInMap("credit_promise_extra_info_list")
    public java.util.List<String> creditPromiseExtraInfoList;

    // 租赁平台金融科技id
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 垫付金额
    @NameInMap("pay_in_advance_money")
    public Long payInAdvanceMoney;

    // 垫付金额，精确到毫厘，即123400表示12.34元
    @NameInMap("pay_in_advance_money_list")
    public java.util.List<Long> payInAdvanceMoneyList;

    // 垫付日期
    @NameInMap("pay_in_advance_time")
    public String payInAdvanceTime;

    // 垫付日  格式为2019-8-31 12:00:00
    @NameInMap("pay_in_advance_time_list")
    @Validation(required = true)
    public java.util.List<String> payInAdvanceTimeList;

    // 根据融资租赁合同及其补充协议哈希
    @NameInMap("promise_hash")
    @Validation(required = true)
    public String promiseHash;

    // 根据融资租赁合同及其补充协议存证交易hash
    @NameInMap("promise_tx_hash")
    @Validation(required = true)
    public String promiseTxHash;

    // 归还金额
    @NameInMap("return_money")
    public Long returnMoney;

    // 还款金额，精确到毫厘，即123400表示12.34元
    @NameInMap("return_money_list")
    @Validation(required = true)
    public java.util.List<Long> returnMoneyList;

    // 还款比例，精确到小数点后四位 12.34% 表示为1234
    @NameInMap("return_rate")
    public Long returnRate;

    // 归还日，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time")
    public String returnTime;

    // 归还日，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time_list")
    @Validation(required = true)
    public java.util.List<String> returnTimeList;

    // 是否启动异步订单处理
    @NameInMap("async")
    public Long async;

    public static CreateLeaseCreditpromiseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseCreditpromiseRequest self = new CreateLeaseCreditpromiseRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseCreditpromiseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseCreditpromiseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseCreditpromiseRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseCreditpromiseRequest setCreditPromiseExtraInfoList(java.util.List<String> creditPromiseExtraInfoList) {
        this.creditPromiseExtraInfoList = creditPromiseExtraInfoList;
        return this;
    }
    public java.util.List<String> getCreditPromiseExtraInfoList() {
        return this.creditPromiseExtraInfoList;
    }

    public CreateLeaseCreditpromiseRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseCreditpromiseRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseCreditpromiseRequest setPayInAdvanceMoney(Long payInAdvanceMoney) {
        this.payInAdvanceMoney = payInAdvanceMoney;
        return this;
    }
    public Long getPayInAdvanceMoney() {
        return this.payInAdvanceMoney;
    }

    public CreateLeaseCreditpromiseRequest setPayInAdvanceMoneyList(java.util.List<Long> payInAdvanceMoneyList) {
        this.payInAdvanceMoneyList = payInAdvanceMoneyList;
        return this;
    }
    public java.util.List<Long> getPayInAdvanceMoneyList() {
        return this.payInAdvanceMoneyList;
    }

    public CreateLeaseCreditpromiseRequest setPayInAdvanceTime(String payInAdvanceTime) {
        this.payInAdvanceTime = payInAdvanceTime;
        return this;
    }
    public String getPayInAdvanceTime() {
        return this.payInAdvanceTime;
    }

    public CreateLeaseCreditpromiseRequest setPayInAdvanceTimeList(java.util.List<String> payInAdvanceTimeList) {
        this.payInAdvanceTimeList = payInAdvanceTimeList;
        return this;
    }
    public java.util.List<String> getPayInAdvanceTimeList() {
        return this.payInAdvanceTimeList;
    }

    public CreateLeaseCreditpromiseRequest setPromiseHash(String promiseHash) {
        this.promiseHash = promiseHash;
        return this;
    }
    public String getPromiseHash() {
        return this.promiseHash;
    }

    public CreateLeaseCreditpromiseRequest setPromiseTxHash(String promiseTxHash) {
        this.promiseTxHash = promiseTxHash;
        return this;
    }
    public String getPromiseTxHash() {
        return this.promiseTxHash;
    }

    public CreateLeaseCreditpromiseRequest setReturnMoney(Long returnMoney) {
        this.returnMoney = returnMoney;
        return this;
    }
    public Long getReturnMoney() {
        return this.returnMoney;
    }

    public CreateLeaseCreditpromiseRequest setReturnMoneyList(java.util.List<Long> returnMoneyList) {
        this.returnMoneyList = returnMoneyList;
        return this;
    }
    public java.util.List<Long> getReturnMoneyList() {
        return this.returnMoneyList;
    }

    public CreateLeaseCreditpromiseRequest setReturnRate(Long returnRate) {
        this.returnRate = returnRate;
        return this;
    }
    public Long getReturnRate() {
        return this.returnRate;
    }

    public CreateLeaseCreditpromiseRequest setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public CreateLeaseCreditpromiseRequest setReturnTimeList(java.util.List<String> returnTimeList) {
        this.returnTimeList = returnTimeList;
        return this;
    }
    public java.util.List<String> getReturnTimeList() {
        return this.returnTimeList;
    }

    public CreateLeaseCreditpromiseRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

}
