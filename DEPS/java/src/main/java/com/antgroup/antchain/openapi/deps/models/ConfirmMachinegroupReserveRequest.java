// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ConfirmMachinegroupReserveRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // 分组 ID
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 是否需要预确认分组
    @NameInMap("reserved")
    @Validation(required = true)
    public Boolean reserved;

    // workspace
    @NameInMap("workspace")
    @Validation(required = true)
    public String workspace;

    public static ConfirmMachinegroupReserveRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmMachinegroupReserveRequest self = new ConfirmMachinegroupReserveRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmMachinegroupReserveRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ConfirmMachinegroupReserveRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public ConfirmMachinegroupReserveRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ConfirmMachinegroupReserveRequest setReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }
    public Boolean getReserved() {
        return this.reserved;
    }

    public ConfirmMachinegroupReserveRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
