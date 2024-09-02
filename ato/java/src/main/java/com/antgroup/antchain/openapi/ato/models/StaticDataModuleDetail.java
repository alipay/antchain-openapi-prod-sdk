// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class StaticDataModuleDetail extends TeaModel {
    // 描述
    @NameInMap("property_text")
    @Validation(required = true)
    public String propertyText;

    // 商户类型
    @NameInMap("property_value")
    @Validation(required = true)
    public String propertyValue;

    public static StaticDataModuleDetail build(java.util.Map<String, ?> map) throws Exception {
        StaticDataModuleDetail self = new StaticDataModuleDetail();
        return TeaModel.build(map, self);
    }

    public StaticDataModuleDetail setPropertyText(String propertyText) {
        this.propertyText = propertyText;
        return this;
    }
    public String getPropertyText() {
        return this.propertyText;
    }

    public StaticDataModuleDetail setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
        return this;
    }
    public String getPropertyValue() {
        return this.propertyValue;
    }

}
