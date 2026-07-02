// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class CreateCustomerEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码，由蚂蚁提供
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 实体ID，场景内实体ID需要具有唯一性
    @NameInMap("entity_id")
    @Validation(required = true)
    public String entityId;

    // 实体名称, 例如：服务区地理围栏
    @NameInMap("entity_name")
    @Validation(required = true)
    public String entityName;

    // 实体内容 , 类型为字符串
    @NameInMap("content")
    @Validation(required = true)
    public String content;

    // 实体类别 (枚举) ，由蚂蚁提供 ，例如地理围栏：GEOFENCE
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    public static CreateCustomerEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomerEntityRequest self = new CreateCustomerEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomerEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateCustomerEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateCustomerEntityRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateCustomerEntityRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public CreateCustomerEntityRequest setEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }
    public String getEntityName() {
        return this.entityName;
    }

    public CreateCustomerEntityRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateCustomerEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

}
