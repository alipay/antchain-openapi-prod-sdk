// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaRegionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // regions
    @NameInMap("regions")
    @Validation(required = true)
    public java.util.List<TraasRegionDto> regions;

    public static BatchcreateTraasmetaRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaRegionRequest self = new BatchcreateTraasmetaRegionRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaRegionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaRegionRequest setRegions(java.util.List<TraasRegionDto> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<TraasRegionDto> getRegions() {
        return this.regions;
    }

}
