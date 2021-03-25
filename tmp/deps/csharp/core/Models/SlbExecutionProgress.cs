// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // SLB 执行进度
    public class SlbExecutionProgress : TeaModel {
        // 进度 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 进度名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 状态
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 挂载权重
        [NameInMap("mount_weights")]
        [Validation(Required=false)]
        public List<Pair> MountWeights { get; set; }

    }

}
