// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class UploadBlockchainBotIotsuccessProductSkillRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 解码不超过10MiB（评审初值），不得包含目录穿越
    @NameInMap("content_base64")
    @Validation(required = true)
    public String contentBase64;

    @NameInMap("name")
    @Validation(required = true)
    public String name;

    @NameInMap("description")
    public String description;

    public static UploadBlockchainBotIotsuccessProductSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadBlockchainBotIotsuccessProductSkillRequest self = new UploadBlockchainBotIotsuccessProductSkillRequest();
        return TeaModel.build(map, self);
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }
    public String getContentBase64() {
        return this.contentBase64;
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UploadBlockchainBotIotsuccessProductSkillRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
