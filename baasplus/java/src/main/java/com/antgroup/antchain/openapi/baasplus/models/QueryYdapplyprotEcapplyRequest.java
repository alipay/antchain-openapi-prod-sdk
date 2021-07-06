// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryYdapplyprotEcapplyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 用户证件号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    public static QueryYdapplyprotEcapplyRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryYdapplyprotEcapplyRequest self = new QueryYdapplyprotEcapplyRequest();
        return TeaModel.build(map, self);
    }

    public QueryYdapplyprotEcapplyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryYdapplyprotEcapplyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryYdapplyprotEcapplyRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryYdapplyprotEcapplyRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryYdapplyprotEcapplyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
