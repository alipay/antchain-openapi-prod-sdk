// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 调度任务信息
    public class ScheduleTask : TeaModel {
        // 系统名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // cron 表达式
        [NameInMap("cronexp")]
        [Validation(Required=false)]
        public string Cronexp { get; set; }

        // 任务拆分个数
        [NameInMap("divide_count")]
        [Validation(Required=false)]
        public int? DivideCount { get; set; }

        // 任务id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 任务加载上限
        [NameInMap("max_load")]
        [Validation(Required=false)]
        public int? MaxLoad { get; set; }

        // 任务名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 调度任务优先级
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        // 关联的策略名称
        [NameInMap("strategy_name")]
        [Validation(Required=false)]
        public string StrategyName { get; set; }

        // 调度任务关联的机房信息
        [NameInMap("task_idcs")]
        [Validation(Required=false)]
        public List<TaskIdc> TaskIdcs { get; set; }

        // 调度任务类型
        [NameInMap("task_type")]
        [Validation(Required=false)]
        public string TaskType { get; set; }

    }

}
