// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class LeaseEvidentialElement extends TeaModel {
    // 订单信息
    @NameInMap("lease_order_info")
    @Validation(required = true)
    public LeaseOrderInfo leaseOrderInfo;

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

    public static LeaseEvidentialElement build(java.util.Map<String, ?> map) throws Exception {
        LeaseEvidentialElement self = new LeaseEvidentialElement();
        return TeaModel.build(map, self);
    }

    public LeaseEvidentialElement setLeaseOrderInfo(LeaseOrderInfo leaseOrderInfo) {
        this.leaseOrderInfo = leaseOrderInfo;
        return this;
    }
    public LeaseOrderInfo getLeaseOrderInfo() {
        return this.leaseOrderInfo;
    }

    public LeaseEvidentialElement setCommitmentInfo(CommitmentInfo commitmentInfo) {
        this.commitmentInfo = commitmentInfo;
        return this;
    }
    public CommitmentInfo getCommitmentInfo() {
        return this.commitmentInfo;
    }

    public LeaseEvidentialElement setLogisticsInfo(LogisticsInfo logisticsInfo) {
        this.logisticsInfo = logisticsInfo;
        return this;
    }
    public LogisticsInfo getLogisticsInfo() {
        return this.logisticsInfo;
    }

    public LeaseEvidentialElement setPerformanceInfo(PerformanceInfo performanceInfo) {
        this.performanceInfo = performanceInfo;
        return this;
    }
    public PerformanceInfo getPerformanceInfo() {
        return this.performanceInfo;
    }

}
