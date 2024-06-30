// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightStatisticassetinventoryaccountRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 账户地址
    @NameInMap("account")
    @Validation(required = true)
    public String account;

    // 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
    @NameInMap("asset_id")
    public String assetId;

    // 页数，从1开始，缺省值为1
    @NameInMap("page_no")
    public Long pageNo;

    // 页面大小，缺省值为10
    @NameInMap("page_size")
    @Validation(maximum = 100, minimum = 1)
    public Long pageSize;

    public static PagequeryChaininsightStatisticassetinventoryaccountRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightStatisticassetinventoryaccountRequest self = new PagequeryChaininsightStatisticassetinventoryaccountRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryChaininsightStatisticassetinventoryaccountRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
