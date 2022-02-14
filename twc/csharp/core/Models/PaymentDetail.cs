// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 支付扣款详情
    public class PaymentDetail : TeaModel {
        // 业务自定义扣款id，长度不能超过64
        [NameInMap("biz_trade_id")]
        [Validation(Required=true)]
        public string BizTradeId { get; set; }

        // 扣款期数
        [NameInMap("period")]
        [Validation(Required=true)]
        public long? Period { get; set; }

        // 支付金额，单位：分
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public long? PayMoney { get; set; }

        // 计划扣款时间，格式"yyyy-MM-dd HH:mm:ss"
        [NameInMap("pay_date")]
        [Validation(Required=true)]
        public string PayDate { get; set; }

    }

}
