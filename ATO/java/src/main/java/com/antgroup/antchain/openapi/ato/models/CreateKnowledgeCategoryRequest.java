// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class CreateKnowledgeCategoryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 租户id
    @NameInMap("tenant_id")
    @Validation(required = true)
    public String tenantId;

    // 文件信息
    @NameInMap("file_info")
    @Validation(required = true)
    public FileInfo fileInfo;

    public static CreateKnowledgeCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeCategoryRequest self = new CreateKnowledgeCategoryRequest();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeCategoryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateKnowledgeCategoryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateKnowledgeCategoryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public CreateKnowledgeCategoryRequest setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }
    public FileInfo getFileInfo() {
        return this.fileInfo;
    }

}
