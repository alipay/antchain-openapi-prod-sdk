// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CancelWithholdActivepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 第几期
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 支付类型，默认履约
        [NameInMap("pay_type")]
        [Validation(Required=false)]
        public string PayType { get; set; }

        // 支付申请号，在多期支付场景必填
        [NameInMap("pay_apply_no")]
        [Validation(Required=false)]
        public long? PayApplyNo { get; set; }

    }

}
