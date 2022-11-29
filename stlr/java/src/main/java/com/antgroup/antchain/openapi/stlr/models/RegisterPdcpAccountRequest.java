// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr.models;

import com.aliyun.tea.*;

public class RegisterPdcpAccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // PERSON("个人"),
    // ENTERPRISE("企业")
    @NameInMap("user_type")
    @Validation(required = true)
    public String userType;

    // 用户名称
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // PASSPORT("护照"),
    // RESIDENT("身份证"),
    // NATIONAL_LEGAL_MERGE("统一社会信用代码")
    @NameInMap("cert_type")
    @Validation(required = true)
    public String certType;

    // 证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    public static RegisterPdcpAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterPdcpAccountRequest self = new RegisterPdcpAccountRequest();
        return TeaModel.build(map, self);
    }

    public RegisterPdcpAccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RegisterPdcpAccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RegisterPdcpAccountRequest setUserType(String userType) {
        this.userType = userType;
        return this;
    }
    public String getUserType() {
        return this.userType;
    }

    public RegisterPdcpAccountRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public RegisterPdcpAccountRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public RegisterPdcpAccountRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public RegisterPdcpAccountRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

}
