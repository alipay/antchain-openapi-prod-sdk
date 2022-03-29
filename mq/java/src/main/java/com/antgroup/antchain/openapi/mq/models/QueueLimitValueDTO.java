// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QueueLimitValueDTO extends TeaModel {
    // 条件模式
    @NameInMap("c_mode")
    @Validation(required = true)
    public String cMode;

    // 限流域值id(新增限流规则时不填）
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 限流规则id(新增限流规则时不填）
    @NameInMap("limit_id")
    @Validation(required = true)
    public Long limitId;

    // 限流域值
    @NameInMap("l_value")
    @Validation(required = true)
    public String lValue;

    // 单位时间
    @NameInMap("u_time")
    @Validation(required = true)
    public String uTime;

    public static QueueLimitValueDTO build(java.util.Map<String, ?> map) throws Exception {
        QueueLimitValueDTO self = new QueueLimitValueDTO();
        return TeaModel.build(map, self);
    }

    public QueueLimitValueDTO setCMode(String cMode) {
        this.cMode = cMode;
        return this;
    }
    public String getCMode() {
        return this.cMode;
    }

    public QueueLimitValueDTO setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueueLimitValueDTO setLimitId(Long limitId) {
        this.limitId = limitId;
        return this;
    }
    public Long getLimitId() {
        return this.limitId;
    }

    public QueueLimitValueDTO setLValue(String lValue) {
        this.lValue = lValue;
        return this;
    }
    public String getLValue() {
        return this.lValue;
    }

    public QueueLimitValueDTO setUTime(String uTime) {
        this.uTime = uTime;
        return this;
    }
    public String getUTime() {
        return this.uTime;
    }

}
