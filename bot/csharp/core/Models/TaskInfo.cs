// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 任务信息
    public class TaskInfo : TeaModel {
        // 升级计划Id
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public long? PlanId { get; set; }

        // 刷库计划步骤id
        [NameInMap("plan_step_id")]
        [Validation(Required=false)]
        public long? PlanStepId { get; set; }

        // 任务id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public long? TaskId { get; set; }

        // action_id
        [NameInMap("action_id")]
        [Validation(Required=false)]
        public long? ActionId { get; set; }

        // 任务类型
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

    }

}
