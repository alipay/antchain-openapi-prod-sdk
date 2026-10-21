// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent.models;

import com.aliyun.tea.*;

public class ExtractschemaKmDocumentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 知识库ID
    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    // OSS文件Key
    @NameInMap("file_key")
    @Validation(required = true)
    public String fileKey;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // OSS提供方
    @NameInMap("oss_provider")
    public String ossProvider;

    // 抽取目标描述
    @NameInMap("description")
    public String description;

    public static ExtractschemaKmDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractschemaKmDocumentRequest self = new ExtractschemaKmDocumentRequest();
        return TeaModel.build(map, self);
    }

    public ExtractschemaKmDocumentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExtractschemaKmDocumentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExtractschemaKmDocumentRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public ExtractschemaKmDocumentRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public ExtractschemaKmDocumentRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ExtractschemaKmDocumentRequest setOssProvider(String ossProvider) {
        this.ossProvider = ossProvider;
        return this;
    }
    public String getOssProvider() {
        return this.ossProvider;
    }

    public ExtractschemaKmDocumentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
