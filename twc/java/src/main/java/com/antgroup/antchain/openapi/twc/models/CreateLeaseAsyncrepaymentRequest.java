// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class CreateLeaseAsyncrepaymentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 融资租赁业务id，由资方控制台生成返回
    @NameInMap("application_id")
    public String applicationId;

    // 融资租赁租户还款额外字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 是否最终订单还款结束
    @NameInMap("is_finish")
    @Validation(required = true)
    public Boolean isFinish;

    // 租赁平台商户Id 长度不可超过50
    @NameInMap("lease_id")
    @Validation(required = true, maxLength = 50, minLength = 1)
    public String leaseId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, maxLength = 50)
    public String orderId;

    // 逾期天数,支用到期日开始计算
    @NameInMap("overdue_day")
    public Long overdueDay;

    // 逾期应还款总额,本金+利息+逾期利息,精确到毫厘，即123400表示12.34元
    @NameInMap("overdue_money")
    public Long overdueMoney;

    // 逾期利率（日利率）,精确到小数点后四位 12.34% 表示为1234
    @NameInMap("overdue_rate")
    public Long overdueRate;

    // 逾期状态,暂时都以0处理，目前不处理
    @NameInMap("overdue_status")
    public Long overdueStatus;

    // 剩余应还金额，精确到毫厘，即123400表示12.34元
    @NameInMap("remain_return_money")
    @Validation(required = true)
    public Long remainReturnMoney;

    // 剩余应还期数
    @NameInMap("remain_return_term")
    @Validation(required = true, maximum = 1024)
    public Long remainReturnTerm;

    // 每次还款流水凭证，需要融资方确认，id一样则不处理
    @NameInMap("repayment_unique_id")
    @Validation(required = true)
    public String repaymentUniqueId;

    // 还款结果简要描述,长度不超过256
    @NameInMap("return_description")
    @Validation(required = true, maxLength = 256, minLength = 1)
    public String returnDescription;

    // 还款批次
    @NameInMap("return_index")
    @Validation(required = true, maximum = 1024, minimum = 1)
    public Long returnIndex;

    // 还款总额,本金+利息，精确到毫厘，即123400表示12.34元
    @NameInMap("return_money")
    @Validation(required = true)
    public Long returnMoney;

    // 还款结果状态,1.成功 2.失败
    @NameInMap("return_status")
    @Validation(required = true)
    public Long returnStatus;

    // 还款日期，格式为"2019-07-31 12:00:00"
    @NameInMap("return_time")
    @Validation(required = true)
    public String returnTime;

    // 还款来源,1.共管账号，2.网商清分
    @NameInMap("source")
    @Validation(required = true, maximum = 2, minimum = 1)
    public Long source;

    // 逾期后还款状态,1未还款,2已还款
    @NameInMap("status")
    public Long status;

    // 原所有权id
    @NameInMap("old_ownership_id")
    public String oldOwnershipId;

    // 现所有权id
    @NameInMap("new_ownership_id")
    public String newOwnershipId;

    public static CreateLeaseAsyncrepaymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLeaseAsyncrepaymentRequest self = new CreateLeaseAsyncrepaymentRequest();
        return TeaModel.build(map, self);
    }

    public CreateLeaseAsyncrepaymentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateLeaseAsyncrepaymentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateLeaseAsyncrepaymentRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public CreateLeaseAsyncrepaymentRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CreateLeaseAsyncrepaymentRequest setIsFinish(Boolean isFinish) {
        this.isFinish = isFinish;
        return this;
    }
    public Boolean getIsFinish() {
        return this.isFinish;
    }

    public CreateLeaseAsyncrepaymentRequest setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }
    public String getLeaseId() {
        return this.leaseId;
    }

    public CreateLeaseAsyncrepaymentRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateLeaseAsyncrepaymentRequest setOverdueDay(Long overdueDay) {
        this.overdueDay = overdueDay;
        return this;
    }
    public Long getOverdueDay() {
        return this.overdueDay;
    }

    public CreateLeaseAsyncrepaymentRequest setOverdueMoney(Long overdueMoney) {
        this.overdueMoney = overdueMoney;
        return this;
    }
    public Long getOverdueMoney() {
        return this.overdueMoney;
    }

    public CreateLeaseAsyncrepaymentRequest setOverdueRate(Long overdueRate) {
        this.overdueRate = overdueRate;
        return this;
    }
    public Long getOverdueRate() {
        return this.overdueRate;
    }

    public CreateLeaseAsyncrepaymentRequest setOverdueStatus(Long overdueStatus) {
        this.overdueStatus = overdueStatus;
        return this;
    }
    public Long getOverdueStatus() {
        return this.overdueStatus;
    }

    public CreateLeaseAsyncrepaymentRequest setRemainReturnMoney(Long remainReturnMoney) {
        this.remainReturnMoney = remainReturnMoney;
        return this;
    }
    public Long getRemainReturnMoney() {
        return this.remainReturnMoney;
    }

    public CreateLeaseAsyncrepaymentRequest setRemainReturnTerm(Long remainReturnTerm) {
        this.remainReturnTerm = remainReturnTerm;
        return this;
    }
    public Long getRemainReturnTerm() {
        return this.remainReturnTerm;
    }

    public CreateLeaseAsyncrepaymentRequest setRepaymentUniqueId(String repaymentUniqueId) {
        this.repaymentUniqueId = repaymentUniqueId;
        return this;
    }
    public String getRepaymentUniqueId() {
        return this.repaymentUniqueId;
    }

    public CreateLeaseAsyncrepaymentRequest setReturnDescription(String returnDescription) {
        this.returnDescription = returnDescription;
        return this;
    }
    public String getReturnDescription() {
        return this.returnDescription;
    }

    public CreateLeaseAsyncrepaymentRequest setReturnIndex(Long returnIndex) {
        this.returnIndex = returnIndex;
        return this;
    }
    public Long getReturnIndex() {
        return this.returnIndex;
    }

    public CreateLeaseAsyncrepaymentRequest setReturnMoney(Long returnMoney) {
        this.returnMoney = returnMoney;
        return this;
    }
    public Long getReturnMoney() {
        return this.returnMoney;
    }

    public CreateLeaseAsyncrepaymentRequest setReturnStatus(Long returnStatus) {
        this.returnStatus = returnStatus;
        return this;
    }
    public Long getReturnStatus() {
        return this.returnStatus;
    }

    public CreateLeaseAsyncrepaymentRequest setReturnTime(String returnTime) {
        this.returnTime = returnTime;
        return this;
    }
    public String getReturnTime() {
        return this.returnTime;
    }

    public CreateLeaseAsyncrepaymentRequest setSource(Long source) {
        this.source = source;
        return this;
    }
    public Long getSource() {
        return this.source;
    }

    public CreateLeaseAsyncrepaymentRequest setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public CreateLeaseAsyncrepaymentRequest setOldOwnershipId(String oldOwnershipId) {
        this.oldOwnershipId = oldOwnershipId;
        return this;
    }
    public String getOldOwnershipId() {
        return this.oldOwnershipId;
    }

    public CreateLeaseAsyncrepaymentRequest setNewOwnershipId(String newOwnershipId) {
        this.newOwnershipId = newOwnershipId;
        return this;
    }
    public String getNewOwnershipId() {
        return this.newOwnershipId;
    }

}
