// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDataauthorizationDataEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据类别
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 数据ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 数据名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 数据所有者ID
    @NameInMap("owner_id")
    @Validation(required = true)
    public String ownerId;

    // 流程模版
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    // DID doc里的公开信息
    @NameInMap("public_info")
    public String publicInfo;

    public static UpdateDataauthorizationDataEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataauthorizationDataEntityRequest self = new UpdateDataauthorizationDataEntityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataauthorizationDataEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDataauthorizationDataEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDataauthorizationDataEntityRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateDataauthorizationDataEntityRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateDataauthorizationDataEntityRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public UpdateDataauthorizationDataEntityRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public UpdateDataauthorizationDataEntityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataauthorizationDataEntityRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public UpdateDataauthorizationDataEntityRequest setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

    public UpdateDataauthorizationDataEntityRequest setPublicInfo(String publicInfo) {
        this.publicInfo = publicInfo;
        return this;
    }
    public String getPublicInfo() {
        return this.publicInfo;
    }

}
