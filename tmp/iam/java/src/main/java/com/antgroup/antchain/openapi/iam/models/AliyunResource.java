// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class AliyunResource extends TeaModel {
    // resource_type/resource_id
    @NameInMap("resource")
    @Validation(required = true)
    public String resource;

    // 资源所属的租户
    @NameInMap("resource_tenant")
    @Validation(required = true)
    public String resourceTenant;

    public static AliyunResource build(java.util.Map<String, ?> map) throws Exception {
        AliyunResource self = new AliyunResource();
        return TeaModel.build(map, self);
    }

    public AliyunResource setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public AliyunResource setResourceTenant(String resourceTenant) {
        this.resourceTenant = resourceTenant;
        return this;
    }
    public String getResourceTenant() {
        return this.resourceTenant;
    }

}
