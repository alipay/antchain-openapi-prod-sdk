// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaAppgroupRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_groups
    @NameInMap("app_groups")
    @Validation(required = true)
    public java.util.List<TraasAppGroupDto> appGroups;

    public static BatchcreateTraasmetaAppgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaAppgroupRequest self = new BatchcreateTraasmetaAppgroupRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaAppgroupRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaAppgroupRequest setAppGroups(java.util.List<TraasAppGroupDto> appGroups) {
        this.appGroups = appGroups;
        return this;
    }
    public java.util.List<TraasAppGroupDto> getAppGroups() {
        return this.appGroups;
    }

}
