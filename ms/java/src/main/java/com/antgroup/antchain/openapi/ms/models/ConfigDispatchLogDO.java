// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ConfigDispatchLogDO extends TeaModel {
    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 配置的key
    @NameInMap("key")
    public String key;

    // 配置的类型
    @NameInMap("type")
    public String type;

    // 状态
    @NameInMap("status")
    public Long status;

    // 配置下发的信息
    @NameInMap("value")
    public String value;

    public static ConfigDispatchLogDO build(java.util.Map<String, ?> map) throws Exception {
        ConfigDispatchLogDO self = new ConfigDispatchLogDO();
        return TeaModel.build(map, self);
    }

    public ConfigDispatchLogDO setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigDispatchLogDO setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConfigDispatchLogDO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConfigDispatchLogDO setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public ConfigDispatchLogDO setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
