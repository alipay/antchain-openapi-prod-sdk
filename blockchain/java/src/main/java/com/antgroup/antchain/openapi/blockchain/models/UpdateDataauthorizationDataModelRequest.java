// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDataauthorizationDataModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据模型ID
    @NameInMap("data_model_id")
    @Validation(required = true)
    public String dataModelId;

    // 数据模型描述
    @NameInMap("description")
    public String description;

    // 模型字段详细信息
    @NameInMap("field_detail")
    @Validation(required = true)
    public String fieldDetail;

    // 模型业务ID
    @NameInMap("model_biz_id")
    public String modelBizId;

    // 数据模型名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static UpdateDataauthorizationDataModelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataauthorizationDataModelRequest self = new UpdateDataauthorizationDataModelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataauthorizationDataModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDataauthorizationDataModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDataauthorizationDataModelRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public UpdateDataauthorizationDataModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateDataauthorizationDataModelRequest setFieldDetail(String fieldDetail) {
        this.fieldDetail = fieldDetail;
        return this;
    }
    public String getFieldDetail() {
        return this.fieldDetail;
    }

    public UpdateDataauthorizationDataModelRequest setModelBizId(String modelBizId) {
        this.modelBizId = modelBizId;
        return this;
    }
    public String getModelBizId() {
        return this.modelBizId;
    }

    public UpdateDataauthorizationDataModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
