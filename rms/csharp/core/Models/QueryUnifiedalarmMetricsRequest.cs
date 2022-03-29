// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class QueryUnifiedalarmMetricsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 告警规则唯一标识
        [NameInMap("rule_unique_identity")]
        [Validation(Required=false)]
        public string RuleUniqueIdentity { get; set; }

        // metrics查询唯一id
        [NameInMap("muid")]
        [Validation(Required=false)]
        public string Muid { get; set; }

        // 维度筛选
        [NameInMap("tags")]
        [Validation(Required=false)]
        public List<KeySet> Tags { get; set; }

        // 开始时间
        [NameInMap("start")]
        [Validation(Required=true)]
        public long? Start { get; set; }

        // 结束时间
        [NameInMap("end")]
        [Validation(Required=true)]
        public long? End { get; set; }

        // workspace_name
        [NameInMap("workspace_name")]
        [Validation(Required=true)]
        public string WorkspaceName { get; set; }

    }

}
