// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class ApplyPartyNetworkRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("network_id")
    @Validation(required = true)
    public String networkId;

    //  
    @NameInMap("party_id")
    @Validation(required = true)
    public String partyId;

    //  
    @NameInMap("account_name")
    @Validation(required = true)
    public String accountName;

    public static ApplyPartyNetworkRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyPartyNetworkRequest self = new ApplyPartyNetworkRequest();
        return TeaModel.build(map, self);
    }

    public ApplyPartyNetworkRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ApplyPartyNetworkRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ApplyPartyNetworkRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public ApplyPartyNetworkRequest setPartyId(String partyId) {
        this.partyId = partyId;
        return this;
    }
    public String getPartyId() {
        return this.partyId;
    }

    public ApplyPartyNetworkRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

}
