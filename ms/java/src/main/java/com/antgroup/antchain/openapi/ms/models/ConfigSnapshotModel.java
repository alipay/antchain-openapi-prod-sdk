// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ConfigSnapshotModel extends TeaModel {
    // 实例id
    @NameInMap("instance_id")
    public String instanceId;

    // 配置的key，例如在服务鉴权里是dataId
    @NameInMap("key")
    public String key;

    // 配置类型：例如 auth、lb 等
    @NameInMap("type")
    public String type;

    // 配置值
    @NameInMap("value")
    public String value;

    public static ConfigSnapshotModel build(java.util.Map<String, ?> map) throws Exception {
        ConfigSnapshotModel self = new ConfigSnapshotModel();
        return TeaModel.build(map, self);
    }

    public ConfigSnapshotModel setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigSnapshotModel setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConfigSnapshotModel setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ConfigSnapshotModel setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
