// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class GrayLabelDownstreamRule extends TeaModel {
    // 判断入口流量的方式，目前支持通过header或cookie判断
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 用于判断的键
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    // 判断条件，目前支持相等或者不相等
    @NameInMap("condition")
    @Validation(required = true)
    public String condition;

    // 用于判断的值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static GrayLabelDownstreamRule build(java.util.Map<String, ?> map) throws Exception {
        GrayLabelDownstreamRule self = new GrayLabelDownstreamRule();
        return TeaModel.build(map, self);
    }

    public GrayLabelDownstreamRule setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public GrayLabelDownstreamRule setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GrayLabelDownstreamRule setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public GrayLabelDownstreamRule setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
