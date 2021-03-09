// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // ListenerSecurityIp
    public class ListenerSecurityIp : TeaModel {
        // access_control
        [NameInMap("access_control")]
        [Validation(Required=true)]
        public bool? AccessControl { get; set; }

        // ips
        [NameInMap("ips")]
        [Validation(Required=true)]
        public List<string> Ips { get; set; }

    }

}
