// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class QueryRiskGeneralRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // x
    @NameInMap("data_code")
    @Validation(required = true)
    public String dataCode;

    // AES加密使用的随机数，对该随机数使用RaaS数据服务的公钥进行加密，随后传入；
    @NameInMap("encrypted_nonce")
    @Validation(required = true)
    public String encryptedNonce;

    // ISV的终端客户编码、征信机构的终端客户编码、公司内部部门ID，可以定制数据输出。
    @NameInMap("customer_id")
    public String customerId;

    // 业务请求入参，兼容批量调用
    @NameInMap("biz_query_params")
    @Validation(required = true)
    public java.util.List<BizQueryParam> bizQueryParams;

    // 拓展输入字段,
    @NameInMap("ext_data")
    public String extData;

    // 用于标记是否获得用户授权。
    // 1:获得授权（默认）
    // 0:未获得授权
    @NameInMap("user_authorization")
    @Validation(required = true)
    public String userAuthorization;

    // 默认AES128，后续可选SM2等国密
    @NameInMap("encrypt_method")
    public String encryptMethod;

    // 整个包体加密，二选一
    @NameInMap("encrypted_body")
    public String encryptedBody;

    // hash_type
    @NameInMap("hash_type")
    public String hashType;

    public static QueryRiskGeneralRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRiskGeneralRequest self = new QueryRiskGeneralRequest();
        return TeaModel.build(map, self);
    }

    public QueryRiskGeneralRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryRiskGeneralRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryRiskGeneralRequest setDataCode(String dataCode) {
        this.dataCode = dataCode;
        return this;
    }
    public String getDataCode() {
        return this.dataCode;
    }

    public QueryRiskGeneralRequest setEncryptedNonce(String encryptedNonce) {
        this.encryptedNonce = encryptedNonce;
        return this;
    }
    public String getEncryptedNonce() {
        return this.encryptedNonce;
    }

    public QueryRiskGeneralRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public QueryRiskGeneralRequest setBizQueryParams(java.util.List<BizQueryParam> bizQueryParams) {
        this.bizQueryParams = bizQueryParams;
        return this;
    }
    public java.util.List<BizQueryParam> getBizQueryParams() {
        return this.bizQueryParams;
    }

    public QueryRiskGeneralRequest setExtData(String extData) {
        this.extData = extData;
        return this;
    }
    public String getExtData() {
        return this.extData;
    }

    public QueryRiskGeneralRequest setUserAuthorization(String userAuthorization) {
        this.userAuthorization = userAuthorization;
        return this;
    }
    public String getUserAuthorization() {
        return this.userAuthorization;
    }

    public QueryRiskGeneralRequest setEncryptMethod(String encryptMethod) {
        this.encryptMethod = encryptMethod;
        return this;
    }
    public String getEncryptMethod() {
        return this.encryptMethod;
    }

    public QueryRiskGeneralRequest setEncryptedBody(String encryptedBody) {
        this.encryptedBody = encryptedBody;
        return this;
    }
    public String getEncryptedBody() {
        return this.encryptedBody;
    }

    public QueryRiskGeneralRequest setHashType(String hashType) {
        this.hashType = hashType;
        return this;
    }
    public String getHashType() {
        return this.hashType;
    }

}
