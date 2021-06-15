// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class EvidentialElement extends TeaModel {
    // 订单信息
    @NameInMap("order_info")
    @Validation(required = true)
    public OrderInfo orderInfo;

    // 承诺信息
    @NameInMap("commitment_info")
    @Validation(required = true)
    public CommitmentInfo commitmentInfo;

    // 物流信息
    @NameInMap("logistics_info")
    @Validation(required = true)
    public LogisticsInfo logisticsInfo;

    // 履约信息
    @NameInMap("performance_info")
    @Validation(required = true)
    public PerformanceInfo performanceInfo;

    public static EvidentialElement build(java.util.Map<String, ?> map) throws Exception {
        EvidentialElement self = new EvidentialElement();
        return TeaModel.build(map, self);
    }

    public EvidentialElement setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public EvidentialElement setCommitmentInfo(CommitmentInfo commitmentInfo) {
        this.commitmentInfo = commitmentInfo;
        return this;
    }
    public CommitmentInfo getCommitmentInfo() {
        return this.commitmentInfo;
    }

    public EvidentialElement setLogisticsInfo(LogisticsInfo logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
        return this;
    }
    public LogisticsInfo getLogisticsInfo() {
        return this.logisticsInfo;
    }

    public EvidentialElement setPerformanceInfo(PerformanceInfo performanceInfo) {
        this.performanceInfo = performanceInfo;
        return this;
    }
    public PerformanceInfo getPerformanceInfo() {
        return this.performanceInfo;
    }

}
