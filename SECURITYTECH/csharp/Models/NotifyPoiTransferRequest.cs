// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class NotifyPoiTransferRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 关联交易单号（天枢内部，eKYT接收不透出商城）
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 商城订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 原始正向订单号（仅MALL携带，余额来源业务订单号）
        [NameInMap("original_order_no")]
        [Validation(Required=false)]
        public string OriginalOrderNo { get; set; }

        // 分账时间，格式yyyy-MM-dd HH:mm:ss
        [NameInMap("gmt_transfer")]
        [Validation(Required=true)]
        public string GmtTransfer { get; set; }

        // 结算类型：PET-活体 / MALL-商城消费 / SCORE-充值余额整笔 / MEMBER-会员
        [NameInMap("settle_type")]
        [Validation(Required=true)]
        public string SettleType { get; set; }

        // 分账明细JSON数组（天枢每批次收款主体唯一，单元素数组；元素：cert_no收款主体社信码、transfer_amount结算金额元）
        [NameInMap("transfer_details")]
        [Validation(Required=true)]
        public string TransferDetails { get; set; }

    }

}
