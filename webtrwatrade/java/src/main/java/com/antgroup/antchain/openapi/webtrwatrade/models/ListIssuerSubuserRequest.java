// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class ListIssuerSubuserRequest extends TeaModel {
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

    public static ListIssuerSubuserRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIssuerSubuserRequest self = new ListIssuerSubuserRequest();
        return TeaModel.build(map, self);
    }

    public ListIssuerSubuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ListIssuerSubuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ListIssuerSubuserRequest setAssetProjectId(String assetProjectId) {
        this.assetProjectId = assetProjectId;
        return this;
    }
    public String getAssetProjectId() {
        return this.assetProjectId;
    }

    public ListIssuerSubuserRequest setAssetProjectAddress(String assetProjectAddress) {
        this.assetProjectAddress = assetProjectAddress;
        return this;
    }
    public String getAssetProjectAddress() {
        return this.assetProjectAddress;
    }

    public ListIssuerSubuserRequest setChainName(String chainName) {
        this.chainName = chainName;
        return this;
    }
    public String getChainName() {
        return this.chainName;
    }

}
