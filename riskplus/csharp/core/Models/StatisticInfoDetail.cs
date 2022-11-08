// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 回执统计数据详情
    public class StatisticInfoDetail : TeaModel {
        // actionDriverCode类型
        [NameInMap("action_driver_code")]
        [Validation(Required=false)]
        public long? ActionDriverCode { get; set; }

        // 成功数
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 失败数
        [NameInMap("fail_count")]
        [Validation(Required=false)]
        public long? FailCount { get; set; }

        // 待触达的手机号数
        [NameInMap("waiting_sub_task_count")]
        [Validation(Required=false)]
        public long? WaitingSubTaskCount { get; set; }

        // 已收到的回执数
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
