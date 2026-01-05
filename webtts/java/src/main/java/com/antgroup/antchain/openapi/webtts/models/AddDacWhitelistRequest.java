// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts.models;

import com.aliyun.tea.*;

public class AddDacWhitelistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部客户id
    @NameInMap("external_cust_id")
    @Validation(required = true)
    public String externalCustId;

    // 外部客户名称
    @NameInMap("external_cust_name")
    @Validation(required = true)
    public String externalCustName;

    // 白名单地址
    @NameInMap("address")
    @Validation(required = true)
    public String address;

    // 区块链网络列表
    @NameInMap("blockchain_list")
    @Validation(required = true)
    public java.util.List<String> blockchainList;

    public static AddDacWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDacWhitelistRequest self = new AddDacWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public AddDacWhitelistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddDacWhitelistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddDacWhitelistRequest setExternalCustId(String externalCustId) {
        this.externalCustId = externalCustId;
        return this;
    }
    public String getExternalCustId() {
        return this.externalCustId;
    }

    public AddDacWhitelistRequest setExternalCustName(String externalCustName) {
        this.externalCustName = externalCustName;
        return this;
    }
    public String getExternalCustName() {
        return this.externalCustName;
    }

    public AddDacWhitelistRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public AddDacWhitelistRequest setBlockchainList(java.util.List<String> blockchainList) {
        this.blockchainList = blockchainList;
        return this;
    }
    public java.util.List<String> getBlockchainList() {
        return this.blockchainList;
    }

}
