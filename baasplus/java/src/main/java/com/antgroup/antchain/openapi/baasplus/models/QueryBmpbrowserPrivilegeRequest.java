// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class QueryBmpbrowserPrivilegeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁区块链的唯一链id
    // 
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 查看权限的支付宝电话号码
    // 
    @NameInMap("phone_number")
    @Validation(required = true)
    public String phoneNumber;

    public static QueryBmpbrowserPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryBmpbrowserPrivilegeRequest self = new QueryBmpbrowserPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public QueryBmpbrowserPrivilegeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryBmpbrowserPrivilegeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryBmpbrowserPrivilegeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public QueryBmpbrowserPrivilegeRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
