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

    // 订单创建时间，时间戳（毫秒）
    @NameInMap("create_time")
    @Validation(required = true)
    public Long createTime;

    // 订单最近更新时间
    @NameInMap("update_time")
    @Validation(required = true)
    public Long updateTime;

    // 收费模式：0 销售抽佣, 1 按量付费
    @NameInMap("charge_type")
    @Validation(required = true)
    public Long chargeType;

    // 按量付费的收费单价（按量付费模式必填）
    @NameInMap("auth_price")
    @Validation(required = true)
    public String authPrice;

    // 是否有保底金
    @NameInMap("guaranteed")
    @Validation(required = true)
    public Boolean guaranteed;

    // 保底金金额
    @NameInMap("guaranteed_fund")
    @Validation(required = true)
    public String guaranteedFund;

    // 保底商品个数（按量付费）
    @NameInMap("guaranteed_goods_amount")
    @Validation(required = true)
    public Long guaranteedGoodsAmount;

    // 已使用的保底商品个数（按量付费），订单销售数量超过保底部分需按量付费
    @NameInMap("used_guaranteed_goods_amount")
    @Validation(required = true)
    public Long usedGuaranteedGoodsAmount;

    // 保底商品销售金额（销售抽佣）
    @NameInMap("guaranteed_sales")
    @Validation(required = true)
    public String guaranteedSales;

    // 已使用的保底商品销售金额（销售抽佣），订单销售额超过保底部分需按比例抽拥
    // 
    @NameInMap("used_guaranteed_sales")
    @Validation(required = true)
    public String usedGuaranteedSales;

    // 授权产品范围
    @NameInMap("auth_product_scope")
    @Validation(required = true)
    public String authProductScope;

    // 授权地域范围
    @NameInMap("auth_area_scope")
    @Validation(required = true)
    public String authAreaScope;

    // 商品销售渠道
    @NameInMap("sales_channel")
    @Validation(required = true)
    public String salesChannel;

    // 0 IP交易，1 增值服务交易
    @NameInMap("goods_type")
    @Validation(required = true)
    public Long goodsType;

    // 增值服务交易绑定的ip授权交易订单
    @NameInMap("related_order_id")
    @Validation(required = true)
    public String relatedOrderId;

    // 是否已监修报审
    @NameInMap("supervise_approve")
    @Validation(required = true)
    public Boolean superviseApprove;

    // 订单图库信息，未确认则为空
    @NameInMap("ip_gallery_url")
    public String ipGalleryUrl;

    // 图库版本
    @NameInMap("ip_gallery_version")
    public Long ipGalleryVersion;

    // 商家是否已下载过本订单的图库
    @NameInMap("download_ip_gallery")
    public Boolean downloadIpGallery;

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

    public IPOrder setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public IPOrder setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public IPOrder setChargeType(Long chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public Long getChargeType() {
        return this.chargeType;
    }

    public IPOrder setAuthPrice(String authPrice) {
        this.authPrice = authPrice;
        return this;
    }
    public String getAuthPrice() {
        return this.authPrice;
    }

    public IPOrder setGuaranteed(Boolean guaranteed) {
        this.guaranteed = guaranteed;
        return this;
    }
    public Boolean getGuaranteed() {
        return this.guaranteed;
    }

    public IPOrder setGuaranteedFund(String guaranteedFund) {
        this.guaranteedFund = guaranteedFund;
        return this;
    }
    public String getGuaranteedFund() {
        return this.guaranteedFund;
    }

    public IPOrder setGuaranteedGoodsAmount(Long guaranteedGoodsAmount) {
        this.guaranteedGoodsAmount = guaranteedGoodsAmount;
        return this;
    }
    public Long getGuaranteedGoodsAmount() {
        return this.guaranteedGoodsAmount;
    }

    public IPOrder setUsedGuaranteedGoodsAmount(Long usedGuaranteedGoodsAmount) {
        this.usedGuaranteedGoodsAmount = usedGuaranteedGoodsAmount;
        return this;
    }
    public Long getUsedGuaranteedGoodsAmount() {
        return this.usedGuaranteedGoodsAmount;
    }

    public IPOrder setGuaranteedSales(String guaranteedSales) {
        this.guaranteedSales = guaranteedSales;
        return this;
    }
    public String getGuaranteedSales() {
        return this.guaranteedSales;
    }

    public IPOrder setUsedGuaranteedSales(String usedGuaranteedSales) {
        this.usedGuaranteedSales = usedGuaranteedSales;
        return this;
    }
    public String getUsedGuaranteedSales() {
        return this.usedGuaranteedSales;
    }

    public IPOrder setAuthProductScope(String authProductScope) {
        this.authProductScope = authProductScope;
        return this;
    }
    public String getAuthProductScope() {
        return this.authProductScope;
    }

    public IPOrder setAuthAreaScope(String authAreaScope) {
        this.authAreaScope = authAreaScope;
        return this;
    }
    public String getAuthAreaScope() {
        return this.authAreaScope;
    }

    public IPOrder setSalesChannel(String salesChannel) {
        this.salesChannel = salesChannel;
        return this;
    }
    public String getSalesChannel() {
        return this.salesChannel;
    }

    public IPOrder setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
        return this;
    }
    public Long getGoodsType() {
        return this.goodsType;
    }

    public IPOrder setRelatedOrderId(String relatedOrderId) {
        this.relatedOrderId = relatedOrderId;
        return this;
    }
    public String getRelatedOrderId() {
        return this.relatedOrderId;
    }

    public IPOrder setSuperviseApprove(Boolean superviseApprove) {
        this.superviseApprove = superviseApprove;
        return this;
    }
    public Boolean getSuperviseApprove() {
        return this.superviseApprove;
    }

    public IPOrder setIpGalleryUrl(String ipGalleryUrl) {
        this.ipGalleryUrl = ipGalleryUrl;
        return this;
    }
    public String getIpGalleryUrl() {
        return this.ipGalleryUrl;
    }

    public IPOrder setIpGalleryVersion(Long ipGalleryVersion) {
        this.ipGalleryVersion = ipGalleryVersion;
        return this;
    }
    public Long getIpGalleryVersion() {
        return this.ipGalleryVersion;
    }

    public IPOrder setDownloadIpGallery(Boolean downloadIpGallery) {
        this.downloadIpGallery = downloadIpGallery;
        return this;
    }
    public Boolean getDownloadIpGallery() {
        return this.downloadIpGallery;
    }

}
