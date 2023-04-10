// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.fairopennet.models;

import com.aliyun.tea.*;

public class AddNetworkNormalnodeRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    //  
    @NameInMap("info")
    @Validation(required = true)
    public NetworkEntranceInfo info;

    //  
    @NameInMap("extra")
    public String extra;

    public static AddNetworkNormalnodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNetworkNormalnodeRequest self = new AddNetworkNormalnodeRequest();
        return TeaModel.build(map, self);
    }

    public AddNetworkNormalnodeRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public AddNetworkNormalnodeRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public AddNetworkNormalnodeRequest setInfo(NetworkEntranceInfo info) {
        this.info = info;
        return this;
    }
    public NetworkEntranceInfo getInfo() {
        return this.info;
    }

    public AddNetworkNormalnodeRequest setExtra(String extra) {
        this.extra = extra;
        return this;
    }
    public String getExtra() {
        return this.extra;
    }

}
