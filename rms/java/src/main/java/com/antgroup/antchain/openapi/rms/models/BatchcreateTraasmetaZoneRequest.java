// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaZoneRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // zones
    @NameInMap("zones")
    @Validation(required = true)
    public java.util.List<TraasZoneDto> zones;

    public static BatchcreateTraasmetaZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaZoneRequest self = new BatchcreateTraasmetaZoneRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaZoneRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaZoneRequest setZones(java.util.List<TraasZoneDto> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<TraasZoneDto> getZones() {
        return this.zones;
    }

}
