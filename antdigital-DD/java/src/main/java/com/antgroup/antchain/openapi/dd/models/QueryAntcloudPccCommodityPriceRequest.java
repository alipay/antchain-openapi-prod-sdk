// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd.models;

import com.aliyun.tea.*;

public class QueryAntcloudPccCommodityPriceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 模型名称，精确匹配
    @NameInMap("model")
    public String model;

    // 供应商
    @NameInMap("provider")
    public String provider;

    // 收费项（定价对象）
    @NameInMap("charge_item")
    public String chargeItem;

    // 定价状态
    @NameInMap("status")
    public String status;

    // 页码
    @NameInMap("page_num")
    @Validation(required = true)
    public Long pageNum;

    // 每页数据量
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 商品code
    @NameInMap("commodity_code")
    @Validation(required = true)
    public String commodityCode;

    public static QueryAntcloudPccCommodityPriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudPccCommodityPriceRequest self = new QueryAntcloudPccCommodityPriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudPccCommodityPriceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryAntcloudPccCommodityPriceRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryAntcloudPccCommodityPriceRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public QueryAntcloudPccCommodityPriceRequest setChargeItem(String chargeItem) {
        this.chargeItem = chargeItem;
        return this;
    }
    public String getChargeItem() {
        return this.chargeItem;
    }

    public QueryAntcloudPccCommodityPriceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAntcloudPccCommodityPriceRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryAntcloudPccCommodityPriceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudPccCommodityPriceRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

}
