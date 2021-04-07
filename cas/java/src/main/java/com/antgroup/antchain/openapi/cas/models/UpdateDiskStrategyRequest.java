// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class UpdateDiskStrategyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // delete_with_computer
    @NameInMap("delete_with_computer")
    public Boolean deleteWithComputer;

    // delete_auto_snapshot
    @NameInMap("delete_auto_snapshot")
    public Boolean deleteAutoSnapshot;

    // enable_auto_snapshot
    @NameInMap("enable_auto_snapshot")
    public Boolean enableAutoSnapshot;

    // ids
    @NameInMap("ids")
    @Validation(required = true)
    public java.util.List<String> ids;

    public static UpdateDiskStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDiskStrategyRequest self = new UpdateDiskStrategyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDiskStrategyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDiskStrategyRequest setDeleteWithComputer(Boolean deleteWithComputer) {
        this.deleteWithComputer = deleteWithComputer;
        return this;
    }
    public Boolean getDeleteWithComputer() {
        return this.deleteWithComputer;
    }

    public UpdateDiskStrategyRequest setDeleteAutoSnapshot(Boolean deleteAutoSnapshot) {
        this.deleteAutoSnapshot = deleteAutoSnapshot;
        return this;
    }
    public Boolean getDeleteAutoSnapshot() {
        return this.deleteAutoSnapshot;
    }

    public UpdateDiskStrategyRequest setEnableAutoSnapshot(Boolean enableAutoSnapshot) {
        this.enableAutoSnapshot = enableAutoSnapshot;
        return this;
    }
    public Boolean getEnableAutoSnapshot() {
        return this.enableAutoSnapshot;
    }

    public UpdateDiskStrategyRequest setIds(java.util.List<String> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<String> getIds() {
        return this.ids;
    }

}
