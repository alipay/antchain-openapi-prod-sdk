// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_2fdfc04b2afb4da9ac403531af8942a9.models;

import com.aliyun.tea.*;

public class QuerySaasSecurityInfosecOpencheckservicequeryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 查询参数
    @NameInMap("event")
    @Validation(required = true)
    public String event;

    // 服务版本
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static QuerySaasSecurityInfosecOpencheckservicequeryRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasSecurityInfosecOpencheckservicequeryRequest self = new QuerySaasSecurityInfosecOpencheckservicequeryRequest();
        return TeaModel.build(map, self);
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public QuerySaasSecurityInfosecOpencheckservicequeryRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
