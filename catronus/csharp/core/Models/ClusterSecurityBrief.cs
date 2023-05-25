// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 集群安全简报
    public class ClusterSecurityBrief : TeaModel {
        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 集群名
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 防护状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 最后一次安全扫描时间
        [NameInMap("last_scan")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string LastScan { get; set; }

        // 风险数量
        [NameInMap("risk_cnt")]
        [Validation(Required=true)]
        public long? RiskCnt { get; set; }

        // 风险简报
        [NameInMap("brief")]
        [Validation(Required=true)]
        public List<ClusterSecurityComponentBrief> Brief { get; set; }

        // 扫描id
        [NameInMap("scan_id")]
        [Validation(Required=false)]
        public string ScanId { get; set; }

    }

}
