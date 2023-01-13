// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 导出任务
    public class Trigger : TeaModel {
        // 导出任务唯一ID
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 导出目标
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 导出的事件类型
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 创建时间戳
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 最近的错误描述信息
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 任务的状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 导出任务的待处理错误日志数量
        [NameInMap("pending_error_logs")]
        [Validation(Required=false)]
        public long? PendingErrorLogs { get; set; }

        // 检查点信息
        [NameInMap("checkpoint")]
        [Validation(Required=false)]
        public TriggerCheckpoint Checkpoint { get; set; }

        // 导出任务配置
        [NameInMap("options")]
        [Validation(Required=true)]
        public List<MapEntry> Options { get; set; }

    }

}
