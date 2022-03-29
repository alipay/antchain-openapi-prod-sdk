// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class UpdateTraceWorkspacesettingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间配置
        [NameInMap("trace_workspace_settings")]
        [Validation(Required=true)]
        public List<TraceWorkspaceSetting> TraceWorkspaceSettings { get; set; }

        // 工作空间，用来鉴权
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
