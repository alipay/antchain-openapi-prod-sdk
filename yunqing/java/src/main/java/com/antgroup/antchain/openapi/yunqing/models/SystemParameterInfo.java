// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class SystemParameterInfo extends TeaModel {
    // 参数名
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    // 参数值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 环境Id
    @NameInMap("env_id")
    @Validation(required = true)
    public String envId;

    // 参数描述
    @NameInMap("description")
    public String description;

    // 记录id
    @NameInMap("id")
    public String id;

    public static SystemParameterInfo build(java.util.Map<String, ?> map) throws Exception {
        SystemParameterInfo self = new SystemParameterInfo();
        return TeaModel.build(map, self);
    }

    public SystemParameterInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SystemParameterInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public SystemParameterInfo setEnvId(String envId) {
        this.envId = envId;
        return this;
    }
    public String getEnvId() {
        return this.envId;
    }

    public SystemParameterInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SystemParameterInfo setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
