// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class GetDistributedeviceBychainidRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 发行设备Id
    @NameInMap("chain_id_list")
    @Validation(required = true)
    public java.util.List<String> chainIdList;

    public static GetDistributedeviceBychainidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDistributedeviceBychainidRequest self = new GetDistributedeviceBychainidRequest();
        return TeaModel.build(map, self);
    }

    public GetDistributedeviceBychainidRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public GetDistributedeviceBychainidRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public GetDistributedeviceBychainidRequest setChainIdList(java.util.List<String> chainIdList) {
        this.chainIdList = chainIdList;
        return this;
    }
    public java.util.List<String> getChainIdList() {
        return this.chainIdList;
    }

}
