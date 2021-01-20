// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 发布单
    public class OpsPlan : TeaModel {
        // 是否自动执行
        [NameInMap("auto_execution")]
        [Validation(Required=false)]
        public bool? AutoExecution { get; set; }

        // 上下文
        [NameInMap("context")]
        [Validation(Required=false)]
        public List<Pair> Context { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否开启通知
        [NameInMap("enable_notification")]
        [Validation(Required=false)]
        public bool? EnableNotification { get; set; }

        // 执行人 ID
        [NameInMap("executor_id")]
        [Validation(Required=false)]
        public string ExecutorId { get; set; }

        // 执行人
        [NameInMap("executor_name")]
        [Validation(Required=false)]
        public string ExecutorName { get; set; }

        // 完成时间
        [NameInMap("finished_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string FinishedTime { get; set; }

        // ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // last operator
        [NameInMap("last_operator")]
        [Validation(Required=false)]
        public string LastOperator { get; set; }

        // 详情
        [NameInMap("message_detail")]
        [Validation(Required=false)]
        public List<Pair> MessageDetail { get; set; }

        // 信息
        [NameInMap("message_params")]
        [Validation(Required=false)]
        public string MessageParams { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 类型
        [NameInMap("ops_type")]
        [Validation(Required=false)]
        public string OpsType { get; set; }

        // 发布进程
        [NameInMap("process_definitions")]
        [Validation(Required=false)]
        public List<OpsProcessDefinition> ProcessDefinitions { get; set; }

        // release_mode
        [NameInMap("release_mode")]
        [Validation(Required=false)]
        public string ReleaseMode { get; set; }

        // 回滚单ID
        [NameInMap("rollback_plan_id")]
        [Validation(Required=false)]
        public string RollbackPlanId { get; set; }

        // 是否可独立执行
        [NameInMap("standalone_executable")]
        [Validation(Required=false)]
        public bool? StandaloneExecutable { get; set; }

        // 开始时间
        [NameInMap("started_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string StartedTime { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 发布单 ID
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

    }

}
