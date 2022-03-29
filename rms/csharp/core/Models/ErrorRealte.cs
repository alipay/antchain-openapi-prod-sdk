// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // ErrorRealte
    public class ErrorRealte : TeaModel {
        // ips
        [NameInMap("ips")]
        [Validation(Required=true)]
        public List<string> Ips { get; set; }

        // log_paths
        [NameInMap("log_paths")]
        [Validation(Required=true)]
        public List<string> LogPaths { get; set; }

    }

}
