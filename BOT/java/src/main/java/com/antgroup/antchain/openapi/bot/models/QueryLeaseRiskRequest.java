// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryLeaseRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部系统的用户唯一ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 用户姓名
    @NameInMap("user_name")
    @Validation(required = true)
    public String userName;

    // 用户身份证号码
    @NameInMap("cert_no")
    @Validation(required = true)
    public String certNo;

    // 用户手机号码
    @NameInMap("mobile")
    @Validation(required = true)
    public String mobile;

    // 用户IP地址
    @NameInMap("ip")
    @Validation(required = true)
    public String ip;

    public static QueryLeaseRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseRiskRequest self = new QueryLeaseRiskRequest();
        return TeaModel.build(map, self);
    }

    public QueryLeaseRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryLeaseRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryLeaseRiskRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryLeaseRiskRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public QueryLeaseRiskRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public QueryLeaseRiskRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public QueryLeaseRiskRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

}
