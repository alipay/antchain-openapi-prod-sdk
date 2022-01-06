// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 鉴权规则
    public class AuthRule : TeaModel {
        // 鉴权规则描述
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // REJECT : 表示严格模式，例如不匹配白名单则拒绝访问
        // OBSERVER：表示非严格模式，例如不匹配白名单只记录日志，不拒绝访问
        [NameInMap("mode")]
        [Validation(Required=true)]
        public string Mode { get; set; }

        // 规则所属的名单id
        [NameInMap("auth_rule_group_id")]
        [Validation(Required=true)]
        public long? AuthRuleGroupId { get; set; }

        // 是否生效，1 表示生效，0 表示不生效
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public long? Enabled { get; set; }

        // 一条规则下，所有的规则项
        [NameInMap("rule_items")]
        [Validation(Required=false)]
        public List<AuthRuleItem> RuleItems { get; set; }

    }

}
