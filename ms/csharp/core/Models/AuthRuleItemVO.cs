// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // AuthRuleItemVO
    public class AuthRuleItemVO : TeaModel {
        // 规则id
        [NameInMap("auth_rule_id")]
        [Validation(Required=false)]
        public long? AuthRuleId { get; set; }

        // 操作类型
        [NameInMap("changed_type")]
        [Validation(Required=false)]
        public string ChangedType { get; set; }

        // 规则字段
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // 操作类型(EQUAL,NOT_EQUAL,IN,NOT_INT,REGEX)
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // AuthRuleItemModel
        [NameInMap("published_auth_rule_item")]
        [Validation(Required=false)]
        public AuthRuleItemModel PublishedAuthRuleItem { get; set; }

        // 系统内置或者用户自定义 SYSTEM/CUSTOM
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 规则项的值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

    }

}
