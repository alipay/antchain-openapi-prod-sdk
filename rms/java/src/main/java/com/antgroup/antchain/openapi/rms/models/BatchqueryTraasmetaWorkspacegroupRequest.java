// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchqueryTraasmetaWorkspacegroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // uuids
    @NameInMap("uuids")
    public java.util.List<String> uuids;

    // names
    @NameInMap("names")
    public java.util.List<String> names;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    public static BatchqueryTraasmetaWorkspacegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryTraasmetaWorkspacegroupRequest self = new BatchqueryTraasmetaWorkspacegroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryTraasmetaWorkspacegroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchqueryTraasmetaWorkspacegroupRequest setUuids(java.util.List<String> uuids) {
        this.uuids = uuids;
        return this;
    }
    public java.util.List<String> getUuids() {
        return this.uuids;
    }

    public BatchqueryTraasmetaWorkspacegroupRequest setNames(java.util.List<String> names) {
        this.names = names;
        return this;
    }
    public java.util.List<String> getNames() {
        return this.names;
    }

    public BatchqueryTraasmetaWorkspacegroupRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public BatchqueryTraasmetaWorkspacegroupRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

}
