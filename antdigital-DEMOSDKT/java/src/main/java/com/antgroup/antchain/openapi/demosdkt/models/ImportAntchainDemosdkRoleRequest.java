// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdkt.models;

import com.aliyun.tea.*;

public class ImportAntchainDemosdkRoleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // xx
    @NameInMap("test")
    public String test;

    public static ImportAntchainDemosdkRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAntchainDemosdkRoleRequest self = new ImportAntchainDemosdkRoleRequest();
        return TeaModel.build(map, self);
    }

    public ImportAntchainDemosdkRoleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAntchainDemosdkRoleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAntchainDemosdkRoleRequest setTest(String test) {
        this.test = test;
        return this;
    }
    public String getTest() {
        return this.test;
    }

}
