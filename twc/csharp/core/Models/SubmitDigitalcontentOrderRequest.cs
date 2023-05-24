// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SubmitDigitalcontentOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 支付id
        [NameInMap("payment_id")]
        [Validation(Required=true)]
        public string PaymentId { get; set; }

        // 付款方式
        // ●AliPay，支付宝
        // ● WeChatPay，微信支付
        // ● Bank，银行卡支付
        // ● Other，其他
        [NameInMap("payment_type")]
        [Validation(Required=true)]
        public string PaymentType { get; set; }

        // 按次使用时需要为整数
        [NameInMap("usage")]
        [Validation(Required=true)]
        public string Usage { get; set; }

        // 用作幂等，防重调用
        [NameInMap("client_token")]
        [Validation(Required=true)]
        public string ClientToken { get; set; }

    }

}
