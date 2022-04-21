// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twoe.models;

import com.aliyun.tea.*;

public class GetTokenRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 支付宝用户id
    @NameInMap("uid")
    @Validation(required = true)
    public String uid;

    // 证件类型。可选，根据是否需要上链公证决定
    @NameInMap("cert_type")
    public String certType;

    // 证件姓名。可选，根据是否需要上链公证决定。
    @NameInMap("cert_name")
    public String certName;

    // 证件编号。可选，根据是否需要上链公证决定。
    @NameInMap("cert_no")
    public String certNo;

    // 手机号。可选，根据是否需要上链公证决定。
    @NameInMap("mobile_no")
    public String mobileNo;

    public static GetTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenRequest self = new GetTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetTokenRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetTokenRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetTokenRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public GetTokenRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public GetTokenRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public GetTokenRequest setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
        return this;
    }
    public String getMobileNo() {
        return this.mobileNo;
    }

}
