// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class Agreement extends TeaModel {
    // 协议名称
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("agreement_name")
    @Validation(required = true)
    public String agreementName;

    // 协议类型
    /**
     * <strong>example:</strong>
     * <p>USER_SERVICE_AUTH</p>
     */
    @NameInMap("agreement_type")
    @Validation(required = true)
    public String agreementType;

    // 第三方原始协议链接
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("agreement_url")
    @Validation(required = true)
    public String agreementUrl;

    // 协议文件上传目录
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("agreement_file_oss_key")
    @Validation(required = true)
    public String agreementFileOssKey;

    // 上传时的协议原始文件名
    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("agreement_file_original_name")
    @Validation(required = true)
    public String agreementFileOriginalName;

    public static Agreement build(java.util.Map<String, ?> map) throws Exception {
        Agreement self = new Agreement();
        return TeaModel.build(map, self);
    }

    public Agreement setAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }
    public String getAgreementName() {
        return this.agreementName;
    }

    public Agreement setAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }
    public String getAgreementType() {
        return this.agreementType;
    }

    public Agreement setAgreementUrl(String agreementUrl) {
        this.agreementUrl = agreementUrl;
        return this;
    }
    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public Agreement setAgreementFileOssKey(String agreementFileOssKey) {
        this.agreementFileOssKey = agreementFileOssKey;
        return this;
    }
    public String getAgreementFileOssKey() {
        return this.agreementFileOssKey;
    }

    public Agreement setAgreementFileOriginalName(String agreementFileOriginalName) {
        this.agreementFileOriginalName = agreementFileOriginalName;
        return this;
    }
    public String getAgreementFileOriginalName() {
        return this.agreementFileOriginalName;
    }

}
