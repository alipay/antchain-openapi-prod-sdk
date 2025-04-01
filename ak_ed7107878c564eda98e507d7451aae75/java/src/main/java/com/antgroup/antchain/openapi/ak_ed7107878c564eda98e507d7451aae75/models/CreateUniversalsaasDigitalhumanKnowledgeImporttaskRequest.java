// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_ed7107878c564eda98e507d7451aae75.models;

import com.aliyun.tea.*;

public class CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识点excel文件
    /**
     * <p>待上传文件</p>
     */
    @NameInMap("fileObject")
    public java.io.InputStream fileObject;

    /**
     * <p>待上传文件名</p>
     */
    @NameInMap("fileObjectName")
    public String fileObjectName;

    @NameInMap("file_id")
    @Validation(required = true)
    public String fileId;

    // 租户编码
    @NameInMap("tenant_code")
    @Validation(required = true)
    public String tenantCode;

    // 知识库id
    @NameInMap("library_id")
    @Validation(required = true)
    public Long libraryId;

    public static CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest self = new CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setFileObject(java.io.InputStream fileObject) {
        this.fileObject = fileObject;
        return this;
    }
    public java.io.InputStream getFileObject() {
        return this.fileObject;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setFileObjectName(String fileObjectName) {
        this.fileObjectName = fileObjectName;
        return this;
    }
    public String getFileObjectName() {
        return this.fileObjectName;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public CreateUniversalsaasDigitalhumanKnowledgeImporttaskRequest setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
        return this;
    }
    public Long getLibraryId() {
        return this.libraryId;
    }

}
