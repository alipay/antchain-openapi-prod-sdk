// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class GetDmsBindingtemplateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ins
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    public static GetDmsBindingtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDmsBindingtemplateRequest self = new GetDmsBindingtemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDmsBindingtemplateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDmsBindingtemplateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDmsBindingtemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
