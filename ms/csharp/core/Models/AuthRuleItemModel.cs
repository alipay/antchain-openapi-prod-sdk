// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // AuthRuleItemModel
    public class AuthRuleItemModel : TeaModel {
        // 规则id
        [NameInMap("auth_rule_id")]
        [Validation(Required=false)]
        public long? AuthRuleId { get; set; }

        // 规则字段
        [NameInMap("field")]
        [Validation(Required=false)]
        public string Field { get; set; }

        // 操作类型(EQUAL,NOT_EQUAL,IN,NOT_INT,REGEX)
        [NameInMap("operation")]
        [Validation(Required=false)]
        public string Operation { get; set; }

        // 规则项的值
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 操作类型
        [NameInMap("changed_type")]
        [Validation(Required=false)]
        public string ChangedType { get; set; }

    }

}
