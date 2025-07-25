// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class QueryAntchainAtoWithholdActivepayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 第几期,当支付类型为PERFORMANCE或为空必填
        [NameInMap("period_num")]
        [Validation(Required=false)]
        public long? PeriodNum { get; set; }

        // 支付宝支付订单号，当传递此单号时，只会返回当前单据
        [NameInMap("trade_no")]
        [Validation(Required=false, MaxLength=64)]
        public string TradeNo { get; set; }

        // 支付类型
        [NameInMap("pay_type")]
        [Validation(Required=false, MaxLength=64)]
        public string PayType { get; set; }

        // 无用字段，无需关注
        [NameInMap("pay_channel")]
        [Validation(Required=false, MaxLength=64)]
        public string PayChannel { get; set; }

        // 支付申请号，用于区分在一笔订单同一支付类型的多笔支付请求。
        // 当支付类型非MULTI_PAY或为空时必填
        [NameInMap("pay_apply_no")]
        [Validation(Required=false)]
        public long? PayApplyNo { get; set; }

    }

}
