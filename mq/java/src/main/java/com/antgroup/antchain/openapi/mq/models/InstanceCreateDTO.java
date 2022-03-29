// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class InstanceCreateDTO extends TeaModel {
    // instance id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 实例类型
    @NameInMap("instance_type")
    @Validation(required = true)
    public Long instanceType;

    public static InstanceCreateDTO build(java.util.Map<String, ?> map) throws Exception {
        InstanceCreateDTO self = new InstanceCreateDTO();
        return TeaModel.build(map, self);
    }

    public InstanceCreateDTO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceCreateDTO setInstanceType(Long instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public Long getInstanceType() {
        return this.instanceType;
    }

}
