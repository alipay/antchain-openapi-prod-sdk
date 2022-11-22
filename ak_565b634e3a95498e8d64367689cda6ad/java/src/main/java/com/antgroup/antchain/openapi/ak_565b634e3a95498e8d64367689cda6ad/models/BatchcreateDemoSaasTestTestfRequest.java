// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_565b634e3a95498e8d64367689cda6ad.models;

import com.aliyun.tea.*;

public class BatchcreateDemoSaasTestTestfRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // test
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static BatchcreateDemoSaasTestTestfRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchcreateDemoSaasTestTestfRequest self = new BatchcreateDemoSaasTestTestfRequest();
        return TeaModel.build(map, self);
    }

    public BatchcreateDemoSaasTestTestfRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public BatchcreateDemoSaasTestTestfRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public BatchcreateDemoSaasTestTestfRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
