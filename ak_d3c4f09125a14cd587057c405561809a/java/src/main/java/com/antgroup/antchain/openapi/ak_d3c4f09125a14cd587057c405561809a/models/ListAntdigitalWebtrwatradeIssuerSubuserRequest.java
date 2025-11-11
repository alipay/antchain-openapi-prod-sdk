// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class ListAntdigitalWebtrwatradeIssuerSubuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产项目ID（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("asset_project_id")
    public String assetProjectId;

    // 资产项目合约地址（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("asset_project_address")
    public String assetProjectAddress;

    // 项目所在链（资产项目ID、资产项目合约地址+所在链 二选一必填）
    @NameInMap("chain_name")
    public String chainName;

    public static ListAntdigitalWebtrwatradeIssuerSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAntdigitalWebtrwatradeIssuerSubuserRequest self = new ListAntdigitalWebtrwatradeIssuerSubuserRequest();
        return TeaModel.build(map, self);
    }

    public ListAntdigitalWebtrwatradeIssuerSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListAntdigitalWebtrwatradeIssuerSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListAntdigitalWebtrwatradeIssuerSubuserRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public ListAntdigitalWebtrwatradeIssuerSubuserRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ListAntdigitalWebtrwatradeIssuerSubuserRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

}
