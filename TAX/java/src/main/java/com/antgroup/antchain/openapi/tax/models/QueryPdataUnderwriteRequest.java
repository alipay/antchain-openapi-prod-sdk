// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class QueryPdataUnderwriteRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务流水号
    @NameInMap("biz_id")
    public String bizId;

    // 加密后的入参数据（包括姓名和身份ID）
    @NameInMap("encrypt_data")
    public String encryptData;

    // 省份行政区划代码list
    @NameInMap("recommand_province_list")
    public java.util.List<String> recommandProvinceList;

    // 授权编号
    @NameInMap("authorization_no")
    public String authorizationNo;

    // 授权凭证
    @NameInMap("authorization_credential")
    public String authorizationCredential;

    // 凭证格式
    @NameInMap("credential_type")
    public String credentialType;

    // 授权有效期
    @NameInMap("authorization_expiration_time")
    public String authorizationExpirationTime;

    // 授权对象
    @NameInMap("authorization_type")
    public String authorizationType;

    public static QueryPdataUnderwriteRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPdataUnderwriteRequest self = new QueryPdataUnderwriteRequest();
        return TeaModel.build(map, self);
    }

    public QueryPdataUnderwriteRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryPdataUnderwriteRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryPdataUnderwriteRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public QueryPdataUnderwriteRequest setEncryptData(String encryptData) {
        this.encryptData = encryptData;
        return this;
    }
    public String getEncryptData() {
        return this.encryptData;
    }

    public QueryPdataUnderwriteRequest setRecommandProvinceList(java.util.List<String> recommandProvinceList) {
        this.recommandProvinceList = recommandProvinceList;
        return this;
    }
    public java.util.List<String> getRecommandProvinceList() {
        return this.recommandProvinceList;
    }

    public QueryPdataUnderwriteRequest setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
        return this;
    }
    public String getAuthorizationNo() {
        return this.authorizationNo;
    }

    public QueryPdataUnderwriteRequest setAuthorizationCredential(String authorizationCredential) {
        this.authorizationCredential = authorizationCredential;
        return this;
    }
    public String getAuthorizationCredential() {
        return this.authorizationCredential;
    }

    public QueryPdataUnderwriteRequest setCredentialType(String credentialType) {
        this.credentialType = credentialType;
        return this;
    }
    public String getCredentialType() {
        return this.credentialType;
    }

    public QueryPdataUnderwriteRequest setAuthorizationExpirationTime(String authorizationExpirationTime) {
        this.authorizationExpirationTime = authorizationExpirationTime;
        return this;
    }
    public String getAuthorizationExpirationTime() {
        return this.authorizationExpirationTime;
    }

    public QueryPdataUnderwriteRequest setAuthorizationType(String authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }
    public String getAuthorizationType() {
        return this.authorizationType;
    }

}
