// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest extends TeaModel {
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

    public static DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest build(java.util.Map<String, ?> map) throws Exception {
        DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest self = new DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest();
        return TeaModel.build(map, self);
    }

    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

}
