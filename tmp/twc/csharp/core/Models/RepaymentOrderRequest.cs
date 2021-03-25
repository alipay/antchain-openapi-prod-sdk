// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 普通代扣规则
    public class RepaymentOrderRequest : TeaModel {
        // 代扣触发时间，精确到毫秒
        // java.lang.System#currentTimeMillis()
        [NameInMap("pay_date")]
        [Validation(Required=true)]
        public long? PayDate { get; set; }

        // 代扣金额，整数 精确到分
        [NameInMap("pay_money")]
        [Validation(Required=true)]
        public long? PayMoney { get; set; }

        // 是否用户签署成功后立即触发第一期代扣
        [NameInMap("trigger_immediately")]
        [Validation(Required=false)]
        public long? TriggerImmediately { get; set; }

    }

}
