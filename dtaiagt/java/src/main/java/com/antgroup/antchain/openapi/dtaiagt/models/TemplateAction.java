// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtaiagt.models;

import com.aliyun.tea.*;

public class TemplateAction extends TeaModel {
    // name
    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static TemplateAction build(java.util.Map<String, ?> map) throws Exception {
        TemplateAction self = new TemplateAction();
        return TeaModel.build(map, self);
    }

    public TemplateAction setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
