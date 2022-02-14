// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseClearingRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台创建返回
    @NameInMap("application_id")
    public String applicationId;

    // 清分收款账号 长度不超过64
    @NameInMap("clearing_account")
    @Validation(required = true)
    public String clearingAccount;

    // 清分金额,精确到毫厘，即123400表示12.34元
    @NameInMap("clearing_money")
    @Validation(required = true)
    public Long clearingMoney;

    // 清分订单号 长度不超过128
    @NameInMap("clearing_order_ids")
    @Validation(required = true)
    public java.util.List<String> clearingOrderIds;

    // 清分状态,1.足额2.部分3.零
    @NameInMap("clearing_state")
    public Long clearingState;

    // 结束时间，格式为"2019-07-31 12:00:00"
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 融资租赁额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 租赁平台商户Id 长度不可超过50
    @NameInMap("lease_id")
    @Validation(required = true)
    public String leaseId;

    // 订单id 长度不可超过50
    // 
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 还款批次
    @NameInMap("return_index")
    @Validation(required = true)
    public Long returnIndex;

    // 开始时间，格式为"2019-07-31 12:00:00"
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 是否启动订单的异步处理
    @NameInMap("async")
    public Long async;

    // 清分资金的来源，比如用户xx元，商家yy元
    @NameInMap("memo")
    public String memo;

    // 融资租赁资金方id
    @NameInMap("credit_id")
    @Validation(required = true)
    public String creditId;

    public static CreateLeaseClearingRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseClearingRequest self = new CreateLeaseClearingRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseClearingRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseClearingRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseClearingRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseClearingRequest setClearingAccount(String clearingAccount) {
        this.clearingAccount = clearingAccount;
        return this;
    }
    public String getClearingAccount() {
        return this.clearingAccount;
    }

    public CreateLeaseClearingRequest setClearingMoney(Long clearingMoney) {
        this.clearingMoney = clearingMoney;
        return this;
    }
    public Long getClearingMoney() {
        return this.clearingMoney;
    }

    public CreateLeaseClearingRequest setClearingOrderIds(java.util.List<String> clearingOrderIds) {
        this.clearingOrderIds = clearingOrderIds;
        return this;
    }
    public java.util.List<String> getClearingOrderIds() {
        return this.clearingOrderIds;
    }

    public CreateLeaseClearingRequest setClearingState(Long clearingState) {
        this.clearingState = clearingState;
        return this;
    }
    public Long getClearingState() {
        return this.clearingState;
    }

    public CreateLeaseClearingRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public CreateLeaseClearingRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseClearingRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseClearingRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseClearingRequest setReturnIndex(Long returnIndex) {
        this.returnIndex = returnIndex;
        return this;
    }
    public Long getReturnIndex() {
        return this.returnIndex;
    }

    public CreateLeaseClearingRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public CreateLeaseClearingRequest setAsync(Long async) {
        this.async = async;
        return this;
    }
    public Long getAsync() {
        return this.async;
    }

    public CreateLeaseClearingRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CreateLeaseClearingRequest setCreditId(String creditId) {
        this.creditId = creditId;
        return this;
    }
    public String getCreditId() {
        return this.creditId;
    }

}
