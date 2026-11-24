// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiotdatalink.models;

import com.aliyun.tea.*;

public class OpenApiModelInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("model_id")
    @Validation(required = true)
    public String modelId;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    /**
     * <strong>example:</strong>
     * <p>undefined</p>
     */
    @NameInMap("region")
    @Validation(required = true)
    public String region;

    public static OpenApiModelInfo build(java.util.Map<String, ?> map) throws Exception {
        OpenApiModelInfo self = new OpenApiModelInfo();
        return TeaModel.build(map, self);
    }

    public OpenApiModelInfo setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public OpenApiModelInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public OpenApiModelInfo setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
