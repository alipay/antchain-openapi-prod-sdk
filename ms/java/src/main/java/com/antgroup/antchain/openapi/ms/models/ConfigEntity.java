// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class ConfigEntity extends TeaModel {
    // 值
    @NameInMap("value")
    @Validation(required = true)
    public String value;

    // 英文描述
    @NameInMap("desc_en")
    @Validation(required = true)
    public String descEn;

    // 中文描述
    @NameInMap("desc_cn")
    @Validation(required = true)
    public String descCn;

    public static ConfigEntity build(java.util.Map<String, ?> map) throws Exception {
        ConfigEntity self = new ConfigEntity();
        return TeaModel.build(map, self);
    }

    public ConfigEntity setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public ConfigEntity setDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }
    public String getDescEn() {
        return this.descEn;
    }

    public ConfigEntity setDescCn(String descCn) {
        this.descCn = descCn;
        return this;
    }
    public String getDescCn() {
        return this.descCn;
    }

}
