// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 执行记录详情
    public class JobRecordDTO : TeaModel {
        // 结束时间
        [NameInMap("end")]
        [Validation(Required=false)]
        public string End { get; set; }

        // 任务执行id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 执行总进度
        // 
        // 总的进度为100，这里的进度条如何配置需要，前端同学定一下，我来改
        [NameInMap("progress")]
        [Validation(Required=true)]
        public long? Progress { get; set; }

        // 任务执行状态
        [NameInMap("run_type")]
        [Validation(Required=true)]
        public string RunType { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public string Start { get; set; }

        // 任务执行记录集合
        [NameInMap("task_records")]
        [Validation(Required=true)]
        public List<TaskRecordDTO> TaskRecords { get; set; }

        // 执行耗时
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

        // 触发类型
        [NameInMap("trigger_type")]
        [Validation(Required=true)]
        public string TriggerType { get; set; }

        // 分区信息
        [NameInMap("partition")]
        [Validation(Required=true)]
        public string Partition { get; set; }

        // 触发上下文
        [NameInMap("context")]
        [Validation(Required=false)]
        public string Context { get; set; }

    }

}
