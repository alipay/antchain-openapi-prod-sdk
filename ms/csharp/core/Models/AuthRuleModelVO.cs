// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 鉴权规则模型
    public class AuthRuleModelVO : TeaModel {
        // 鉴权规则组id
        [NameInMap("auth_rule_group_id")]
        [Validation(Required=false)]
        public long? AuthRuleGroupId { get; set; }

        // 规则开启状态。0关闭，1开启
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public long? Enabled { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 更新时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 主键
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 模式，观察者模式（OBSERVER），拦截模式（REJECT）
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 鉴权规则配置项
        [NameInMap("rule_items")]
        [Validation(Required=false)]
        public List<AuthRuleItemModelVO> RuleItems { get; set; }

        // 类型。白名单（WHITELIST），黑名单（BLACKLIST）
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
