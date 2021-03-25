// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateMerchantFriendRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 友好商户租户ID
    @NameInMap("friend_tenant_id")
    @Validation(required = true)
    public String friendTenantId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 更新类型
    @NameInMap("type")
    @Validation(required = true)
    public String type;

    public static UpdateMerchantFriendRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMerchantFriendRequest self = new UpdateMerchantFriendRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMerchantFriendRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMerchantFriendRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMerchantFriendRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateMerchantFriendRequest setFriendTenantId(String friendTenantId) {
        this.friendTenantId = friendTenantId;
        return this;
    }
    public String getFriendTenantId() {
        return this.friendTenantId;
    }

    public UpdateMerchantFriendRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public UpdateMerchantFriendRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
