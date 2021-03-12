// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class AddBlockchainMiniprogramRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 蚂蚁区块链的唯一链id
    @NameInMap("bizid")
    @Validation(required = true)
    public String bizid;

    // 授权查看权限的支付宝电话号码集合
    @NameInMap("phone_numbers")
    @Validation(required = true)
    public String phoneNumbers;

    public static AddBlockchainMiniprogramRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBlockchainMiniprogramRequest self = new AddBlockchainMiniprogramRequest();
        return TeaModel.build(map, self);
    }

    public AddBlockchainMiniprogramRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddBlockchainMiniprogramRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddBlockchainMiniprogramRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public AddBlockchainMiniprogramRequest setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

}
