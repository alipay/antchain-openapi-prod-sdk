// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationDataModelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务系统唯一标示
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 数据模型描述
    @NameInMap("description")
    public String description;

    // 模型字段详细信息
    @NameInMap("field_detail")
    @Validation(required = true)
    public String fieldDetail;

    // 数据模型业务ID
    @NameInMap("model_biz_id")
    public String modelBizId;

    // 数据模型名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 空间ID
    @NameInMap("space_id")
    public String spaceId;

    // 提交人ID
    @NameInMap("submitter_id")
    public String submitterId;

    public static CreateDataauthorizationDataModelRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationDataModelRequest self = new CreateDataauthorizationDataModelRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationDataModelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationDataModelRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationDataModelRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationDataModelRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDataauthorizationDataModelRequest setFieldDetail(String fieldDetail) {
        this.fieldDetail = fieldDetail;
        return this;
    }
    public String getFieldDetail() {
        return this.fieldDetail;
    }

    public CreateDataauthorizationDataModelRequest setModelBizId(String modelBizId) {
        this.modelBizId = modelBizId;
        return this;
    }
    public String getModelBizId() {
        return this.modelBizId;
    }

    public CreateDataauthorizationDataModelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationDataModelRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public CreateDataauthorizationDataModelRequest setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
        return this;
    }
    public String getSubmitterId() {
        return this.submitterId;
    }

}
