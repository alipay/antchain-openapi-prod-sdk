// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ORG.Models
{
    // 支付宝交易记录
    public class OrgAlipayTradeData : TeaModel {
        // 支付宝订单号
        [NameInMap("alipay_order_no")]
        [Validation(Required=true)]
        public string AlipayOrderNo { get; set; }

        // 交易创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public string GmtCreate { get; set; }

        // 交易支付时间
        [NameInMap("gmt_pay")]
        [Validation(Required=true)]
        public string GmtPay { get; set; }

        // 交易退款时间
        [NameInMap("gmt_refund")]
        [Validation(Required=true)]
        public string GmtRefund { get; set; }

        // 商品备注信息
        [NameInMap("goods_memo")]
        [Validation(Required=false)]
        public string GoodsMemo { get; set; }

        // 机构名称
        [NameInMap("goods_title")]
        [Validation(Required=true)]
        public string GoodsTitle { get; set; }

        // 商户订单号，创建支付宝交易时传入的信息
        [NameInMap("merchant_order_no")]
        [Validation(Required=true)]
        public string MerchantOrderNo { get; set; }

        // 商家优惠金额
        [NameInMap("net_mdiscount")]
        [Validation(Required=true)]
        public string NetMdiscount { get; set; }

        // 对方账户
        [NameInMap("other_account")]
        [Validation(Required=true)]
        public string OtherAccount { get; set; }

        // 订单退款金额
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 服务费金额
        [NameInMap("service_fee")]
        [Validation(Required=true)]
        public string ServiceFee { get; set; }

        // 门店名称
        [NameInMap("store_name")]
        [Validation(Required=false)]
        public string StoreName { get; set; }

        // 门店编号
        [NameInMap("store_no")]
        [Validation(Required=false)]
        public string StoreNo { get; set; }

        // 订单金额
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

        // 订单状态(待付款,成功,关闭,待发货,待确认收货,已预付,进行中)
        [NameInMap("trade_status")]
        [Validation(Required=true)]
        public string TradeStatus { get; set; }

        // 业务类型，帮助商户作为对账参考
        [NameInMap("trade_type")]
        [Validation(Required=true)]
        public string TradeType { get; set; }

    }

}
