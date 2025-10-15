// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class MatchAuthCarUsersRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 设备号的md5
    @NameInMap("oaid")
    public String oaid;

    // 手机号md5
    @NameInMap("phone")
    public String phone;

    public static MatchAuthCarUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        MatchAuthCarUsersRequest self = new MatchAuthCarUsersRequest();
        return TeaModel.build(map, self);
    }

    public MatchAuthCarUsersRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public MatchAuthCarUsersRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public MatchAuthCarUsersRequest setOaid(String oaid) {
        this.oaid = oaid;
        return this;
    }
    public String getOaid() {
        return this.oaid;
    }

    public MatchAuthCarUsersRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

}
