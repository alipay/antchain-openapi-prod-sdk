// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class CreateTraasmetaApptagRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // tag_key
    @NameInMap("tag_key")
    @Validation(required = true)
    public String tagKey;

    // outside_id
    @NameInMap("outside_id")
    public String outsideId;

    // source_from
    @NameInMap("source_from")
    @Validation(required = true)
    public String sourceFrom;

    // extension
    @NameInMap("extension")
    public String extension;

    // tenant_uuid
    @NameInMap("tenant_uuid")
    public String tenantUuid;

    // tenant_name
    @NameInMap("tenant_name")
    public String tenantName;

    // tag_value
    @NameInMap("tag_value")
    public String tagValue;

    // app_uuid
    @NameInMap("app_uuid")
    public String appUuid;

    // app_name
    @NameInMap("app_name")
    public String appName;

    public static CreateTraasmetaApptagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTraasmetaApptagRequest self = new CreateTraasmetaApptagRequest();
        return TeaModel.build(map, self);
    }

    public CreateTraasmetaApptagRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateTraasmetaApptagRequest setTagKey(String tagKey) {
        this.tagKey = tagKey;
        return this;
    }
    public String getTagKey() {
        return this.tagKey;
    }

    public CreateTraasmetaApptagRequest setOutsideId(String outsideId) {
        this.outsideId = outsideId;
        return this;
    }
    public String getOutsideId() {
        return this.outsideId;
    }

    public CreateTraasmetaApptagRequest setSourceFrom(String sourceFrom) {
        this.sourceFrom = sourceFrom;
        return this;
    }
    public String getSourceFrom() {
        return this.sourceFrom;
    }

    public CreateTraasmetaApptagRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public CreateTraasmetaApptagRequest setTenantUuid(String tenantUuid) {
        this.tenantUuid = tenantUuid;
        return this;
    }
    public String getTenantUuid() {
        return this.tenantUuid;
    }

    public CreateTraasmetaApptagRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public CreateTraasmetaApptagRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

    public CreateTraasmetaApptagRequest setAppUuid(String appUuid) {
        this.appUuid = appUuid;
        return this;
    }
    public String getAppUuid() {
        return this.appUuid;
    }

    public CreateTraasmetaApptagRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
