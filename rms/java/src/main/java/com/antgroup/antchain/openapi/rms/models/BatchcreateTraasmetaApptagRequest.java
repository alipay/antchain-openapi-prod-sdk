// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaApptagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // app_tags
    @NameInMap("app_tags")
    @Validation(required = true)
    public java.util.List<TraasAppTagDto> appTags;

    public static BatchcreateTraasmetaApptagRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaApptagRequest self = new BatchcreateTraasmetaApptagRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaApptagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaApptagRequest setAppTags(java.util.List<TraasAppTagDto> appTags) {
        this.appTags = appTags;
        return this;
    }
    public java.util.List<TraasAppTagDto> getAppTags() {
        return this.appTags;
    }

}
