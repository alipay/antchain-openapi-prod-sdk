// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryClusterBaselineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 扫描id，不填默认最近一次
        [NameInMap("scan_id")]
        [Validation(Required=false)]
        public string ScanId { get; set; }

        // 页码
        [NameInMap("page")]
        [Validation(Required=false)]
        public long? Page { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
