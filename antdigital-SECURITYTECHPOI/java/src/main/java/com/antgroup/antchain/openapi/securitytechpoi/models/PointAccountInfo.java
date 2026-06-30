// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytechpoi.models;

import com.aliyun.tea.*;

public class PointAccountInfo extends TeaModel {
    // 门店ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("store_id")
    public String storeId;

    // 账户ID
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("account_id")
    public String accountId;

    // 总积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("total_point")
    public String totalPoint;

    // 已充值积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("recharged_point")
    public String rechargedPoint;

    // 可用积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("available_point")
    public String availablePoint;

    // 冻结积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("frozen_point")
    public String frozenPoint;

    // 已消费积分
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("consumed_point")
    public String consumedPoint;

    // 账户状态：ACTIVE-生效, INACTIVE-失效, FROZEN-逾期冻结, CANCEL-解约中
    /**
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("account_status")
    public String accountStatus;

    public static PointAccountInfo build(java.util.Map<String, ?> map) throws Exception {
        PointAccountInfo self = new PointAccountInfo();
        return TeaModel.build(map, self);
    }

    public PointAccountInfo setStoreId(String storeId) {
        this.storeId = storeId;
        return this;
    }
    public String getStoreId() {
        return this.storeId;
    }

    public PointAccountInfo setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public PointAccountInfo setTotalPoint(String totalPoint) {
        this.totalPoint = totalPoint;
        return this;
    }
    public String getTotalPoint() {
        return this.totalPoint;
    }

    public PointAccountInfo setRechargedPoint(String rechargedPoint) {
        this.rechargedPoint = rechargedPoint;
        return this;
    }
    public String getRechargedPoint() {
        return this.rechargedPoint;
    }

    public PointAccountInfo setAvailablePoint(String availablePoint) {
        this.availablePoint = availablePoint;
        return this;
    }
    public String getAvailablePoint() {
        return this.availablePoint;
    }

    public PointAccountInfo setFrozenPoint(String frozenPoint) {
        this.frozenPoint = frozenPoint;
        return this;
    }
    public String getFrozenPoint() {
        return this.frozenPoint;
    }

    public PointAccountInfo setConsumedPoint(String consumedPoint) {
        this.consumedPoint = consumedPoint;
        return this;
    }
    public String getConsumedPoint() {
        return this.consumedPoint;
    }

    public PointAccountInfo setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

}
