// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class SetAgentVersionstrategyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间名称
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

        // 0 容器，1经典
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // TENANT、WORKSPACE
        [NameInMap("scope")]
        [Validation(Required=true)]
        public string Scope { get; set; }

        // agent 地址，容器为镜像地址，经典为 OSS 地址
        [NameInMap("agent_url")]
        [Validation(Required=true)]
        public string AgentUrl { get; set; }

        // 版本号
        [NameInMap("agent_version")]
        [Validation(Required=true)]
        public string AgentVersion { get; set; }

    }

}
