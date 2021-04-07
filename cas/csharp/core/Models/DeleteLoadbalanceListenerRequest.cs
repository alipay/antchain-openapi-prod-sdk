// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteLoadbalanceListenerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // listener 端口
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // lb id
        [NameInMap("loadbalance_sequence")]
        [Validation(Required=true)]
        public string LoadbalanceSequence { get; set; }

    }

}
