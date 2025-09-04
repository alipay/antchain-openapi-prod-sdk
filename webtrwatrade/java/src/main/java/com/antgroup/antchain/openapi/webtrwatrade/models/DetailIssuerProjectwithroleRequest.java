// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class DetailIssuerProjectwithroleRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 项目id，项目资产ID和
    // 项目合约地址+所在链组合 二选一
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址，项目资产ID和
    // 项目合约地址+所在链组合 二选一
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 所在链，项目资产ID和
    // 项目合约地址+所在链组合 二选一
    @NameInMap("chain_name")
    public String chainName;

    public static DetailIssuerProjectwithroleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailIssuerProjectwithroleRequest self = new DetailIssuerProjectwithroleRequest();
        return TeaModel.build(map, self);
    }

    public DetailIssuerProjectwithroleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailIssuerProjectwithroleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailIssuerProjectwithroleRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public DetailIssuerProjectwithroleRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public DetailIssuerProjectwithroleRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

}
