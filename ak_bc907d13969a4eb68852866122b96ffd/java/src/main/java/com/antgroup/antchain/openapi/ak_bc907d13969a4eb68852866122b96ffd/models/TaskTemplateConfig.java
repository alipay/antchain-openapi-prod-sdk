// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class TaskTemplateConfig extends TeaModel {
    // templateoptionmap
    @NameInMap("templateoptionmap")
    @Validation(required = true)
    public TemplateOptionMap templateoptionmap;

    public static TaskTemplateConfig build(java.util.Map<String, ?> map) throws Exception {
        TaskTemplateConfig self = new TaskTemplateConfig();
        return TeaModel.build(map, self);
    }

    public TaskTemplateConfig setTemplateoptionmap(TemplateOptionMap templateoptionmap) {
        this.templateoptionmap = templateoptionmap;
        return this;
    }
    public TemplateOptionMap getTemplateoptionmap() {
        return this.templateoptionmap;
    }

}
