// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAASPLATFORM.Models
{
    public class PayGeneralDivideRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 合约实例id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 订单编号 ( 编号不能重复)
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=256)]
        public string OrderId { get; set; }

        // 发起人
        [NameInMap("from")]
        [Validation(Required=true, MaxLength=100)]
        public string From { get; set; }

        // 付款人
        [NameInMap("payer")]
        [Validation(Required=true, MaxLength=100)]
        public string Payer { get; set; }

        // 支付方式
        [NameInMap("pay_type")]
        [Validation(Required=true, MaxLength=100)]
        public string PayType { get; set; }

        // 支付时间
        [NameInMap("pay_time")]
        [Validation(Required=true, MaxLength=100)]
        public string PayTime { get; set; }

        // 支付状态
        [NameInMap("status")]
        [Validation(Required=true, MaxLength=100)]
        public string Status { get; set; }

        // 收款人
        [NameInMap("to")]
        [Validation(Required=true, MaxLength=100)]
        public string To { get; set; }

        // 订单金额（保留3位小数）
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

        // 分账规则id （根据规则进行分账）
        [NameInMap("rule_id")]
        [Validation(Required=true)]
        public string RuleId { get; set; }

        // 扩展json
        [NameInMap("data")]
        [Validation(Required=false, MaxLength=2000)]
        public string Data { get; set; }

    }

}
