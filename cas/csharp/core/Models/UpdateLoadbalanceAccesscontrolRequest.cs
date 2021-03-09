// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateLoadbalanceAccesscontrolRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // lb paas id
        [NameInMap("loadbalance_sequence")]
        [Validation(Required=true)]
        public string LoadbalanceSequence { get; set; }

        // 监听器端口
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // 是否打开访问控制
        [NameInMap("access_control")]
        [Validation(Required=true)]
        public bool? AccessControl { get; set; }

    }

}
