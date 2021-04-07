// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class UpdateLoadbalanaceSecurityipRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // lb id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // listener_port
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // access_control
        [NameInMap("access_control")]
        [Validation(Required=true)]
        public bool? AccessControl { get; set; }

    }

}
