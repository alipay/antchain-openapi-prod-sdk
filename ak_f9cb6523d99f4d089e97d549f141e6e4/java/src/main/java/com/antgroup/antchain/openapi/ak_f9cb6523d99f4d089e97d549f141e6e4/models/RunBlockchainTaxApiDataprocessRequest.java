// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_f9cb6523d99f4d089e97d549f141e6e4.models;

import com.aliyun.tea.*;

public class RunBlockchainTaxApiDataprocessRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数json
    @NameInMap("biz_param")
    @Validation(required = true)
    public String bizParam;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 调用的方法
    @NameInMap("method_code")
    @Validation(required = true)
    public String methodCode;

    // 租户编码
    @NameInMap("inst_code")
    public String instCode;

    // RSA-DESede
    // 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
    @NameInMap("algorithm")
    public String algorithm;

    // 是否采用加密算法
    @NameInMap("encryption")
    public Boolean encryption;

    // 对称秘钥加密后的数据
    @NameInMap("encryption_key")
    public String encryptionKey;

    public static RunBlockchainTaxApiDataprocessRequest build(java.util.Map<String, ?> map) throws Exception {
        RunBlockchainTaxApiDataprocessRequest self = new RunBlockchainTaxApiDataprocessRequest();
        return TeaModel.build(map, self);
    }

    public RunBlockchainTaxApiDataprocessRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RunBlockchainTaxApiDataprocessRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RunBlockchainTaxApiDataprocessRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public RunBlockchainTaxApiDataprocessRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public RunBlockchainTaxApiDataprocessRequest setMethodCode(String methodCode) {
        this.methodCode = methodCode;
        return this;
    }
    public String getMethodCode() {
        return this.methodCode;
    }

    public RunBlockchainTaxApiDataprocessRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public RunBlockchainTaxApiDataprocessRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public RunBlockchainTaxApiDataprocessRequest setEncryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    public Boolean getEncryption() {
        return this.encryption;
    }

    public RunBlockchainTaxApiDataprocessRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

}
