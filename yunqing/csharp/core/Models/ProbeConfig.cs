// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 探针配置
    public class ProbeConfig : TeaModel {
        // 超时时间，单位s
        [NameInMap("timeout")]
        [Validation(Required=true)]
        public string Timeout { get; set; }

        // exec
        [NameInMap("exec")]
        [Validation(Required=false)]
        public Exec Exec { get; set; }

        // http
        [NameInMap("http")]
        [Validation(Required=false)]
        public HTTP Http { get; set; }

        // tcp
        [NameInMap("tcp")]
        [Validation(Required=false)]
        public TCP Tcp { get; set; }

    }

}
