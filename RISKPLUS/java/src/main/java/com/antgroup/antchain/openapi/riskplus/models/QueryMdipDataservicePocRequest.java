// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryMdipDataservicePocRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务编码
    // 
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 服务参数
    @NameInMap("service_param")
    @Validation(required = true)
    public String serviceParam;

    public static QueryMdipDataservicePocRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMdipDataservicePocRequest self = new QueryMdipDataservicePocRequest();
        return TeaModel.build(map, self);
    }

    public QueryMdipDataservicePocRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMdipDataservicePocRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMdipDataservicePocRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryMdipDataservicePocRequest setServiceParam(String serviceParam) {
        this.serviceParam = serviceParam;
        return this;
    }
    public String getServiceParam() {
        return this.serviceParam;
    }

}
