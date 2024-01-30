// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.windward.models;

import com.aliyun.tea.*;

public class QueryFinanceAbilityRequest extends TeaModel {
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

    public static QueryFinanceAbilityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryFinanceAbilityRequest self = new QueryFinanceAbilityRequest();
        return TeaModel.build(map, self);
    }

    public QueryFinanceAbilityRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryFinanceAbilityRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryFinanceAbilityRequest setSceneCode(String sceneCode) {
        this.sceneCode = sceneCode;
        return this;
    }
    public String getSceneCode() {
        return this.sceneCode;
    }

    public QueryFinanceAbilityRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryFinanceAbilityRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryFinanceAbilityRequest setTelNo(String telNo) {
        this.telNo = telNo;
        return this;
    }
    public String getTelNo() {
        return this.telNo;
    }

    public QueryFinanceAbilityRequest setEncrypt(Boolean encrypt) {
        this.encrypt = encrypt;
        return this;
    }
    public Boolean getEncrypt() {
        return this.encrypt;
    }

}
