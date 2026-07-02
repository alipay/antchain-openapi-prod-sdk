// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class ExecThingServiceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 场景码
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    // 服务标识
    @NameInMap("identifier")
    @Validation(required = true)
    public String identifier;

    // 可信设备唯一ID
    @NameInMap("entity_id_list")
    @Validation(required = true)
    public java.util.List<String> entityIdList;

    // 物模型服务入参
    @NameInMap("input_data")
    public String inputData;

    // 实体类型
    @NameInMap("entity_type")
    @Validation(required = true)
    public String entityType;

    // 是否使用trustiotId
    @NameInMap("use_trustiot_id")
    @Validation(required = true)
    public Boolean useTrustiotId;

    public static ExecThingServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecThingServiceRequest self = new ExecThingServiceRequest();
        return TeaModel.build(map, self);
    }

    public ExecThingServiceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecThingServiceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecThingServiceRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public ExecThingServiceRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public ExecThingServiceRequest setEntityIdList(java.util.List<String> entityIdList) {
        this.entityIdList = entityIdList;
        return this;
    }
    public java.util.List<String> getEntityIdList() {
        return this.entityIdList;
    }

    public ExecThingServiceRequest setInputData(String inputData) {
        this.inputData = inputData;
        return this;
    }
    public String getInputData() {
        return this.inputData;
    }

    public ExecThingServiceRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ExecThingServiceRequest setUseTrustiotId(Boolean useTrustiotId) {
        this.useTrustiotId = useTrustiotId;
        return this;
    }
    public Boolean getUseTrustiotId() {
        return this.useTrustiotId;
    }

}
