// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryClusterScanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // 扫描id
        [NameInMap("scan_id")]
        [Validation(Required=false)]
        public string ScanId { get; set; }

    }

}
