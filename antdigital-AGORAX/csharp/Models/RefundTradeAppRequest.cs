// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class RefundTradeAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 原支付业务订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 退款业务号，当前调用方内唯一，作为退款幂等键
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 本次退款金额，单位：元，大于 0，最多两位小数
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public string RefundAmount { get; set; }

        // 退款原因
        [NameInMap("refund_reason")]
        [Validation(Required=true)]
        public string RefundReason { get; set; }

        // 订单创建时登记的中国大陆 11 位手机号
        [NameInMap("registered_mobile")]
        [Validation(Required=false)]
        public string RegisteredMobile { get; set; }

    }

}
