// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdatagw.models;

import com.aliyun.tea.*;

public class PagequeryChaininsightStatisticassethistoryassetRequest extends TeaModel {
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

    // 资产ID，支持模糊搜索（既可以是assetId，也可以是数字权证链1155合约特有的shardId）
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 分片ID，可空
    @NameInMap("shard_id")
    public String shardId;

    // 页数，从 1 开始，缺省值为1
    @NameInMap("page_no")
    public Long pageNo;

    // 页面大小，缺省值为10
    @NameInMap("page_size")
    @Validation(maximum = 100, minimum = 1)
    public Long pageSize;

    public static PagequeryChaininsightStatisticassethistoryassetRequest build(java.util.Map<String, ?> map) throws Exception {
        PagequeryChaininsightStatisticassethistoryassetRequest self = new PagequeryChaininsightStatisticassethistoryassetRequest();
        return TeaModel.build(map, self);
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setShardId(String shardId) {
        this.shardId = shardId;
        return this;
    }
    public String getShardId() {
        return this.shardId;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public PagequeryChaininsightStatisticassethistoryassetRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
