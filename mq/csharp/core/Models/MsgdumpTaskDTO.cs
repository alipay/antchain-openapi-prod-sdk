// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消息同步任务
    public class MsgdumpTaskDTO : TeaModel {
        // 描述
        [NameInMap("remark")]
        [Validation(Required=true)]
        public string Remark { get; set; }

        // 源 eventcode
        [NameInMap("source_event_code")]
        [Validation(Required=true)]
        public string SourceEventCode { get; set; }

        // 源实例 id
        [NameInMap("source_instance_id")]
        [Validation(Required=true)]
        public string SourceInstanceId { get; set; }

        // 源 topic
        [NameInMap("source_topic")]
        [Validation(Required=true)]
        public string SourceTopic { get; set; }

        // 任务状态
        // 0: 初始化中；1: 运行中；2: 停止中；3: 已停止
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 目标实例 id
        [NameInMap("target_instance_id")]
        [Validation(Required=true)]
        public string TargetInstanceId { get; set; }

        // 目标 tag
        [NameInMap("target_tag")]
        [Validation(Required=true)]
        public string TargetTag { get; set; }

        // 目标 topic
        [NameInMap("target_topic")]
        [Validation(Required=true)]
        public string TargetTopic { get; set; }

        // 任务 id
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // 消息同步目标 cell
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

    }

}
