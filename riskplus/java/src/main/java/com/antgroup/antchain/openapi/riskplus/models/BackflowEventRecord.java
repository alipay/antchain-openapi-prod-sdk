// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BackflowEventRecord extends TeaModel {
    // 回流事件记录分组，ACTION-触达属性组/SERVICE-业务属性组/CONVERSION-转化属性组
    @NameInMap("group_code")
    @Validation(required = true)
    public String groupCode;

    // 回流事件部分分组后的记录list
    @NameInMap("properties")
    @Validation(required = true)
    public java.util.List<BackflowEventRecordProperty> properties;

    public static BackflowEventRecord build(java.util.Map<String, ?> map) throws Exception {
        BackflowEventRecord self = new BackflowEventRecord();
        return TeaModel.build(map, self);
    }

    public BackflowEventRecord setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public BackflowEventRecord setProperties(java.util.List<BackflowEventRecordProperty> properties) {
        this.properties = properties;
        return this;
    }
    public java.util.List<BackflowEventRecordProperty> getProperties() {
        return this.properties;
    }

}
