// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 集群里的服务器信息
    public class SofaGwHostVO : TeaModel {
        // 服务器地址，域名或ip(:端口)
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // host name
        [NameInMap("host_name")]
        [Validation(Required=false)]
        public string HostName { get; set; }

        // 元信息
        [NameInMap("meta_data")]
        [Validation(Required=false)]
        public string MetaData { get; set; }

    }

}
