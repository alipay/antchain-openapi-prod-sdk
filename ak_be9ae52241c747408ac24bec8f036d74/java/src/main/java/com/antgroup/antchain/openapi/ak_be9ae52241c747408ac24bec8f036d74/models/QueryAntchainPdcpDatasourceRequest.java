// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class QueryAntchainPdcpDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 想要查询的数据源的数据源id，用于指定数据源
    @NameInMap("datasource_id")
    @Validation(required = true, minLength = 1)
    public String datasourceId;

    public static QueryAntchainPdcpDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainPdcpDatasourceRequest self = new QueryAntchainPdcpDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainPdcpDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainPdcpDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainPdcpDatasourceRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

}
