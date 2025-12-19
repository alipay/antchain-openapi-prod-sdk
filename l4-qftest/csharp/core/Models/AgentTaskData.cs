// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 权益智能体任务对象
    public class AgentTaskData : TeaModel {
        // 任务名称
        [NameInMap("task_name")]
        [Validation(Required=true)]
        public string TaskName { get; set; }

        // 任务类型
        [NameInMap("task_type")]
        [Validation(Required=true)]
        public string TaskType { get; set; }

        // 任务状态
        [NameInMap("task_status")]
        [Validation(Required=true)]
        public string TaskStatus { get; set; }

        // 是否有未读的消息
        [NameInMap("message_flag")]
        [Validation(Required=true)]
        public bool? MessageFlag { get; set; }

        // 最后更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // 单步骤任务直接关联消息id
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 附加信息
        [NameInMap("ext_info")]
        [Validation(Required=true)]
        public string ExtInfo { get; set; }

        // 任务步骤列表
        [NameInMap("step_list")]
        [Validation(Required=true)]
        public List<AgentTaskStepData> StepList { get; set; }

    }

}
