// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 资产项目净值
    public class ProjectPerformance : TeaModel {
        // 项目ID
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // 项目净值
        [NameInMap("net_value")]
        [Validation(Required=true)]
        public string NetValue { get; set; }

        // 币种(目前支持USD、HKD)
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 净值更新时间戳
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

    }

}
