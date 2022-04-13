// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // sidecar运维机器分组信息
    public class SidecarOpsMachineGroup : TeaModel {
        // 分组ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 分组名称
        [NameInMap("target")]
        [Validation(Required=false)]
        public string Target { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 扩展属性
        [NameInMap("properties")]
        [Validation(Required=false)]
        public string Properties { get; set; }

        // 执行日志
        [NameInMap("messages")]
        [Validation(Required=false)]
        public string Messages { get; set; }

        // sidecar 运维机器列表
        [NameInMap("sub_targets")]
        [Validation(Required=true)]
        public List<SidecarOpsMachine> SubTargets { get; set; }

    }

}
