// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 权益智能体任务步骤对象
    public class AgentTaskStepData : TeaModel {
        // 步骤id
        [NameInMap("step_id")]
        [Validation(Required=true)]
        public string StepId { get; set; }

        // 步骤名称
        [NameInMap("step_name")]
        [Validation(Required=true)]
        public string StepName { get; set; }

        //  PENDING,  RUNNING,COMPLETED,TERMINATED,FAILED
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public string UpdateTime { get; set; }

        // 关联的消息id
        [NameInMap("message_id")]
        [Validation(Required=true)]
        public string MessageId { get; set; }

        // 关联的异步任务id
        [NameInMap("job_id")]
        [Validation(Required=true)]
        public string JobId { get; set; }

        // 异步任务结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 异步任务已读标识
        [NameInMap("message_flag")]
        [Validation(Required=true)]
        public bool? MessageFlag { get; set; }

    }

}
