// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障隔离规则具体项model
    public class FaultToleranceRuleItemModel : TeaModel {
        // 是否启用(0-未启用1-启用2-部分启用)
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public string Enabled { get; set; }

        // 暂时不用
        [NameInMap("scopes")]
        [Validation(Required=false)]
        public List<string> Scopes { get; set; }

        //  流量管控规则
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public List<BaseConditionModel> Conditions { get; set; }

        // 具体隔离规则配置
        [NameInMap("configs")]
        [Validation(Required=false)]
        public FaultToleranceConfigs Configs { get; set; }

        // 行为项(type取值DOWNGRADE隔离/NONE监控)
        [NameInMap("actions")]
        [Validation(Required=false)]
        public List<BaseActionModel> Actions { get; set; }

    }

}
