// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class EnvVar extends TeaModel {
    // 环境变量名称。
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 环境变量value。
    @NameInMap("value")
    public String value;

    // 环境变量的取值来源。
    @NameInMap("value_from")
    public EnvVarSource valueFrom;

    // EnvVar类型
    @NameInMap("type")
    public String type;

    public static EnvVar build(java.util.Map<String, ?> map) throws Exception {
        EnvVar self = new EnvVar();
        return TeaModel.build(map, self);
    }

    public EnvVar setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public EnvVar setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public EnvVar setValueFrom(EnvVarSource valueFrom) {
        this.valueFrom = valueFrom;
        return this;
    }
    public EnvVarSource getValueFrom() {
        return this.valueFrom;
    }

    public EnvVar setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
