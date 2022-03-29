// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class StackAlarmRule extends TeaModel {
    // ID
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 告警套餐配置
    @NameInMap("config")
    @Validation(required = true)
    public String config;

    // 栈 ID
    @NameInMap("stack_id")
    @Validation(required = true)
    public Long stackId;

    // 指标 ID (如pv对应的ID)
    @NameInMap("stack_metric_id")
    @Validation(required = true)
    public Long stackMetricId;

    // 关联报警relation (如果未关联，默认为-1)
    @NameInMap("stack_relation_id")
    @Validation(required = true)
    public Long stackRelationId;

    // 实体对象复合 ID
    @NameInMap("stack_universal_table_id")
    @Validation(required = true)
    public String stackUniversalTableId;

    public static StackAlarmRule build(java.util.Map<String, ?> map) throws Exception {
        StackAlarmRule self = new StackAlarmRule();
        return TeaModel.build(map, self);
    }

    public StackAlarmRule setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StackAlarmRule setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public StackAlarmRule setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public StackAlarmRule setStackMetricId(Long stackMetricId) {
        this.stackMetricId = stackMetricId;
        return this;
    }
    public Long getStackMetricId() {
        return this.stackMetricId;
    }

    public StackAlarmRule setStackRelationId(Long stackRelationId) {
        this.stackRelationId = stackRelationId;
        return this;
    }
    public Long getStackRelationId() {
        return this.stackRelationId;
    }

    public StackAlarmRule setStackUniversalTableId(String stackUniversalTableId) {
        this.stackUniversalTableId = stackUniversalTableId;
        return this;
    }
    public String getStackUniversalTableId() {
        return this.stackUniversalTableId;
    }

}
