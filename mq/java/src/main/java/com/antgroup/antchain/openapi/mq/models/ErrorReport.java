// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class ErrorReport extends TeaModel {
    // 组件 数组
    @NameInMap("components")
    @Validation(required = true)
    public java.util.List<UIComponent> components;

    public static ErrorReport build(java.util.Map<String, ?> map) throws Exception {
        ErrorReport self = new ErrorReport();
        return TeaModel.build(map, self);
    }

    public ErrorReport setComponents(java.util.List<UIComponent> components) {
        this.components = components;
        return this;
    }
    public java.util.List<UIComponent> getComponents() {
        return this.components;
    }

}
