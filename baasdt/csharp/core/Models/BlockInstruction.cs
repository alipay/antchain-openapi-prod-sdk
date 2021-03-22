// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 消费卡的单条交易记录数据
    public class BlockInstruction : TeaModel {
        // 商品兑换单/订单编号
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 交易类型
        [NameInMap("instruction_type")]
        [Validation(Required=true)]
        public long? InstructionType { get; set; }

        // 买家的链上账户Id
        [NameInMap("buyer_account_id")]
        [Validation(Required=true)]
        public string BuyerAccountId { get; set; }

        // 卖家的链上账户Id
        [NameInMap("seller_account_id")]
        [Validation(Required=true)]
        public string SellerAccountId { get; set; }

        // 平台机构ID
        [NameInMap("platform_id")]
        [Validation(Required=true)]
        public string PlatformId { get; set; }

        // 商品ID
        [NameInMap("goods_id")]
        [Validation(Required=true)]
        public string GoodsId { get; set; }

        // 商品名称
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 实际售价(元)
        [NameInMap("seller_price")]
        [Validation(Required=true)]
        public string SellerPrice { get; set; }

        // 商品面值(元)
        [NameInMap("display_price")]
        [Validation(Required=true)]
        public string DisplayPrice { get; set; }

        // 备注信息
        [NameInMap("memo")]
        [Validation(Required=true)]
        public string Memo { get; set; }

        // 附言
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 兑换单状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 退款状态
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public long? RefundStatus { get; set; }

        // 交易创建时间
        [NameInMap("create_timestamp")]
        [Validation(Required=true)]
        public long? CreateTimestamp { get; set; }

        // 支付时间
        [NameInMap("pay_timestamp")]
        [Validation(Required=true)]
        public long? PayTimestamp { get; set; }

        // 交易附属信息
        [NameInMap("extra_data")]
        [Validation(Required=true)]
        public List<MetaDataDO> ExtraData { get; set; }

        // 交易token来源信息
        [NameInMap("token_instructions")]
        [Validation(Required=true)]
        public List<TokenInstructionDO> TokenInstructions { get; set; }

        // 关联交易ID
        [NameInMap("related_order_id")]
        [Validation(Required=true)]
        public string RelatedOrderId { get; set; }

        // 手续费token数量
        [NameInMap("commission_token")]
        [Validation(Required=true)]
        public string CommissionToken { get; set; }

        // 卖家收到的token数量
        [NameInMap("seller_receive_token")]
        [Validation(Required=true)]
        public string SellerReceiveToken { get; set; }

        // 支付类型：买家支付，卖家支付
        [NameInMap("pay_commission_type")]
        [Validation(Required=true)]
        public long? PayCommissionType { get; set; }

        // 买家手机号
        [NameInMap("buyer_phone")]
        [Validation(Required=true)]
        public string BuyerPhone { get; set; }

        // 买家名称
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 买家身份信息
        [NameInMap("buyer_id_number")]
        [Validation(Required=true)]
        public string BuyerIdNumber { get; set; }

        // 买家身份信息类型
        [NameInMap("buyer_id_type")]
        [Validation(Required=true)]
        public string BuyerIdType { get; set; }

        // 买家IP
        [NameInMap("buye_ip")]
        [Validation(Required=true)]
        public string BuyeIp { get; set; }

        // 订单原始创建时间，外部传入
        [NameInMap("origin_create_time")]
        [Validation(Required=true)]
        public long? OriginCreateTime { get; set; }

        // 订单原始订单ID，外部传入
        [NameInMap("origin_order_id")]
        [Validation(Required=true)]
        public string OriginOrderId { get; set; }

    }

}
