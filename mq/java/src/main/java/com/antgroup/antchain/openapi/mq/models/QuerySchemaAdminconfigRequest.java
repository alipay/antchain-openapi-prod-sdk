// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mq.models;

import com.aliyun.tea.*;

public class QuerySchemaAdminconfigRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 配置类型
    @NameInMap("config_type")
    @Validation(required = true)
    public String configType;

    public static QuerySchemaAdminconfigRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySchemaAdminconfigRequest self = new QuerySchemaAdminconfigRequest();
        return TeaModel.build(map, self);
    }

    public QuerySchemaAdminconfigRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QuerySchemaAdminconfigRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QuerySchemaAdminconfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

}
