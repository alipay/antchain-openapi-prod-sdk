// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class TemplateOptionMap extends TeaModel {
    // Map<String, TaskTemplateOptionConfig> templateOptionMap中的key
    @NameInMap("key")
    public String key;

    // TaskTemplateOptionConfig
    @NameInMap("value")
    public TaskTemplateOptionConfig value;

    public static TemplateOptionMap build(java.util.Map<String, ?> map) throws Exception {
        TemplateOptionMap self = new TemplateOptionMap();
        return TeaModel.build(map, self);
    }

    public TemplateOptionMap setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public TemplateOptionMap setValue(TaskTemplateOptionConfig value) {
        this.value = value;
        return this;
    }
    public TaskTemplateOptionConfig getValue() {
        return this.value;
    }

}
