// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("kb_id")
    @Validation(required = true)
    public String kbId;

    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 解码不超过10MiB（评审初值），不得包含目录穿越
    @NameInMap("content_base64")
    @Validation(required = true)
    public String contentBase64;

    // 枚举:TXT,MD,JSON,CSV,XLSX,XLS,DOCX,DOC,PDF
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    public static UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest self = new UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest();
        return TeaModel.build(map, self);
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setKbId(String kbId) {
        this.kbId = kbId;
        return this;
    }
    public String getKbId() {
        return this.kbId;
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }
    public String getContentBase64() {
        return this.contentBase64;
    }

    public UploadBlockchainBotIotsuccessProductKnowledgebaseContentRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
