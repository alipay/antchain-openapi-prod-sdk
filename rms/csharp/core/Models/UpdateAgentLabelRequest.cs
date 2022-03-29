// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateAgentLabelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 唯一标识数组
        [NameInMap("collect_ids")]
        [Validation(Required=true)]
        public List<string> CollectIds { get; set; }

        // 标记是否开启告警
        // 1：开启告警
        // 0：关闭告警
        [NameInMap("label")]
        [Validation(Required=true)]
        public long? Label { get; set; }

    }

}
