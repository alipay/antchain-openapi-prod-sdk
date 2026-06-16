// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demosdk.models;

import com.aliyun.tea.*;

public class ImportTwiceThreeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 超时间
    @NameInMap("timeout")
    @Validation(required = true)
    public String timeout;

    // 结构体A
    @NameInMap("struct_a")
    public TestParamA structA;

    // 结构体B
    @NameInMap("struct_b")
    public TestParamB structB;

    public static ImportTwiceThreeRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportTwiceThreeRequest self = new ImportTwiceThreeRequest();
        return TeaModel.build(map, self);
    }

    public ImportTwiceThreeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ImportTwiceThreeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ImportTwiceThreeRequest setTimeout(String timeout) {
        this.timeout = timeout;
        return this;
    }
    public String getTimeout() {
        return this.timeout;
    }

    public ImportTwiceThreeRequest setStructA(TestParamA structA) {
        this.structA = structA;
        return this;
    }
    public TestParamA getStructA() {
        return this.structA;
    }

    public ImportTwiceThreeRequest setStructB(TestParamB structB) {
        this.structB = structB;
        return this;
    }
    public TestParamB getStructB() {
        return this.structB;
    }

}
