// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ImportPlatformTestregionTestfuncRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("test_param1")
    @Validation(required = true)
    public String testParam1;

    // 123
    @NameInMap("test_param2")
    @Validation(required = true)
    public Long testParam2;

    // 123
    @NameInMap("test_param3")
    @Validation(required = true)
    public java.util.List<NodeInfo> testParam3;

    public static ImportPlatformTestregionTestfuncRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportPlatformTestregionTestfuncRequest self = new ImportPlatformTestregionTestfuncRequest();
        return TeaModel.build(map, self);
    }

    public ImportPlatformTestregionTestfuncRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportPlatformTestregionTestfuncRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportPlatformTestregionTestfuncRequest setTestParam1(String testParam1) {
        this.testParam1 = testParam1;
        return this;
    }
    public String getTestParam1() {
        return this.testParam1;
    }

    public ImportPlatformTestregionTestfuncRequest setTestParam2(Long testParam2) {
        this.testParam2 = testParam2;
        return this;
    }
    public Long getTestParam2() {
        return this.testParam2;
    }

    public ImportPlatformTestregionTestfuncRequest setTestParam3(java.util.List<NodeInfo> testParam3) {
        this.testParam3 = testParam3;
        return this;
    }
    public java.util.List<NodeInfo> getTestParam3() {
        return this.testParam3;
    }

}
