// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 逾期信息查询响应
    public class OverdueInfoResponse : TeaModel {
        // 逾期标识
        // true：逾期
        // false：未逾期
        [NameInMap("over_due_flag")]
        [Validation(Required=true)]
        public bool? OverDueFlag { get; set; }

        // 逾期天数
        [NameInMap("dpd")]
        [Validation(Required=true)]
        public long? Dpd { get; set; }

        // 价值逾期天枢
        [NameInMap("cpd")]
        [Validation(Required=true)]
        public long? Cpd { get; set; }

        // 应还总额
        [NameInMap("need_amount")]
        [Validation(Required=true)]
        public long? NeedAmount { get; set; }

        // 总剩余应还
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public long? TotalAmount { get; set; }

    }

}
