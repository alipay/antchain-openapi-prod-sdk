// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryCustomerentityServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 客户实体id
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 请求客户实体服务类型
    @NameInMap("service_type")
    @Validation(required = true)
    public String serviceType;

    // 查询参数json串
    @NameInMap("param")
    public String param;

    public static QueryCustomerentityServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCustomerentityServiceRequest self = new QueryCustomerentityServiceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCustomerentityServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryCustomerentityServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryCustomerentityServiceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public QueryCustomerentityServiceRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public QueryCustomerentityServiceRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public QueryCustomerentityServiceRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

}
