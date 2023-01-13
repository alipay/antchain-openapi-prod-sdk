// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ChainInsightStatisticTask extends TeaModel {
    // 统计任务ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 统计任务类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 所属链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 统计的链上合约地址
    @NameInMap("address")
    public String address;

    // 任务产出的指标信息
    @NameInMap("metrics")
    @Validation(required = true)
    public java.util.List<ChainInsightStatisticMetricMeta> metrics;

    // 任务创建时间，毫秒时间戳
    @NameInMap("create_time")
    public Long createTime;

    // 任务修改时间，毫秒时间戳
    @NameInMap("modify_time")
    public Long modifyTime;

    // 任务状态：Running： 运行中； Paused: 已暂停
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    public static ChainInsightStatisticTask build(java.util.Map<String, ?> map) throws Exception {
        ChainInsightStatisticTask self = new ChainInsightStatisticTask();
        return TeaModel.build(map, self);
    }

    public ChainInsightStatisticTask setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ChainInsightStatisticTask setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ChainInsightStatisticTask setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ChainInsightStatisticTask setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public ChainInsightStatisticTask setMetrics(java.util.List<ChainInsightStatisticMetricMeta> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<ChainInsightStatisticMetricMeta> getMetrics() {
        return this.metrics;
    }

    public ChainInsightStatisticTask setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public ChainInsightStatisticTask setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public ChainInsightStatisticTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
