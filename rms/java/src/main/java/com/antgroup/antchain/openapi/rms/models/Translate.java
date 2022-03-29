// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class Translate extends TeaModel {
    // 列值翻译的默认值
    @NameInMap("default_value")
    public String defaultValue;

    // 列值翻译映射关系
    @NameInMap("mappings")
    public java.util.List<TranslateMapping> mappings;

    public static Translate build(java.util.Map<String, ?> map) throws Exception {
        Translate self = new Translate();
        return TeaModel.build(map, self);
    }

    public Translate setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }

    public Translate setMappings(java.util.List<TranslateMapping> mappings) {
        this.mappings = mappings;
        return this;
    }
    public java.util.List<TranslateMapping> getMappings() {
        return this.mappings;
    }

}
