// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BackflowEventRecord extends TeaModel {
    // 回流事件部分分组后的记录list
    @NameInMap("properties")
    @Validation(required = true)
    public java.util.List<BackflowEventRecordProperty> properties;

    public static BackflowEventRecord build(java.util.Map<String, ?> map) throws Exception {
        BackflowEventRecord self = new BackflowEventRecord();
        return TeaModel.build(map, self);
    }

    public BackflowEventRecord setProperties(java.util.List<BackflowEventRecordProperty> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<BackflowEventRecordProperty> getProperties() {
        return this.properties;
    }

}
