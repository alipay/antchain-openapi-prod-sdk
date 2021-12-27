// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryMdipDataserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 服务编码
    @NameInMap("service_code")
    @Validation(required = true)
    public String serviceCode;

    // 服务参数
    @NameInMap("service_param")
    @Validation(required = true)
    public String serviceParam;

    public static QueryMdipDataserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMdipDataserviceRequest self = new QueryMdipDataserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryMdipDataserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMdipDataserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMdipDataserviceRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public QueryMdipDataserviceRequest setServiceParam(String serviceParam) {
        this.serviceParam = serviceParam;
        return this;
    }
    public String getServiceParam() {
        return this.serviceParam;
    }

}
