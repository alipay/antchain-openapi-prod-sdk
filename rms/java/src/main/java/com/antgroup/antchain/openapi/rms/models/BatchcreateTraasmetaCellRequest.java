// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class BatchcreateTraasmetaCellRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // cells
    @NameInMap("cells")
    @Validation(required = true)
    public java.util.List<TraasCellDto> cells;

    public static BatchcreateTraasmetaCellRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateTraasmetaCellRequest self = new BatchcreateTraasmetaCellRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateTraasmetaCellRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateTraasmetaCellRequest setCells(java.util.List<TraasCellDto> cells) {
        this.cells = cells;
        return this;
    }
    public java.util.List<TraasCellDto> getCells() {
        return this.cells;
    }

}
