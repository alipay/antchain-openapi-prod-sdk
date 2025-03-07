// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class ApplyFundAssertorderRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 授权id
    @NameInMap("auth_id")
    @Validation(required = true)
    public String authId;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true)
    public String fundId;

    // 商户的租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 商家统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 异步生成文件任务流水号
    @NameInMap("biz_no")
    @Validation(required = true)
    public String bizNo;

    // 查询开始时间
    @NameInMap("start_time")
    @Validation(required = true)
    public String startTime;

    // 查询结束时间
    @NameInMap("end_time")
    @Validation(required = true)
    public String endTime;

    // 是否过滤被其他资方标记的订单（融资申请中+融资申请通过），默认值false
    @NameInMap("filter_financing_status")
    public Boolean filterFinancingStatus;

    // 是否过滤已取消订单 （无剩余应还期数），默认值false
    @NameInMap("filter_cancel")
    public Boolean filterCancel;

    // 是否过滤提前结清订单,默认值false
    @NameInMap("filter_early_settlement")
    public Boolean filterEarlySettlement;

    // 是否过滤某一期已逾期的订单,默认值false
    @NameInMap("filter_overdue")
    public Boolean filterOverdue;

    // 是否过滤最新一期晚于计划扣款日的重试中订单 ,默认值false
    @NameInMap("filter_retry")
    public Boolean filterRetry;

    // 是否过滤付款日为当日（查询日）的订单 （当日需执行扣款的）,默认值false
    @NameInMap("filter_today_pay")
    public Boolean filterTodayPay;

    public static ApplyFundAssertorderRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyFundAssertorderRequest self = new ApplyFundAssertorderRequest();
        return TeaModel.build(map, self);
    }

    public ApplyFundAssertorderRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyFundAssertorderRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyFundAssertorderRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public ApplyFundAssertorderRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public ApplyFundAssertorderRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ApplyFundAssertorderRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ApplyFundAssertorderRequest setBizNo(String bizNo) {
        this.bizNo = bizNo;
        return this;
    }
    public String getBizNo() {
        return this.bizNo;
    }

    public ApplyFundAssertorderRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public ApplyFundAssertorderRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ApplyFundAssertorderRequest setFilterFinancingStatus(Boolean filterFinancingStatus) {
        this.filterFinancingStatus = filterFinancingStatus;
        return this;
    }
    public Boolean getFilterFinancingStatus() {
        return this.filterFinancingStatus;
    }

    public ApplyFundAssertorderRequest setFilterCancel(Boolean filterCancel) {
        this.filterCancel = filterCancel;
        return this;
    }
    public Boolean getFilterCancel() {
        return this.filterCancel;
    }

    public ApplyFundAssertorderRequest setFilterEarlySettlement(Boolean filterEarlySettlement) {
        this.filterEarlySettlement = filterEarlySettlement;
        return this;
    }
    public Boolean getFilterEarlySettlement() {
        return this.filterEarlySettlement;
    }

    public ApplyFundAssertorderRequest setFilterOverdue(Boolean filterOverdue) {
        this.filterOverdue = filterOverdue;
        return this;
    }
    public Boolean getFilterOverdue() {
        return this.filterOverdue;
    }

    public ApplyFundAssertorderRequest setFilterRetry(Boolean filterRetry) {
        this.filterRetry = filterRetry;
        return this;
    }
    public Boolean getFilterRetry() {
        return this.filterRetry;
    }

    public ApplyFundAssertorderRequest setFilterTodayPay(Boolean filterTodayPay) {
        this.filterTodayPay = filterTodayPay;
        return this;
    }
    public Boolean getFilterTodayPay() {
        return this.filterTodayPay;
    }

}
