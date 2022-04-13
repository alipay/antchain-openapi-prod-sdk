// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ldc.models;

import com.aliyun.tea.*;

public class ElasticScene extends TeaModel {
    // 场景名
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 弹性场景状态，有效值（VALID，INVALID）
    @NameInMap("status")
    @Validation(required = true)
    public String status;

    // 弹性场景ID
    @NameInMap("id")
    public Long id;

    public static ElasticScene build(java.util.Map<String, ?> map) throws Exception {
        ElasticScene self = new ElasticScene();
        return TeaModel.build(map, self);
    }

    public ElasticScene setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ElasticScene setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ElasticScene setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
