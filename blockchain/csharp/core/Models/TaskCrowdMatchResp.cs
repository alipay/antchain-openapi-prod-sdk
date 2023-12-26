// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 任务人群匹配返回列表
    public class TaskCrowdMatchResp : TeaModel {
        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 人群匹配结果
        [NameInMap("crowd_match_result")]
        [Validation(Required=true)]
        public CrowdMatchResult CrowdMatchResult { get; set; }

    }

}
