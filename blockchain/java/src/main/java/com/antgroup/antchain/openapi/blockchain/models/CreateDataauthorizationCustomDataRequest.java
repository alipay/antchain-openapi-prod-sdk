// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class CreateDataauthorizationCustomDataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 区块链ID
    @NameInMap("blockchain_id")
    @Validation(required = true)
    public String blockchainId;

    // 数据对象类别
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 数据对象ID，全局唯一
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 数据对象名字
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 数据所有者ID
    @NameInMap("owner_id")
    @Validation(required = true)
    public String ownerId;

    // 流程审批模版
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    public static CreateDataauthorizationCustomDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataauthorizationCustomDataRequest self = new CreateDataauthorizationCustomDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataauthorizationCustomDataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateDataauthorizationCustomDataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateDataauthorizationCustomDataRequest setBlockchainId(String blockchainId) {
        this.blockchainId = blockchainId;
        return this;
    }
    public String getBlockchainId() {
        return this.blockchainId;
    }

    public CreateDataauthorizationCustomDataRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public CreateDataauthorizationCustomDataRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public CreateDataauthorizationCustomDataRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public CreateDataauthorizationCustomDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataauthorizationCustomDataRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public CreateDataauthorizationCustomDataRequest setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

}
