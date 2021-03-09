// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class DatabaseSecurityIp extends TeaModel {
    // id
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // resource_id
    @NameInMap("resource_id")
    public String resourceId;

    // resource_type
    @NameInMap("resource_type")
    public String resourceType;

    // ip
    @NameInMap("ip")
    public String ip;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    public static DatabaseSecurityIp build(java.util.Map<String, ?> map) throws Exception {
        DatabaseSecurityIp self = new DatabaseSecurityIp();
        return TeaModel.build(map, self);
    }

    public DatabaseSecurityIp setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DatabaseSecurityIp setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DatabaseSecurityIp setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DatabaseSecurityIp setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public DatabaseSecurityIp setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DatabaseSecurityIp setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
