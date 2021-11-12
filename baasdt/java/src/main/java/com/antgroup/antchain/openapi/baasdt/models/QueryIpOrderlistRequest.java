// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpOrderlistRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 请求参数
    @NameInMap("base_request")
    @Validation(required = true)
    public BaseRequestInfo baseRequest;

    // 买方ID
    @NameInMap("buyer_id")
    public String buyerId;

    // 卖方ID
    @NameInMap("seller_id")
    public String sellerId;

    // IP id
    @NameInMap("ip_id")
    public String ipId;

    // 订单ID
    @NameInMap("ip_order_id")
    public String ipOrderId;

    // 订单状态
    @NameInMap("order_status")
    public Long orderStatus;

    // 根据IP名称模糊查询
    @NameInMap("ip_name")
    public String ipName;

    // 卖方名称，根据卖方名称模糊查询
    @NameInMap("seller_name")
    public String sellerName;

    // 交易类型：1 套餐交易， 2 定向授权
    @NameInMap("trade_type")
    public Long tradeType;

    // 0 IP交易，1 增值服务交易
    @NameInMap("goods_type")
    public Long goodsType;

    // 收费模式：0 销售抽拥，1 按量计费
    @NameInMap("charge_type")
    public Long chargeType;

    // 查询订单授权开始时间
    @NameInMap("auth_start_time")
    public Long authStartTime;

    // 查询订单授权结束时间
    @NameInMap("auth_end_time")
    public Long authEndTime;

    // 订单创建时间开始范围
    @NameInMap("create_start_time")
    public Long createStartTime;

    // 订单创建时间结束范围
    @NameInMap("create_end_time")
    public Long createEndTime;

    // 排序字段
    @NameInMap("order_by")
    @Validation(required = true)
    public String orderBy;

    // 数据排序顺序：正序还是倒序
    @NameInMap("order")
    @Validation(required = true)
    public String order;

    // 页码
    @NameInMap("page_number")
    @Validation(required = true)
    public Long pageNumber;

    // 每页数据量大小
    @NameInMap("page_size")
    @Validation(required = true)
    public Long pageSize;

    // 渠道名称
    @NameInMap("channel_name")
    public String channelName;

    public static QueryIpOrderlistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryIpOrderlistRequest self = new QueryIpOrderlistRequest();
        return TeaModel.build(map, self);
    }

    public QueryIpOrderlistRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public QueryIpOrderlistRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public QueryIpOrderlistRequest setBaseRequest(BaseRequestInfo baseRequest) {
        this.baseRequest = baseRequest;
        return this;
    }
    public BaseRequestInfo getBaseRequest() {
        return this.baseRequest;
    }

    public QueryIpOrderlistRequest setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public QueryIpOrderlistRequest setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public QueryIpOrderlistRequest setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public QueryIpOrderlistRequest setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public QueryIpOrderlistRequest setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }
    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public QueryIpOrderlistRequest setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public QueryIpOrderlistRequest setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public QueryIpOrderlistRequest setTradeType(Long tradeType) {
        this.tradeType = tradeType;
        return this;
    }
    public Long getTradeType() {
        return this.tradeType;
    }

    public QueryIpOrderlistRequest setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public Long getGoodsType() {
        return this.goodsType;
    }

    public QueryIpOrderlistRequest setChargeType(Long chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public Long getChargeType() {
        return this.chargeType;
    }

    public QueryIpOrderlistRequest setAuthStartTime(Long authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public Long getAuthStartTime() {
        return this.authStartTime;
    }

    public QueryIpOrderlistRequest setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public QueryIpOrderlistRequest setCreateStartTime(Long createStartTime) {
        this.createStartTime = createStartTime;
        return this;
    }
    public Long getCreateStartTime() {
        return this.createStartTime;
    }

    public QueryIpOrderlistRequest setCreateEndTime(Long createEndTime) {
        this.createEndTime = createEndTime;
        return this;
    }
    public Long getCreateEndTime() {
        return this.createEndTime;
    }

    public QueryIpOrderlistRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public QueryIpOrderlistRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryIpOrderlistRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryIpOrderlistRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIpOrderlistRequest setChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }
    public String getChannelName() {
        return this.channelName;
    }

}
