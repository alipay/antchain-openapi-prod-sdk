// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class QueryInfosecOpencheckservicequeryRequest extends TeaModel {
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

    public static QueryInfosecOpencheckservicequeryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInfosecOpencheckservicequeryRequest self = new QueryInfosecOpencheckservicequeryRequest();
        return TeaModel.build(map, self);
    }

    public QueryInfosecOpencheckservicequeryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInfosecOpencheckservicequeryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInfosecOpencheckservicequeryRequest setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public QueryInfosecOpencheckservicequeryRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
