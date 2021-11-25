// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class DeleteBlockchainMiniprogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁区块链的唯一链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 取消查看权限的支付宝电话号码集合
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public String phoneNumbers;

    public static DeleteBlockchainMiniprogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBlockchainMiniprogramRequest self = new DeleteBlockchainMiniprogramRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBlockchainMiniprogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DeleteBlockchainMiniprogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DeleteBlockchainMiniprogramRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public DeleteBlockchainMiniprogramRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
