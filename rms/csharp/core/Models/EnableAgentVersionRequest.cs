// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class EnableAgentVersionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // agent版本号
        [NameInMap("agent_version")]
        [Validation(Required=true)]
        public string AgentVersion { get; set; }

        // agent存储url
        [NameInMap("agent_url")]
        [Validation(Required=true)]
        public string AgentUrl { get; set; }

    }

}
