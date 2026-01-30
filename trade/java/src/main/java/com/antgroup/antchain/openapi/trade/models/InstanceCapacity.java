// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class InstanceCapacity extends TeaModel {
    // 实例ID
    /**
     * <strong>example:</strong>
     * <p>A0KMMSFM00190219BMZNESCN1ZXEMO6IGIE</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 当前剩余容量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("current_capacity")
    @Validation(required = true)
    public String currentCapacity;

    // 初始容量
    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("initial_capacity")
    @Validation(required = true)
    public String initialCapacity;

    // 起始时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("start_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String startTime;

    // 截止时间
    /**
     * <strong>example:</strong>
     * <p>2018-10-10T10:10:00Z</p>
     */
    @NameInMap("end_time")
    @Validation(required = true, pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String endTime;

    // Valid：有效；Closed：已用完；Expired:已到期
    /**
     * <strong>example:</strong>
     * <p>状态</p>
     */
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 资源包对应商品码
    /**
     * <strong>example:</strong>
     * <p>KXSFFM00264687</p>
     */
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    // 关联按量商品码
    /**
     * <strong>example:</strong>
     * <p>KKAASP00000001</p>
     */
    @NameInMap("rel_postpay_commodity")
    @Validation(required = true)
    public String relPostpayCommodity;

    public static InstanceCapacity build(java.util.Map<String, ?> map) throws Exception {
        InstanceCapacity self = new InstanceCapacity();
        return TeaModel.build(map, self);
    }

    public InstanceCapacity setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceCapacity setCurrentCapacity(String currentCapacity) {
        this.currentCapacity = currentCapacity;
        return this;
    }
    public String getCurrentCapacity() {
        return this.currentCapacity;
    }

    public InstanceCapacity setInitialCapacity(String initialCapacity) {
        this.initialCapacity = initialCapacity;
        return this;
    }
    public String getInitialCapacity() {
        return this.initialCapacity;
    }

    public InstanceCapacity setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public InstanceCapacity setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public InstanceCapacity setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public InstanceCapacity setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public InstanceCapacity setRelPostpayCommodity(String relPostpayCommodity) {
        this.relPostpayCommodity = relPostpayCommodity;
        return this;
    }
    public String getRelPostpayCommodity() {
        return this.relPostpayCommodity;
    }

}
