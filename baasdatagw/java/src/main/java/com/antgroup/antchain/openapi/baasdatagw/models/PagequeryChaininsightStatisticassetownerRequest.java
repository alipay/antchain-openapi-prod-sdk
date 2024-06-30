// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightStatisticassetownerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("biz_id")
    @Validation(required = true)
    public String bizId;

    // 合约地址
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 资产ID，可空，支持模糊搜索（既可以是assetId，也可以是数字权证链1155资产特有的shardId）
    @NameInMap("asset_id")
    public String assetId;

    // 数字权证链1155合约的分片ID
    @NameInMap("shard_id")
    public String shardId;

    // 页数，从 1 开始，缺省值为1
    @NameInMap("page_no")
    public Long pageNo;

    // 页面大小，缺省值为10
    @NameInMap("page_size")
    @Validation(maximum = 100, minimum = 1)
    public Long pageSize;

    public static PagequeryChaininsightStatisticassetownerRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightStatisticassetownerRequest self = new PagequeryChaininsightStatisticassetownerRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightStatisticassetownerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryChaininsightStatisticassetownerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryChaininsightStatisticassetownerRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PagequeryChaininsightStatisticassetownerRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public PagequeryChaininsightStatisticassetownerRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public PagequeryChaininsightStatisticassetownerRequest setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public PagequeryChaininsightStatisticassetownerRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryChaininsightStatisticassetownerRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
