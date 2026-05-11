// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_31dc9f55b9684fe29acc7c0125a5d7a2.models;

import com.aliyun.tea.*;

public class ExecAntcloudAdomAppmarketPrivacymodelRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 商品实例id
    @NameInMap("instance_id")
    @Validation(required = true)
    public String instanceId;

    // 文件标识，文件上传时的入参
    @NameInMap("file_id")
    public String fileId;

    // 结构化入参
    @NameInMap("struct_input")
    public String structInput;

    // 上传的数据文件和产出的结果文件是否为密文，默认非密文
    @NameInMap("is_encrypt_file")
    public Boolean isEncryptFile;

    // 大模型调用时鉴权token
    @NameInMap("req_token")
    public String reqToken;

    public static ExecAntcloudAdomAppmarketPrivacymodelRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAntcloudAdomAppmarketPrivacymodelRequest self = new ExecAntcloudAdomAppmarketPrivacymodelRequest();
        return TeaModel.build(map, self);
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setStructInput(String structInput) {
        this.structInput = structInput;
        return this;
    }
    public String getStructInput() {
        return this.structInput;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setIsEncryptFile(Boolean isEncryptFile) {
        this.isEncryptFile = isEncryptFile;
        return this;
    }
    public Boolean getIsEncryptFile() {
        return this.isEncryptFile;
    }

    public ExecAntcloudAdomAppmarketPrivacymodelRequest setReqToken(String reqToken) {
        this.reqToken = reqToken;
        return this;
    }
    public String getReqToken() {
        return this.reqToken;
    }

}
