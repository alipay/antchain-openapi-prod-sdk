// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像告警明细列表
    public class AppPortraitAlertList : TeaModel {
        // 告警节点ID
        [NameInMap("node_id")]
        [Validation(Required=true)]
        public string NodeId { get; set; }

        // 节点名
        [NameInMap("node_name")]
        [Validation(Required=true)]
        public string NodeName { get; set; }

        // 告警指标
        [NameInMap("metric")]
        [Validation(Required=true)]
        public string Metric { get; set; }

        // 告警级别
        [NameInMap("severity")]
        [Validation(Required=true)]
        public string Severity { get; set; }

        // 告警内容
        [NameInMap("alert_content")]
        [Validation(Required=true)]
        public string AlertContent { get; set; }

        // 告警时间
        [NameInMap("gmt_occur_timestamp")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtOccurTimestamp { get; set; }

    }

}
