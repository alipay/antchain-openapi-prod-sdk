// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // AuthRule
    public class AuthRuleVO : TeaModel {
        // 分组id
        [NameInMap("auth_rule_group_id")]
        [Validation(Required=false)]
        public string AuthRuleGroupId { get; set; }

        // changedItemCnt
        [NameInMap("changed_item_cnt")]
        [Validation(Required=false)]
        public long? ChangedItemCnt { get; set; }

        // changed_type
        [NameInMap("changed_type")]
        [Validation(Required=false)]
        public string ChangedType { get; set; }

        // 是否生效，1 生效，0 未生效。默认未生效
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // 规则id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 模式
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 规则名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 所有规则项
        [NameInMap("rule_items")]
        [Validation(Required=false)]
        public List<AuthRuleItemVO> RuleItems { get; set; }

    }

}
