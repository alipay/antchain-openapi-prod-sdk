// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class InstanceInfo extends TeaModel {
    // 实例id
    /**
     * <strong>example:</strong>
     * <p>设备001</p>
     */
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 实例名称
    /**
     * <strong>example:</strong>
     * <p>12313</p>
     */
    @NameInMap("instance_name")
    @Validation(required = true)
    public String instanceName;

    public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceInfo self = new InstanceInfo();
        return TeaModel.build(map, self);
    }

    public InstanceInfo setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InstanceInfo setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
