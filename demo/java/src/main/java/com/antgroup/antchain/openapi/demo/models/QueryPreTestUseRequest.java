// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.demo.models;

import com.aliyun.tea.*;

public class QueryPreTestUseRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 2
    @NameInMap("struct_1")
    @Validation(required = true)
    public PreTestUse struct1;

    // 1
    @NameInMap("param_1")
    @Validation(required = true)
    public String param1;

    public static QueryPreTestUseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPreTestUseRequest self = new QueryPreTestUseRequest();
        return TeaModel.build(map, self);
    }

    public QueryPreTestUseRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPreTestUseRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPreTestUseRequest setStruct1(PreTestUse struct1) {
        this.struct1 = struct1;
        return this;
    }
    public PreTestUse getStruct1() {
        return this.struct1;
    }

    public QueryPreTestUseRequest setParam1(String param1) {
        this.param1 = param1;
        return this;
    }
    public String getParam1() {
        return this.param1;
    }

}
