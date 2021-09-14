// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class DeleteDasDatasourceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 要删除的数据源biz_uuid
    @NameInMap("biz_uuid")
    @Validation(required = true)
    public String bizUuid;

    public static DeleteDasDatasourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDasDatasourceRequest self = new DeleteDasDatasourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDasDatasourceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteDasDatasourceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteDasDatasourceRequest setBizUuid(String bizUuid) {
        this.bizUuid = bizUuid;
        return this;
    }
    public String getBizUuid() {
        return this.bizUuid;
    }

}
