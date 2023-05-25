// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class ScaleRiskTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险任务ID
        [NameInMap("risk_task_id")]
        [Validation(Required=true)]
        public string RiskTaskId { get; set; }

        // 延期时间
        [NameInMap("deadline_time")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeadlineTime { get; set; }

        // comment描述
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

    }

}
