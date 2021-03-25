// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class AppExtraInfo extends TeaModel {
    // 应用额外元数据名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 元数据类型为 TEXT, USER 类型
    @NameInMap("type")
    public String type;

    // 元数据值
    @NameInMap("value")
    public String value;

    public static AppExtraInfo build(java.util.Map<String, ?> map) throws Exception {
        AppExtraInfo self = new AppExtraInfo();
        return TeaModel.build(map, self);
    }

    public AppExtraInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AppExtraInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AppExtraInfo setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
