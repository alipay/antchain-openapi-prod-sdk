// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas.models;

import com.aliyun.tea.*;

public class QueryFoundationProtobufRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 产品码
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // api code列表信息
    @NameInMap("api_code_list")
    @Validation(required = true)
    public java.util.List<String> apiCodeList;

    public static QueryFoundationProtobufRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFoundationProtobufRequest self = new QueryFoundationProtobufRequest();
        return TeaModel.build(map, self);
    }

    public QueryFoundationProtobufRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFoundationProtobufRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFoundationProtobufRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryFoundationProtobufRequest setApiCodeList(java.util.List<String> apiCodeList) {
        this.apiCodeList = apiCodeList;
        return this;
    }
    public java.util.List<String> getApiCodeList() {
        return this.apiCodeList;
    }

}
