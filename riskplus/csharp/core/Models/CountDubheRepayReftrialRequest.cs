// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CountDubheRepayReftrialRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 授信申请订单号
        [NameInMap("original_order_no")]
        [Validation(Required=true)]
        public string OriginalOrderNo { get; set; }

        // 产品编号
        [NameInMap("prod_no")]
        [Validation(Required=true)]
        public string ProdNo { get; set; }

        // 借款金额
        [NameInMap("apply_amount")]
        [Validation(Required=true)]
        public long? ApplyAmount { get; set; }

        // 借款期数
        [NameInMap("apply_period")]
        [Validation(Required=true)]
        public long? ApplyPeriod { get; set; }

        // 还款方式
        [NameInMap("repay_type")]
        [Validation(Required=true)]
        public string RepayType { get; set; }

    }

}
