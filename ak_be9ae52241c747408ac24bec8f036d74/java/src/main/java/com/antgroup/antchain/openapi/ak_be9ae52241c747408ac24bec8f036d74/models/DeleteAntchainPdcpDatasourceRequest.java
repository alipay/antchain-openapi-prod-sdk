// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_be9ae52241c747408ac24bec8f036d74.models;

import com.aliyun.tea.*;

public class DeleteAntchainPdcpDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 待删除的数据源 id，必填
    @NameInMap("datasource_id")
    @Validation(required = true)
    public String datasourceId;

    public static DeleteAntchainPdcpDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntchainPdcpDatasourceRequest self = new DeleteAntchainPdcpDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAntchainPdcpDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteAntchainPdcpDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteAntchainPdcpDatasourceRequest setDatasourceId(String datasourceId) {
        this.datasourceId = datasourceId;
        return this;
    }
    public String getDatasourceId() {
        return this.datasourceId;
    }

}
