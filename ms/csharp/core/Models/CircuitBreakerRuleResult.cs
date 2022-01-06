// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 服务熔断规则查询结果
    public class CircuitBreakerRuleResult : TeaModel {
        // 多个应用名
        [NameInMap("app_names")]
        [Validation(Required=true)]
        public string AppNames { get; set; }

        // 服务id
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

        // 规则总数
        [NameInMap("rules_num")]
        [Validation(Required=true)]
        public long? RulesNum { get; set; }

        // 服务类型
        [NameInMap("service_type")]
        [Validation(Required=true)]
        public string ServiceType { get; set; }

    }

}
