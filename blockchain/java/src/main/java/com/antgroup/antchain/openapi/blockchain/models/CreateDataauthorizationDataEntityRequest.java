// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationDataEntityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务系统数据对象唯一标示
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 数据类别
    @NameInMap("category")
    @Validation(required = true, maxLength = 32)
    public String category;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    // 扩展参数，标准JSON格式
    @NameInMap("extension_info")
    @Validation(maxLength = 2000)
    public String extensionInfo;

    // 数据名称
    @NameInMap("name")
    @Validation(required = true, maxLength = 64)
    public String name;

    // 数据所有者ID
    @NameInMap("owner_id")
    @Validation(required = true, maxLength = 100)
    public String ownerId;

    // 审批模版
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    public static CreateDataauthorizationDataEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationDataEntityRequest self = new CreateDataauthorizationDataEntityRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationDataEntityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationDataEntityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationDataEntityRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationDataEntityRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public CreateDataauthorizationDataEntityRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDataauthorizationDataEntityRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public CreateDataauthorizationDataEntityRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationDataEntityRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationDataEntityRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateDataauthorizationDataEntityRequest setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

}
