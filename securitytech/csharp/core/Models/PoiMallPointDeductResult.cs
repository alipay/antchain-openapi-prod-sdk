// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 扣减结果详情
    public class PoiMallPointDeductResult : TeaModel {
        // 账户ID
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 本次扣减总积分
        [NameInMap("total_deduct_point")]
        [Validation(Required=false)]
        public string TotalDeductPoint { get; set; }

        // 账户累计已消费积分
        [NameInMap("consumed_point")]
        [Validation(Required=false)]
        public string ConsumedPoint { get; set; }

        // 成功扣减的子订单数
        [NameInMap("deduct_order_count")]
        [Validation(Required=false)]
        public string DeductOrderCount { get; set; }

        // 扣减失败的子订单ID列表
        [NameInMap("failed_order_ids")]
        [Validation(Required=false)]
        public List<string> FailedOrderIds { get; set; }

    }

}
