// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class IPOrder extends TeaModel {
    // 订单ID
    @NameInMap("ip_order_id")
    @Validation(required = true)
    public String ipOrderId;

    // 卖方
    @NameInMap("seller_id")
    @Validation(required = true)
    public String sellerId;

    // 卖家名称
    @NameInMap("seller_name")
    @Validation(required = true)
    public String sellerName;

    // 买方
    @NameInMap("buyer_id")
    @Validation(required = true)
    public String buyerId;

    // 买家名称
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 订单交易类型：0套餐交易，1授权交易
    @NameInMap("type")
    @Validation(required = true)
    public Long type;

    // ip id
    @NameInMap("ip_id")
    @Validation(required = true)
    public String ipId;

    // IP名称
    @NameInMap("ip_name")
    @Validation(required = true)
    public String ipName;

    // 渠道信息
    @NameInMap("channel_id")
    @Validation(required = true)
    public String channelId;

    // 套餐总量
    @NameInMap("total_amount")
    @Validation(required = true)
    public Long totalAmount;

    // 套餐已使用数量
    @NameInMap("used_amount")
    @Validation(required = true)
    public Long usedAmount;

    // 终端商品价格范围
    @NameInMap("price_range")
    @Validation(required = true)
    public String priceRange;

    // 套餐交易总费用
    @NameInMap("total_price")
    @Validation(required = true)
    public String totalPrice;

    // 授权佣金比例
    @NameInMap("auth_rate")
    @Validation(required = true)
    public String authRate;

    // 授权合作开始时间（毫秒时间戳）
    @NameInMap("auth_start_time")
    @Validation(required = true)
    public Long authStartTime;

    // 授权合作结束时间
    @NameInMap("auth_end_time")
    @Validation(required = true)
    public Long authEndTime;

    // 合同信息
    @NameInMap("contract")
    @Validation(required = true)
    public String contract;

    // 设计稿信息
    @NameInMap("design_draft")
    @Validation(required = true)
    public String designDraft;

    // 操作人
    @NameInMap("operator")
    @Validation(required = true)
    public String operator;

    // 操作者名称
    @NameInMap("operator_name")
    @Validation(required = true)
    public String operatorName;

    // 订单状态。TODO 补充枚举信息
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 订单最近更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    public static IPOrder build(java.util.Map<String, ?> map) throws Exception {
        IPOrder self = new IPOrder();
        return TeaModel.build(map, self);
    }

    public IPOrder setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public IPOrder setSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }
    public String getSellerId() {
        return this.sellerId;
    }

    public IPOrder setSellerName(String sellerName) {
        this.sellerName = sellerName;
        return this;
    }
    public String getSellerName() {
        return this.sellerName;
    }

    public IPOrder setBuyerId(String buyerId) {
        this.buyerId = buyerId;
        return this;
    }
    public String getBuyerId() {
        return this.buyerId;
    }

    public IPOrder setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public IPOrder setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public IPOrder setIpId(String ipId) {
        this.ipId = ipId;
        return this;
    }
    public String getIpId() {
        return this.ipId;
    }

    public IPOrder setIpName(String ipName) {
        this.ipName = ipName;
        return this;
    }
    public String getIpName() {
        return this.ipName;
    }

    public IPOrder setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public IPOrder setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
    public Long getTotalAmount() {
        return this.totalAmount;
    }

    public IPOrder setUsedAmount(Long usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }
    public Long getUsedAmount() {
        return this.usedAmount;
    }

    public IPOrder setPriceRange(String priceRange) {
        this.priceRange = priceRange;
        return this;
    }
    public String getPriceRange() {
        return this.priceRange;
    }

    public IPOrder setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }
    public String getTotalPrice() {
        return this.totalPrice;
    }

    public IPOrder setAuthRate(String authRate) {
        this.authRate = authRate;
        return this;
    }
    public String getAuthRate() {
        return this.authRate;
    }

    public IPOrder setAuthStartTime(Long authStartTime) {
        this.authStartTime = authStartTime;
        return this;
    }
    public Long getAuthStartTime() {
        return this.authStartTime;
    }

    public IPOrder setAuthEndTime(Long authEndTime) {
        this.authEndTime = authEndTime;
        return this;
    }
    public Long getAuthEndTime() {
        return this.authEndTime;
    }

    public IPOrder setContract(String contract) {
        this.contract = contract;
        return this;
    }
    public String getContract() {
        return this.contract;
    }

    public IPOrder setDesignDraft(String designDraft) {
        this.designDraft = designDraft;
        return this;
    }
    public String getDesignDraft() {
        return this.designDraft;
    }

    public IPOrder setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public IPOrder setOperatorName(String operatorName) {
        this.operatorName = operatorName;
        return this;
    }
    public String getOperatorName() {
        return this.operatorName;
    }

    public IPOrder setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public IPOrder setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
