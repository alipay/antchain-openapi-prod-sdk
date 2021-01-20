// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class SidecarTemplateConfig extends TeaModel {
    // 类型：默认、透明劫持
    @NameInMap("type")
    public String type;

    // 模板内容
    @NameInMap("template")
    public String template;

    public static SidecarTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        SidecarTemplateConfig self = new SidecarTemplateConfig();
        return TeaModel.build(map, self);
    }

    public SidecarTemplateConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SidecarTemplateConfig setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
