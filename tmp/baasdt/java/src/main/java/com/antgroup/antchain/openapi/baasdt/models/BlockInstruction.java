// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class BlockInstruction extends TeaModel {
    // 商品兑换单/订单编号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 交易类型
    @NameInMap("instruction_type")
    @Validation(required = true)
    public Long instructionType;

    // 买家的链上账户Id
    @NameInMap("buyer_account_id")
    @Validation(required = true)
    public String buyerAccountId;

    // 卖家的链上账户Id
    @NameInMap("seller_account_id")
    @Validation(required = true)
    public String sellerAccountId;

    // 平台机构ID
    @NameInMap("platform_id")
    @Validation(required = true)
    public String platformId;

    // 商品ID
    @NameInMap("goods_id")
    @Validation(required = true)
    public String goodsId;

    // 商品名称
    @NameInMap("display_name")
    @Validation(required = true)
    public String displayName;

    // 实际售价(元)
    @NameInMap("seller_price")
    @Validation(required = true)
    public String sellerPrice;

    // 商品面值(元)
    @NameInMap("display_price")
    @Validation(required = true)
    public String displayPrice;

    // 备注信息
    @NameInMap("memo")
    @Validation(required = true)
    public String memo;

    // 附言
    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    // 兑换单状态
    @NameInMap("status")
    @Validation(required = true)
    public Long status;

    // 退款状态
    @NameInMap("refund_status")
    @Validation(required = true)
    public Long refundStatus;

    // 交易创建时间
    @NameInMap("create_timestamp")
    @Validation(required = true)
    public Long createTimestamp;

    // 支付时间
    @NameInMap("pay_timestamp")
    @Validation(required = true)
    public Long payTimestamp;

    // 交易附属信息
    @NameInMap("extra_data")
    @Validation(required = true)
    public java.util.List<MetaDataDO> extraData;

    // 交易token来源信息
    @NameInMap("token_instructions")
    @Validation(required = true)
    public java.util.List<TokenInstructionDO> tokenInstructions;

    // 关联交易ID
    @NameInMap("related_order_id")
    @Validation(required = true)
    public String relatedOrderId;

    // 手续费token数量
    @NameInMap("commission_token")
    @Validation(required = true)
    public String commissionToken;

    // 卖家收到的token数量
    @NameInMap("seller_receive_token")
    @Validation(required = true)
    public String sellerReceiveToken;

    // 支付类型：买家支付，卖家支付
    @NameInMap("pay_commission_type")
    @Validation(required = true)
    public Long payCommissionType;

    // 买家手机号
    @NameInMap("buyer_phone")
    @Validation(required = true)
    public String buyerPhone;

    // 买家名称
    @NameInMap("buyer_name")
    @Validation(required = true)
    public String buyerName;

    // 买家身份信息
    @NameInMap("buyer_id_number")
    @Validation(required = true)
    public String buyerIdNumber;

    // 买家身份信息类型
    @NameInMap("buyer_id_type")
    @Validation(required = true)
    public String buyerIdType;

    // 买家IP
    @NameInMap("buye_ip")
    @Validation(required = true)
    public String buyeIp;

    // 订单原始创建时间，外部传入
    @NameInMap("origin_create_time")
    @Validation(required = true)
    public Long originCreateTime;

    // 订单原始订单ID，外部传入
    @NameInMap("origin_order_id")
    @Validation(required = true)
    public String originOrderId;

    public static BlockInstruction build(java.util.Map<String, ?> map) throws Exception {
        BlockInstruction self = new BlockInstruction();
        return TeaModel.build(map, self);
    }

    public BlockInstruction setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BlockInstruction setInstructionType(Long instructionType) {
        this.instructionType = instructionType;
        return this;
    }
    public Long getInstructionType() {
        return this.instructionType;
    }

    public BlockInstruction setBuyerAccountId(String buyerAccountId) {
        this.buyerAccountId = buyerAccountId;
        return this;
    }
    public String getBuyerAccountId() {
        return this.buyerAccountId;
    }

    public BlockInstruction setSellerAccountId(String sellerAccountId) {
        this.sellerAccountId = sellerAccountId;
        return this;
    }
    public String getSellerAccountId() {
        return this.sellerAccountId;
    }

    public BlockInstruction setPlatformId(String platformId) {
        this.platformId = platformId;
        return this;
    }
    public String getPlatformId() {
        return this.platformId;
    }

    public BlockInstruction setGoodsId(String goodsId) {
        this.goodsId = goodsId;
        return this;
    }
    public String getGoodsId() {
        return this.goodsId;
    }

    public BlockInstruction setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public BlockInstruction setSellerPrice(String sellerPrice) {
        this.sellerPrice = sellerPrice;
        return this;
    }
    public String getSellerPrice() {
        return this.sellerPrice;
    }

    public BlockInstruction setDisplayPrice(String displayPrice) {
        this.displayPrice = displayPrice;
        return this;
    }
    public String getDisplayPrice() {
        return this.displayPrice;
    }

    public BlockInstruction setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public BlockInstruction setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BlockInstruction setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public BlockInstruction setRefundStatus(Long refundStatus) {
        this.refundStatus = refundStatus;
        return this;
    }
    public Long getRefundStatus() {
        return this.refundStatus;
    }

    public BlockInstruction setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public BlockInstruction setPayTimestamp(Long payTimestamp) {
        this.payTimestamp = payTimestamp;
        return this;
    }
    public Long getPayTimestamp() {
        return this.payTimestamp;
    }

    public BlockInstruction setExtraData(java.util.List<MetaDataDO> extraData) {
        this.extraData = extraData;
        return this;
    }
    public java.util.List<MetaDataDO> getExtraData() {
        return this.extraData;
    }

    public BlockInstruction setTokenInstructions(java.util.List<TokenInstructionDO> tokenInstructions) {
        this.tokenInstructions = tokenInstructions;
        return this;
    }
    public java.util.List<TokenInstructionDO> getTokenInstructions() {
        return this.tokenInstructions;
    }

    public BlockInstruction setRelatedOrderId(String relatedOrderId) {
        this.relatedOrderId = relatedOrderId;
        return this;
    }
    public String getRelatedOrderId() {
        return this.relatedOrderId;
    }

    public BlockInstruction setCommissionToken(String commissionToken) {
        this.commissionToken = commissionToken;
        return this;
    }
    public String getCommissionToken() {
        return this.commissionToken;
    }

    public BlockInstruction setSellerReceiveToken(String sellerReceiveToken) {
        this.sellerReceiveToken = sellerReceiveToken;
        return this;
    }
    public String getSellerReceiveToken() {
        return this.sellerReceiveToken;
    }

    public BlockInstruction setPayCommissionType(Long payCommissionType) {
        this.payCommissionType = payCommissionType;
        return this;
    }
    public Long getPayCommissionType() {
        return this.payCommissionType;
    }

    public BlockInstruction setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
        return this;
    }
    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public BlockInstruction setBuyerName(String buyerName) {
        this.buyerName = buyerName;
        return this;
    }
    public String getBuyerName() {
        return this.buyerName;
    }

    public BlockInstruction setBuyerIdNumber(String buyerIdNumber) {
        this.buyerIdNumber = buyerIdNumber;
        return this;
    }
    public String getBuyerIdNumber() {
        return this.buyerIdNumber;
    }

    public BlockInstruction setBuyerIdType(String buyerIdType) {
        this.buyerIdType = buyerIdType;
        return this;
    }
    public String getBuyerIdType() {
        return this.buyerIdType;
    }

    public BlockInstruction setBuyeIp(String buyeIp) {
        this.buyeIp = buyeIp;
        return this;
    }
    public String getBuyeIp() {
        return this.buyeIp;
    }

    public BlockInstruction setOriginCreateTime(Long originCreateTime) {
        this.originCreateTime = originCreateTime;
        return this;
    }
    public Long getOriginCreateTime() {
        return this.originCreateTime;
    }

    public BlockInstruction setOriginOrderId(String originOrderId) {
        this.originOrderId = originOrderId;
        return this;
    }
    public String getOriginOrderId() {
        return this.originOrderId;
    }

}
