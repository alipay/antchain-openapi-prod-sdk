// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class WithdrawOrderSettlementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 退分账金额，单位：分
        [NameInMap("refund_amount")]
        [Validation(Required=true)]
        public long? RefundAmount { get; set; }

        // 分账单号
        [NameInMap("settle_no")]
        [Validation(Required=true)]
        public string SettleNo { get; set; }

        // 退款原因说明。 商家自定义，将在会在商户和用户的pc退款账单详情中展示
        [NameInMap("refund_reason")]
        [Validation(Required=false)]
        public string RefundReason { get; set; }

    }

}
