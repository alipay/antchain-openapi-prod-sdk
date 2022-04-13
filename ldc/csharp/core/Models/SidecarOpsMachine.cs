// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar运维对象 - 机器（computer|pod）
    public class SidecarOpsMachine : TeaModel {
        // 机器运维流程ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 运维机器名称
        [NameInMap("target")]
        [Validation(Required=true)]
        public string Target { get; set; }

        // 执行状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 执行状态描述
        [NameInMap("status_desc")]
        [Validation(Required=false)]
        public string StatusDesc { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 执行消息日志
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 机器sidecar运维任务列表
        [NameInMap("sub_targets")]
        [Validation(Required=true)]
        public List<SidecarOpsMachineTask> SubTargets { get; set; }

    }

}
