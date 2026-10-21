// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class ErfvQwsxWedcRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // string_param
    @NameInMap("string_param")
    @Validation(required = true)
    public String stringParam;

    // struct_param
    @NameInMap("struct_param")
    public TestClass structParam;

    public static ErfvQwsxWedcRequest build(java.util.Map<String, ?> map) throws Exception {
        ErfvQwsxWedcRequest self = new ErfvQwsxWedcRequest();
        return TeaModel.build(map, self);
    }

    public ErfvQwsxWedcRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ErfvQwsxWedcRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ErfvQwsxWedcRequest setStringParam(String stringParam) {
        this.stringParam = stringParam;
        return this;
    }
    public String getStringParam() {
        return this.stringParam;
    }

    public ErfvQwsxWedcRequest setStructParam(TestClass structParam) {
        this.structParam = structParam;
        return this;
    }
    public TestClass getStructParam() {
        return this.structParam;
    }

}
