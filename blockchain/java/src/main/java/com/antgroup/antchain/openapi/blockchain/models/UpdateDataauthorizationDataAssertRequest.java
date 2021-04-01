// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class UpdateDataauthorizationDataAssertRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数据资产类别
    @NameInMap("category")
    @Validation(required = true)
    public String category;

    // 数据资产ID
    @NameInMap("data_id")
    @Validation(required = true)
    public String dataId;

    // 扩展参数
    @NameInMap("extension_info")
    public String extensionInfo;

    // 数据资产名称
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    // 审批流程模版
    @NameInMap("process_template")
    public java.util.List<ProcessNode> processTemplate;

    // 数据模型ID
    @NameInMap("data_model_id")
    public String dataModelId;

    public static UpdateDataauthorizationDataAssertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataauthorizationDataAssertRequest self = new UpdateDataauthorizationDataAssertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataauthorizationDataAssertRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateDataauthorizationDataAssertRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateDataauthorizationDataAssertRequest setCategory(String category) {
        this.category = category;
        return this;
    }
    public String getCategory() {
        return this.category;
    }

    public UpdateDataauthorizationDataAssertRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public UpdateDataauthorizationDataAssertRequest setExtensionInfo(String extensionInfo) {
        this.extensionInfo = extensionInfo;
        return this;
    }
    public String getExtensionInfo() {
        return this.extensionInfo;
    }

    public UpdateDataauthorizationDataAssertRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataauthorizationDataAssertRequest setProcessTemplate(java.util.List<ProcessNode> processTemplate) {
        this.processTemplate = processTemplate;
        return this;
    }
    public java.util.List<ProcessNode> getProcessTemplate() {
        return this.processTemplate;
    }

    public UpdateDataauthorizationDataAssertRequest setDataModelId(String dataModelId) {
        this.dataModelId = dataModelId;
        return this;
    }
    public String getDataModelId() {
        return this.dataModelId;
    }

}
