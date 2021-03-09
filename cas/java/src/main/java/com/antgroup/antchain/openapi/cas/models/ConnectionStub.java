// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ConnectionStub extends TeaModel {
    // cloud
    @NameInMap("cloud")
    public Cloud cloud;

    // id
    @NameInMap("id")
    public Long id;

    // tenant_id
    @NameInMap("tenant_id")
    public String tenantId;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // type
    @NameInMap("type")
    public String type;

    public static ConnectionStub build(java.util.Map<String, ?> map) throws Exception {
        ConnectionStub self = new ConnectionStub();
        return TeaModel.build(map, self);
    }

    public ConnectionStub setCloud(Cloud cloud) {
        this.cloud = cloud;
        return this;
    }
    public Cloud getCloud() {
        return this.cloud;
    }

    public ConnectionStub setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ConnectionStub setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public ConnectionStub setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public ConnectionStub setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
