// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class AddPartyRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("info")
    @Validation(required = true)
    public PartyInfo info;

    //  
    @NameInMap("extra")
    public String extra;

    public static AddPartyRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPartyRequest self = new AddPartyRequest();
        return TeaModel.build(map, self);
    }

    public AddPartyRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddPartyRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddPartyRequest setInfo(PartyInfo info) {
        this.info = info;
        return this;
    }
    public PartyInfo getInfo() {
        return this.info;
    }

    public AddPartyRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
