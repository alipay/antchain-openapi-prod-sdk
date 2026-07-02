// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class UpdateCustomerEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，由蚂蚁提供
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 实体ID
    // 
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 实体名称, 例如：服务区A地理围栏
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // 实体内容 , 类型为字符串
    // 
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    public static UpdateCustomerEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerEntityRequest self = new UpdateCustomerEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateCustomerEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateCustomerEntityRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateCustomerEntityRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public UpdateCustomerEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public UpdateCustomerEntityRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
