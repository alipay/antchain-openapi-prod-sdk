// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class InstallAgentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 需要安装 agent 的目标列表
        [NameInMap("collect_ids")]
        [Validation(Required=false)]
        public List<string> CollectIds { get; set; }

        // 0 容器，1经典
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

    }

}
