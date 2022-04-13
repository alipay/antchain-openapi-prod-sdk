// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod_s hosts file.
    public class HostAlias : TeaModel {
        // Hostnames for the above IP address.
        [NameInMap("hostnames")]
        [Validation(Required=false)]
        public List<string> Hostnames { get; set; }

        // IP address of the host file entry.
        // 
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

    }

}
