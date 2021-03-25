// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateBuildpackUpdatepackagesstatusRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("tenant")
    public String tenant;

    // buildpackId
    @NameInMap("id")
    public String id;

    // newFileStatus
    @NameInMap("new_file_status")
    public String newFileStatus;

    // originalFileStatus
    @NameInMap("original_file_status")
    public String originalFileStatus;

    // regionIds
    @NameInMap("region_num")
    public java.util.List<String> regionNum;

    public static UpdateBuildpackUpdatepackagesstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBuildpackUpdatepackagesstatusRequest self = new UpdateBuildpackUpdatepackagesstatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setNewFileStatus(String newFileStatus) {
        this.newFileStatus = newFileStatus;
        return this;
    }
    public String getNewFileStatus() {
        return this.newFileStatus;
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setOriginalFileStatus(String originalFileStatus) {
        this.originalFileStatus = originalFileStatus;
        return this;
    }
    public String getOriginalFileStatus() {
        return this.originalFileStatus;
    }

    public UpdateBuildpackUpdatepackagesstatusRequest setRegionNum(java.util.List<String> regionNum) {
        this.regionNum = regionNum;
        return this;
    }
    public java.util.List<String> getRegionNum() {
        return this.regionNum;
    }

}
