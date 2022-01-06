// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障隔离规则model
    public class FaultToleranceRuleModel : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // app名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 规则名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // 排序字段
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<BaseOrderDO> Orders { get; set; }

        // 是否启用(0-未启用1启用-2部分启用)
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // 故障隔离的具体规则项
        // {"appName":"testApp","name":"test23","ruleItemList":[{"conditions":[{"type":"system","field":"targetApp","operation":"IN","value":["A"]}],"configs":{"timeWindow":10,"leastWindowCount":100,"maxIpCount":3,"exceptionRateMultiple":3,"leastExceptionRate":10,"exceptionTypes":["500"]},"actions":[{"type":"DOWNGRADE"}]}]}
        [NameInMap("rule_item_list")]
        [Validation(Required=false)]
        public List<FaultToleranceRuleItemModel> RuleItemList { get; set; }

        // 取值client,server二选1，默认是client
        [NameInMap("direction")]
        [Validation(Required=false)]
        public string Direction { get; set; }

    }

}
