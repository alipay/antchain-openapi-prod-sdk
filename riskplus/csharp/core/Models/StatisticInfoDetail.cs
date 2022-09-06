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

        // 调用总数
        [NameInMap("invoke_count")]
        [Validation(Required=false)]
        public long? InvokeCount { get; set; }

        // 成功数
        [NameInMap("success_count")]
        [Validation(Required=false)]
        public long? SuccessCount { get; set; }

        // 失败数
        [NameInMap("fail_count")]
        [Validation(Required=false)]
        public long? FailCount { get; set; }

        // 已处理完成任务数
        [NameInMap("finish_count")]
        [Validation(Required=false)]
        public long? FinishCount { get; set; }

    }

}
