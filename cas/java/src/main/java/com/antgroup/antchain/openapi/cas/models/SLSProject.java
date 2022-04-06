// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class SLSProject extends TeaModel {
    // 项目描述
    @NameInMap("description")
    public String description;

    // 项目名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 阿里云返回的regionName，仅作展示用
    @NameInMap("region")
    public String region;

    public static SLSProject build(java.util.Map<String, ?> map) throws Exception {
        SLSProject self = new SLSProject();
        return TeaModel.build(map, self);
    }

    public SLSProject setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SLSProject setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SLSProject setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
