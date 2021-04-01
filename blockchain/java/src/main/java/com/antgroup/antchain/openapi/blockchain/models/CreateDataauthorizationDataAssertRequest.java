// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationDataAssertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务系统数据唯一标示
    @NameInMap("biz_uid")
    @Validation(required = true)
    public String bizUid;

    // 区块链ID
    @NameInMap("blockchain_id")
    public String blockchainId;

    // 资产类别
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 资产名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 所有者ID
    @NameInMap("owner_id")
    @Validation(required = true)
    public String ownerId;

    // 审批流程模版
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    public static CreateDataauthorizationDataAssertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationDataAssertRequest self = new CreateDataauthorizationDataAssertRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationDataAssertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationDataAssertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationDataAssertRequest setBizUid(String bizUid) {
        this.bizUid = bizUid;
        return this;
    }
    public String getBizUid() {
        return this.bizUid;
    }

    public CreateDataauthorizationDataAssertRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public CreateDataauthorizationDataAssertRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDataauthorizationDataAssertRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

    public CreateDataauthorizationDataAssertRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationDataAssertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationDataAssertRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateDataauthorizationDataAssertRequest setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

}
