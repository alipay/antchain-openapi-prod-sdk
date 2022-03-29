// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraasmetaEntitytopoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // entity_name
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    public static QueryTraasmetaEntitytopoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraasmetaEntitytopoRequest self = new QueryTraasmetaEntitytopoRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraasmetaEntitytopoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryTraasmetaEntitytopoRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
