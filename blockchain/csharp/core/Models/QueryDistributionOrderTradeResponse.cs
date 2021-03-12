// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryDistributionOrderTradeResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 买家id
        [NameInMap("buyer_id")]
        [Validation(Required=false)]
        public string BuyerId { get; set; }

        // 买家信息
        [NameInMap("buyer_info")]
        [Validation(Required=false)]
        public string BuyerInfo { get; set; }

        // 买家名称
        [NameInMap("buyer_name")]
        [Validation(Required=false)]
        public string BuyerName { get; set; }

        // 收银单号
        [NameInMap("cashier_id")]
        [Validation(Required=false)]
        public string CashierId { get; set; }

        // 外部子订单id
        [NameInMap("child_id")]
        [Validation(Required=false)]
        public string ChildId { get; set; }

        // 分销交易分佣信息
        [NameInMap("distribution_info")]
        [Validation(Required=false)]
        public string DistributionInfo { get; set; }

        // 分销商城id
        [NameInMap("distribution_shop_id")]
        [Validation(Required=false)]
        public string DistributionShopId { get; set; }

        // 分销商城名称
        [NameInMap("distribution_shop_name")]
        [Validation(Required=false)]
        public string DistributionShopName { get; set; }

        // 订单过期时间戳
        [NameInMap("expire_time")]
        [Validation(Required=false)]
        public long? ExpireTime { get; set; }

        // 订单扩展信息
        [NameInMap("extend")]
        [Validation(Required=false)]
        public string Extend { get; set; }

        // 内部渠道
        [NameInMap("inner_source")]
        [Validation(Required=false)]
        public string InnerSource { get; set; }

        // 交易参与方
        [NameInMap("join_trader")]
        [Validation(Required=false)]
        public string JoinTrader { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单金额
        [NameInMap("order_price")]
        [Validation(Required=false)]
        public string OrderPrice { get; set; }

        // 外部父订单id
        [NameInMap("parent_id")]
        [Validation(Required=false)]
        public string ParentId { get; set; }

        // 订单支付信息f
        [NameInMap("pay_info")]
        [Validation(Required=false)]
        public string PayInfo { get; set; }

        // 结算状态 I待结算 S已结算
        [NameInMap("pay_status")]
        [Validation(Required=false)]
        public string PayStatus { get; set; }

        // 商品描述
        [NameInMap("product_desc")]
        [Validation(Required=false)]
        public string ProductDesc { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品数量
        [NameInMap("product_num")]
        [Validation(Required=false)]
        public long? ProductNum { get; set; }

        // 商品单价
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public string ProductPrice { get; set; }

        // 商品类型
        [NameInMap("product_type")]
        [Validation(Required=false)]
        public string ProductType { get; set; }

        // 推广人订单id
        [NameInMap("promoter_order_id")]
        [Validation(Required=false)]
        public string PromoterOrderId { get; set; }

        // 商品原始金额
        [NameInMap("real_price")]
        [Validation(Required=false)]
        public string RealPrice { get; set; }

        // 退款时间
        [NameInMap("refund_time")]
        [Validation(Required=false)]
        public long? RefundTime { get; set; }

        // 请求系统
        [NameInMap("req_system")]
        [Validation(Required=false)]
        public string ReqSystem { get; set; }

        // 卖家id
        [NameInMap("seller_id")]
        [Validation(Required=false)]
        public string SellerId { get; set; }

        // 卖家信息
        [NameInMap("seller_info")]
        [Validation(Required=false)]
        public string SellerInfo { get; set; }

        // 卖家名称
        [NameInMap("seller_name")]
        [Validation(Required=false)]
        public string SellerName { get; set; }

        // 分享人
        [NameInMap("share")]
        [Validation(Required=false)]
        public string Share { get; set; }

        // 商户id
        [NameInMap("shop_id")]
        [Validation(Required=false)]
        public string ShopId { get; set; }

        // 订单渠道
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 状态 W-待付款、S-成功、F-失败、C-待确认
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 购买订单id
        [NameInMap("trade_id")]
        [Validation(Required=false)]
        public string TradeId { get; set; }

        // 交易时间戳
        [NameInMap("trade_time")]
        [Validation(Required=false)]
        public long? TradeTime { get; set; }

        // 交易类型
        [NameInMap("trade_type")]
        [Validation(Required=false)]
        public string TradeType { get; set; }

        // 业务类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
