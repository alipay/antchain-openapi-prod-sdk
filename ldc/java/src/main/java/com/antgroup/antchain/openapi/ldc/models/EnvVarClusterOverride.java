// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EnvVarClusterOverride extends TeaModel {
    // 环境变量名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环境变量取值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // Pod容器名称
    @NameInMap("container_name")
    @Validation(required = true)
    public String containerName;

    public static EnvVarClusterOverride build(java.util.Map<String, ?> map) throws Exception {
        EnvVarClusterOverride self = new EnvVarClusterOverride();
        return TeaModel.build(map, self);
    }

    public EnvVarClusterOverride setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvVarClusterOverride setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public EnvVarClusterOverride setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

}
