// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_c175eb6e902d4839bce77e1b7a390162.models;

import com.aliyun.tea.*;

public class QueryAntchainWindwardFinanceAbilityRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 大经分
    @NameInMap("scene_code")
    @Validation(required = true)
    public String sceneCode;

    // 身份证号
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 姓名
    @NameInMap("user_name")
    public String userName;

    // 手机号
    @NameInMap("tel_no")
    public String telNo;

    // true
    @NameInMap("encrypt")
    public Boolean encrypt;

    public static QueryAntchainWindwardFinanceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainWindwardFinanceAbilityRequest self = new QueryAntchainWindwardFinanceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntchainWindwardFinanceAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setTelNo(String telNo) {
        this.telNo = telNo;
        return this;
    }
    public String getTelNo() {
        return this.telNo;
    }

    public QueryAntchainWindwardFinanceAbilityRequest setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }
    public Boolean getEncrypt() {
        return this.encrypt;
    }

}
