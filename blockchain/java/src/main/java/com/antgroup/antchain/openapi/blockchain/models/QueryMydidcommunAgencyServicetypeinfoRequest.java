// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryMydidcommunAgencyServicetypeinfoRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 带查询的服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    public static QueryMydidcommunAgencyServicetypeinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMydidcommunAgencyServicetypeinfoRequest self = new QueryMydidcommunAgencyServicetypeinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryMydidcommunAgencyServicetypeinfoRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryMydidcommunAgencyServicetypeinfoRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryMydidcommunAgencyServicetypeinfoRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
