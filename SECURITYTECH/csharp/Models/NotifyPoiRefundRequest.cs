// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class NotifyPoiRefundRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 退款单号
        [NameInMap("refund_no")]
        [Validation(Required=true)]
        public string RefundNo { get; set; }

        // 关联交易单号（天枢内部）
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 活体部分退款金额（渠道报文）
        [NameInMap("pet_refund_amount")]
        [Validation(Required=false)]
        public string PetRefundAmount { get; set; }

        // 商城部分退款金额
        [NameInMap("mall_refund_amount")]
        [Validation(Required=false)]
        public string MallRefundAmount { get; set; }

        // 退款状态：SUCCESS / FAILED（FAILED时金额恢复可用余额）
        [NameInMap("refund_status")]
        [Validation(Required=true)]
        public string RefundStatus { get; set; }

        // 买家用户id（商城报文携带）
        [NameInMap("buyer_id")]
        [Validation(Required=false)]
        public string BuyerId { get; set; }

        // 商城订单号（模式4商品订单取消携带）
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

    }

}
