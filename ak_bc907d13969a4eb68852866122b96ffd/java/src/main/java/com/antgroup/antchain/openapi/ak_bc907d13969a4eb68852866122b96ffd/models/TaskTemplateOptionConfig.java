// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_bc907d13969a4eb68852866122b96ffd.models;

import com.aliyun.tea.*;

public class TaskTemplateOptionConfig extends TeaModel {
    // defaultresult
    @NameInMap("defaultresult")
    @Validation(required = true)
    public String defaultresult;

    // rule
    @NameInMap("rule")
    public String rule;

    // 预制选项，针对填空题的输入题目
    @NameInMap("preoptions")
    public java.util.List<String> preoptions;

    public static TaskTemplateOptionConfig build(java.util.Map<String, ?> map) throws Exception {
        TaskTemplateOptionConfig self = new TaskTemplateOptionConfig();
        return TeaModel.build(map, self);
    }

    public TaskTemplateOptionConfig setDefaultresult(String defaultresult) {
        this.defaultresult = defaultresult;
        return this;
    }
    public String getDefaultresult() {
        return this.defaultresult;
    }

    public TaskTemplateOptionConfig setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public TaskTemplateOptionConfig setPreoptions(java.util.List<String> preoptions) {
        this.preoptions = preoptions;
        return this;
    }
    public java.util.List<String> getPreoptions() {
        return this.preoptions;
    }

}
