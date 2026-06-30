// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRpaasOpenServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 开放服务ID
    @NameInMap("service_id")
    @Validation(required = true)
    public String serviceId;

    // { "companyId": "2088" }
    @NameInMap("params")
    public String params;

    public static QueryRpaasOpenServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRpaasOpenServiceRequest self = new QueryRpaasOpenServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryRpaasOpenServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRpaasOpenServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRpaasOpenServiceRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public QueryRpaasOpenServiceRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
