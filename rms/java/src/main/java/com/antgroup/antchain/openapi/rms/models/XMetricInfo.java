// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class XMetricInfo extends TeaModel {
    //  
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    //  
    @NameInMap("description")
    public String description;

    //  
    @NameInMap("type")
    public String type;

    //  
    @NameInMap("unit")
    public String unit;

    public static XMetricInfo build(java.util.Map<String, ?> map) throws Exception {
        XMetricInfo self = new XMetricInfo();
        return TeaModel.build(map, self);
    }

    public XMetricInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public XMetricInfo setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public XMetricInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public XMetricInfo setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
