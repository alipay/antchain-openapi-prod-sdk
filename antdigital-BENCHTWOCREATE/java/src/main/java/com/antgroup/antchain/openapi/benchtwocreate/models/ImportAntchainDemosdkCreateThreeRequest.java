// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.benchtwocreate.models;

import com.aliyun.tea.*;

public class ImportAntchainDemosdkCreateThreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 3000
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    public static ImportAntchainDemosdkCreateThreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportAntchainDemosdkCreateThreeRequest self = new ImportAntchainDemosdkCreateThreeRequest();
        return TeaModel.build(map, self);
    }

    public ImportAntchainDemosdkCreateThreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportAntchainDemosdkCreateThreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportAntchainDemosdkCreateThreeRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

}
