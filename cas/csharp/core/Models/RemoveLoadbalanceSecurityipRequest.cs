// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class RemoveLoadbalanceSecurityipRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 要删除的 ip
        [NameInMap("ips")]
        [Validation(Required=true)]
        public List<string> Ips { get; set; }

        // 监听器端口
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // lb paas id
        [NameInMap("loadbalance_sequence")]
        [Validation(Required=true)]
        public string LoadbalanceSequence { get; set; }

    }

}
