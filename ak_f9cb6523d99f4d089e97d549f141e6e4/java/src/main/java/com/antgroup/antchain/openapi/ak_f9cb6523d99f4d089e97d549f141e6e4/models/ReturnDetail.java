// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f9cb6523d99f4d089e97d549f141e6e4.models;

import com.aliyun.tea.*;

public class ReturnDetail extends TeaModel {
    // 结果对象内容
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 返回形式
    @NameInMap("return_type")
    @Validation(required = true)
    public String returnType;

    // 文件列表
    @NameInMap("file_urls")
    @Validation(required = true)
    public java.util.List<String> fileUrls;

    // 文件类型
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 加密模式
    @NameInMap("encrypt_model")
    @Validation(required = true)
    public String encryptModel;

    // 密钥信封
    @NameInMap("secret_envelope")
    @Validation(required = true)
    public String secretEnvelope;

    public static ReturnDetail build(java.util.Map<String, ?> map) throws Exception {
        ReturnDetail self = new ReturnDetail();
        return TeaModel.build(map, self);
    }

    public ReturnDetail setBizContent(String bizContent) {
        this.bizContent = bizContent;
        return this;
    }
    public String getBizContent() {
        return this.bizContent;
    }

    public ReturnDetail setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }
    public String getReturnType() {
        return this.returnType;
    }

    public ReturnDetail setFileUrls(java.util.List<String> fileUrls) {
        this.fileUrls = fileUrls;
        return this;
    }
    public java.util.List<String> getFileUrls() {
        return this.fileUrls;
    }

    public ReturnDetail setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ReturnDetail setEncryptModel(String encryptModel) {
        this.encryptModel = encryptModel;
        return this;
    }
    public String getEncryptModel() {
        return this.encryptModel;
    }

    public ReturnDetail setSecretEnvelope(String secretEnvelope) {
        this.secretEnvelope = secretEnvelope;
        return this;
    }
    public String getSecretEnvelope() {
        return this.secretEnvelope;
    }

}
