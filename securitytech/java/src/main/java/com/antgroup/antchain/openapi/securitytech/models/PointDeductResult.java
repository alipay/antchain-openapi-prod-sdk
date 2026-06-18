// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class PointDeductResult extends TeaModel {
    // 账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    public String accountId;

    // 本次扣减总积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_deduct_point")
    public String totalDeductPoint;

    // 账户累计已消费积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("consumed_point")
    public String consumedPoint;

    // 成功扣减的子订单数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("deduct_order_count")
    public String deductOrderCount;

    // 扣减失败的子订单ID列表（全部成功时为空）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("failed_order_ids")
    public java.util.List<String> failedOrderIds;

    public static PointDeductResult build(java.util.Map<String, ?> map) throws Exception {
        PointDeductResult self = new PointDeductResult();
        return TeaModel.build(map, self);
    }

    public PointDeductResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PointDeductResult setTotalDeductPoint(String totalDeductPoint) {
        this.totalDeductPoint = totalDeductPoint;
        return this;
    }
    public String getTotalDeductPoint() {
        return this.totalDeductPoint;
    }

    public PointDeductResult setConsumedPoint(String consumedPoint) {
        this.consumedPoint = consumedPoint;
        return this;
    }
    public String getConsumedPoint() {
        return this.consumedPoint;
    }

    public PointDeductResult setDeductOrderCount(String deductOrderCount) {
        this.deductOrderCount = deductOrderCount;
        return this;
    }
    public String getDeductOrderCount() {
        return this.deductOrderCount;
    }

    public PointDeductResult setFailedOrderIds(java.util.List<String> failedOrderIds) {
        this.failedOrderIds = failedOrderIds;
        return this;
    }
    public java.util.List<String> getFailedOrderIds() {
        return this.failedOrderIds;
    }

}
