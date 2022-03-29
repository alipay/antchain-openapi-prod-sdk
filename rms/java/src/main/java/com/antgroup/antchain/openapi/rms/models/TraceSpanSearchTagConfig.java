// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class TraceSpanSearchTagConfig extends TeaModel {
    // 字段的key
    @NameInMap("key")
    public String key;

    // 中文标签
    @NameInMap("name")
    public String name;

    // 是否支持多选
    @NameInMap("multiple")
    public Boolean multiple;

    // 如果该数组非空, 那么表明用户只能从数组给定的值中进行选择, 否则意味着用户可以随意填写.
    @NameInMap("values")
    public java.util.List<String> values;

    public static TraceSpanSearchTagConfig build(java.util.Map<String, ?> map) throws Exception {
        TraceSpanSearchTagConfig self = new TraceSpanSearchTagConfig();
        return TeaModel.build(map, self);
    }

    public TraceSpanSearchTagConfig setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TraceSpanSearchTagConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TraceSpanSearchTagConfig setMultiple(Boolean multiple) {
        this.multiple = multiple;
        return this;
    }
    public Boolean getMultiple() {
        return this.multiple;
    }

    public TraceSpanSearchTagConfig setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
