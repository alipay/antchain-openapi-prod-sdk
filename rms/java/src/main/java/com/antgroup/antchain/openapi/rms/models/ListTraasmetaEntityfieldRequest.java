// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListTraasmetaEntityfieldRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 实体名称
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    public static ListTraasmetaEntityfieldRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraasmetaEntityfieldRequest self = new ListTraasmetaEntityfieldRequest();
        return TeaModel.build(map, self);
    }

    public ListTraasmetaEntityfieldRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListTraasmetaEntityfieldRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

}
