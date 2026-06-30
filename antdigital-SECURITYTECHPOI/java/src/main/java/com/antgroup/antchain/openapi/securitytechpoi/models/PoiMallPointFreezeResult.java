// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class PoiMallPointFreezeResult extends TeaModel {
    // 账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    public String accountId;

    // 本次冻结总积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_freeze_point")
    public String totalFreezePoint;

    // 冻结后剩余可用积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("available_point")
    public String availablePoint;

    // 成功冻结的子订单数
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("freeze_order_count")
    public String freezeOrderCount;

    // 冻结失败的子订单ID列表
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("failed_order_ids")
    public java.util.List<String> failedOrderIds;

    public static PoiMallPointFreezeResult build(java.util.Map<String, ?> map) throws Exception {
        PoiMallPointFreezeResult self = new PoiMallPointFreezeResult();
        return TeaModel.build(map, self);
    }

    public PoiMallPointFreezeResult setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PoiMallPointFreezeResult setTotalFreezePoint(String totalFreezePoint) {
        this.totalFreezePoint = totalFreezePoint;
        return this;
    }
    public String getTotalFreezePoint() {
        return this.totalFreezePoint;
    }

    public PoiMallPointFreezeResult setAvailablePoint(String availablePoint) {
        this.availablePoint = availablePoint;
        return this;
    }
    public String getAvailablePoint() {
        return this.availablePoint;
    }

    public PoiMallPointFreezeResult setFreezeOrderCount(String freezeOrderCount) {
        this.freezeOrderCount = freezeOrderCount;
        return this;
    }
    public String getFreezeOrderCount() {
        return this.freezeOrderCount;
    }

    public PoiMallPointFreezeResult setFailedOrderIds(java.util.List<String> failedOrderIds) {
        this.failedOrderIds = failedOrderIds;
        return this;
    }
    public java.util.List<String> getFailedOrderIds() {
        return this.failedOrderIds;
    }

}
