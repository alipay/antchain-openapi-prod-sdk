// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class HPABasedElasticConfig extends TeaModel {
    // pod要发布的部署单元及每个部署单元副本数的映射关系列表
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<CellReplicasMap> cells;

    // 最小副本数
    @NameInMap("min_replica")
    @Validation(required = true)
    public Long minReplica;

    // 最大副本数
    @NameInMap("max_replica")
    @Validation(required = true)
    public Long maxReplica;

    // 弹性伸缩指标列表
    @NameInMap("metrics")
    @Validation(required = true)
    public java.util.List<HPABasedElasticConfigMetric> metrics;

    // 扩缩容规则高级配置
    @NameInMap("behavior")
    public HPAScaleBehavior behavior;

    public static HPABasedElasticConfig build(java.util.Map<String, ?> map) throws Exception {
        HPABasedElasticConfig self = new HPABasedElasticConfig();
        return TeaModel.build(map, self);
    }

    public HPABasedElasticConfig setCells(java.util.List<CellReplicasMap> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<CellReplicasMap> getCells() {
        return this.cells;
    }

    public HPABasedElasticConfig setMinReplica(Long minReplica) {
        this.minReplica = minReplica;
        return this;
    }
    public Long getMinReplica() {
        return this.minReplica;
    }

    public HPABasedElasticConfig setMaxReplica(Long maxReplica) {
        this.maxReplica = maxReplica;
        return this;
    }
    public Long getMaxReplica() {
        return this.maxReplica;
    }

    public HPABasedElasticConfig setMetrics(java.util.List<HPABasedElasticConfigMetric> metrics) {
        this.metrics = metrics;
        return this;
    }
    public java.util.List<HPABasedElasticConfigMetric> getMetrics() {
        return this.metrics;
    }

    public HPABasedElasticConfig setBehavior(HPAScaleBehavior behavior) {
        this.behavior = behavior;
        return this;
    }
    public HPAScaleBehavior getBehavior() {
        return this.behavior;
    }

}
