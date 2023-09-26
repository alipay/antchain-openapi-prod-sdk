// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class ListChaininsightAssetinterfacesrequiredRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // ERC标准类型：ERC721 / ERC1155
    @NameInMap("erc_type")
    @Validation(required = true)
    public String ercType;

    public static ListChaininsightAssetinterfacesrequiredRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChaininsightAssetinterfacesrequiredRequest self = new ListChaininsightAssetinterfacesrequiredRequest();
        return TeaModel.build(map, self);
    }

    public ListChaininsightAssetinterfacesrequiredRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListChaininsightAssetinterfacesrequiredRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListChaininsightAssetinterfacesrequiredRequest setErcType(String ercType) {
        this.ercType = ercType;
        return this;
    }
    public String getErcType() {
        return this.ercType;
    }

}
