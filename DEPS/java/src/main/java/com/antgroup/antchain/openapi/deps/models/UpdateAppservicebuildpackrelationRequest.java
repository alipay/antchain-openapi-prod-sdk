// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class UpdateAppservicebuildpackrelationRequest extends TeaModel {
    @NameInMap("auth_token")
    public String authToken;

    // new_app_service
    @NameInMap("new_app_service")
    public BuildpackAppService newAppService;

    // original_app_service
    @NameInMap("original_app_service")
    public BuildpackAppService originalAppService;

    public static UpdateAppservicebuildpackrelationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppservicebuildpackrelationRequest self = new UpdateAppservicebuildpackrelationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppservicebuildpackrelationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateAppservicebuildpackrelationRequest setNewAppService(BuildpackAppService newAppService) {
        this.newAppService = newAppService;
        return this;
    }
    public BuildpackAppService getNewAppService() {
        return this.newAppService;
    }

    public UpdateAppservicebuildpackrelationRequest setOriginalAppService(BuildpackAppService originalAppService) {
        this.originalAppService = originalAppService;
        return this;
    }
    public BuildpackAppService getOriginalAppService() {
        return this.originalAppService;
    }

}
