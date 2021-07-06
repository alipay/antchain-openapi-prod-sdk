// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class UpdateBmpbrowserPrivilegeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // bizid
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 取消查看权限的支付宝电话号码集合
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public String phoneNumbers;

    public static UpdateBmpbrowserPrivilegeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBmpbrowserPrivilegeRequest self = new UpdateBmpbrowserPrivilegeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBmpbrowserPrivilegeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateBmpbrowserPrivilegeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateBmpbrowserPrivilegeRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public UpdateBmpbrowserPrivilegeRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
