// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CommissionResult extends TeaModel {
    // 手续费生效时间
    @NameInMap("begin_time")
    @Validation(required = true)
    public Long beginTime;

    // 手续费
    @NameInMap("commission")
    @Validation(required = true)
    public String commission;

    // 手续费信息ID
    @NameInMap("commission_id")
    @Validation(required = true)
    public String commissionId;

    // 手续费状态（0可用，1停用，2禁用）
    @NameInMap("commission_status")
    @Validation(required = true)
    public Long commissionStatus;

    // 手续费失效时间
    @NameInMap("end_time")
    @Validation(required = true)
    public Long endTime;

    // 商品类型
    @NameInMap("equity_type")
    @Validation(required = true)
    public Long equityType;

    // 租户ID
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 手续费信息ID
    @NameInMap("commission_sub_id")
    @Validation(required = true)
    public String commissionSubId;

    public static CommissionResult build(java.util.Map<String, ?> map) throws Exception {
        CommissionResult self = new CommissionResult();
        return TeaModel.build(map, self);
    }

    public CommissionResult setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public CommissionResult setCommission(String commission) {
        this.commission = commission;
        return this;
    }
    public String getCommission() {
        return this.commission;
    }

    public CommissionResult setCommissionId(String commissionId) {
        this.commissionId = commissionId;
        return this;
    }
    public String getCommissionId() {
        return this.commissionId;
    }

    public CommissionResult setCommissionStatus(Long commissionStatus) {
        this.commissionStatus = commissionStatus;
        return this;
    }
    public Long getCommissionStatus() {
        return this.commissionStatus;
    }

    public CommissionResult setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CommissionResult setEquityType(Long equityType) {
        this.equityType = equityType;
        return this;
    }
    public Long getEquityType() {
        return this.equityType;
    }

    public CommissionResult setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CommissionResult setCommissionSubId(String commissionSubId) {
        this.commissionSubId = commissionSubId;
        return this;
    }
    public String getCommissionSubId() {
        return this.commissionSubId;
    }

}
