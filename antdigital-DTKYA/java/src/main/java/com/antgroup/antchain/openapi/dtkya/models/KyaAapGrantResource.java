// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtkya.models;

import com.aliyun.tea.*;

public class KyaAapGrantResource extends TeaModel {
    // AAP 协议模板 resourceId。
    /**
     * <strong>example:</strong>
     * <p>RES-BRANCH-001</p>
     */
    @NameInMap("resource_id")
    @Validation(required = true)
    public String resourceId;

    // 按该 resourceId 模板填写的授权字段 JSON 对象；每个协议独立填写。
    /**
     * <strong>example:</strong>
     * <p>{&quot;city&quot;:&quot;杭州&quot;}</p>
     */
    @NameInMap("field_values")
    @Validation(required = true)
    public String fieldValues;

    public static KyaAapGrantResource build(java.util.Map<String, ?> map) throws Exception {
        KyaAapGrantResource self = new KyaAapGrantResource();
        return TeaModel.build(map, self);
    }

    public KyaAapGrantResource setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public KyaAapGrantResource setFieldValues(String fieldValues) {
        this.fieldValues = fieldValues;
        return this;
    }
    public String getFieldValues() {
        return this.fieldValues;
    }

}
