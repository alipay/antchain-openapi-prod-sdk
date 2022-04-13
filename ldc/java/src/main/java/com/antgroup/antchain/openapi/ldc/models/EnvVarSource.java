// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EnvVarSource extends TeaModel {
    // 对应的ConfigMap或Secret名称。
    @NameInMap("object_name")
    @Validation(required = true)
    public String objectName;

    // 对应的Object类型。
    // 取值：ConfigMap | Secret
    @NameInMap("object_type")
    @Validation(required = true)
    public String objectType;

    // 引用的ConfigMap或则Secret的key。
    @NameInMap("key")
    @Validation(required = true)
    public String key;

    public static EnvVarSource build(java.util.Map<String, ?> map) throws Exception {
        EnvVarSource self = new EnvVarSource();
        return TeaModel.build(map, self);
    }

    public EnvVarSource setObjectName(String objectName) {
        this.objectName = objectName;
        return this;
    }
    public String getObjectName() {
        return this.objectName;
    }

    public EnvVarSource setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public EnvVarSource setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
