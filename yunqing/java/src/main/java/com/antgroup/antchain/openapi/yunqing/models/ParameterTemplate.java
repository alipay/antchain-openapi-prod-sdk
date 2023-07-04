// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yunqing.models;

import com.aliyun.tea.*;

public class ParameterTemplate extends TeaModel {
    // template模板值
    @NameInMap("template")
    @Validation(required = true)
    public String template;

    // target 模版对象
    @NameInMap("target")
    public String target;

    public static ParameterTemplate build(java.util.Map<String, ?> map) throws Exception {
        ParameterTemplate self = new ParameterTemplate();
        return TeaModel.build(map, self);
    }

    public ParameterTemplate setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public ParameterTemplate setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

}
