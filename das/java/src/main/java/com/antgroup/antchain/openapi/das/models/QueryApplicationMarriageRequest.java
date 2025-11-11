// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.das.models;

import com.aliyun.tea.*;

public class QueryApplicationMarriageRequest extends TeaModel {
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

    // RSA-DESede 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
    @NameInMap("algorithm")
    public String algorithm;

    // 是否采用加密算法
    @NameInMap("encryption")
    public Boolean encryption;

    // 对称秘钥加密后的数据
    @NameInMap("encryption_key")
    public String encryptionKey;

    public static QueryApplicationMarriageRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryApplicationMarriageRequest self = new QueryApplicationMarriageRequest();
        return TeaModel.build(map, self);
    }

    public QueryApplicationMarriageRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryApplicationMarriageRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryApplicationMarriageRequest setBizParam(String bizParam) {
        this.bizParam = bizParam;
        return this;
    }
    public String getBizParam() {
        return this.bizParam;
    }

    public QueryApplicationMarriageRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public QueryApplicationMarriageRequest setMethodCode(String methodCode) {
        this.methodCode = methodCode;
        return this;
    }
    public String getMethodCode() {
        return this.methodCode;
    }

    public QueryApplicationMarriageRequest setInstCode(String instCode) {
        this.instCode = instCode;
        return this;
    }
    public String getInstCode() {
        return this.instCode;
    }

    public QueryApplicationMarriageRequest setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public QueryApplicationMarriageRequest setEncryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    public Boolean getEncryption() {
        return this.encryption;
    }

    public QueryApplicationMarriageRequest setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

}
