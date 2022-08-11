// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_5bb1b66c4aab4cc998c05a36078e45c1.models;

import com.aliyun.tea.*;

public class QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 123
    @NameInMap("infosec_content_query")
    @Validation(required = true)
    public InfoSecContentQuery infosecContentQuery;

    // 123
    @NameInMap("service_version")
    @Validation(required = true)
    public String serviceVersion;

    public static QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest self = new QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest();
        return TeaModel.build(map, self);
    }

    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest setInfosecContentQuery(InfoSecContentQuery infosecContentQuery) {
        this.infosecContentQuery = infosecContentQuery;
        return this;
    }
    public InfoSecContentQuery getInfosecContentQuery() {
        return this.infosecContentQuery;
    }

    public QuerySaasSecurityInfosecHoloxcontentcheckqueryserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
