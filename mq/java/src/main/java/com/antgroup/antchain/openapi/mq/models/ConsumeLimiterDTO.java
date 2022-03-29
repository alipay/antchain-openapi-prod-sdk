// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ConsumeLimiterDTO extends TeaModel {
    // 实例ID
    // 
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 限流类型
    // - UNIT：单元限流，指定单元/CELL限流
    // 
    @NameInMap("limiter_type")
    @Validation(required = true)
    public String limiterType;

    // 限流资源名，由 GROUP@TOPIC 组成
    // 
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 限流值配置，BASE 为基准限流值。
    @NameInMap("tps")
    @Validation(required = true)
    public String tps;

    public static ConsumeLimiterDTO build(java.util.Map<String, ?> map) throws Exception {
        ConsumeLimiterDTO self = new ConsumeLimiterDTO();
        return TeaModel.build(map, self);
    }

    public ConsumeLimiterDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConsumeLimiterDTO setLimiterType(String limiterType) {
        this.limiterType = limiterType;
        return this;
    }
    public String getLimiterType() {
        return this.limiterType;
    }

    public ConsumeLimiterDTO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ConsumeLimiterDTO setTps(String tps) {
        this.tps = tps;
        return this;
    }
    public String getTps() {
        return this.tps;
    }

}
