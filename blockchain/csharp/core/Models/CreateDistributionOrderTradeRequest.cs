// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateDistributionOrderTradeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 买家id
        [NameInMap("buyer_id")]
        [Validation(Required=true)]
        public string BuyerId { get; set; }

        // 买家信息
        [NameInMap("buyer_info")]
        [Validation(Required=true)]
        public string BuyerInfo { get; set; }

        // 买家名称
        [NameInMap("buyer_name")]
        [Validation(Required=true)]
        public string BuyerName { get; set; }

        // 收银单号
        [NameInMap("cashier_id")]
        [Validation(Required=true)]
        public string CashierId { get; set; }

        // 外部子订单id
        [NameInMap("child_id")]
        [Validation(Required=true)]
        public string ChildId { get; set; }

        // 分销交易分佣信息
        [NameInMap("distribution_info")]
        [Validation(Required=true)]
        public string DistributionInfo { get; set; }

        // 分销商城id
        [NameInMap("distribution_shop_id")]
        [Validation(Required=true)]
        public string DistributionShopId { get; set; }

        // 分销商城名称
        [NameInMap("distribution_shop_name")]
        [Validation(Required=true)]
        public string DistributionShopName { get; set; }

        // 订单过期时间戳
        [NameInMap("expire_time")]
        [Validation(Required=true)]
        public long? ExpireTime { get; set; }

        // 订单扩展信息
        [NameInMap("extend")]
        [Validation(Required=true)]
        public string Extend { get; set; }

        // 内部渠道
        [NameInMap("inner_source")]
        [Validation(Required=true)]
        public string InnerSource { get; set; }

        // 交易参与方
        [NameInMap("join_trader")]
        [Validation(Required=true)]
        public string JoinTrader { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 订单金额 单位 分
        [NameInMap("order_price")]
        [Validation(Required=true)]
        public long? OrderPrice { get; set; }

        // 外部父订单id
        [NameInMap("parent_id")]
        [Validation(Required=true)]
        public string ParentId { get; set; }

        // 订单支付信息
        [NameInMap("pay_info")]
        [Validation(Required=true)]
        public string PayInfo { get; set; }

        // 结算状态 I待结算 S已结算
        [NameInMap("pay_status")]
        [Validation(Required=true)]
        public string PayStatus { get; set; }

        // 上级推广金额
        [NameInMap("prev_promoter_price")]
        [Validation(Required=true)]
        public string PrevPromoterPrice { get; set; }

        // 商品描述
        [NameInMap("product_desc")]
        [Validation(Required=true)]
        public string ProductDesc { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 商品数量
        [NameInMap("product_num")]
        [Validation(Required=true)]
        public long? ProductNum { get; set; }

        // 商品价格
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public string ProductPrice { get; set; }

        // 商品类型
        [NameInMap("product_type")]
        [Validation(Required=true)]
        public string ProductType { get; set; }

        // 推广订单id
        [NameInMap("promoter_order_id")]
        [Validation(Required=true)]
        public string PromoterOrderId { get; set; }

        // 商品原始金额
        [NameInMap("real_price")]
        [Validation(Required=true)]
        public string RealPrice { get; set; }

        // 退款时间戳
        [NameInMap("refund_time")]
        [Validation(Required=true)]
        public long? RefundTime { get; set; }

        // 请求系统
        [NameInMap("req_system")]
        [Validation(Required=true)]
        public string ReqSystem { get; set; }

        // 卖方id
        [NameInMap("seller_id")]
        [Validation(Required=true)]
        public string SellerId { get; set; }

        // 卖方信息
        [NameInMap("seller_info")]
        [Validation(Required=true)]
        public string SellerInfo { get; set; }

        // 卖方名称
        [NameInMap("seller_name")]
        [Validation(Required=true)]
        public string SellerName { get; set; }

        // 分享人
        [NameInMap("share")]
        [Validation(Required=true)]
        public string Share { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=true)]
        public string ShopId { get; set; }

        // 订单渠道
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 交易状态 W-待付款、S-成功、F-失败、C-待确认
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 购买订单id
        [NameInMap("trade_id")]
        [Validation(Required=true)]
        public string TradeId { get; set; }

        // 交易时间戳
        [NameInMap("trade_time")]
        [Validation(Required=true)]
        public long? TradeTime { get; set; }

        // 交易类型
        [NameInMap("trade_type")]
        [Validation(Required=true)]
        public string TradeType { get; set; }

        // 业务类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
