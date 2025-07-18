// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class ReturnDetail extends TeaModel {
    // 结果对象内容
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("biz_content")
    @Validation(required = true)
    public String bizContent;

    // 返回形式
    /**
     * <strong>example:</strong>
     * <p>BIZCONTENT 字段返回格式化,这种模式下取bizContent字段 FILE 文件模式，这种模式下用fileUrls获取文件</p>
     */
    @NameInMap("return_type")
    @Validation(required = true)
    public String returnType;

    // 文件列表
    /**
     * <strong>example:</strong>
     * <p>[&quot;a.com&quot;,&quot;b.com&quot;]</p>
     */
    @NameInMap("file_urls")
    @Validation(required = true)
    public java.util.List<String> fileUrls;

    // 文件类型
    /**
     * <strong>example:</strong>
     * <p> PDF pdf TXT JSON结构化</p>
     */
    @NameInMap("file_type")
    @Validation(required = true)
    public String fileType;

    // 加密模式
    /**
     * <strong>example:</strong>
     * <p>LINKS：链接加密 CONTENT：内容加密，使用信封模式，</p>
     */
    @NameInMap("encrypt_model")
    @Validation(required = true)
    public String encryptModel;

    // 密钥信封
    /**
     * <strong>example:</strong>
     * <p>密钥信封，用RSA将将对内容处理的对称钥加密</p>
     */
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
