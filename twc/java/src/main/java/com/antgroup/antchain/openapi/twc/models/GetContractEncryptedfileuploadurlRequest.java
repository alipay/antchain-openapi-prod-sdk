// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class GetContractEncryptedfileuploadurlRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 包含后缀的文件全名, 合同.pdf
    @NameInMap("file_name")
    @Validation(required = true)
    public String fileName;

    // 是否已加密, 默认否
    @NameInMap("encrypted")
    public Boolean encrypted;

    // 明文文件的md5码，用于完整性校验
    @NameInMap("md5")
    @Validation(required = true)
    public String md5;

    public static GetContractEncryptedfileuploadurlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetContractEncryptedfileuploadurlRequest self = new GetContractEncryptedfileuploadurlRequest();
        return TeaModel.build(map, self);
    }

    public GetContractEncryptedfileuploadurlRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetContractEncryptedfileuploadurlRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetContractEncryptedfileuploadurlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetContractEncryptedfileuploadurlRequest setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    public GetContractEncryptedfileuploadurlRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

}
