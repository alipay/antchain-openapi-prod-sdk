// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar运维流程任务
    public class SidecarOpsMachineTask : TeaModel {
        // 分组ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 执行状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 扩展属性 - JSON string
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 执行信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 任务名称
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

        // 开始时间
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 任务描述
        [NameInMap("target_desc")]
        [Validation(Required=false)]
        public string TargetDesc { get; set; }

        // 状态描述
        [NameInMap("status_desc")]
        [Validation(Required=false)]
        public string StatusDesc { get; set; }

    }

}
