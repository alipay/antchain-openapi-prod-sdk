// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class PointUnfreezeResult extends TeaModel {
    // 账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    public String accountId;

    // 本次解冻总积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_unfreeze_point")
    public String totalUnfreezePoint;

    // 解冻后可用积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("available_point")
    public String availablePoint;

    // 成功解冻的子订单数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("unfreeze_order_count")
    public String unfreezeOrderCount;

    // 解冻失败的子订单ID列表（全部成功时为空）
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("failed_order_ids")
    public java.util.List<String> failedOrderIds;

    public static PointUnfreezeResult build(java.util.Map<String, ?> map) throws Exception {
        PointUnfreezeResult self = new PointUnfreezeResult();
        return TeaModel.build(map, self);
    }

    public PointUnfreezeResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PointUnfreezeResult setTotalUnfreezePoint(String totalUnfreezePoint) {
        this.totalUnfreezePoint = totalUnfreezePoint;
        return this;
    }
    public String getTotalUnfreezePoint() {
        return this.totalUnfreezePoint;
    }

    public PointUnfreezeResult setAvailablePoint(String availablePoint) {
        this.availablePoint = availablePoint;
        return this;
    }
    public String getAvailablePoint() {
        return this.availablePoint;
    }

    public PointUnfreezeResult setUnfreezeOrderCount(String unfreezeOrderCount) {
        this.unfreezeOrderCount = unfreezeOrderCount;
        return this;
    }
    public String getUnfreezeOrderCount() {
        return this.unfreezeOrderCount;
    }

    public PointUnfreezeResult setFailedOrderIds(java.util.List<String> failedOrderIds) {
        this.failedOrderIds = failedOrderIds;
        return this;
    }
    public java.util.List<String> getFailedOrderIds() {
        return this.failedOrderIds;
    }

}
