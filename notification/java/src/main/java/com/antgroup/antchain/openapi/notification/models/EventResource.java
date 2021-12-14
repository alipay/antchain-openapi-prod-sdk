// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.notification.models;

import com.aliyun.tea.*;

public class EventResource extends TeaModel {
    // 资源类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 实例ID
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    public static EventResource build(java.util.Map<String, ?> map) throws Exception {
        EventResource self = new EventResource();
        return TeaModel.build(map, self);
    }

    public EventResource setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public EventResource setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
