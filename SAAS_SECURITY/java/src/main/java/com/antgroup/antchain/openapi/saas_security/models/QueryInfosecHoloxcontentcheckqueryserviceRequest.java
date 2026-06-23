// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas_security.models;

import com.aliyun.tea.*;

public class QueryInfosecHoloxcontentcheckqueryserviceRequest extends TeaModel {
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

    public static QueryInfosecHoloxcontentcheckqueryserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInfosecHoloxcontentcheckqueryserviceRequest self = new QueryInfosecHoloxcontentcheckqueryserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryInfosecHoloxcontentcheckqueryserviceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceRequest setInfosecContentQuery(InfoSecContentQuery infosecContentQuery) {
        this.infosecContentQuery = infosecContentQuery;
        return this;
    }
    public InfoSecContentQuery getInfosecContentQuery() {
        return this.infosecContentQuery;
    }

    public QueryInfosecHoloxcontentcheckqueryserviceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
